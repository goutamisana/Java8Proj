
public class CustomerService {

	
	 public String findByName(String name){

	        if ("".equals(name)) {
	            throw new NameNotFoundException("Name is empty!");
	        }

	        return new String(name);

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CustomerService obj = new CustomerService();

	        try {

	        	String cus = obj.findByName("");
			System.out.println("inside syso");

	        } catch (NameNotFoundException e) {
	            e.printStackTrace();
	        }
	}

}
