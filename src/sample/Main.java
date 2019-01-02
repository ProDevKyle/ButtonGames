package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Button Game");
        Button button = new Button("Click me.");
        button.setStyle("-fx-text-fill: #0000ff");
        button.setMaxSize(100,50);
        button.setAlignment(Pos.CENTER);
        HBox hbox = new HBox(button);
        Scene scene = new Scene(hbox, 200,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        Application.launch(args);
        new TimerClass(10);

    }
}
