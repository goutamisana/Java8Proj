import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class TestMapFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Map<Integer, String> HOSTING = new HashMap<>();
	        HOSTING.put(1, "linode.com");
	        HOSTING.put(2, "heroku.com");
	        HOSTING.put(3, "digitalocean.com");
	        HOSTING.put(4, "aws.amazon.com");
	        HOSTING.put(5, "aws.amazonaa.com");
	        HOSTING.put(6, "linode.com");
	        
	        
	        String result =  HOSTING.entrySet().stream().filter(map ->"linode.com".equals(map.getValue())).map(map->map.getKey().toString()).collect(Collectors.joining(","));
	        
	        System.out.println("result::"+result);
	}

}
