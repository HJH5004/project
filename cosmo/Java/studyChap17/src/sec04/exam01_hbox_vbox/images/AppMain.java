package sec04.exam01_hbox_vbox.images;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Parent root= FXMLLoader.load(getClass().getResource("root.fxml"));
		VBox root = (VBox)FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setResizable(false);//�ش��ϴ� x,y ��ǥ�� ������ ũ�⿡ ���� ���ϴ� ���� �����ϱ� ����
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	

}