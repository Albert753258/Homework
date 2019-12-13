package sample;

import javafx.scene.control.TextArea;

public class TextAnalyze {
    public static void analyze(TextArea name, TextArea text) {
        String name1 = name.getText();
        nameAnalyze(name1);
    }

    public static String nameAnalyze(String name) {
        for(int i = 0; i < name.length(); i ++){
            name.replace('\n', '\t');
            System.out.println(name.charAt(i));
        }
        System.out.println(name);
        return name;
    }
    public static String nameRead(String name) {
        for(int i = 0; i < name.length(); i ++){
            name.replace('\f', '\n');
            name.replace('\t', ' ');
        }
        return name;
    }
}
