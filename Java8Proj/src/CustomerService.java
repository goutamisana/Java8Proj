
public class CustomerService {

	
	 public String findByName(String name) throws NameNotFoundException {

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

	        } catch (NameNotFoundException e) {
	            e.printStackTrace();
	        }
	}

}