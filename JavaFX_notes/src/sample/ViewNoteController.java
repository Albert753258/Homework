package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewNoteController implements Initializable {
    @FXML
    public Button removeButton;
    @FXML
    public Button saveButton;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        number.setText("Number");
        name.setText("Name");
        text.setText("Text");
        name.setEditable(false);
        number.setEditable(false);
        text.setEditable(false);
        numberColumn.setEditable(false);
        String s = Main.controller.numberOfView.getText();
        Main.controller.numberOfView.setText("");
        int i = Integer.parseInt(s);
        Note note = FindNotes.findNoteByNumber(i, Main.notes);
        String nameString = TextAnalyze.textDeAnalyze(note.getName());
        String textString = TextAnalyze.textDeAnalyze(note.getText());
        numberColumn.setText(i + "");
        nameColumn.setText(nameString);
        textColumn.setText(textString);
        int j = note.getId();
        int number = Main.notes.indexOf(note);
        int number1 = Main.notes_deleted.indexOf(note);
        removeButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Note note1 = Main.notes.get(number);
                note1.setDeleted(true);
                Main.notes.remove(number);
                Main.notes_deleted.set(number1, note1);
                Main.showNotes(Main.controller.textColumn, Main.controller.nameColumn, Main.controller.numberColumn);
                
            }
        });
        saveButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String nameString = TextAnalyze.textAnalyze(nameColumn.getText());
                String textString = TextAnalyze.textAnalyze(textColumn.getText());
                Note note2 = new Note(false, j, i, nameString, textString);
                Main.notes.set(number, note2);
                Main.notes_deleted.set(number1, note2);
                Main.showNotes(Main.controller.textColumn, Main.controller.nameColumn, Main.controller.numberColumn);
            }
        });
    }
}
