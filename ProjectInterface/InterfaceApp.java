interface Calculable{
	double PI = 3.14; // 원래 인터페이스는 내용이 안 들어가는데 변수의 경우에는 그 값을 넣음으로써 내용을 만들기가 가넝함.
	int sum(int v1, int v2); // 반면 메소드의 경우에는 메소드가 어떻게 구현되는지 내용 적지 않음. 그건 RealCal같은 곳에서 직접 내용을 집어넣어야하기 때문임.
}
interface Printable{
	void print();
}

// 하나의 클래스는 여러개의 인터페이스를 구현할 수 있다. (상속은 단 하나의 클래스만 받아올 수 있던것과 비교되게!)
// Calculable 인터페이스에는 PI라는 변수가 있다. 하지만 이건 내가 따로 RealCal에 입력하지 않아도 된다. 이건 그냥 내가 가지게되는 것이다.
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
		System.out.println(c.PI); // RealCal에 따로 PI를 안 집어넣었는데도, Calculable 인터페이스를 써서 그대로 가지고있음.
	}

}
