package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.ArrayList;

public class GameCode extends Application
{
    private ArrayList<Integer> sequence = new ArrayList<Integer>();

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Button Game");
        primaryStage.setScene(new Scene(root, 200, 200));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
        new BackEnd(10);
    }
}
