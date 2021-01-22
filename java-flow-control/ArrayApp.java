
public class ArrayApp {

	public static void main(String[] args) {
		
		// goyoung, miamia, baduck 고영관리를 위한 장부가 필요함.
//		String users = "goyoung, miamia, baduck"; 
		// 위처럼 해도 됨. 그치만 셋은 같이 묶여있고 쪼개고 붙이고하는 과정이 필요할지도 모름. 무엇보다..이쁘지가 않은데요...
		// 아래처럼 해보자.
		String[] users = new String[3]; // 세 칸 짜리 캐비넷 만들었음 방금! 갯수는 3개
		users[0] = "goyoung"; // 하지만 카운팅은 0부터다...(좀 이상함) 0이라는 index 붙여줌.
		users[1] = "miamia";
		users[2] = "baduck";
		
		System.out.println(users[1]); // miamia
		System.out.println(users.length); // 값이 세 개다 라는 의미보다는, 세 칸짜리 배열이다 라고 해석하는게 더 알맞음.


		
		// 처음 배열을 생성할 때,아예 값을 넣어서 만들수는 없을까?
		int[] scores = {10, 100, 1000};
		System.out.println(scores[0]);
		System.out.println(scores.length);
		
		
	}

}
