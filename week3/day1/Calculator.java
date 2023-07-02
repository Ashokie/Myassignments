package week3.day1;

public class Calculator {
public void add(int x, int y) {
	System.out.println(x+y);
}
public void add(int x,int y, int z) {
	System.out.println(x+y+z);
}
public void multi(double x, double y) {
	System.out.println(x*y);
}
public void multi(float x, float y) {
	System.out.println(x*y);
}
	public static void main(String[] args) {
	Calculator obj= new Calculator();
	obj.add(10, 20);
	obj.add(10, 20, 10);
	obj.multi(100d, 100d);
	obj.multi(10f, 10f);

	}

}
