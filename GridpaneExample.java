import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class GridpaneExample extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		GridPane root=new GridPane();
		Label firstname=new Label("First Name");
		TextField tf1=new TextField();
		Label lastname=new Label("Last Name");
		TextField tf2=new TextField();
		Button b=new Button("Submit");
		
		root.addRow(0,firstname,tf1);
		root.addRow(1,lastname,tf2);
		root.addRow(2,b);
		
		Scene scene=new Scene(root,300,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
}