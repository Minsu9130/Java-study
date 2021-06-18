package tutorial4;

public interface Dog {
	
	abstract void crying();
	public void one();
	// 추상클래스와는 달리 인터페이스는 반드시 사전에 정의된 추상메소드와 상수만을 가질 수 있다
	// 메소드 안에 내용을 설계하면 오류가 발생한다(추상클래스는 가능)
}
