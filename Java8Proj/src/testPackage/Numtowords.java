package testPackage;

public class Numtowords {
	 static String unitsMap[] = { "zero", "one", "two", "three", "four", "five","six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	 static String tensMap[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	 public static void main(String[] args)
	 {
		 Numtowords numToWords = new Numtowords();
		 System.out.println(numToWords.NumberToWords("43112609"));
		 System.out.println(numToWords.NumberToWords("1000000000"));
		 System.out.println(numToWords.NumberToWords("-120"));
	 }
	 String NumberToWords(String number)
	 {
		 return NumberToWords(Long.parseLong(number));
	 }
	 String NumberToWords(long number)
	 {
	  if (number == 0)
	     return "zero";

	 boolean isNegative = false;
	 if (number < 0)
	 {
		 isNegative = true;
		 number = Math.abs(number);
	 }
	     //return "minus " ;

	 String words = "";

	 if ((number / 1000000000) > 0)
	 {
	     words += NumberToWords(number / 1000000000) + " billion ";
	     number %= 1000000000;
	 }

	 if ((number / 1000000) > 0)
	 {
	     words += NumberToWords(number / 1000000) + " million ";
	     number %= 1000000;
	 }

	 if ((number / 1000) > 0)
	 {
	     words += NumberToWords(number / 1000) + " thousand ";
	     number %= 1000;
	 }

	 if ((number / 100) > 0)
	 {
	     words += NumberToWords(number / 100) + " hundred ";
	     number %= 100;
	 }

	 if (number > 0)
	 {
	     if (number < 20)
	         words += unitsMap[(int) number];
	     else
	     {
	         words += tensMap[(int) (number / 10)];
	         if ((number % 10) > 0)
	             words += "-" + unitsMap[(int) (number % 10)];
	     }
	 }
	 if(isNegative)
	 {
		 words = "negative " + words;
	 }
	 return words;
	  }

}
