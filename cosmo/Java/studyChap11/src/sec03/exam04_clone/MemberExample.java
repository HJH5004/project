package sec03.exam04_clone;

public class MemberExample {
	public static void main (String[] args) {
		Member original = new Member("ȫ�浿", 25, new int[] {90,90}, new Car("�Ÿ"));
		
		
		Member cloned = original.getMember();
		cloned.scores[0]=100;
		cloned.car.model = "�׷���";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name"+cloned.name);
		System.out.println("age"+cloned.age);
		System.out.print("score: {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
			//, �־��ִ� �Է¾�
		}
		System.out.println("}");
		System.out.println("Car"+cloned.car.model);
		
		System.out.println("------------------------------");
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name"+original.name);
		System.out.println("age"+original.age);
		System.out.print("score: {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("Car"+original.car.model);
	}

}
