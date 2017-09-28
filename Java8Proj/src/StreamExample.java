import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<10; i++) myList.add(i);
		
		Stream<Integer> sequentialStream = myList.stream();
		int abc = sequentialStream.filter(p -> p > 7).mapToInt(p -> p).sum();		
		//myList.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
				
		System.out.println(abc);
		
		String gout ="goutmai sana rocks";
		FunctionalInt fi =  (goutami) -> {
			System.out.println("inside fi ::" + goutami);
		};
		
		fi.method1(gout);
	}

}
