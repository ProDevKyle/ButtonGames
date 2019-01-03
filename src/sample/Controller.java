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
    private Button button;

    private static int num = 0;
    public static void click(ActionEvent actionEvent)
    {
        num++;
    }
}