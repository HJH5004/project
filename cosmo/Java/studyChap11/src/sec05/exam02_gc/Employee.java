package sec05.exam02_gc;

public class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno=eno;
		System.out.println("Rmployee("+eno+")�� �޸𸮿� ���Ե�");
	}
	
	public void finalize() {
		System.out.println("Employee"+eno+"�� �޸𸮿� ���ŵ�");
	}

}
