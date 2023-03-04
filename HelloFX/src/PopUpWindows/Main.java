package PopUpWindows;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Example code for making pop-up windows
 */
public class Main extends Application implements EventHandler<ActionEvent> {

    Button button;
    Stage window;

    public static void main(String[] args){
        launch(args);
    }

    /**
     * Prompts user to click on 1 button and another screen pops up, not allowing user to go back to the other scene
     * unless they interact with current screen
     *
     * @param primaryStage the primary stage for this application, onto which
     * the application scene can be set.
     * Applications may create other stages, if needed, but they will not be
     * primary stages.
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        primaryStage.setTitle("Title of Window");


        button = new Button("Press here");
        button.setOnAction(e-> PopUpWindows.display("Title of window", "wow, this is cool"));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout,300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == button){
            System.out.println("this is a cool button lol");
        }
    }
}