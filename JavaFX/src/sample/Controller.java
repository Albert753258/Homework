package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField text;
    public TextField text1;
    public TextField result;
    public Button button;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    Random random = new Random();
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                long a = Long.parseLong(text.getText());
                long b = Long.parseLong(text1.getText());
                long c = Main.plus(a, b);
                String s = "" + c;
                result.setText(s);
            }

        });
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                long a = Long.parseLong(text.getText());
                long b = Long.parseLong(text1.getText());
                long c = Main.minus(a, b);
                String s = "" + c;
                result.setText(s);
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                long a = Long.parseLong(text.getText());
                long b = Long.parseLong(text1.getText());
                long c = Main.umnozit(a, b);
                String s = "" + c;
                result.setText(s);
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                long a = Long.parseLong(text.getText());
                long b = Long.parseLong(text1.getText());
                long c = Main.razdelit(a, b);
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
    }
}
