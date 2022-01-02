package sec03.exam03_margin_padding;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Appmain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//��� ����
//		//��Ʈ �����̳� ����
//		HBox hbox = new HBox();
		//��� ����
//		hbox.setPadding(new Insets(50,10,10,50));//���� �� ������ �Ʒ� ���� ��
//		
//		
//		//��Ʈ �����̳ʿ� �� ���ҽ� ����
//		Button button = new Button();
//		//�ڽ� ũ�� ����
//		button.setPrefSize(100, 100);
		
		
		//Margin �����ϴ°�!!
		HBox hbox = new HBox();
		Button button = new Button();
		button.setPrefSize(100, 100);
		HBox.setMargin(button, new Insets(10,10,50,50));
		
		
		
		//�����̳ʿ� ��� ����
		hbox.getChildren().add(button);
		Scene scene = new Scene(hbox);
		
		//�����쿡 ���� �־���
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		
		//�����츦 �����ֵ��� ����
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}