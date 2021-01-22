
public class LogicalOperatorApp {

	public static void main(String[] args) {
		// AND
		System.out.println(1 == 1);
		System.out.println(true && true); // 논리연산자는 boolean 양 값을 확인하고 true false 알려줌
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		// &&는 한국말로 '그리고' 
		
		
		// OR
		System.out.println(true || true); // 논리연산자는 boolean 양 값을 확인하고 true false 알려줌
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// NOT
		System.out.println(!true); // false
		System.out.println(!false); // true
	}

}
