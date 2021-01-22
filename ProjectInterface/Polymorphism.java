interface Ccalculable{
	double PI = 3.14; 
	int sum(int v1, int v2); 
}
interface pPrintable{
	void print();
}


class Rrrealcal implements Ccalculable, pPrintable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public void print() {
		System.out.println("This is Rrrealcal");
	}	
}

class AdvancedpPrint implements pPrintable{

	public void print() {
		System.out.println("This is AdvancedpPrint");
	}
	
}

public class Polymorphism {

	public static void main(String[] args) {
		pPrintable c = new Rrrealcal(); // �������̽��� �ν��Ͻ� ���� �� �տ� ������Ÿ�����ε� �� �� �ִ�.
//		System.out.println(c.sum(2,4)); // �ش��ڵ�� Ccalculable �ȿ� �־ �۵��� �� ����.
		c.print(); // �ڿ�  Rrrealcal�� ������, AdvancedpPrint�� �����Ŀ� ���� �ٸ��� Ȱ�� ����
		
		//������Ÿ���� �������̽��� ���� ��� �� ���� ȿ��.
		// 1. ���۹�ưó�� ����� �� �ִ�. ����Ʈ�� �� ������, ����� �� ������ �����Ͽ� �����ؼ� ���� �� �� �ֱ� ����.
		// 2. �ν��Ͻ� ���� �� ���� �������̽��� �����ϴ� Ŭ�������� ȣȯ��ų �� �ִ�.
		
	}

}

