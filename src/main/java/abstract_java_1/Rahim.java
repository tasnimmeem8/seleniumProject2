package abstract_java_1;

public class Rahim extends MobileUser{
	
    void call() {
		System.out.println("Rahim can call");
	}

	@Override
	void text() {
		
		System.out.println("Rahim can send text");
	}

	@Override
	void screen() {
		
		System.out.println("Rahims phone is not touch screen ");
	}

	@Override
	void touchScreen() {
	System.out.println("Rahims phone is not touch screen 1");
		
	}
	public void onlyRahim() {
		System.out.println("Rahims phone number is 894");
	}

}
