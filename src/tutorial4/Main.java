package tutorial4;

public class Main implements Dog, Cat{
// �������̽��� ���߻�� ����� �����Ҽ� �ִ�.
	
	public static void main(String[] args) {
	
		Main main = new Main();
		
		main.crying();
	}

	// ��ġ�� �޼ҵ�� �ϳ��� �������־ �ȴ�
	public void crying() {
		System.out.println("�۸�");
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
