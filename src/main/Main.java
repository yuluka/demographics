package main;

import java.io.IOException;

import controls.MainWindow;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.PointsData;

public class Main extends Application{

	public static void main(String[] args) {
		try {
			PointsData.loadData();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/MainWindow.fxml"));
		loader.setController(new MainWindow());
		Parent root = loader.load();
		
		Scene sc = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(sc);
		stage.show();
	}

}
