package streamsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jhon", "Dan", "Mike", "Thomson");

		// Create a Stream
		Stream<String> n = names.stream();

		// Intermediate Operations
		Stream<String> ln = n.filter(str -> str.length() > 3);

		ln.forEach(System.out::println);

		System.out.println("***********************************");

		// PipeLining(output of one operation is taking as input to another operation)
		// Create a Stream ---> Operations --> Convert Stream back to Collections
		List<String> names1 = names.stream().filter(str -> str.length() > 4).collect(Collectors.toList());

		System.out.println(names1);

		System.out.println("***********************************");

	}

}
