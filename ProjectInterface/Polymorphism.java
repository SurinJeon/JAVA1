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
		pPrintable c = new Rrrealcal(); // 인터페이스는 인스턴스 생성 시 앞에 데이터타입으로도 올 수 있다.
//		System.out.println(c.sum(2,4)); // 해당코드는 Ccalculable 안에 있어서 작동될 수 없다.
		c.print(); // 뒤에  Rrrealcal이 오느냐, AdvancedpPrint가 오느냐에 따라 다르게 활용 가능
		
		//데이터타입을 인터페이스로 넣을 경우 두 가지 효과.
		// 1. 조작버튼처럼 사용할 수 있다. 프린트를 할 것인지, 계산을 할 것인지 결정하여 구분해서 숨길 수 가 있기 때문.
		// 2. 인스턴스 생성 시 같은 인터페이스를 구현하는 클래스들을 호환시킬 수 있다.
		
	}

}

