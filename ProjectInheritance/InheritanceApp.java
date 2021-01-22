class Cal {
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3; // this�� �ڱ��ڽ��� Ŭ������ �ǹ�.
	} // sum�޼ҵ尡 �ִµ� �� sum�޼ҵ带 ����� ������. �̰� �� �״´�, �����Ѵ�, ���� overloading
	  // �ڽĵ� overloading�� �� �ִ�. overloading�� overriding�̶� ���� ����ؼ� �򰥸��°ǵ�, ��� ��Ӻκп� ���ѵǴ� ǥ���� �ƴϴ�. 
}

// Cal2�� ���� ����°͵� ����. ������ �̹� Cal�� sum�޼ҵ尡 �ִµ� ���� �� �ߺ����� �ۼ��Ѵ�...? ��ȿ�����̾�...
//class Cal2 {
//	public int sum(int v1, int v2) {
//		return v1+v2;
//	}	
//
//	public int minus(int v1, int v2) {
//		return v1-v2;
//	}
//}

// Cal3�� Cal�� Ȯ���Ѵ� = Cal�� ��ӹ޾Ҵ�!
class Cal3 extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	public int sum(int v1, int v2) {
		System.out.println("Cal3!");
		return super.sum(v1,v2); // super�� �ڱⰡ ��ӹ��� ���� Ŭ������ �ǹ�.
	} // �θ� ������ �ִ� �޼ҵ带 ������� ��������!(������) overriding�ߴ�.
}


public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
//		c.sum(2,4);  // ȭ�鿡 �ƹ��͵� �� ��. ���� ���� ���ؼ� System.out.println() �޼ҵ� �ʿ���~
//		System.out.println(c.sum(3,2));
//		System.out.println(c.sum(2, 1, 1));
		
		Cal3 c3 = new Cal3();
//		System.out.println(c3.sum(3,2));
//		System.out.println(c3.minus(3,2));

		System.out.println(c.sum(2, 4));
		System.out.println(c3.sum(2, 4));
		System.out.println(c3.minus(4, 2));
	
	}

}
