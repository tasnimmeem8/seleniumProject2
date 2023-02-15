package abstract_java_2;

public class Test {

	public static void main(String[] args) {
		
		MobileUser MU;

	//	MU.call();
		
		MU= new Sam();
		MU.screen();
		MU.message();
		MU.call();
		
		MU= new Nick();
		MU.message();
		MU.screen();
		MU.call();

	}

}
