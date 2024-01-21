package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        correctText("/Users/public_hysteria/Documents/antlrProj/src/main/resources/CorrectExample.txt");
        incorrectText("/Users/public_hysteria/Documents/antlrProj/src/main/resources/ErrorExample.txt");
    }
    public static void correctText(String path){
        boolean Success = false;
        try{
            CharStream input = CharStreams.fromFileName(path);
            GramNewLexer lexer = new GramNewLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramNewParser parser = new GramNewParser(tokens);
            ParseTree tree = parser.r();
            System.out.println(tree.toStringTree(parser));
            JFrame frame = new JFrame("Antlr AST");
            JPanel panel = new JPanel();
            TreeViewer viewer = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),tree);
            viewer.setScale(0.7); // Scale a little
            panel.add(viewer);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            if(parser.getTrimParseTree()) {
                Success = true;
            }
        }catch (java.lang.RuntimeException re){
            System.out.println(re.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (Success){
            System.out.println("Введенный код корректный");
        }
    }
    public static void incorrectText(String path){
        try{
            CharStream input = CharStreams.fromFileName(path);
            GramNewLexer lexer = new GramNewLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramNewParser parser = new GramNewParser(tokens);
            ParseTree tree = parser.r();
            System.out.println(tree.toStringTree(parser));
            JFrame frame = new JFrame("Antlr AST");
            JPanel panel = new JPanel();
            TreeViewer viewer = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),tree);
            viewer.setScale(0.7); // Scale a little
            panel.add(viewer);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);

        }catch (java.lang.RuntimeException re){
            System.out.println(re.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}