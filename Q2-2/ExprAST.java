import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class ExprAST {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprASTLexer lexer = new ExprASTLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprASTParser parser = new ExprASTParser(tokens);
        ExprASTParser.doc_return r = parser.doc();

        // walk resulting tree
        CommonTree t = (CommonTree)r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        ExprASTWalker walker = new ExprASTWalker(nodes);
        walker.doc();
    }
}
