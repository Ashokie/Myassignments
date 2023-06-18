package week1.day1;

public class Mobile {
	public void sendSms() {
		System.out.println("hello testleaf");
	}

	protected void hellovoicecall() {
		System.out.println("voice call");
	}

	private void takeVideo() {
		System.out.println("Record video");
	}
	
	

	public static void main(String[] args) {
		String brandName = "Samsung";
		String mobileColor = "Red";
		int storageCapacity = 560;
		Short noOfcamera = 2;
		boolean isCharged = true;
		long IMEI = 234154324;
		float availableStorage = 523.85f;
		System.out.println(brandName); 
		System.out.println(mobileColor);
		System.out.println(storageCapacity);
		System.out.println(noOfcamera);
		System.out.println(isCharged);
		System.out.println(IMEI);
		System.out.println(availableStorage);
		System.out.println();
		Mobile object = new Mobile();
		object.sendSms();
		object.hellovoicecall();
		object.takeVideo();
	}

}
