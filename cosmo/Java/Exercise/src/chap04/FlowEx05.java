package chap04;

import java.util.Scanner;

//��ø�� if ���ǹ�
public class FlowEx05 {
	public static void main(String[] args) {
//		int score = 0;
//		char grade = ' ';
//		char opt = '+';
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine();
//		
//		score = Integer.parseInt(tmp);
//		/* ����:
//		 * score�� 90�� ���� ũ�ų� ������ A����(=grade)
//		 *        90�� �̻� �߿����� 98�� �̻��̸� opt�� Ȱ���Ͽ� A+�� ��µǵ���
//		 * 		  94�� �̸��̸� A-
//		 * score�� 80�� ���� ũ�ų� ������ B����(=grade)
//		 *        80�� �̻� �߿����� 98�� �̻��̸� opt�� Ȱ���Ͽ� B+�� ��µǵ���
//		 * 		  84�� �̸��̸� B-
//		 * �������� C ����
//		 */
//		if(score>=90) {
//			grade = 'A';
//			/*
//			 * 
//			 */
//		} else if(score >= 80) {
//			grade = 'B';
//			/*
//			 * 
//			 */
//			
//		} else {
//			grade = 'C';
//		}
//		System.out.printf("����� ������ %c%c�Դϴ�", grade, opt);//���� �ִ� ��¹��� �ۼ��Ҷ��� printf�� ����Ѵ�.
		
		
		
		int score = 0;
		char grade = ' ';
		char opt = '0';
		boolean run = true;
		
		while(run) {
		System.out.print("������ �Է����ּ���.>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		score = Integer.parseInt(tmp);
		
		if(score>=90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			} else if (score<94) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score>=88) {
				opt = '+';
			} else if (score<84) {
				opt = '-';
			} else {
				opt = ' ';
			}
			
		} else {
			grade = 'C';
			opt = ' ';
		}
		
		
		System.out.printf("����� ������ %c%c�Դϴ�.", grade, opt);
//		char test1 = 'ȫ';
//		System.out.printf("����� ������ %c%c�Դϴ� %c%c%c%c", grade, opt, test1, test1,test1,test1);//���� �ִ� ��¹��� �ۼ��Ҷ��� printf�� ����Ѵ�.
//		//printf���� ����� �ִ� ��¹����� ��� �� �� ������ �� �� ������ �� �ִ� ������ ���� ������ ����. �ٸ� String���� �� �� ����. ��?
		System.out.println();
		}
			
		
		
		
		
	}

}