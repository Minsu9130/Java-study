package tutorial2;

public class Main extends Player{

	public static void main(String[] args) {
		
		Main main = new Main();
		
		main.play("Justin Bieber -  Peaches");
		main.pause();
		main.stop();
	}

	@Override
	void play(String songName) {
		
		System.out.println(songName + " ���� ����մϴ�");
	}

	@Override
	void pause() {
		System.out.println("���� �Ͻ������մϴ�.");
	}

	@Override
	void stop() {
		System.out.println("���� �����մϴ�.");
	}

}