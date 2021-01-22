import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		
//		Try with resource 구문!
//		Try-catch는 쓰는데 close라는 메소드가 필요한, 즉 resource(외부의 자료)를 활용하는 경우.
// 		이전 CheckedException 파일과 구문 내용 똑같으나 훨 간결함!
		try(FileWriter f = new FileWriter("data.txt")) {
		f.write("Hello");
		} catch(IOException e) {
			e.getStackTrace();
		}
	}
}

