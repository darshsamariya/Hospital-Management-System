import java.util.Scanner;
 class newcase {
	int i[]=new int[4];
	int r[]=new int[4];
	int f[]=new int[4];
	int size[]=new int[4];
	newcase()    //constructor
	{
		for(int j=1;j<=3;j++)
		{
			i[j]=r[j]=f[j]=0;
		}
		size[1]=50;
		size[2]=25;
		size[3]=15;
	}
 public void NEW(int y,patient p[],String s1,String s2,String s3)   //method NEW
	{
	 Scanner sc=new Scanner(System.in);
	  boolean hos=true;
	  while(hos)
	  {
		  System.out.println("YOU ARE VIEWING "+s1+" CASE"+" APPLICATION ");
		  System.out.print("\n _______________________ \n");
	      System.out.print("|   1. ADMINISTRATOR    | \n");
		  System.out.print("|_______________________| \n\n");
		  System.out.print(" _______________________ \n");
	      System.out.print("|   2. PATIENT          | \n");
		  System.out.print("|_______________________| \n\n");
		  System.out.print(" ___________________________________\n");
		  System.out.print("|   3. EXIT "+s1+ " APPLICATION     | \n");
		  System.out.print("|      AND GO BACK TO MAIN MENU     | \n");
		  System.out.print("|___________________________________| \n\n");

		  System.out.println("Enter your choice from 1 to 3:- ");
		  int temp=sc.nextInt();
		  switch(temp)
		  {
		  case 1:
		  {
               System.out.printf("PRESS: " );
               System.out.printf("\n ______________________________________________ \n");
	           System.out.printf("|  1-> TO VIEW All PATIENT RECORD FOR THIS CASE | \n");
		       System.out.printf("|_______________________________________________| \n");
	           System.out.printf("|   0-> to EXIT                                 | \n");
		       System.out.printf("|_______________________________________________| \n\n"); 
               int k=sc.nextInt();
               if(k==1)
               {
            	   if(f[y]==0)
            	   {
            		   System.out.println("NO DATA TO DISPLAY");
            	   }
            	   else {
            	   for(int j=f[y];j<r[y];j++)
          	  	   {
          	  	       System.out.printf("-------------------------------------------------------------------------\n"); 
          			   System.out.printf(" NAME = %s    |    CITY = %s   |   AGE = %d | PHONE = %d | \n ",p[j].name,p[j].city,p[j].age,p[j].phone);
          			   p[j].timedisplay(j,y,s1,s2,s3);  
          			   System.out.printf("--------------------------------------------------------------------------\n"); 
          		   }
            	   hos=true;}
               }
               else hos=true;
               break;
		  }
		  case 2:
		  {
			  boolean todo=true;
				
				while(todo)
				{
					System.out.println();
					if(f[y]==0)
					{
						System.out.println("NO CASE REGISTERED TODAY in "+s1+" Case");
					}                                   //showing total/current cases that are registered today
					else {
					System.out.printf("CURRENT TOKEN for %s IS %d/%d\n",s1,f[y],size[y]);
					}
				System.out.printf(" PRESS\n");
				System.out.printf(" 1| For new %s case \n 2| To find Your Time Slot \n 3| IF your token is same as current token \n 4| To go back\n:->",s1);
				int k=sc.nextInt();   
				switch(k)
				{
				case 1:                    //for new case
				{
				if(i[y]==0)
				{
					r[y]=1;
					f[y]=1;
					i[y]=1;
				}
				if(i[y]==size[y])              //checking all the formalities if the new case token no is not exceeding
				{
					System.out.println("FULL NO MORE CASES TAKEN TODAY");
					todo=false;
					break;
				}
				  p[i[y]]=new patient();           //making a object of patient 
					p[i[y]].details();
					 System.out.println("Your slot is SUCCESSFULLY Confirmed");
					 p[i[y]].display(i[y],y,s1,s2,s3);                //all methods are stored in class patient
					p[i[y]].increase(y);          //increasing the time slot for other patient
					i[y]++;
					r[y]++;
					
					todo=false;
					break;
				
				}
				case 2:
				{
					System.out.println("Enter patient token");   //making a service of showing Time for a particular token
					int n=sc.nextInt();
					if(n<=i[y]-1)
					{
					p[n].timedisplay(n,y,s1,s2,s3);   
					}
					else
					{
						System.out.println("Data not found");
					}
					todo=false;
					break;
				}
				case 3:
				{
					System.out.printf("Current token is %d\n",f[y]);   //For check-in in the following case
					System.out.println("Enter ur token no");          //means if token matches with current token
					int g=sc.nextInt();                               //then it has service to check-in 
					if(f[y]==r[y])
					{
						System.out.println("TOKEN size exceed");
						todo=false;
						break;
					}
					if(f[y]==size[y])
					{
						System.out.println("TOKEN size exceed");
						todo=false;
						break;
					}
					if(g==f[y])
					{
						boolean tome=true;
						while(tome)
						{
						System.out.println("Enter your Phone no. for verification purpose");  //for extra security by entering their name
						long l=sc.nextLong();
						if(l==p[f[y]].phone)
						{
							System.out.printf("Verification Successful and You can GO IN \n");
							p[f[y]].timedisplay(f[y],y,s1,s2,s3);   
							p[f[y]]=null;              
								f[y]++;
							
							break;
						}
						else
						{
							System.out.println("Verification UNSUCCESSFULL");  //if name not matches then patients entry will not be valid
							System.out.println("To Re-Enter your Name press 1 (OR 0 to EXIT)");
							int z=sc.nextInt();
							if(z==1) tome=true;
							else tome=false;
							
						}
						}
					}
					
					else
					{
						System.out.println("TOKEN NOT MATCHED");
					}
					todo=false;
					break;
				}
				case 4:
				{
				  todo=false;
				  break;
				}
				
				}
			}
				hos=true;
				break;
				
			}
		  case 3:
		  {
			  hos=false;
			  break;
		  }
		  }
		  }
		
}
}


