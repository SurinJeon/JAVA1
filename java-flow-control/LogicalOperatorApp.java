
public class LogicalOperatorApp {

	public static void main(String[] args) {
		// AND
		System.out.println(1 == 1);
		System.out.println(true && true); // �������ڴ� boolean �� ���� Ȯ���ϰ� true false �˷���
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		// &&�� �ѱ����� '�׸���' 
		
		
		// OR
		System.out.println(true || true); // �������ڴ� boolean �� ���� Ȯ���ϰ� true false �˷���
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// NOT
		System.out.println(!true); // false
		System.out.println(!false); // true
	}

}
