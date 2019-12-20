package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class SearchController implements Initializable {

    @FXML
    public Button viewButton;
    @FXML
    public TextArea textColumn;
    @FXML
    public TextArea nameColumn;
    @FXML
    public TextArea numberColumn;
    @FXML
    public TextField numberOfView;
    @FXML
    public TextField searchText;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for(int i = 1; i <= Main.notes.size(); i ++){
            Note note = Main.notes.get(i - 1);
            numberColumn.appendText(i + "\n");
            nameColumn.appendText(note.getName() + "\n");
            textColumn.appendText(note.getText() + "\n");
        }
        searchText.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.equals("")) {
                nameColumn.setText("");
                textColumn.setText("");
                numberColumn.setText("");
                int i = 1;
                for(Note note: Main.notes){
                    numberColumn.appendText(i + "\n");
                    nameColumn.appendText(note.getName() + "\n");
                    textColumn.appendText(note.getText() + "\n");
                    i ++;
                }
            } else {
                nameColumn.setText("");
                textColumn.setText("");
                numberColumn.setText("");
                int i = 1;
                LinkedList<Note> search_result = new LinkedList();
                FindNotes.findNote(searchText.getText(), searchText.getText(), search_result);
                for(Note note: search_result){
                    numberColumn.appendText(i + "\n");
                    nameColumn.appendText(note.getName() + "\n");
                    textColumn.appendText(note.getText() + "\n");
                    i ++;
                }
            }
        });
    }
}
