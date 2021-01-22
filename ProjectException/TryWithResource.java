import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		
//		Try with resource ����!
//		Try-catch�� ���µ� close��� �޼ҵ尡 �ʿ���, �� resource(�ܺ��� �ڷ�)�� Ȱ���ϴ� ���.
// 		���� CheckedException ���ϰ� ���� ���� �Ȱ����� �� ������!
		try(FileWriter f = new FileWriter("data.txt")) {
		f.write("Hello");
		} catch(IOException e) {
			e.getStackTrace();
		}
	}
}

