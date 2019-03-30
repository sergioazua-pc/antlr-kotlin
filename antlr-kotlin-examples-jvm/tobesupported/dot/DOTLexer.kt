// Generated from java-escape by ANTLR 4.7.1
package me.tomassetti.minicalc
import com.strumenta.kotlinmultiplatform.Arrays
import org.antlr.v4.runtime.misc.Utils
import org.antlr.v4.kotlinruntime.CharStream
import org.antlr.v4.kotlinruntime.Lexer
import org.antlr.v4.kotlinruntime.VocabularyImpl
import org.antlr.v4.kotlinruntime.atn.ATN
import org.antlr.v4.kotlinruntime.atn.ATNDeserializer
import org.antlr.v4.kotlinruntime.atn.LexerATNSimulator
import org.antlr.v4.kotlinruntime.atn.PredictionContextCache
import org.antlr.v4.kotlinruntime.dfa.DFA

class DOTLexer(val input: CharStream) : Lexer(input) {
	// TODO Verify the runtime version is correct

    override val ruleNames: Array<String>?
        get() = Rules.values().map { it.name }.toTypedArray()

    override val grammarFileName: String
        get() = "DOT.g4"

    override val atn: ATN
		get() = DOTLexer.Companion.ATN

	companion object {
		val decisionToDFA : Array<DFA>
		val sharedContextCache = PredictionContextCache()

		private val LITERAL_NAMES = Arrays.asList<String?>(null, "'{'", "'}'", 
		                                                   "';'", "'='", "'['", 
		                                                   "']'", "','", "'->'", 
		                                                   "'--'", "':'")
		private val SYMBOLIC_NAMES = Arrays.asList<String?>(null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, null, 
		                                                    null, null, "STRICT", 
		                                                    "GRAPH", "DIGRAPH", 
		                                                    "NODE", "EDGE", "SUBGRAPH", 
		                                                    "NUMBER", "STRING", 
		                                                    "ID", "HTML_STRING", 
		                                                    "COMMENT", "LINE_COMMENT", 
		                                                    "PREPROC", "WS")

		val VOCABULARY = VocabularyImpl(LITERAL_NAMES.toTypedArray(), SYMBOLIC_NAMES.toTypedArray())

        val tokenNames: Array<String?> = Array<String?>(SYMBOLIC_NAMES.size) {
            var el = VOCABULARY.getLiteralName(it)
            if (el == null) {
                el = VOCABULARY.getSymbolicName(it)
            }

            if (el == null) {
                el = "<INVALID>"
            }
            el
        }

		private const val serializedATN : String = "\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\u0002\u001a\u00e8\u0008\u0001\u0004\u0002\u0009\u0002\u0004\u0003\u0009\u0003\u0004\u0004\u0009\u0004\u0004\u0005\u0009\u0005\u0004\u0006\u0009\u0006\u0004\u0007\u0009\u0007\u0004\u0008\u0009\u0008\u0004\u0009\u0009\u0009\u0004\u000a\u0009\u000a\u0004\u000b\u0009\u000b\u0004\u000c\u0009\u000c\u0004\u000d\u0009\u000d\u0004\u000e\u0009\u000e\u0004\u000f\u0009\u000f\u0004\u0010\u0009\u0010\u0004\u0011\u0009\u0011\u0004\u0012\u0009\u0012\u0004\u0013\u0009\u0013\u0004\u0014\u0009\u0014\u0004\u0015\u0009\u0015\u0004\u0016\u0009\u0016\u0004\u0017\u0009\u0017\u0004\u0018\u0009\u0018\u0004\u0019\u0009\u0019\u0004\u001a\u0009\u001a\u0004\u001b\u0009\u001b\u0004\u001c\u0009\u001c\u0003\u0002\u0003\u0002\u0003\u0003\u0003\u0003\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005\u0003\u0006\u0003\u0006\u0003\u0007\u0003\u0007\u0003\u0008\u0003\u0008\u0003\u0009\u0003\u0009\u0003\u0009\u0003\u000a\u0003\u000a\u0003\u000a\u0003\u000b\u0003\u000b\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000c\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000d\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u000f\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0010\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0011\u0003\u0012\u0005\u0012\u0079\u000a\u0012\u0003\u0012\u0003\u0012\u0006\u0012\u007d\u000a\u0012\u000d\u0012\u000e\u0012\u007e\u0003\u0012\u0006\u0012\u0082\u000a\u0012\u000d\u0012\u000e\u0012\u0083\u0003\u0012\u0003\u0012\u0007\u0012\u0088\u000a\u0012\u000c\u0012\u000e\u0012\u008b\u000b\u0012\u0005\u0012\u008d\u000a\u0012\u0005\u0012\u008f\u000a\u0012\u0003\u0013\u0003\u0013\u0003\u0014\u0003\u0014\u0003\u0014\u0003\u0014\u0007\u0014\u0097\u000a\u0014\u000c\u0014\u000e\u0014\u009a\u000b\u0014\u0003\u0014\u0003\u0014\u0003\u0015\u0003\u0015\u0003\u0015\u0007\u0015\u00a1\u000a\u0015\u000c\u0015\u000e\u0015\u00a4\u000b\u0015\u0003\u0016\u0003\u0016\u0003\u0017\u0003\u0017\u0003\u0017\u0007\u0017\u00ab\u000a\u0017\u000c\u0017\u000e\u0017\u00ae\u000b\u0017\u0003\u0017\u0003\u0017\u0003\u0018\u0003\u0018\u0007\u0018\u00b4\u000a\u0018\u000c\u0018\u000e\u0018\u00b7\u000b\u0018\u0003\u0018\u0003\u0018\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0007\u0019\u00bf\u000a\u0019\u000c\u0019\u000e\u0019\u00c2\u000b\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u0019\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0007\u001a\u00cd\u000a\u001a\u000c\u001a\u000e\u001a\u00d0\u000b\u001a\u0003\u001a\u0005\u001a\u00d3\u000a\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001a\u0003\u001b\u0003\u001b\u0007\u001b\u00db\u000a\u001b\u000c\u001b\u000e\u001b\u00de\u000b\u001b\u0003\u001b\u0003\u001b\u0003\u001c\u0006\u001c\u00e3\u000a\u001c\u000d\u001c\u000e\u001c\u00e4\u0003\u001c\u0003\u001c\u0006\u0098\u00b5\u00c0\u00ce\u0002\u001d\u0003\u0003\u0005\u0004\u0007\u0005\u0009\u0006\u000b\u0007\u000d\u0008\u000f\u0009\u0011\u000a\u0013\u000b\u0015\u000c\u0017\u000d\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011\u0021\u0012\u0023\u0013\u0025\u0002\u0027\u0014\u0029\u0015\u002b\u0002\u002d\u0016\u002f\u0002\u0031\u0017\u0033\u0018\u0035\u0019\u0037\u001a\u0003\u0002\u0016\u0004\u0002\u0055\u0055\u0075\u0075\u0004\u0002\u0056\u0056\u0076\u0076\u0004\u0002\u0054\u0054\u0074\u0074\u0004\u0002\u004b\u004b\u006b\u006b\u0004\u0002\u0045\u0045\u0065\u0065\u0004\u0002\u0049\u0049\u0069\u0069\u0004\u0002\u0043\u0043\u0063\u0063\u0004\u0002\u0052\u0052\u0072\u0072\u0004\u0002\u004a\u004a\u006a\u006a\u0004\u0002\u0046\u0046\u0066\u0066\u0004\u0002\u0050\u0050\u0070\u0070\u0004\u0002\u0051\u0051\u0071\u0071\u0004\u0002\u0047\u0047\u0067\u0067\u0004\u0002\u0057\u0057\u0077\u0077\u0004\u0002\u0044\u0044\u0064\u0064\u0003\u0002\u0032\u003b\u0006\u0002\u0043\u005c\u0061\u0061\u0063\u007c\u0082\u0101\u0004\u0002\u003e\u003e\u0040\u0040\u0004\u0002\u000c\u000c\u000f\u000f\u0005\u0002\u000b\u000c\u000f\u000f\u0022\u0022\u0002\u00f6\u0002\u0003\u0003\u0002\u0002\u0002\u0002\u0005\u0003\u0002\u0002\u0002\u0002\u0007\u0003\u0002\u0002\u0002\u0002\u0009\u0003\u0002\u0002\u0002\u0002\u000b\u0003\u0002\u0002\u0002\u0002\u000d\u0003\u0002\u0002\u0002\u0002\u000f\u0003\u0002\u0002\u0002\u0002\u0011\u0003\u0002\u0002\u0002\u0002\u0013\u0003\u0002\u0002\u0002\u0002\u0015\u0003\u0002\u0002\u0002\u0002\u0017\u0003\u0002\u0002\u0002\u0002\u0019\u0003\u0002\u0002\u0002\u0002\u001b\u0003\u0002\u0002\u0002\u0002\u001d\u0003\u0002\u0002\u0002\u0002\u001f\u0003\u0002\u0002\u0002\u0002\u0021\u0003\u0002\u0002\u0002\u0002\u0023\u0003\u0002\u0002\u0002\u0002\u0027\u0003\u0002\u0002\u0002\u0002\u0029\u0003\u0002\u0002\u0002\u0002\u002d\u0003\u0002\u0002\u0002\u0002\u0031\u0003\u0002\u0002\u0002\u0002\u0033\u0003\u0002\u0002\u0002\u0002\u0035\u0003\u0002\u0002\u0002\u0002\u0037\u0003\u0002\u0002\u0002\u0003\u0039\u0003\u0002\u0002\u0002\u0005\u003b\u0003\u0002\u0002\u0002\u0007\u003d\u0003\u0002\u0002\u0002\u0009\u003f\u0003\u0002\u0002\u0002\u000b\u0041\u0003\u0002\u0002\u0002\u000d\u0043\u0003\u0002\u0002\u0002\u000f\u0045\u0003\u0002\u0002\u0002\u0011\u0047\u0003\u0002\u0002\u0002\u0013\u004a\u0003\u0002\u0002\u0002\u0015\u004d\u0003\u0002\u0002\u0002\u0017\u004f\u0003\u0002\u0002\u0002\u0019\u0056\u0003\u0002\u0002\u0002\u001b\u005c\u0003\u0002\u0002\u0002\u001d\u0064\u0003\u0002\u0002\u0002\u001f\u0069\u0003\u0002\u0002\u0002\u0021\u006e\u0003\u0002\u0002\u0002\u0023\u0078\u0003\u0002\u0002\u0002\u0025\u0090\u0003\u0002\u0002\u0002\u0027\u0092\u0003\u0002\u0002\u0002\u0029\u009d\u0003\u0002\u0002\u0002\u002b\u00a5\u0003\u0002\u0002\u0002\u002d\u00a7\u0003\u0002\u0002\u0002\u002f\u00b1\u0003\u0002\u0002\u0002\u0031\u00ba\u0003\u0002\u0002\u0002\u0033\u00c8\u0003\u0002\u0002\u0002\u0035\u00d8\u0003\u0002\u0002\u0002\u0037\u00e2\u0003\u0002\u0002\u0002\u0039\u003a\u0007\u007d\u0002\u0002\u003a\u0004\u0003\u0002\u0002\u0002\u003b\u003c\u0007\u007f\u0002\u0002\u003c\u0006\u0003\u0002\u0002\u0002\u003d\u003e\u0007\u003d\u0002\u0002\u003e\u0008\u0003\u0002\u0002\u0002\u003f\u0040\u0007\u003f\u0002\u0002\u0040\u000a\u0003\u0002\u0002\u0002\u0041\u0042\u0007\u005d\u0002\u0002\u0042\u000c\u0003\u0002\u0002\u0002\u0043\u0044\u0007\u005f\u0002\u0002\u0044\u000e\u0003\u0002\u0002\u0002\u0045\u0046\u0007\u002e\u0002\u0002\u0046\u0010\u0003\u0002\u0002\u0002\u0047\u0048\u0007\u002f\u0002\u0002\u0048\u0049\u0007\u0040\u0002\u0002\u0049\u0012\u0003\u0002\u0002\u0002\u004a\u004b\u0007\u002f\u0002\u0002\u004b\u004c\u0007\u002f\u0002\u0002\u004c\u0014\u0003\u0002\u0002\u0002\u004d\u004e\u0007\u003c\u0002\u0002\u004e\u0016\u0003\u0002\u0002\u0002\u004f\u0050\u0009\u0002\u0002\u0002\u0050\u0051\u0009\u0003\u0002\u0002\u0051\u0052\u0009\u0004\u0002\u0002\u0052\u0053\u0009\u0005\u0002\u0002\u0053\u0054\u0009\u0006\u0002\u0002\u0054\u0055\u0009\u0003\u0002\u0002\u0055\u0018\u0003\u0002\u0002\u0002\u0056\u0057\u0009\u0007\u0002\u0002\u0057\u0058\u0009\u0004\u0002\u0002\u0058\u0059\u0009\u0008\u0002\u0002\u0059\u005a\u0009\u0009\u0002\u0002\u005a\u005b\u0009\u000a\u0002\u0002\u005b\u001a\u0003\u0002\u0002\u0002\u005c\u005d\u0009\u000b\u0002\u0002\u005d\u005e\u0009\u0005\u0002\u0002\u005e\u005f\u0009\u0007\u0002\u0002\u005f\u0060\u0009\u0004\u0002\u0002\u0060\u0061\u0009\u0008\u0002\u0002\u0061\u0062\u0009\u0009\u0002\u0002\u0062\u0063\u0009\u000a\u0002\u0002\u0063\u001c\u0003\u0002\u0002\u0002\u0064\u0065\u0009\u000c\u0002\u0002\u0065\u0066\u0009\u000d\u0002\u0002\u0066\u0067\u0009\u000b\u0002\u0002\u0067\u0068\u0009\u000e\u0002\u0002\u0068\u001e\u0003\u0002\u0002\u0002\u0069\u006a\u0009\u000e\u0002\u0002\u006a\u006b\u0009\u000b\u0002\u0002\u006b\u006c\u0009\u0007\u0002\u0002\u006c\u006d\u0009\u000e\u0002\u0002\u006d\u0020\u0003\u0002\u0002\u0002\u006e\u006f\u0009\u0002\u0002\u0002\u006f\u0070\u0009\u000f\u0002\u0002\u0070\u0071\u0009\u0010\u0002\u0002\u0071\u0072\u0009\u0007\u0002\u0002\u0072\u0073\u0009\u0004\u0002\u0002\u0073\u0074\u0009\u0008\u0002\u0002\u0074\u0075\u0009\u0009\u0002\u0002\u0075\u0076\u0009\u000a\u0002\u0002\u0076\u0022\u0003\u0002\u0002\u0002\u0077\u0079\u0007\u002f\u0002\u0002\u0078\u0077\u0003\u0002\u0002\u0002\u0078\u0079\u0003\u0002\u0002\u0002\u0079\u008e\u0003\u0002\u0002\u0002\u007a\u007c\u0007\u0030\u0002\u0002\u007b\u007d\u0005\u0025\u0013\u0002\u007c\u007b\u0003\u0002\u0002\u0002\u007d\u007e\u0003\u0002\u0002\u0002\u007e\u007c\u0003\u0002\u0002\u0002\u007e\u007f\u0003\u0002\u0002\u0002\u007f\u008f\u0003\u0002\u0002\u0002\u0080\u0082\u0005\u0025\u0013\u0002\u0081\u0080\u0003\u0002\u0002\u0002\u0082\u0083\u0003\u0002\u0002\u0002\u0083\u0081\u0003\u0002\u0002\u0002\u0083\u0084\u0003\u0002\u0002\u0002\u0084\u008c\u0003\u0002\u0002\u0002\u0085\u0089\u0007\u0030\u0002\u0002\u0086\u0088\u0005\u0025\u0013\u0002\u0087\u0086\u0003\u0002\u0002\u0002\u0088\u008b\u0003\u0002\u0002\u0002\u0089\u0087\u0003\u0002\u0002\u0002\u0089\u008a\u0003\u0002\u0002\u0002\u008a\u008d\u0003\u0002\u0002\u0002\u008b\u0089\u0003\u0002\u0002\u0002\u008c\u0085\u0003\u0002\u0002\u0002\u008c\u008d\u0003\u0002\u0002\u0002\u008d\u008f\u0003\u0002\u0002\u0002\u008e\u007a\u0003\u0002\u0002\u0002\u008e\u0081\u0003\u0002\u0002\u0002\u008f\u0024\u0003\u0002\u0002\u0002\u0090\u0091\u0009\u0011\u0002\u0002\u0091\u0026\u0003\u0002\u0002\u0002\u0092\u0098\u0007\u0024\u0002\u0002\u0093\u0094\u0007\u005e\u0002\u0002\u0094\u0097\u0007\u0024\u0002\u0002\u0095\u0097\u000b\u0002\u0002\u0002\u0096\u0093\u0003\u0002\u0002\u0002\u0096\u0095\u0003\u0002\u0002\u0002\u0097\u009a\u0003\u0002\u0002\u0002\u0098\u0099\u0003\u0002\u0002\u0002\u0098\u0096\u0003\u0002\u0002\u0002\u0099\u009b\u0003\u0002\u0002\u0002\u009a\u0098\u0003\u0002\u0002\u0002\u009b\u009c\u0007\u0024\u0002\u0002\u009c\u0028\u0003\u0002\u0002\u0002\u009d\u00a2\u0005\u002b\u0016\u0002\u009e\u00a1\u0005\u002b\u0016\u0002\u009f\u00a1\u0005\u0025\u0013\u0002\u00a0\u009e\u0003\u0002\u0002\u0002\u00a0\u009f\u0003\u0002\u0002\u0002\u00a1\u00a4\u0003\u0002\u0002\u0002\u00a2\u00a0\u0003\u0002\u0002\u0002\u00a2\u00a3\u0003\u0002\u0002\u0002\u00a3\u002a\u0003\u0002\u0002\u0002\u00a4\u00a2\u0003\u0002\u0002\u0002\u00a5\u00a6\u0009\u0012\u0002\u0002\u00a6\u002c\u0003\u0002\u0002\u0002\u00a7\u00ac\u0007\u003e\u0002\u0002\u00a8\u00ab\u0005\u002f\u0018\u0002\u00a9\u00ab\u000a\u0013\u0002\u0002\u00aa\u00a8\u0003\u0002\u0002\u0002\u00aa\u00a9\u0003\u0002\u0002\u0002\u00ab\u00ae\u0003\u0002\u0002\u0002\u00ac\u00aa\u0003\u0002\u0002\u0002\u00ac\u00ad\u0003\u0002\u0002\u0002\u00ad\u00af\u0003\u0002\u0002\u0002\u00ae\u00ac\u0003\u0002\u0002\u0002\u00af\u00b0\u0007\u0040\u0002\u0002\u00b0\u002e\u0003\u0002\u0002\u0002\u00b1\u00b5\u0007\u003e\u0002\u0002\u00b2\u00b4\u000b\u0002\u0002\u0002\u00b3\u00b2\u0003\u0002\u0002\u0002\u00b4\u00b7\u0003\u0002\u0002\u0002\u00b5\u00b6\u0003\u0002\u0002\u0002\u00b5\u00b3\u0003\u0002\u0002\u0002\u00b6\u00b8\u0003\u0002\u0002\u0002\u00b7\u00b5\u0003\u0002\u0002\u0002\u00b8\u00b9\u0007\u0040\u0002\u0002\u00b9\u0030\u0003\u0002\u0002\u0002\u00ba\u00bb\u0007\u0031\u0002\u0002\u00bb\u00bc\u0007\u002c\u0002\u0002\u00bc\u00c0\u0003\u0002\u0002\u0002\u00bd\u00bf\u000b\u0002\u0002\u0002\u00be\u00bd\u0003\u0002\u0002\u0002\u00bf\u00c2\u0003\u0002\u0002\u0002\u00c0\u00c1\u0003\u0002\u0002\u0002\u00c0\u00be\u0003\u0002\u0002\u0002\u00c1\u00c3\u0003\u0002\u0002\u0002\u00c2\u00c0\u0003\u0002\u0002\u0002\u00c3\u00c4\u0007\u002c\u0002\u0002\u00c4\u00c5\u0007\u0031\u0002\u0002\u00c5\u00c6\u0003\u0002\u0002\u0002\u00c6\u00c7\u0008\u0019\u0002\u0002\u00c7\u0032\u0003\u0002\u0002\u0002\u00c8\u00c9\u0007\u0031\u0002\u0002\u00c9\u00ca\u0007\u0031\u0002\u0002\u00ca\u00ce\u0003\u0002\u0002\u0002\u00cb\u00cd\u000b\u0002\u0002\u0002\u00cc\u00cb\u0003\u0002\u0002\u0002\u00cd\u00d0\u0003\u0002\u0002\u0002\u00ce\u00cf\u0003\u0002\u0002\u0002\u00ce\u00cc\u0003\u0002\u0002\u0002\u00cf\u00d2\u0003\u0002\u0002\u0002\u00d0\u00ce\u0003\u0002\u0002\u0002\u00d1\u00d3\u0007\u000f\u0002\u0002\u00d2\u00d1\u0003\u0002\u0002\u0002\u00d2\u00d3\u0003\u0002\u0002\u0002\u00d3\u00d4\u0003\u0002\u0002\u0002\u00d4\u00d5\u0007\u000c\u0002\u0002\u00d5\u00d6\u0003\u0002\u0002\u0002\u00d6\u00d7\u0008\u001a\u0002\u0002\u00d7\u0034\u0003\u0002\u0002\u0002\u00d8\u00dc\u0007\u0025\u0002\u0002\u00d9\u00db\u000a\u0014\u0002\u0002\u00da\u00d9\u0003\u0002\u0002\u0002\u00db\u00de\u0003\u0002\u0002\u0002\u00dc\u00da\u0003\u0002\u0002\u0002\u00dc\u00dd\u0003\u0002\u0002\u0002\u00dd\u00df\u0003\u0002\u0002\u0002\u00de\u00dc\u0003\u0002\u0002\u0002\u00df\u00e0\u0008\u001b\u0002\u0002\u00e0\u0036\u0003\u0002\u0002\u0002\u00e1\u00e3\u0009\u0015\u0002\u0002\u00e2\u00e1\u0003\u0002\u0002\u0002\u00e3\u00e4\u0003\u0002\u0002\u0002\u00e4\u00e2\u0003\u0002\u0002\u0002\u00e4\u00e5\u0003\u0002\u0002\u0002\u00e5\u00e6\u0003\u0002\u0002\u0002\u00e6\u00e7\u0008\u001c\u0002\u0002\u00e7\u0038\u0003\u0002\u0002\u0002\u0015\u0002\u0078\u007e\u0083\u0089\u008c\u008e\u0096\u0098\u00a0\u00a2\u00aa\u00ac\u00b5\u00c0\u00ce\u00d2\u00dc\u00e4\u0003\u0008\u0002\u0002"

		val ATN = ATNDeserializer().deserialize(serializedATN.toCharArray())
		init {
			decisionToDFA = Array<DFA>(ATN.numberOfDecisions, {
				DFA(ATN.getDecisionState(it)!!, it)
			})


		}
	}

