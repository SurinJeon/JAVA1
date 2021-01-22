import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	// class : public, Math, FileWriter
	// instance: f1, f2
	public static void main(String[] args) throws IOException {
		// Math class
		// class�� ��Ժ��� �ణ ��ȸ�� ������ ��. ��� '����'�� �������ʰ�, �ʿ��� �� �ٷιٷ� �� �� ����.
		System.out.println(Math.PI); // PI��� ���� 
		System.out.println(Math.floor(1.8)); // floor()��� �޼ҵ�
		System.out.println(Math.ceil(1.8)); // ceil()�̶�� �޼ҵ�

		
		// �� �ƶ��� �ڵ带 © ��, instance�� ����ؼ� �̰��� ������ �� �ִ�.
		// instance�� ��� '����'�� �������ֱ⿡ �Ʒ�ó�� f2�� f1�߰��� ���ܵ� �ƶ��� �������ʰ� �״�� �̾�� �� �ִ�. 
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
