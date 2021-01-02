import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.AprendizagemLexer;
import parser.AprendizagemParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            System.out.println("Working Directory = " + System.getProperty("user.dir"));
            CharStream input= CharStreams.fromFileName("./src/Exemplo/Recursos.txt"); // a character stream
            AprendizagemLexer lex = new AprendizagemLexer(input); // transforms characters into tokens
            CommonTokenStream tokens = new CommonTokenStream(lex); // a token stream
            AprendizagemParser parser = new AprendizagemParser(tokens); // transforms tokens into parse trees
            System.out.println();
            ParseTree t = parser.aprendizagem(); // creates the parse tree from the called rule
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
