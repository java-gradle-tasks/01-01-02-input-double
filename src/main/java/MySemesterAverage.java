import java.util.Scanner;

public class MySemesterAverage {

	public static void main(final String[] args) {
		// Write your solution here
		System.out.print("Adja meg az elso feleves atlagat:");
		Scanner in=new Scanner(System.in);
		double average=in.nextDouble();
		System.out.println(average);
		in.close();
	}

}
