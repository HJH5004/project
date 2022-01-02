package sec07.exam04_array_management;

public class Tire {
	public int maxRotation;         //�ִ����(�ִ� ȸ����)
	public int accumulatedRotation; // ����ȸ����
	public String location;
	
	public Tire(String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	//�޼ҵ�
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire ����:"+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else {
			System.out.println("***"+location+"Tire ��ũ***");
			return false;
		}
	}
	

}