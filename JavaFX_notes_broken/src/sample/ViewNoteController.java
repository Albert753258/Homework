package sample;

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
        String s = Main.controller.numberOfView.getText();
        int i = Integer.parseInt(s);
        Note note = Main.findNote(i);
        numberColumn.setText(note.getNumber() + "");
        nameColumn.setText(note.getName() + "");
        textColumn.setText(note.getText());
        int j = note.getId();
        removeButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Note note1 = Main.notes.get(j - 1);
                note1.setDeleted(true);
                Main.notes.set(j - 1, note1);
                Main.notes_deleted.set(j - 1, note1);
                Main.showNotes(Main.controller.text);
                try {
                    Files.writeList();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        saveButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                TextAnalyze.analyze(nameColumn, textColumn);
                Note note2 = new Note(false, j, i, nameColumn.getText(), textColumn.getText());
                int number = Main.notes.indexOf(note);
                Main.notes.set(number, note2);
                Main.notes_deleted.set(j - 1, note2);
                Main.showNotes(Main.controller.text);
                try {
                    Files.writeList();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
