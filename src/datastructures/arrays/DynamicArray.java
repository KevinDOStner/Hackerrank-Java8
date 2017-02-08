package datastructures.arrays;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DynamicArray {
	
	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(new File("input.txt"));
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		int lastAns = 0;
		
		List<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>();
	
		IntStream.range(0, N).forEach(n -> seqList.add(new ArrayList<Integer>()));
		
		for(int i = 0; i < Q; i++){
			
			int flag = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			
			switch(flag){
				case 1:
					seqList.get((x^lastAns)%N).add(y);
					break;
				case 2:
					lastAns = seqList.get((x^lastAns)%N).get(y%seqList.get((x^lastAns)%N).size());
					System.out.println(lastAns);
					break;
					
			}
		}
		
	}
}
