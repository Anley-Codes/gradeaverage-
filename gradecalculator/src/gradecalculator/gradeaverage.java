package gradecalculator;

import java.util.Scanner;

public class gradeaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double grade1= 1;
		//double grade2=1;
		//double grade3=1;
		//double average =1;
		//double answer=1;
		
		Scanner input = new Scanner(System.in);
System.out.println("please enter the grades 0 to 100");
System.out.println("First grade");
double grade1= input.nextDouble();
System.out.println("please enter second grade ");
double grade2 = input.nextDouble();
System.out.println("please enter Thirs grade ");
double grade3 = input.nextDouble();

double answer = average(grade1,grade2,grade3);

System.out.println();

System.out.println(answer);

	}
	
	public static double average(double a, double b, double c) {
		double gradeaverage= a+b+c;
		gradeaverage=gradeaverage/3;
		return gradeaverage;
		
	}

}
    