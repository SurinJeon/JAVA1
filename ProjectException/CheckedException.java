import java.io.FileWriter;
import java.io.IOException;

// Exception은 두가지 종류가 있ㄷ
public class CheckedException {

	public static void main(String[] args) {
// CheckedException은 try-catch나 Throws를 통해서 예외대한 조치를 취해줘야함
// (체크 안하면 컴파일 조차 안해)
// 만약 try 안에서 예외가 발생해서 f.close();가 실행될 기회를 잃어버린다면?
// 그럴땐 finally를 사용한다(얘는 중괄호만 있음) 
		
		// null은 값이 없다!
		FileWriter f = null;
		
		try {
		// 아래 코드를 통해 f는 이제 null이 아닐 것	
		f = new FileWriter("data.txt");
		f.write("Hello");
//		f.close();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
//			만약에 f가 null이 아니라면(값을 가지고 있다면) close가 실행되도록 하라
			if(f != null) {
			try {
			f.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
}

