package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage MainViewStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Gui/Views/MainView.fxml"));
        MainViewStage.setTitle("MMS");
        MainViewStage.setScene(new Scene(root));
        MainViewStage.setResizable(false);
        MainViewStage.show();
    }
}
