class tion{
	int v1, v2;
	public tion(int v1, int v2) {
		System.out.println("Hi, I'm tion");
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum() {
		return v1+v2;
	}
}

class tion2 extends tion{
	public tion2(int v1, int v2) {
		super(v1, v2);
		System.out.println("Hi, I'm tion2");
	}
	public int minus() {
		return v1-v2;
	}
}



public class testingInheritance2 {

	public static void main(String[] args) {	
		tion t = new tion(2,4);
		System.out.println(t.sum());
		
		tion2 t2 = new tion2(4,2);
		System.out.println(t2.sum());
		System.out.println(t2.minus());
	}

}
