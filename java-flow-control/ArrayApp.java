
public class ArrayApp {

	public static void main(String[] args) {
		
		// goyoung, miamia, baduck �������� ���� ��ΰ� �ʿ���.
//		String users = "goyoung, miamia, baduck"; 
		// ��ó�� �ص� ��. ��ġ�� ���� ���� �����ְ� �ɰ��� ���̰��ϴ� ������ �ʿ������� ��. ��������..�̻����� ��������...
		// �Ʒ�ó�� �غ���.
		String[] users = new String[3]; // �� ĭ ¥�� ĳ��� ������� ���! ������ 3��
		users[0] = "goyoung"; // ������ ī������ 0���ʹ�...(�� �̻���) 0�̶�� index �ٿ���.
		users[1] = "miamia";
		users[2] = "baduck";
		
		System.out.println(users[1]); // miamia
		System.out.println(users.length); // ���� �� ���� ��� �ǹ̺��ٴ�, �� ĭ¥�� �迭�̴� ��� �ؼ��ϴ°� �� �˸���.


		
		// ó�� �迭�� ������ ��,�ƿ� ���� �־ ������� ������?
		int[] scores = {10, 100, 1000};
		System.out.println(scores[0]);
		System.out.println(scores.length);
		
		
	}

}
