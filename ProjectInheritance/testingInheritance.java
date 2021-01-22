class la {
	public int sum(int v1, int v2) {
		System.out.println("I'm la");
		return v1+v2;
		}
	public int sum(int v1, int v2, int v3) {
		System.out.println("We can overload another method");
		return this.sum(v1, v2)+v3;
	}
	
	
}

class la2 extends la{
	public int minus(int v1, int v2) {
		System.out.println("I'm la2");
		return v1-v2;
	}
	public int sum(int v1, int v2) {
		System.out.println("Actually I overide la");
		return super.sum(v1,v2);
	}
}


public class testingInheritance {

	public static void main(String[] args) {
		
		la l = new la();
//		System.out.println(l.sum(3,2)); 
		System.out.println(l.sum(2, 4, 6)); // 위캔, 아임, 12
		
		
		la2 l2 = new la2();
//		System.out.println(l2.sum(3, 2)); 
//		System.out.println(l2.minus(4, 2)); 
		System.out.println(l2.sum(6, 4)); // 오버라이드, 아임, 10
	}

}
