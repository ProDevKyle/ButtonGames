package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

import javax.xml.soap.Text;

public class GameCode extends Application
{
    @FXML
    private Button button1, button2;
    private int score;
    private int highscore = 0;
    @FXML
    private Text text;

    public void click(ActionEvent actionEvent)
    {
        score++;

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(5000), ae -> endGame()));
        timeline.play();
    }

    public void findScore(ActionEvent actionEvent)
    {
        button2.setText(Integer.toString(score));
        //
        // getHighScore();
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }

    public void endGame()
    {
        button1.setText("Game over!");
        button1.setDisable(true);
    }

    /*public void getHighScore()
    {
        if (highscore == 0)
            highscore = score;
        else if (score > highscore)
            highscore = score;
        text.setTextContent(String.valueOf(highscore));
    }*/

    public static void main(String[] args)
    {
        launch(args);
    }
}