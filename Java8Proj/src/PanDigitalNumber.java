
public class PanDigitalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Creating an PanDigitalRomanNumberImpl to check if the number is roman or not
		PanDigitalRomanNumberImpl panObj = new PanDigitalRomanNumberImpl();
		System.out.println(panObj.checkNumber(1455));
		System.out.println(panObj.checkNumber(1466));
		System.out.println(panObj.checkNumber(1890));
		System.out.println(panObj.checkNumber(0));
		System.out.println(panObj.checkNumber(-1));
		System.out.println(panObj.checkNumber(100));
		System.out.println(panObj.checkNumber(1000));
		System.out.println(panObj.checkNumber(2000));
		System.out.println(panObj.checkNumber(2001));
	}

}
