package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExmaple {
	public static void main(String[] args) {
		//���ù�ȣ
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.println("���� ��ȣ: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		//��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.println("��÷ ��ȣ: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		//��÷����
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("��÷ ����: ");
		if(result) {
			System.out.println("��÷�Դϴ�");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�");
		}
		
	}

}
