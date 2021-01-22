
public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println( "One"); // String 유한함
		System.out.println(1); // Integer 무한함
	
		//Boolean 딱 두개만 있음
		System.out.println(true);
		System.out.println(false);

		String foo = "Hello World";  // 변수 가능!
//		String true = "Hello World";  // true는 이미 사용되고 있는 언어. 사용안됨.. 컴퓨터가 쓰기로 예약된 언어여서 reserved word라고 불림.
		
		System.out.println(foo.contains("World")); // 포함하고 있으니 참
		System.out.println(foo.contains("cat")); // 포함하지 않았으니 거짓
		
		
		//Boolean은 조건문 반복문과 함께하면 엄청나진다!
		
	}

}
