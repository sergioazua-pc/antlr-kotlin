/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */
package org.antlr.v4.kotlinruntime

import kotlin.native.concurrent.SharedImmutable
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.misc.Interval
import org.antlr.v4.kotlinruntime.tree.ParseTree
import org.antlr.v4.kotlinruntime.tree.ParseTreeVisitor
import org.antlr.v4.kotlinruntime.tree.RuleNode
import org.antlr.v4.kotlinruntime.tree.Trees

/** A rule context is a record of a single rule invocation.
 *
 * We form a stack of these context objects using the parent
 * pointer. A parent pointer of null indicates that the current
 * context is the bottom of the stack. The ParserRuleContext subclass
 * as a children list so that we can turn this data structure into a
 * tree.
 *
 * The root node always has a null pointer and invokingState of -1.
 *
 * Upon entry to parsing, the first invoked rule function creates a
 * context object (a subclass specialized for that rule such as
 * SContext) and makes it the root of a parse tree, recorded by field
 * Parser._ctx.
 *
 * public final SContext s() throws RecognitionException {
 * SContext _localctx = new SContext(_ctx, getState()); <-- create new node
 * enterRule(_localctx, 0, RULE_s);                     <-- push it
 * ...
 * exitRule();                                          <-- pop back to _localctx
 * return _localctx;
 * }
 *
 * A subsequent rule invocation of r from the start rule s pushes a
 * new context object for r whose parent points at s and use invoking
 * state is the state with r emanating as edge accessLabel.
 *
 * The invokingState fields from a context object to the root
 * together form a stack of rule indication states where the root
 * (bottom of the stack) has a -1 sentinel value. If we invoke start
 * symbol s then call r1, which calls r2, the  would look like
 * this:
 *
 * SContext[-1]   <- root node (bottom of the stack)
 * R1Context[p]   <- p in rule s called r1
 * R2Context[q]   <- q in rule r1 called r2
 *
 * So the top of the stack, _ctx, represents a call to the current
 * rule and it holds the return address from another rule that invoke
 * to this rule. To invoke a rule, we must always have a current context.
 *
 * The parent contexts are useful for computing lookahead sets and
 * getting error information.
 *
 * These objects are used during parsing and prediction.
 * For the special case of parsers, we use the subclass
 * ParserRuleContext.
 *
 * @see ParserRuleContext
 */

@SharedImmutable
val EMPTY_RULECTX = ParserRuleContext()


open class RuleContext : RuleNode {
    //    override fun setParent(parent: RuleContext) {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
    override fun assignParent(value: ParseTree?) {
        this.parent = value as RuleContext?
    }

    /** What context invoked this rule?  */
    /** @since 4.7. {@see ParseTree#setParent} comment
     */
    open var parent: RuleContext?

    fun assignParent(value: RuleContext?) {
        this.parent = value
    }

    override fun readParent(): RuleContext? {
        return this.parent
    }

    /** What state invoked the rule associated with this context?
     * The "return address" is the followState of invokingState
     * If parent is null, this should be -1 this context object represents
     * the start rule.
     */
    var invokingState = -1

    /** A context is empty if there is no invoking state; meaning nobody called
     * current context.
     */
    val isEmpty: Boolean
        get() = invokingState == -1

    // satisfy the ParseTree / SyntaxTree interface

    override open val sourceInterval: Interval
        get() = Interval.INVALID

    override val ruleContext: RuleContext
        get() = this

    override val payload: RuleContext
        get() = this

    /** Return the combined text of all child nodes. This method only considers
     * tokens which have been added to the parse tree.
     *
     *
     * Since tokens on hidden channels (e.g. whitespace or comments) are not
     * added to the parse trees, they will not appear in the output of this
     * method.
     */
    override val text: String
        get() {
            if (childCount == 0) {
                return ""
            }

            val builder = StringBuilder()
            for (i in 0 until childCount) {
                builder.append(getChild(i)!!.text)
            }

            return builder.toString()
        }

    open var ruleIndex: Int = -1

    /** For rule associated with this parse tree internal node, return
     * the outer alternative number used to match the input. Default
     * implementation does not compute nor store this alt num. Create
     * a subclass of ParserRuleContext with backing field and set
     * option contextSuperClass.
     * to set it.
     *
     * @since 4.5.3
     */
    /** Set the outer alternative number for this context node. Default
     * implementation does nothing to avoid backing field overhead for
     * trees that don't need it.  Create
     * a subclass of ParserRuleContext with backing field and set
     * option contextSuperClass.
     *
     * @since 4.5.3
     */
    open var altNumber: Int
        get() = ATN.INVALID_ALT_NUMBER
        set(altNumber) {}

    override open val childCount: Int
        get() = 0

    constructor() : super() {
        this.parent = null
    }

    constructor(parent: RuleContext?, invokingState: Int) : super() {
        //assignParent(parent)
        this.parent = parent
        //if ( parent!=null ) System.out.println("invoke "+stateNumber+" from "+parent);
        this.invokingState = invokingState
    }

    fun depth(): Int {
        var n = 0
        var p: RuleContext? = this
        while (p != null) {
            p = p.parent
            n++
        }
        return n
    }

    override open fun getChild(i: Int): ParseTree? {
        return null
    }

    override fun <T> accept(visitor: ParseTreeVisitor<out T>): T {
        return visitor.visitChildren(this)!!
    }

    /** Print out a whole tree, not just a node, in LISP format
     * (root child1 .. childN). Print just a node if this is a leaf.
     * We have to know the recognizer so we can get rule names.
     */
    override fun toStringTree(recog: Parser): String {
        return Trees.toStringTree(this, recog)
    }

    /** Print out a whole tree, not just a node, in LISP format
     * (root child1 .. childN). Print just a node if this is a leaf.
     */
    fun toStringTree(ruleNames: List<String>?): String {
        return Trees.toStringTree(this, ruleNames)
    }

    override fun toStringTree(): String {
        return toStringTree(null as List<String>?)
    }

    override fun toString(): String {
        return toString(null as List<String>?, null as RuleContext?)
    }

    // recog null unless ParserRuleContext, in which case we use subclass toString(...)
    fun toString(recog: Recognizer<*, *>?, stop: RuleContext = EMPTY_RULECTX): String {
        val ruleNames = recog?.ruleNames
        val ruleNamesList = if (ruleNames != null) listOf(*ruleNames) else null
        return toString(ruleNamesList, stop)
    }

    fun toString(ruleNames: List<String>?, stop: RuleContext? = null): String {
        val buf = StringBuilder()
        var p: RuleContext? = this
        buf.append("[")
        while (p != null && p !== stop) {
            if (ruleNames == null) {
                if (!p.isEmpty) {
                    buf.append(p.invokingState)
                }
            } else {
                val ruleIndex = p.ruleIndex
                val ruleName = if (ruleIndex >= 0 && ruleIndex < ruleNames.size) ruleNames[ruleIndex] else ruleIndex.toString()
                buf.append(ruleName)
            }

            if (p.parent != null && (ruleNames != null || !p.parent!!.isEmpty)) {
                buf.append(" ")
            }

            p = p.parent
        }

        buf.append("]")
        return buf.toString()
    }


}
