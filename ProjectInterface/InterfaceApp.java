interface Calculable{
	double PI = 3.14; // ���� �������̽��� ������ �� ���µ� ������ ��쿡�� �� ���� �������ν� ������ ����Ⱑ ������.
	int sum(int v1, int v2); // �ݸ� �޼ҵ��� ��쿡�� �޼ҵ尡 ��� �����Ǵ��� ���� ���� ����. �װ� RealCal���� ������ ���� ������ ����־���ϱ� ������.
}
interface Printable{
	void print();
}

// �ϳ��� Ŭ������ �������� �������̽��� ������ �� �ִ�. (����� �� �ϳ��� Ŭ������ �޾ƿ� �� �ִ��Ͱ� �񱳵ǰ�!)
// Calculable �������̽����� PI��� ������ �ִ�. ������ �̰� ���� ���� RealCal�� �Է����� �ʾƵ� �ȴ�. �̰� �׳� ���� �����ԵǴ� ���̴�.
class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is Realcal");
	}	
}

class  DummyCal implements Calculable{
	public int sum(int v1, int v2) {
		return 3;
	}
}



public class InterfaceApp {

	public static void main(String[] args) {
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 4));
		c.print();
		System.out.println(c.PI); // RealCal�� ���� PI�� �� ����־��µ���, Calculable �������̽��� �Ἥ �״�� ����������.
	}

}
