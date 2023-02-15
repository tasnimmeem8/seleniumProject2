package abstract_java_1;

public class Karim extends MobileUser{

	 void call() {
		System.out.println("Karim can call");
	}
	
	@Override
	 void text() {
		System.out.println("Karim can text");
	
	}
	@Override
	 void screen() {
		System.out.println("Karim has big screen");
	
	}

	@Override
	void touchScreen() {
		System.out.println("Karims phone is not touch screen");
		
	}
	
	public void onlyKarim() {
		System.out.println("Karims phone number is 1234");
	}
}
