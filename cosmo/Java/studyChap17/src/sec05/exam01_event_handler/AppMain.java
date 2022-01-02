package sec05.exam01_event_handler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPrefSize(200, 50);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		
		Button btn1 = new Button("��ư1");
		//������ ���� �̺�Ʈ�� �͸���ü�� ���� �� �ڸ����� �����ϰ� �ѹ��� ����°�
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("��ư 1 Ŭ��");
			}
		});
		
		Button btn2 = new Button("��ư2");
		//������ �̺�Ʈ�� �����ϰ� ���ٽ����� �ۼ�
		btn2.setOnAction(event -> System.out.println("��ư 2 Ŭ��"));
		
		//�ϳ��ϳ� �߰��� �� ������ �̷��� �ѹ��� ���� �߰� �� �� �ִ�
		root.getChildren().addAll(btn1,btn2);
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("AppMain");
		primaryStage.setOnCloseRequest(event-> System.out.println("���� Ŭ��"));
		primaryStage.show();
		
		/*
		 * Note
		 * ��ư�� ���� �� ���� �̺�Ʈ �ڵ鷯�� �ش� �ϴ� ������ �߻��Ͽ��� �� 
		 * ����� ���� ��ų �� �ְڱ� ���ش�.
		 * �� �̺�Ʈ �ڵ鷯�� ��� �͸� ��ü�� �۵��� �� ������ ���ٽ����ε� �ۼ� �� �� �ִ�
		 */
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}