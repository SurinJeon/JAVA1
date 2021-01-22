class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // class �޼ҵ� �ȿ��� class ���� ���� ����
//		System.out.println(instanceVar); instance ������ class �޼ҵ忡 ��ȯ �Ұ���
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar); // instance �޼ҵ� �ȿ����� class ������ instance ���� ��� ���� ������!
	}
}

public class StaticApp {

	public static void main(String[] args) {
	
		System.out.println(Foo.classVar); // class�� ���ؼ� class�� ���� ��ȯ ����
//		System.out.println(Foo.instanceVar); ������ instance�� ������ class�� ���ؼ� ��ȯ �Ұ��� (static�� �����ϴ�...)
		Foo.classMethod();
//		Foo.instanceMethod(); instanceMethod�� instance�� ������ Foo class�� ���ؼ� �����ϴ� ���� �����Ǿ�����.
		
		Foo f1 =  new Foo();
		Foo f2 =  new Foo();
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "change by f1";
		System.out.println(f1.classVar);
		System.out.println(Foo.classVar);
		System.out.println(f2.classVar);

		f1.instanceVar = "change by f1";
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);
		
		f1.instanceMethod();
//		Foo.classMethod();  ������ ������ classvar �ٲ��� ������ sout classvar�� classMethod�� �ٲ� �� �ۿ� ����.
	}

	
}
