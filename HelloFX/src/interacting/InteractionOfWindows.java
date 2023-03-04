package interacting;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class InteractionOfWindows{

    static boolean answer;

    /**
     *
     * @param title: String
     * @param msg: String
     */
    public static boolean display(String title, String msg){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);    //prevents u from going back to other window
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(msg);

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e->{
            answer = true;
            window.close();
        });

        noButton.setOnAction(e->{
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);      //for spacing <3
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);        // centers it
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); //show stage and wait for stage to close, FORCES YOU TO close the window before proceeding

        return answer;
    }
}
