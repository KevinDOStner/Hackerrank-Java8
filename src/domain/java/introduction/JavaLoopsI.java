package domain.java.introduction;

import java.io.File;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaLoopsI {

	public static void main(String[] args) throws Exception{
		
		Scanner in = new Scanner(new File("input.txt"));
        int N = in.nextInt();
        
        IntStream.range(1, 11).mapToObj(i -> (N + " x " + i + " = " + i * N)).forEach(System.out::println);
		
	}

}
