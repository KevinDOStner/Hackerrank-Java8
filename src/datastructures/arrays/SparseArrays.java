package datastructures.arrays;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SparseArrays {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new File("input.txt"));

		int N = sc.nextInt();
		List<String> corpus = IntStream.range(0, N)
					       .mapToObj(i -> sc.next())
					       .collect(Collectors.toList());

		int Q = sc.nextInt();
		List<String> queries = IntStream.range(0, Q)
						.mapToObj(i -> sc.next())
						.collect(Collectors.toList());

		queries.stream()
			.mapToLong(query -> corpus.stream()
						  .filter(p -> p.equals(query))
						  .count()
			).forEach(System.out::println);

	}
}
