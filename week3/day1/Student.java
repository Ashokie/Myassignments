package week3.day1;

public class Student {
	public void getStudentInfo(int x) {
		System.out.println("id -" + x);
	}

	public void getStudentInfo(int x, String y) {
		System.out.println(x +"-"+ y);

	}

	public void getStudentInfo(String x, int y) {
		System.out.println("E-mail:"+x +" "+"and Phone No:"+ y);

	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.getStudentInfo(2101);
		obj.getStudentInfo(2101, "Ashok");
		obj.getStudentInfo("ashok@gamil.com", 987654321);

	}

}
