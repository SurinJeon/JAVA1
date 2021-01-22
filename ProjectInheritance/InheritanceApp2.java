class Cul {
	int v1,v2;
	public Cul(int v1, int v2) {
		System.out.println("I'm Cul");
		this.v1 = v1;
		this.v2 = v2;
		
	}
	public int sum() {
		return this.v1+v2;
	} // sum()에서 더이상 인자를 받지 않음. 이미 생성자에서 필수로 인자 받도록 설정해둬서, 인스턴스화 할때 인자 진즉 집어넣어뒀음.
}

//Cul3의 부모인 Cul이 생성자 메소드를 가지고 있다. ->그렇다면 Cul3도 자식된! 도리로! 똑같이 생성자 메소드를 가져야한다고 강제함~!
class Cul3 extends Cul {

	public Cul3(int v1, int v2) {
		super(v1, v2); // 여기서 super는 부모클래스의 생성자! 단순히 생성자 복붙이 아니라 super를 써서 해야한다.
		System.out.println("I'm Cul3");
	}
	public int minus() {
		return this.v1-v2;
	}

		
}


public class InheritanceApp2 {

	public static void main(String[] args) {
		Cul c = new Cul(2,1); // I'm Cul
		Cul3 c3 = new Cul3(2,1); // I'm Cul 실행된 후에 I'm Cul3 실행될 것. 
		
		System.out.println(c3.sum()); // 3 I'm Cul3 이런건 안 나옴. 왜냐하면 그건 인스턴스에 관한 이야기고 얘는 지금 sum()을 호출했기 때문임
		System.out.println(c3.minus()); // 1	
	}

}
