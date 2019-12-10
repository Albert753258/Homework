package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class NewNoteController implements Initializable {
    Scanner scanner;
    @FXML
    public TextField name;
    @FXML
    public TextArea text;
    @FXML
    public Button saveButton;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        saveButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    int number = Main.notes.peekLast().getNumber();
                    number ++;
                    Note note = new Note(number, name.getText(), text.getText());
                    Main.notes.add(note);
                    Main.writeNotes(note);
                    Stage stage = (Stage) saveButton.getScene().getWindow();
                    stage.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
