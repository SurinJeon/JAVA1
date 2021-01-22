
public class IfApp {

	public static void main(String[] args) {
		// 아래 세 문장의 결과는 '순서대로' a 1 b가 나올것이다.
//		System.out.println("a");
//		System.out.println(1);
//		System.out.println("b");

		// 하지만 순대대로 말고, 어떤 때는 a 어떤때는 1 b 등이 나오게 하고싶다! -> 조건문
		System.out.println("a");
		if(true) {
			System.out.println(1);
		} // if의 () 안에 있는 코드가 true라면 {}안의 코드는 실행된다.
		System.out.println("b");
		
		if(false) {
			System.out.println(1); 
		} // if의 () 안에 있는 코드가 false기 때문에 {} 안의 코드는 실행되지 않았음.
		  // 지금은 false라고 직접적으로 적었지만 이건 나중에 변화가능한 코드로 만들것임.
		
		System.out.println("a");
		if(true) {
			System.out.println(1);
		} else {
			System.out.println(2);
		} // else를 사용해 하나의 if문으로 grouping 가능
		System.out.println("b");
		
		
		
	
//		if(false) {
//			System.out.println(1);
//		} else {
//			if(true) {
//				System.out.println(2);
//			} else {
//				System.out.println(3);
//				}
//		}

		// 위와 같지만(중첩 if문) 더 명료하고 예쁘게 쓴 게 아래!
		if(false) {
			System.out.println(1);
		} else if(true) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	}

}
