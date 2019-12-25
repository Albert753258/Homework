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
    public static Note findNote(String name, String text, LinkedList<Note> search_result, LinkedList<Note> list) {
        search_result.clear();
        for (Note note : list) {
            if (note.getName().contains(name)) {
                search_result.add(note);
            }
            else{
                if (note.getText().contains(text)) {
                    search_result.add(note);
                }
            }
        }
        return null;
    }
}
