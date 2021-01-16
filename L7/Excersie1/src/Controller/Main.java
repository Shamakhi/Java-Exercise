package Controller;

import Model.Entity.PlanEntity;
import Model.Entity.UserEntity;
import Model.Repository.UserRepo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/sample.fxml"));
        primaryStage.setTitle("Data MVC");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("../view/13.jpg")));
        primaryStage.setScene(new Scene(root, 225, 300));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
