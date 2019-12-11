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
    public TextArea text;
    @FXML
    public TextField numberOfView;
    @FXML
    public Button addButton;
    @FXML
    public Button viewButton;
    @Override
    public void initialize(URL location, ResourceBundle resources){
        Main.controller = this;
        Main.showNotes(text);
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                Stage stage = new Stage();
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("newNote.fxml"));
                    stage.setTitle("Добавить заметку");
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
                if (i == null){
                }
                else {
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
    }
}
