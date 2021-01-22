class Cal {
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2)+v3; // this는 자기자신의 클래스를 의미.
	} // sum메소드가 있는데 또 sum메소드를 만들기 가능함. 이건 또 쌓는다, 적재한다, 뜻의 overloading
	  // 자식도 overloading할 수 있다. overloading은 overriding이랑 말이 비슷해서 헷갈리는건데, 사실 상속부분에 국한되는 표현은 아니다. 
}

// Cal2를 새로 만드는것도 좋다. 하지만 이미 Cal에 sum메소드가 있는데 굳이 또 중복으로 작성한다...? 비효율적이야...
//class Cal2 {
//	public int sum(int v1, int v2) {
//		return v1+v2;
//	}	
//
//	public int minus(int v1, int v2) {
//		return v1-v2;
//	}
//}

// Cal3는 Cal을 확장한다 = Cal을 상속받았다!
class Cal3 extends Cal{
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	public int sum(int v1, int v2) {
		System.out.println("Cal3!");
		return super.sum(v1,v2); // super는 자기가 상속받은 상위 클래스를 의미.
	} // 부모가 가지고 있는 메소드를 내맘대로 재정의함!(가넝함) overriding했다.
}


public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
//		c.sum(2,4);  // 화면에 아무것도 안 뜸. 직접 찍어내기 위해서 System.out.println() 메소드 필요함~
//		System.out.println(c.sum(3,2));
//		System.out.println(c.sum(2, 1, 1));
		
		Cal3 c3 = new Cal3();
//		System.out.println(c3.sum(3,2));
//		System.out.println(c3.minus(3,2));

		System.out.println(c.sum(2, 4));
		System.out.println(c3.sum(2, 4));
		System.out.println(c3.minus(4, 2));
	
	}

}
