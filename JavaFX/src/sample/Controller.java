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
    public TextField random_text;
    public Button button;
    public Button button1;
    Random random = new Random();
    public void initialize(URL location, ResourceBundle resources) {
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int s = random.nextInt();
                String t = "" + s;
                random_text.setText(t);
            }

        });
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                random_text.setText("");
            }
        });
    }
}
