package tutorial5;

public class Main{
	
	public static void main(String[] args) {
	
		Fruit fruit = new Lemon();
		//다형성은 부모 클래스 타입의 참조변수로 하위 클래스의 객체를 참조할 수 있다
		
		fruit.show();
	}
}
