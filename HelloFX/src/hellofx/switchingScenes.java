package hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class switchingScenes extends Application{

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primarysStage) throws Exception {
        window = primarysStage;
        
        // Label is a chunk of text, user doesnt interact w it at all
        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));      //does something when you click it, goes to scene2

        //Layout 1 = children are laid out in vertical columns
        VBox layout1 = new VBox(20);                    // stacks all obj on top of each other in column with a 20 spacing
        layout1.getChildren().addAll(label1, button1);          // add items to the layout
        scene1 = new Scene(layout1, 200, 200);

        //Button 2
        Button button2 = new Button("this scene suckkkks go back to scene 1");
        button1.setOnAction(e -> window.setScene(scene1));      //does something when you click it

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout1, 600, 600);

        // how window knows to displace scene1 first?
        window.setScene(scene1);
        window.setTitle("TItle goes here");
        window.show();

    }

}
