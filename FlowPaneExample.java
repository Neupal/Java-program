import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class FlowPaneExample extends Application
{
	public void start(Stage primaryStage) throws Exception
	{
		FlowPane root=new FlowPane();
		Button b1=new Button("Start");
		Button b2=new Button("Finish");
		
		root.getChildren().addAll(b1,b2);
		Scene scene=new Scene(root,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch();
		
	}
}