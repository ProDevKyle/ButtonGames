package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller
{
    @FXML
    private Label label;

    @FXML
    private Button button1, button2;
    private int score;

    public void click(ActionEvent actionEvent)
    {
        score++;
    }

    public void total(ActionEvent actionEvent)
    {
        button2.setText(Integer.toString(score));
    }
}