package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class SearchViewNoteDeletedController {
    @FXML
    public Button restoreButton;
    @FXML
    public TextArea number;
    @FXML
    public TextArea name;
    @FXML
    public TextArea text;
    @FXML
    public TextArea numberColumn;
    @FXML
    public TextArea nameColumn;
    @FXML
    public TextArea textColumn;
    @FXML
    public TextArea deletedColumn;
    @FXML
    public TextArea deleted;

    public void initialize(){
        Note note = setData();
        int j = note.getId();
        int number2 = SearchController.search_result.indexOf(note);
        int number = Main.notes.indexOf(note);
        restoreButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                deletedColumn.setText("Not deleted");
                note.setDeleted(false);
                Main.notes_deleted.set(j - 1, note);
                Main.notes.clear();
                for(Note note: Main.notes_deleted){
                    if(note.getDeleted() == false){
                        Main.notes.add(note);
                    }
                }
                Main.controller1.search_result.set(number2, note);
                Main.showNotesSearch(Main.controller1.textColumn, Main.controller1.nameColumn, Main.controller1.numberColumn, Main.controller1.deletedColumn);
                Main.showNotes(Main.controller.textColumn, Main.controller.nameColumn, Main.controller.numberColumn);
            }
        });
    }
    public Note setData(){
        name.setEditable(false);
        number.setEditable(false);
        text.setEditable(false);
        numberColumn.setEditable(false);
        nameColumn.setEditable(false);
        textColumn.setEditable(false);
        deleted.setEditable(false);
        deletedColumn.setEditable(false);
        String s = Main.controller1.numberOfView.getText();
        int i = Integer.parseInt(s);
        Note note = SearchController.search_result.get(i - 1);
        String nameString = TextAnalyze.textDeAnalyze(note.getName());
        String textString = TextAnalyze.textDeAnalyze(note.getText());
        numberColumn.setText(i + "");
        nameColumn.setText(nameString);
        textColumn.setText(textString);
        if(note.getDeleted() == false){
            deletedColumn.appendText("Not deleted" + "\n");
        }
        if(note.getDeleted() == true){
            deletedColumn.appendText("Deleted" + "\n");
        }
        return note;
    }
}
