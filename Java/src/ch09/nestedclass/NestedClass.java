package ch09.nestedclass;

public class NestedClass {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();  // �ν��Ͻ� ��� Ŭ���� ��ü ���� 
		b.field1 = 10;
		b.method1();
		
		A.C c = new A.C();  //A ��ü ���� ���� ��� Ŭ���� ���� ����.
		c.field1 = 1;  		
		c.method1(); 		
		A.C.field2 =2;		
		A.C.method2();
		
		a.method();  //���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
	}
}

// AŬ���� �ܺο��� �ν��Ͻ� ��� Ŭ���� B�� ��ü�� �����Ϸ��� 
// ���� A��ü�� �����ϰ� B��ü�� �����ؾ���. d
// �ߺ� Ŭ������ ����ϴ� ����
// 1. ���� ĸ��ȭ
// 2. ���� �������� ����������
class A {

	class B {
		// �ν��Ͻ� ��� Ŭ���� (���� �ʵ�,�޼ҵ�� ������ �� ����.)
		B() {}
		int field1;
		void method1() {
			System.out.println(field1 + "�ν��Ͻ� ��� Ŭ����");
		}
	}

	static class C{
		//���� ��� Ŭ����
		C(){}
		int field1;
		static int field2;
		void method1() {
			System.out.println("���� ��� Ŭ����" + field1);
		}
		static void method2() {
			System.out.println("���� ��� Ŭ����" + field2);
		}
	}
	
	void method() {
		//���� Ŭ����  (�޼ҵ峻 ���� ������ Ŭ����)
//		���� Ŭ������ ���� ������(public,private) �� static�� ���� �� ����. (�޼ҵ� ���ο����� ���Ǳ⶧��)
		class D{
			D() {}
			int field1;
			void method1() {
				System.out.println(field1 + "����Ŭ����");
			}
		}
		//���� Ŭ������ �޼ҵ峻�ο��� ��ü�� �����ϰ� ����ؾ� �Ѵ�.
		//�񵿱� ó���� ���� �����尴ü ���� �� �����.
		D d = new D();
		d.field1 = 5;
		d.method1();
	}
}

