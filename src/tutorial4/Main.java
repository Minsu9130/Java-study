package tutorial4;

public class Main implements Dog, Cat{
// 인터페이스는 다중상속 기능을 구현할수 있다.
	
	public static void main(String[] args) {
	
		Main main = new Main();
		
		main.crying();
	}

	// 겹치는 메소드는 하나만 구현해주어도 된다
	public void crying() {
		System.out.println("멍멍");
	}

	@Override
	public void two() {
		System.out.println("two");
	}

	@Override
	public void one() {
		System.out.println("one");
	}
}
