package sample;

public class TextAnalyze {
    public static String textDeAnalyze(String text) {
        String analyzedText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '\f') {
                analyzedText += "\n";
            } else if (text.charAt(i) == '\t') {
                analyzedText += " ";
            } else {
                analyzedText += text.charAt(i);
            }
        }
        return analyzedText;
    }
    public static String textAnalyze(String text) {
        String text1 = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                text1 += "\t";
            } else if (text.charAt(i) == '\n') {
                text1 += "\f";
            } else {
                text1 += text.charAt(i);
            }
        }
        return text1;
    }
}