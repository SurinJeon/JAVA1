class Print{
	public String delimiter = "";
	public Print(String delimiter) {
		this.delimiter=delimiter;
	}
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
}


public class testthisandsuper {

	public static void main(String[] args) {
		Print p1 = new Print("^^");
		
		p1.A();
		p1.B();
		
		
		

	}

}
