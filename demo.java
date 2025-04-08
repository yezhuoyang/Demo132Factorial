import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import minijava.MiniJavaParser;
import minijava.syntaxtree.Goal;

public class demo {
    public static void main(String[] args) {
        try {
            // 1) Pick an input source
            InputStream in;
            if (args.length > 0) {
                // If a file name is passed, parse that file
                in = new FileInputStream(args[0]);
                System.out.println("Parsing from file: " + args[0]);
            } else {
                // Otherwise parse from standard input
                in = System.in;
                System.out.println("Parsing from standard input");
            }

            // 2) Create the parser on that input
            MiniJavaParser parser = new MiniJavaParser(in);

            // 3) Parse the top-level nonterminal S()
            //    S is the root AST node type for your grammar
            Goal rootnode=parser.Goal();
            System.out.println("Parse successful!");
            
            // 4) Create and run a custom visitor
            printE visitor = new printE();
            rootnode.accept(visitor);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
