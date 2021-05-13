package java_chap07;

//	Cild3 클래스는 Parent3 클래스를 상속받음
//	method1, method2 메서드를 상속 받음
public class Child3 extends Parent3 {
//	상속받은 method2를 오버라이드하고자 하지만 오류가 발생
//	부모 클래스인 Parent3 클래스에서 method2()에 final 키워드를 사용하여 오버라이드를 금지함
//	@Override
//	public void method2() {
//		System.out.println("Child3 클래스의 method2() 호출");
//	}
//	메서드에 final 키워드를 사용함
//	해당 메서드는 오버라이드 되지 않음
//	상속은 문제없이 잘 된다.
	public final void method3() {
		System.out.println("Child3 클래스의 method3() 호출");
	}
}
