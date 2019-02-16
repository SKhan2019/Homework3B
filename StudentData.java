package StudentInformation;
import java.util.*;

public class studentData extends StudentSportRecord implements Student{
	
	int[] intIDs = new int[30];
	int n;
	String[]sName = new String[30];
	String[]sAddress = new String[30];
	String s, a;
	
	public void studentID() {
		
		System.out.println("Enter student ID: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		intIDs[0]=n;
		
		
		System.out.println("Enter student name: ");
		Scanner scan2 = new Scanner(System.in);
		s = scan2.nextLine();
		sName[0]=s;
	
	
		System.out.println("Enter student address: ");
		Scanner scan3 = new Scanner(System.in);
		a = scan3.nextLine();
		sAddress[0]=a;

		System.out.println();
		System.out.println();
		System.out.println("Student ID: "+intIDs[0]);
		System.out.println("Student Name: "+sName[0].toUpperCase());
		System.out.println("Student Address: "+sAddress[0].toUpperCase());
}	
		
	public void name() {
		System.out.println("Khan Shafiqul: ");
}
	public void address() {
		System.out.println("93-16 89th Ave Woodhaven NY 11421 ");
}	
	public void hobby() {
		System.out.println("Student's hobby:");
}
	public void sickdays() {
		System.out.println("How many days student missed class:");
		Scanner missed = new Scanner(System.in);
		int sd = missed.nextInt();
		System.out.println("Days Student missed class: "+sd);
		
}
	
}	
	
	
	
	
	
	
	
	
	
	