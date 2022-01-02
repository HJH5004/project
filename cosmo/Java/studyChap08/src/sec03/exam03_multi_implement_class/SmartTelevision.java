package sec03.exam03_multi_implement_class;


public class SmartTelevision implements RemoteControl, Searchable { //�������� �������̼����� ȣ���� �� �ִ�
	private int volume;

	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else  {
			this.volume = volume;
		}
		System.out.println("���� TV ������"+volume+"�Դϴ�.");
			
		
	}
	
	@Override //���ʿ� �ִ� interface�� method ���� ������
	public void search(String url) {
		System.out.println(url+"�� �˻��մϴ�");
		
	}

}