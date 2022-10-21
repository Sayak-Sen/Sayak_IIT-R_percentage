package PercentageOfMarks;
import java.util.*;
public class Marks {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the full marks of each subject");
	int fullmarks_individual=sc.nextInt();
	System.out.println("total Subject");
	int Total_Subject=sc.nextInt();
	int totalmarks=Total_Subject*fullmarks_individual;
	System.out.println("Total marks is "+totalmarks);
	System.out.println("Name of the Subjects ");
	for(int j=1;j<=Total_Subject;j++)
	{
	 System.out.print("subject"+j+":");
	 String subject= sc.next();
	}
	 System.out.println("obtained marks out of "+fullmarks_individual+"is: ");
	// System.out.print("enter the size of the array obtained marks ");
	// int size=sc.nextInt();
	 System.out.println("enter the obtained marks in each subject");
	 float[] obtained_marks=new float[Total_Subject];
	 for(int j=0;j<Total_Subject;j++)
	 {	 
	 
		 obtained_marks[j]=sc.nextFloat();
	}
	float sum=0;
	 for(int j=0;j<Total_Subject;j++)
	 {
		 sum=sum+obtained_marks[j];
	 } 
	 System.out.println("total obtained marks is "+sum);
	
	 float percentage=(sum*100)/totalmarks;
	 System.out.println("percentage of the obtained marks is "+percentage+"%");
	
}}