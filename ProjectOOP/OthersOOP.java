import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	// class : public, Math, FileWriter
	// instance: f1, f2
	public static void main(String[] args) throws IOException {
		// Math class
		// class는 어떻게보면 약간 일회성 느낌이 남. 어떠한 '상태'를 가지지않고, 필요할 때 바로바로 쓸 수 있음.
		System.out.println(Math.PI); // PI라는 변수 
		System.out.println(Math.floor(1.8)); // floor()라는 메소드
		System.out.println(Math.ceil(1.8)); // ceil()이라는 메소드

		
		// 긴 맥락의 코드를 짤 때, instance로 사용해서 이것을 제어할 수 있다.
		// instance는 어떠한 '상태'를 가지고있기에 아래처럼 f2가 f1중간에 낑겨들어도 맥락이 끊기지않고 그대로 이어나갈 수 있다. 
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		
		f1.write(" Java");
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
	
		f1.write(" !!!");
		f1.close();
		
	}

}
