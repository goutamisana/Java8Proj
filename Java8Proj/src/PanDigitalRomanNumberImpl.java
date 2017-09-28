


// Program to convert Numbers to Roman Numerals
public class PanDigitalRomanNumberImpl implements PanDigitalRomanNumber{

	

    /*Arrays storing the unique symbols of Roman Number System
       and also the corresponding decimal equivalents in the second array*/
	
	private static int[]    numbers = { 1000,  900,  500,  400,  100,   90,  
		50,   40,   10,    9,    5,    4,    1 };

	private static String[] letters = { "M",  "CM",  "D",  "CD", "C",  "XC",
		"L",  "XL",  "X",  "IX", "V",  "IV", "I" };
	
	final static String symbol = "MDCLXVI";
	final static String TRUE = "true";
	final static String FALSE = "false";
	//this method return takes an integer ann converts to roman
		public String convertToRoman(int N)
		{
			StringBuffer roman = new StringBuffer();
			
			//converting a number to roman numeral 
			
			
				//Itertate the above array of letters an convert it into equivalent roman numbers
				for (int i = 0; i < numbers.length; i++) {
					while (N >= numbers[i]) { 
						roman.append(letters[i]);
						N -= numbers[i];//decrease the value from given number
					}
				}
				
				
			
			return roman.toString();
		}

		
		//this method returns the character count of a given character in a string
		public  int count( final String s, final char c ) {
			  final char[] chars = s.toCharArray();//converting string to character array
			  int count = 0;
			  for(int i=0; i<chars.length; i++) {
			    if (chars[i] == c) {
			      count++;
			    }
			  }
			  return count;
			}
		
	//Use this class to implement your exercise
	@Override
	public String checkNumber(int input) {
		
		if( input<0 || input>2000) //checking if the input is valid or not
		{
			
			return "Invalid Number";
			
		}
		else
		{
			String romanNumber = convertToRoman(input);
			
			for(int i=0;i<symbol.length();i++)
			{
				
				if(romanNumber.indexOf(symbol.charAt(i))==-1 || count(romanNumber,symbol.charAt(i))!=1)//this condition is to check if all the symbols are present exactly once
				{
					return FALSE;
				}
				
			}
			
		
		return TRUE;
		}
	}



}
