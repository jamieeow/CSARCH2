package CSARCH2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CSARCH.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        ((UnsignedIntDivController) fxmlLoader.getController()).setStage(primaryStage);
        primaryStage.setTitle("Non-restoring division Simulator - CSARCH2 S12 G11");
        primaryStage.setScene(new Scene(root, 640, 400));
        primaryStage.show();





    }


    public static void main(String[] args) {
        launch(args);
    }
}
