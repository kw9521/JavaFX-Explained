package MakeBasicWindow;

import PopUpWindows.PopUpWindows;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    public static void main(String[] args){
        launch(args);
    }

    /**
     * A window pops up asking user to click here but doesn't do anything once the user clicks there
     *
     * @param primaryStage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Title of Window");
        button = new Button("Press here");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}