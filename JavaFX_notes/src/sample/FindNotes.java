package sample;

import java.util.LinkedList;

public class FindNotes {
    public static Note findNoteByNumber(int i, LinkedList<Note> notes){
        for (Note note: notes){
            if (note.getNumber() == i){
                return note;
            }
        }
        return null;
    }
    public static Note findNote(String name, String text, LinkedList<Note> search_result) {
        search_result.clear();
        for (Note note : Main.notes) {
            boolean b = false;
            if (note.getName().contains(name)) {
                search_result.add(note);
                b = true;
            }
            if(b == false){
                if (note.getText().contains(text)) {
                    search_result.add(note);
                }
            }
        }
        return null;
    }
}
