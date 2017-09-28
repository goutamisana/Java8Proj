


	 //What is the output of this Program? 
package testPackage;//proper package structure should be created for classifying the classes
//---Class level comments are not provided because of which the purpose of the class is not understood
	public class TestClass 
	{ 
		public void test1(String aux)//method level comments are missing ,the purpose of the method is not understood
		{ 
			aux = "Text changed"; //for texts can be assigned to final variables.
			//variable not used any place
			
		} 
		public static void main(String[] args) 
		{  
			int x = 3, y = 5; 
			String s1 = x + y + "total"; //stringbuffer or stringbuilder can be used to append strings based on the circumstances. 
			 String s2 = "total " + x + y;  //stringbuffer or stringbuilder can be used to append strings  based on the circumstances 
			 String s3 = " " + x + y + "total";  //stringbuffer or stringbuilder can be used to append strings  based on the circumstances 
			 System.out.println("s1: " + s1); 
			 System.out.println("s2: " + s2); 
			 System.out.println("s3: " + s3); 
			 TestClass test = new TestClass(); //instanciating the class is not required
			 String newText = "New Text"; //better to declare all variables in the beginning
			 test.test1(newText); 
			 System.out.print(newText); //instead of System.out.print loggers can be used for based on the need to display value for warnings,infos etc
			 } 
		} 

/*output is -
	
s1: 8total
s2: total 35
s3:  35total
New Text
	*/