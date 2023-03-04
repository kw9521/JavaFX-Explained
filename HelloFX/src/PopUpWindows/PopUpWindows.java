package PopUpWindows;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PopUpWindows{

    /**
     * Makes the pop-up screen and centers it
     *
     * @param title: String
     * @param msg: String
     */
    public static void display(String title, String msg){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);    //prevents u from going back to other window
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(msg);
        Button closeButton = new Button("Click to close window");
        closeButton.setOnAction(e-> window.close());

        VBox layout = new VBox(10);      //for spacing <3
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);        // centers it

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); //show stage and wait for stage to close, FORCES YOU TO close the window before proceeding

    }
}
