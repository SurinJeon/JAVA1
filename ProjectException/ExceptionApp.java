public class ExceptionApp {
	public static void main(String[] args) {
		
		
		int[] scores = {10, 20, 30};
//		try {
//		System.out.println(scores[3]); // [3]은 네번째 배열 값인데 네번째는 없음. 예외가 발생할 것임
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("없는 값입니다.");
//		}
		
		
		// 이 밑에 구문에서... 무슨 일이 날 것 같아... 일단 격리해서 예외처리 해보자... try catch 구문으로!
//		try {
//			System.out.println(2/0); // 자바에서는 2를 0으로 나눌 수 없음. 이건 예상치 못한 상황, 예외
//		} catch(ArithmeticException e) {
//			System.out.println("잘못된 계산입니다.");
//		}
		
		
		
		// 한 번에 하는 방법! // 사실 같은 역할을 하는건 아님 (미묘하게 예외 처리하는게 다름) 
		
		try {
			System.out.println(2);
//			System.out.println(scores[3]);
// 아래 세 줄은실행될 기회를 아예 가지지 못함. 윗 줄에서 이미 배열예외가 잡혀버려서 try-catch구문을 빠져나가버림
			System.out.println(3); 
			System.out.println(2/0);
			System.out.println(4);
		}  catch(ArithmeticException e) {
			System.out.println("잘못된 계산입니다."+e.getMessage());
			e.printStackTrace();
		}  catch (Exception e) {
			System.out.println("무언가 이상합니다. 오류가 발생했습니다."+e.getMessage());
		} // 부모 예외를 갖다놓으면 아래 두개의 상위이기 때문에 알아서 처리 가능함
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("없는 값입니다.");
//		} 
		System.out.println(5);
		
		
	}

}