    enum class Tokens(val id: Int) {
	    T__0(1),
	    T__1(2),
	    T__2(3),
	    T__3(4),
	    T__4(5),
	    T__5(6),
	    T__6(7),
	    T__7(8),
	    T__8(9),
	    T__9(10),
	    STRICT(11),
	    GRAPH(12),
	    DIGRAPH(13),
	    NODE(14),
	    EDGE(15),
	    SUBGRAPH(16),
	    NUMBER(17),
	    STRING(18),
	    ID(19),
	    HTML_STRING(20),
	    COMMENT(21),
	    LINE_COMMENT(22),
	    PREPROC(23),
	    WS(24)
    }

	enum class Channels(val id: Int) {
		DEFAULT_TOKEN_CHANNEL(0),
		HIDDEN(1),
	}

	enum class Modes(val id: Int) {
		DEFAULT_MODE(0),
	}

	enum class Rules {
	    T__0,
	    T__1,
	    T__2,
	    T__3,
	    T__4,
	    T__5,
	    T__6,
	    T__7,
	    T__8,
	    T__9,
	    STRICT,
	    GRAPH,
	    DIGRAPH,
	    NODE,
	    EDGE,
	    SUBGRAPH,
	    NUMBER,
	    DIGIT,
	    STRING,
	    ID,
	    LETTER,
	    HTML_STRING,
	    TAG,
	    COMMENT,
	    LINE_COMMENT,
	    PREPROC,
	    WS
	}


	init {
		this.interpreter = LexerATNSimulator(this, ATN, decisionToDFA as Array<DFA?>, sharedContextCache)
	}

}