public class Welcome {
	public static void main(String[] args) {

		// System.out.println("Welcome to Shopping Mall"); ----[������Ʈ 1-1]���� �ۼ��� ����
		// System.out.println("Welcome to Book Market!"); ----[������Ʈ 1-1]���� �ۼ��� ����

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";

		System.out.println("***********************************************");
		System.out.println("\t" + greeting);
		System.out.println("\t" + tagline);
		System.out.println("***********************************************");
		System.out.println(" 1. �� ���� Ȯ���ϱ� \t4. �ٱ��Ͽ� �׸� �߰��ϱ�");
		System.out.println(" 2. ��ٱ��� ��ǰ ��� ���� \t5. ��ٱ����� �׸� ���� ���̱�");
		System.out.println(" 3. ��ٱ��� ���� \t6. ��ٱ����� �׸� �����ϱ�");
		System.out.println(" 7. ������ ǥ���ϱ� \t8. ����");
		System.out.println("***********************************************");
	}
}