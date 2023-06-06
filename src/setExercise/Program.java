package setExercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=1; i<=n; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.print("Total students: " + set.size());	
		
		sc.close();
		
	}

}
