package dad.app;

import dad.controller.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

	private RootController rootController = new RootController();

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(rootController.getView()));
		primaryStage.setTitle("Calendario JavaFX");
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/images/calendar-64x64.png")));
		primaryStage.show();
	}
}
