package datastructures.arrays;

import java.io.File;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LeftRotation {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(new File("input.txt"));
		
		int N = sc.nextInt();
		int d = sc.nextInt();
		
		int[] arr = new int[N];
		int[] arrRotated = new int[N];
		
		IntStream.range(0, N).forEach(number -> arr[number] = sc.nextInt());
		IntStream.range(0, N).forEach(number -> arrRotated[(N - d + number)%N] = arr[number]);
		IntStream.range(0, N).forEach(number -> System.out.print(arrRotated[number] + " "));	
		
	}
}
