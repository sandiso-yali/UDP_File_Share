import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FileShare extends javafx.application.Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Pane root = new Pane();
		
		stage.setScene(new Scene(root, 600, 500));
		stage.setTitle("Testing");
		stage.show();
	}

}
