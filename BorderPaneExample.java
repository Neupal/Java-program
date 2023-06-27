import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class BorderPaneExample extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		BorderPane root=new BorderPane();
		root.setTop(new Button("This will be at the top"));
		root.setBottom(new Button("This will be at the bottom"));
		root.setLeft(new Button("This will be at the left"));
		root.setCenter(new Button("This will be at the center"));
		root.setRight(new Button("This will be at the right"));
		
		Scene scene=new Scene(root,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}