import java.util.Scanner;

public class Welcome {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;

	static CartItem[] mCartItem = new CartItem[NUM_BOOK];
	static int mCartCount = 0;

	public static void main(String[] args) {
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

		Scanner input = new Scanner(System.in);
		System.out.print("����� �̸��� �Է��ϼ��� : ");
		String userName = input.next();

		System.out.print("����ó�� �Է��ϼ��� : ");
		int userMobile = input.nextInt();
		// System.out.println("Welcome to Shopping Mall"); ----[������Ʈ 1-1]���� �ۼ��� ����
		// System.out.println("Welcome to Book Market!"); ----[������Ʈ 1-1]���� �ۼ��� ����

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";

		boolean quit = false;

		while (!quit) {
			System.out.println("***********************************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			/*
			 * System.out.println("***********************************************");
			 * System.out.println(" 1. �� ���� Ȯ���ϱ� \t4. �ٱ��Ͽ� �׸� �߰��ϱ�");
			 * System.out.println(" 2. ��ٱ��� ��ǰ ��� ���� \t5. ��ٱ��Ͽ� �׸���� ���̱�");
			 * System.out.println(" 3. ��ٱ��� ���� \t6. ��ٱ����� �׸� �����ϱ�");
			 * System.out.println(" 7. ������ ǥ���ϱ� \t8. ����");
			 * System.out.println("***********************************************");
			 */

			menuIntroduction();

			System.out.print("�޴� ��ȣ�� �������ּ��� ");
			int n = input.nextInt();
			// System.out.println(n + "���� �����߽��ϴ�");

			if (n < 1 || n > 8) {
				System.out.println("1���� 8������ ���ڸ� �Է��ϼ���.");
			} else {
				switch (n) {

					case 1:
						// System.out.println("���� �� ���� : ");
						// System.out.println("�̸� " + userName + " ����ó " + userMobile);
						menuGuestInfo(userName, userMobile);
						break;
					case 2:
						// System.out.println("��ٱ��� ��ǰ ��� ���� :");
						menuCartItemList();
						break;
					case 3:
						// System.out.println("��ٱ��� ����");
						menuCartClear();
						break;
					case 4:
						// System.out.println("��ٱ��Ͽ� �׸� �߰��ϱ� : ");
						menuCartAddItem(mBook);
						break;
					case 5:
						// System.out.println("5. ��ٱ����� �׸� ���� ���̱�");
						menuCartRemoveItemCount();
						break;
					case 6:
						// System.out.println("6. ��ٱ����� �׸� �����ϱ�");
						menuCartRemoveItem();
						break;
					case 7:
						// System.out.println("7. ������ ǥ���ϱ�");
						menuCartBill();
						break;
					case 8:
						// System.out.println("8. ����");
						menuExit();
						quit = true;
						break;
				}
			}
		}

	}

	public static void menuIntroduction() {
		System.out.println("******************************");
		System.out.println(" 1. �� ���� Ȯ���ϱ� \t4. �ٱ��Ͽ� �׸� �߰��ϱ�");
		System.out.println(" 2. ��ٱ��� ��ǰ ��� ���� \t5. ��ٱ����� �׸� ���� ���̱�");
		System.out.println(" 3. ��ٱ��� ���� \t6. ��ٱ����� �׸� �����ϱ�");
		System.out.println(" 7. ������ ǥ���ϱ� \t8. ����");
		System.out.println("******************************");
		
	}

	public static void menuGuestInfo(String name, int mobile) {
		System.out.println("���� �� ���� : ");
		//System.out.println("�̸� " + name + " ����ó " + mobile);
		Person person = new Person(name, mobile);
		System.out.println("�̸�"+person.getName() + " ����ó: "+person.getPhone());


	}

	public static void menuCartItemList() {
		System.out.println("��ٱ��� ��ǰ ��� :");
	}

	public static void menuCartClear() {
		System.out.println("��ٱ��� ����");
		System.out.println("��ٱ��� ��ǰ ���: ");
		System.out.println("======================================");
		System.out.println("   ����ID \t|     ���� \t|      �հ�");
		for (int i = 0; i < mCartCount; i++) {
			System.out.printf("    " +mCartItem[i].getBookID() + "\t: ");
			System.out.printf("    " +mCartItem[i].getQuantity() + "\t: ");
			System.out.printf("    " +mCartItem[i].getTotalPrice());
			System.out.println("    ");
		}
		System.out.println("======================================");

	}

	public static void menuCartAddItem(String[][] book) {
		// System.out.println("��ٱ��Ͽ� �׸� �߰��ϱ� : ");

		BookList(book);
		for (int i = 0; i < NUM_BOOK; i++) {
			for (int j = 0; j < NUM_ITEM; j++)
				System.out.print(book[i][j] + " | ");
			System.out.println("");
		}
		boolean quit = false;

		while (!quit) {

			System.out.print("��ٱ��Ͽ� �߰��� ������ ID�� �Է��ϼ��� :");

			Scanner input = new Scanner(System.in);
			String str = input.nextLine();

			boolean flag = false;
			int numId = -1;

			for (int i = 0; i < NUM_BOOK; i++) {
				if (str.equals(book[i][0])) {
					numId = i;
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("��ٱ��Ͽ� �߰��ϰڽ��ϱ�? Y | N ");
				str = input.nextLine();

				if (str.toUpperCase().equals("Y")) {
					System.out.println(book[numId][0] + " ������ ��ٱ��Ͽ� �߰��Ǿ����ϴ�.");
					// ��ٴϱ��Ͽ� �ֱ�
					if(!isCartInBook(book[numId][0]))
						mCartItem[mCartCount++] = new CartItem((book[numId]));

				}
				quit = true;
			} else
				System.out.println("�ٽ� �Է��� �ּ���");

		}
	}

	public static void menuCartRemoveItemCount() {
		System.out.println("5. ��ٱ����� �׸� ���� ���̱�");
	}

	public static void menuCartRemoveItem() {
		System.out.println("6. ��ٱ����� �׸� �����ϱ�");
	}

	public static void menuCartBill() {
		System.out.println("7. ������ ǥ���ϱ�");
	}

	public static void menuExit() {
		System.out.println("8. ����");
	}

	public static void BookList(String[][] book) {

		book[0][0] = "ISBN1234";
		book[0][1] = "���� ���� JSP �� ���α׷���";
		book[0][2] = "27000";
		book[0][3] = "�۹̿�";
		book[0][4] = "�ܰ躰�� ���θ��� �����ϸ� ���� JSP �� ���α׷��� ";
		book[0][5] = "IT������";
		book[0][6] = "2018/10/08";

		book[1][0] = "ISBN1235";
		book[1][1] = "�ȵ���̵� ���α׷���";
		book[1][2] = "33000";
		book[1][3] = "���糲";
		book[1][4] = "�ǽ� �ܰ躰 ������ ���丵!";
		book[1][5] = "IT������";
		book[1][6] = "2022/01/22";

		book[2][0] = "ISBN1236";
		book[2][1] = "��ũ��ġ";
		book[2][2] = "22000";
		book[2][3] = "����";
		book[2][4] = "��ǻ�� ������ Ű��� ��� �ڵ�";
		book[2][5] = "��ǻ���Թ�";
		book[2][6] = "2019/06/10";
	}

	public static boolean isCartInBook(String bookId) {
		boolean flag = false;
		for (int i = 0; i < mCartCount; i++) {
			if(bookId == mCartItem[i].getBookID()) {
				mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
				flag = true;

			}

		}
		return flag;
	}
}