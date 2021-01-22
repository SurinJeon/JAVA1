
public class LoopApp {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println("===while===");
		int i = 0;
		
		// while문은 자유도가 높음! 그러나 i의 값이 변형될 가능성이 있음. 또한 i설정이 다른 줄에 떨어져있기 때문에 응집력 약함.
		while(i < 3) {
		System.out.println(2);
		System.out.println(3);
//			i = i + 1;
			i++;
		}
		
		
		// for문은 while문보다 조금 더 응집력이 있음(패키지 형태로 정의를 따다닥 해버렸기 때문)
		System.out.println("===for===");
		for(int j=0; j < 3; j++) {
			
			System.out.println(2);
			System.out.println(3);
			
		}
		System.out.println(4);

	}

}
