import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("����� �̸��� �Է��ϼ��� : ");
		String userName = input.next();

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";

		boolean quit =false;
		while (!quit) {
			System.out.println("***********************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			System.out.println("***********************************************");
			System.out.println(" 1. �� ���� Ȯ���ϱ� \t4. �ٱ��Ͽ� �׸� �߰��ϱ�");
			System.out.println(" 2. ��ٱ��� ��ǰ ��� ���� \t5. ��ٱ����� �׸� ���� ���̱�");
			System.out.println(" 3. ��ٱ��� ���� \t6. ��ٱ����� �׸� �����ϱ�");
			System.out.println(" 7. ������ ǥ���ϱ� \t8. ����");
			System.out.println("***********************************************");

			System.out.print("�޴���ȣ�� �Է��ϼ��� ");
			int n = input.nextInt();
			//System.out.println(n + "���� �����߽��ϴ�");

			if(n<1||n>8) {
				System.out.println("1���� 8���� �Է¿��");

			}
			else {
				switch (n) {
					case 1:
						System.out.println("���� �� ���� : ");
						System.out.println("�̸� : " +userName);
						break;
					case 2:
						System.out.println("2. ��ٱ��� ��ǰ ��� ���� :");
						break;
					case 3:
						System.out.println("3. ��ٱ��� ����");
						break;
					case 4:
						System.out.println("4. ��ٱ��Ͽ� �׸� �߰��ϱ� : ");
						break;
					case 5:
						System.out.println("5. ��ٱ����� �׸� ���� ���̱�");
						break;
					case 6:
						System.out.println("6. ��ٱ����� �׸� �����ϱ�");
						break;
					case 7:
						System.out.println("7. ������ ǥ���ϱ�");
						break;
					case 8:
						System.out.println("8. ����");
						quit = true;
						break;

				}
			}
		}


	}
}