package week1.day1;

public class Mobile1  {
	public void makecall() {
		String mobileModel = "Nokia";
		float mobileWeight = 421.23f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}

	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 9999;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);

	}

	public static void main(String[] args) {
		Mobile1 mb = new Mobile1();
		mb.makecall();
		mb.sendMsg();
	}

}
