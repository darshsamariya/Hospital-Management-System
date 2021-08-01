/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		patient general[]=new patient[50];    //Creating the array of objects  
		patient covid[]=new patient[25];
		patient bp[]=new patient[15];
		patient m=new patient();
		m.set();   //Intaializing the time 
		Scanner sc=new Scanner(System.in);
		boolean hospital=true; 
		newcase g=new newcase();   //making new cases for each object
		newcase c=new newcase(); 
		newcase e=new newcase();
		System.out.printf("-----------------------------------------------------------------------------------------------\n\n");
		System.out.printf("\t\t\t|          INNOVATIVE ASSIGNMENT         |\n\n");
		System.out.printf("\t\t\t| OBJECT ORIENTED PROGRAMMING - 2CS302 |\n\n");
		System.out.printf("\t\t\t|    SUBMITTED TO : Prof.KAVITA TEWANI    |\n\n");
		System.out.printf("\t\t\t| SUBMITTED BY : SAMARIYA DARSH 19BCE236 |\n\n");
		System.out.printf("\t\t\t|                RUDHRANSH VYAS 19BCE228 |\n\n");
		System.out.printf("\t\t\t|                RONAK SAXENA   19BCE244 |\n\n");
		System.out.printf("-----------------------------------------------------------------------------------------------\n");
		System.out.printf("\n\n\n\n\t\t\t-----------------------------------------");
	    System.out.printf("\n\t\t\t|              WELCOME TO               |");
		System.out.printf("\n\t\t\t| NIRMA HOSPITAL MANAGEMENT SYSTEM |");
		System.out.printf("\n\t\t\t-----------------------------------------\n\n");

		while(hospital)
		{
		  System.out.printf("WELCOME TO NIRMA HOSPITAL MANAGEMENT SYSTEM\n");
		  System.out.print("\n__________________________\n");
	      System.out.print("| Press 1. GENERAL CASE    | \n");
		  System.out.print("|__________________________| \n\n");
		  System.out.print(" ___________________________________________ \n");
	      System.out.print("| Press 2. COVID-19 CONSULTING CASE         | \n");
		  System.out.print("|___________________________________________| \n\n");
		  System.out.print(" ______________________________________________________\n");
		  System.out.print("| Press 3. ACCIDENT OR RELATED EMERGENCY CASE          | \n");
		  System.out.print("|______________________________________________________| \n\n");
		   System.out.print(" ______________________________________________________\n");
		  System.out.print("| Press 4. TO EXIT THE APPLICATION         | \n");
		  System.out.print("|______________________________________________________| \n\n");
		int y=sc.nextInt();   //taking input as per users choice
		switch(y)
		{
		case 1:
		{
			String s1="GENERAL";                 
			String s2="Dr Piyush Patel";
			String s3="A Block";
			g.NEW(y,general,s1,s2,s3);    //All details going in Method NEW 
			break;                         //and therby performing operartion as per user's choice
		}
		case 2:
		{
			String s1="COVID-19";
			String s2="Dr Kalpesh Agarwal";
			String s3="B Block";
			c.NEW(y,covid,s1,s2,s3);
			break;
		}
		case 3:
		{
			String s1="ACCIDENT OR RELATED EMERGENCY CASE";
			String s2="Dr Rahul Mishra";
			String s3="C Block";
			e.NEW(y,bp,s1,s2,s3);
			break;
		}
		case 4:
		    {
		        hospital=false;
		        break;
		    }
		
		}
		}
	}
}
