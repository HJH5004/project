package sec07.exam03_field_polymorphism.review;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "�� ����" +(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else {
			System.out.println("***"+location+"KumhoTire ��ũ"+"***");
			return false;
		}
	}
	

}
