
public class IfApp {

	public static void main(String[] args) {
		// �Ʒ� �� ������ ����� '�������' a 1 b�� ���ð��̴�.
//		System.out.println("a");
//		System.out.println(1);
//		System.out.println("b");

		// ������ ������ ����, � ���� a ����� 1 b ���� ������ �ϰ�ʹ�! -> ���ǹ�
		System.out.println("a");
		if(true) {
			System.out.println(1);
		} // if�� () �ȿ� �ִ� �ڵ尡 true��� {}���� �ڵ�� ����ȴ�.
		System.out.println("b");
		
		if(false) {
			System.out.println(1); 
		} // if�� () �ȿ� �ִ� �ڵ尡 false�� ������ {} ���� �ڵ�� ������� �ʾ���.
		  // ������ false��� ���������� �������� �̰� ���߿� ��ȭ������ �ڵ�� �������.
		
		System.out.println("a");
		if(true) {
			System.out.println(1);
		} else {
			System.out.println(2);
		} // else�� ����� �ϳ��� if������ grouping ����
		System.out.println("b");
		
		
		
	
//		if(false) {
//			System.out.println(1);
//		} else {
//			if(true) {
//				System.out.println(2);
//			} else {
//				System.out.println(3);
//				}
//		}

		// ���� ������(��ø if��) �� ����ϰ� ���ڰ� �� �� �Ʒ�!
		if(false) {
			System.out.println(1);
		} else if(true) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	}

}
