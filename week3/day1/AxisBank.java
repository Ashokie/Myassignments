package week3.day1;

public class AxisBank extends BankInfo {

	public void deposite() {
		System.out.println("Deposite 5L");

	}

	public static void main(String[] args) {

		AxisBank obj = new AxisBank();
		obj.deposite();
		obj.saving();
		obj.fixed();

	}

}
