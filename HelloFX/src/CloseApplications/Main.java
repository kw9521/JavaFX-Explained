package CloseApplications;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;
    Stage window;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        primaryStage.setTitle("JavaFX - Closing Applications");
        button = new Button("Press here");
//        button.setOnAction(e -> close);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
