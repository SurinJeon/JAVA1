class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); // class 메소드 안에서 class 변수 접근 가넝
//		System.out.println(instanceVar); instance 변수는 class 메소드에 소환 불가능
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar); // instance 메소드 안에서는 class 변수와 instance 변수 모두 접근 가넝한!
	}
}

public class StaticApp {

	public static void main(String[] args) {
	
		System.out.println(Foo.classVar); // class를 통해서 class용 변수 소환 가넝
//		System.out.println(Foo.instanceVar); 하지만 instance용 변수는 class를 통해서 소환 불가넝 (static이 없습니다...)
		Foo.classMethod();
//		Foo.instanceMethod(); instanceMethod는 instance기 때문에 Foo class를 통해서 접근하는 것은 금지되어있음.
		
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
//		Foo.classMethod();  어차피 위에서 classvar 바꼈기 때문에 sout classvar인 classMethod도 바뀔 수 밖에 없다.
	}

	
}
