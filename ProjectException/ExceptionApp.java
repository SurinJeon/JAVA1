public class ExceptionApp {
	public static void main(String[] args) {
		
		
		int[] scores = {10, 20, 30};
//		try {
//		System.out.println(scores[3]); // [3]�� �׹�° �迭 ���ε� �׹�°�� ����. ���ܰ� �߻��� ����
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("���� ���Դϴ�.");
//		}
		
		
		// �� �ؿ� ��������... ���� ���� �� �� ����... �ϴ� �ݸ��ؼ� ����ó�� �غ���... try catch ��������!
//		try {
//			System.out.println(2/0); // �ڹٿ����� 2�� 0���� ���� �� ����. �̰� ����ġ ���� ��Ȳ, ����
//		} catch(ArithmeticException e) {
//			System.out.println("�߸��� ����Դϴ�.");
//		}
		
		
		
		// �� ���� �ϴ� ���! // ��� ���� ������ �ϴ°� �ƴ� (�̹��ϰ� ���� ó���ϴ°� �ٸ�) 
		
		try {
			System.out.println(2);
//			System.out.println(scores[3]);
// �Ʒ� �� ��������� ��ȸ�� �ƿ� ������ ����. �� �ٿ��� �̹� �迭���ܰ� ���������� try-catch������ ������������
			System.out.println(3); 
			System.out.println(2/0);
			System.out.println(4);
		}  catch(ArithmeticException e) {
			System.out.println("�߸��� ����Դϴ�."+e.getMessage());
			e.printStackTrace();
		}  catch (Exception e) {
			System.out.println("���� �̻��մϴ�. ������ �߻��߽��ϴ�."+e.getMessage());
		} // �θ� ���ܸ� ���ٳ����� �Ʒ� �ΰ��� �����̱� ������ �˾Ƽ� ó�� ������
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("���� ���Դϴ�.");
//		} 
		System.out.println(5);
		
		
	}

}
