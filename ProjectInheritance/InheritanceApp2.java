class Cul {
	int v1,v2;
	public Cul(int v1, int v2) {
		System.out.println("I'm Cul");
		this.v1 = v1;
		this.v2 = v2;
		
	}
	public int sum() {
		return this.v1+v2;
	} // sum()���� ���̻� ���ڸ� ���� ����. �̹� �����ڿ��� �ʼ��� ���� �޵��� �����صּ�, �ν��Ͻ�ȭ �Ҷ� ���� ���� ����־����.
}

//Cul3�� �θ��� Cul�� ������ �޼ҵ带 ������ �ִ�. ->�׷��ٸ� Cul3�� �ڽĵ�! ������! �Ȱ��� ������ �޼ҵ带 �������Ѵٰ� ������~!
class Cul3 extends Cul {

	public Cul3(int v1, int v2) {
		super(v1, v2); // ���⼭ super�� �θ�Ŭ������ ������! �ܼ��� ������ ������ �ƴ϶� super�� �Ἥ �ؾ��Ѵ�.
		System.out.println("I'm Cul3");
	}
	public int minus() {
		return this.v1-v2;
	}

		
}


public class InheritanceApp2 {

	public static void main(String[] args) {
		Cul c = new Cul(2,1); // I'm Cul
		Cul3 c3 = new Cul3(2,1); // I'm Cul ����� �Ŀ� I'm Cul3 ����� ��. 
		
		System.out.println(c3.sum()); // 3 I'm Cul3 �̷��� �� ����. �ֳ��ϸ� �װ� �ν��Ͻ��� ���� �̾߱�� ��� ���� sum()�� ȣ���߱� ������
		System.out.println(c3.minus()); // 1	
	}

}
