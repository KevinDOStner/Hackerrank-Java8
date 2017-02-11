package domain.java.introduction;

import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateTime {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(new File("input.txt"));
		String month = sc.next();
		String day = sc.next();
		String year = sc.next();
		
		 LocalDate localDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		 
		 System.out.println(localDate.getDayOfWeek());

	}

}
