package org.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) {
        String absPath="C:\\Users\\Admin\\antlrproj\\src\\main\\resources\\";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла:");
        String filename = scanner.nextLine();
        analyzeText(absPath+filename);
        System.out.println("Введите название файла:");
        filename = scanner.nextLine();
        analyzeText(absPath+filename);
    }
    public static void analyzeText(String path){
        System.out.println("\n\t\t~~ Анализ кода файла '"+path+"'~~");
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
            viewer.setScale(0.9);
            panel.add(viewer);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }catch (java.lang.RuntimeException re){

            System.out.println(re.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}