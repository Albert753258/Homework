package sample;

import javafx.scene.control.TextArea;

public class TextAnalyze1 {
    public static void analyze(TextArea name, TextArea text) {
        String name1 = name.getText();
        nameAnalyze(name, name1);
    }
    public static void nameAnalyze(TextArea name, String name1) {
        String[] s1;
        String[] s2;
        String st;
        s1 = name1.split(" ");
        if(s1.length >= 2){

        }
        for(String string: s1){
            name.appendText(string + "\t");
        }
        String name2 = name.getText();
        s2 = name2.split("\n");
        name.setText("");
        for(String string: s2){
            name.appendText(string + "\f");
        }
    }
    public static String nameRead(String name) {
        String[] s1;
        String[] s2;
        s1 = name.split("\t");
        String string = null;
        if(s1.length >= 2){
            for (String st : s1) {
                string = st + " ";
            }
        }
        else{
            string = name;
        }
        String name2 = string;
        s2 = name2.split("\f");
        String string1 = null;
        if(s2.length >= 2){
            for (String st : s2) {
                string1 = st + "\n";
            }
        }
        else{
            string1 = name2;
        }
        return string1;
    }
}
