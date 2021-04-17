package ch09;

public class NestedClass {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();  // 인스턴스 멤버 클래스 객체 생성 
		b.field1 = 10;
		b.method1();
		
		A.C c = new A.C();  //A 객체 없이 정적 멤버 클래스 생성 가능.
		c.field1 = 1;  		
		c.method1(); 		
		A.C.field2 =2;		
		A.C.method2();
		
		a.method();  //로컬 클래스 객체 생성을 위한 메소드 호출
	}
}

// A클래스 외부에서 인스턴스 멤버 클래스 B의 객체를 생성하려면 
// 먼저 A객체를 생성하고 B객체를 생성해야함.
// 중복 클래스를 사용하는 이유
// 1. 향상된 캡슐화
// 2. 좋은 가독성과 유지보수성
class A {

	class B {
		// 인스턴스 멤버 클래스 (정적 필드,메소드는 선언할 수 없다.)
		B() {}
		int field1;
		void method1() {
			System.out.println(field1 + "인스턴스 멤버 클래스");
		}
	}

	static class C{
		//정적 멤버 클래스
		C(){}
		int field1;
		static int field2;
		void method1() {
			System.out.println("정적 멤버 클래스" + field1);
		}
		static void method2() {
			System.out.println("정적 멤버 클래스" + field2);
		}
	}
	
	void method() {
		//로컬 클래스  (메소드내 에서 생성된 클래스)
//		로컬 클래스는 접근 제한자(public,private) 및 static을 붙일 수 없다. (메소드 내부에서만 사용되기때문)
		class D{
			D() {}
			int field1;
			void method1() {
				System.out.println(field1 + "로컬클래스");
			}
		}
		//로컬 클래스는 메소드내부에서 객체를 생성하고 사용해야 한다.
		//비동기 처리를 위한 스레드객체 생생 시 사용함.
		D d = new D();
		d.field1 = 5;
		d.method1();
	}
}

