import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.getName());
		}
		
		listDevs.sort( new Comparator<Developer>(){

			@Override
			public int compare(Developer o1, Developer o2) {
				// TODO Auto-generated method stub
				return o2.getAge()-o1.getAge();
			}
			
			
		});
		
		listDevs.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));
		
		System.out.println("Aftrer Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer.getName());
		}
		
		
		
		System.out.println(":::::::::::::::");
		List<String> lines = Arrays.asList("spring", "node", "mkyong","spring","spring");
		
		lines.stream().filter(line -> line.equals("spring")).forEach(line -> System.out.println("line::"+line));
		System.out.println(":::::::::::::::");
		Map<String, Long> result = lines.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(":::::::::::::::");
		//System.out.println(result.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey().reversed()).);
		
		Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
		List langList = language.collect(Collectors.toList());
		langList.forEach(new Consumer<String>()
		{

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				if(t!=null)
				System.out.println("length::"+t.length());
			}
			
		});
		
		langList.forEach(x -> System.out.println("value of x::"+x));
		
	}
	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}
