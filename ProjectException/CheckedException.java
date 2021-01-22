import java.io.FileWriter;
import java.io.IOException;

// Exception�� �ΰ��� ������ �֤�
public class CheckedException {

	public static void main(String[] args) {
// CheckedException�� try-catch�� Throws�� ���ؼ� ���ܴ��� ��ġ�� ���������
// (üũ ���ϸ� ������ ���� ����)
// ���� try �ȿ��� ���ܰ� �߻��ؼ� f.close();�� ����� ��ȸ�� �Ҿ�����ٸ�?
// �׷��� finally�� ����Ѵ�(��� �߰�ȣ�� ����) 
		
		// null�� ���� ����!
		FileWriter f = null;
		
		try {
		// �Ʒ� �ڵ带 ���� f�� ���� null�� �ƴ� ��	
		f = new FileWriter("data.txt");
		f.write("Hello");
//		f.close();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
//			���࿡ f�� null�� �ƴ϶��(���� ������ �ִٸ�) close�� ����ǵ��� �϶�
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

