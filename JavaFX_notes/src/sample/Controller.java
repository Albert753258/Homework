package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public TextArea textColumn;
    @FXML
    public TextArea nameColumn;
    @FXML
    public TextArea numberColumn;
    @FXML
    public TextArea text;
    @FXML
    public TextArea name;
    @FXML
    public TextArea number;
    @FXML
    public TextField numberOfView;
    @FXML
    public Button addButton;
    @FXML
    public Button viewButton;
    @FXML
    public Button searchButton;
    @Override
    public void initialize(URL location, ResourceBundle resources){
        Main.controller = this;
        Main.showNotes(textColumn, nameColumn, numberColumn);
        text.setEditable(false);
        name.setEditable(false);
        number.setEditable(false);
        textColumn.setEditable(false);
        nameColumn.setEditable(false);
        numberColumn.setEditable(false);
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Stage stage = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("newNote.fxml"));
                    stage.setTitle("Add new note");
                    stage.setScene(new Scene(root, 700,500));
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        viewButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                String s = numberOfView.getText();
                Integer i = Integer.parseInt(s);
                if (!(i == null)){
                    Stage stage = new Stage();
                    try {
                        Parent root = FXMLLoader.load(getClass().getResource("ViewNote.fxml"));
                        stage.setTitle("");
                        stage.setScene(new Scene(root, 700,500));
                        stage.show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        searchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Stage stage = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("searchNote.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.setTitle("Find note");
                stage.setScene(new Scene(root, 1000,500));
                stage.show();
            }
        });
    }
}
