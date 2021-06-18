package tutorial1;

public class Main {

	public static void main(String[] args) {

		Student stu = new Student("±è¹Î¼ö", 24, 153, 00, "201714087", 4, 3.5);
		Student stu2 = new Student("±èÁ¤È£", 25, 178, 00, "201612781", 4, 3.7);
		
		stu.show();
		stu2.show();
		
		Teacher tea = new Teacher("±è¹Î¼ö", 24, 153, 00, "201714087", 4, 3);
		Teacher tea1 = new Teacher("±èÁ¤È£", 25, 178, 00, "201612781", 4, 3);
		
		tea.show();
		tea1.show();
	}

}
