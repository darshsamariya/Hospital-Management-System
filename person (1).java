import java.util.Scanner;
import java.sql.*;
abstract  class person {        //use of abstarct class of class name person
 String name,city;
int age;
long  phone;
abstract void details();
abstract void display(int i,int y,String s1,String s2,String s3);

}
class patient extends person
{
	static int hour[]=new int[4];
	 static int minute[]=new int[4];    //making an static array as hour,minute is same for all objects
	 static int second[]=new int[4];
	 int h,m,s;
	
	 
	 static void set()
		{
		for(int i=1;i<4;i++)
			{
				hour[i]=10;       //setting the starting time of the hospital
				minute[i]=0;
				second[i]=0;
				
			}
		}
	int sethour(int y)
	 {
		 return hour[y];  
	 }
	 int setminute(int y)
	 {
		 return minute[y];
	 }
	
	Scanner sc=new Scanner(System.in);
	
	
	void increase(int y)      //increase the time slot for next patient
	{
		if(y==1 || y==2)
		{
		minute[y]=minute[y]+15;  //if general or covid increase by 15 minutes
		}
		if(y==3)
		{
			minute[y]=minute[y]+20;   //for bp related increase time by 20 min
		}
		
	}
void  details()
	{
		System.out.printf("(1) Enter your name :-  ");  //taking inputs from patients
		name=sc.nextLine();
		System.out.printf("(2) Enter your age :-  ");
		age=sc.nextInt();
		System.out.print("(3) Enter your phone no :-");
		phone=sc.nextLong();
		System.out.printf("(4) Enter your city :-  ");
		String d=sc.nextLine();
	     city=sc.nextLine();
	}
void display(int i,int y,String s1,String s2,String s3)  //displaying patients data
{
	 h=sethour(y);
	 m=setminute(y);
	 java.sql.Time time=new java.sql.Time(h,m,s);  //use of java sql for Time management
	System.out.printf("Your %s case token no is :%d\n",s1,i);
	System.out.printf("----------------------------------------------------------------\n"); 
	System.out.printf("Name :%s | Age :%d | Phone Number :%d | City :%s |\n",name,age,phone,city);
	System.out.printf("----------------------------------------------------------------\n"); 
	System.out.println("Please Meet "+s2+" in "+s3+" At time "+time.toString());
	
	System.out.printf("\n");
	
}
void timedisplay(int n,int y,String s1,String s2,String s3)  //same it also displays time by not the user details
{
	 java.sql.Time time=new java.sql.Time(this.h,this.m,s);
	System.out.printf("Your %s case token no is :%d\n",s1,n);
	System.out.println("Please Meet "+s2+" in "+s3+" At time "+time.toString());
	System.out.printf("\n");
}


	
}


