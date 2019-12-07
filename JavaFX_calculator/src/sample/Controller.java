package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public TextField text;
    @FXML
    public TextField text1;
    @FXML
    public TextField result;
    @FXML
    public Button button;
    @FXML
    public Button button1;
    @FXML
    public Button button2;
    @FXML
    public Button button3;
    @FXML
    public Button button4;
    @FXML
    public Button button5;
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double a = Double.parseDouble(text.getText());
                double b = Double.parseDouble(text1.getText());
                double c = Main.plus(a, b);
                String s = "" + c;
                result.setText(s);
            }

        });
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double a = Double.parseDouble(text.getText());
                double b = Double.parseDouble(text1.getText());
                double c = Main.minus(a, b);
                String s = "" + c;
                result.setText(s);
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double a = Double.parseDouble(text.getText());
                double b = Double.parseDouble(text1.getText());
                double c = Main.umnozit(a, b);
                String s = "" + c;
                result.setText(s);
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double a = Double.parseDouble(text.getText());
                double b = Double.parseDouble(text1.getText());
                double c = Main.razdelit(a, b);

                String s = "" + c;
                result.setText(s);
            }
        });
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                text.setText("");
                text1.setText("");
                result.setText("");
            }
        });
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                double a = Double.parseDouble(text.getText());
                double b = Double.parseDouble(text1.getText());
                double c = Main.procent(a, b);
                String s = "" + c;
                result.setText(s);
            }
        });
    }
}
