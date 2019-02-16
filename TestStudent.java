package StudentInformation;
import java.awt.Color;
import java.util.*;

public class TestStudent {

	enum color {
	White, Red, Green, Blue, Yellow, Black, Gray
}
  
 
public static void main(String[] agrs) {

	Student s1 = new studentData();
	
	s1.studentID();
	
	s1.name();
	
	s1.address();
	
	studentSpoRecord spo = new studentData();
	spo.record();
	
	Color a1 = Color.red;
	System.out.println("Student fav color: " +a1);
	
	System.out.println("For extra curricular activites: Enter 1 for music and movie");
	Scanner scan1 = new Scanner(System.in);
	int choice = scan1.nextInt();
	
	{
	choice=1;
	System.out.println("You have chose Music ($300) and Movie ($150) ");
  }
	
	ExtraCurricular a2 = new extraCurricular();
	double cost = a2.costOfCurriculam(300, 150);
	System.out.println(Cost of two extra curricular activites $"+cost);
		
	modExtraCurricular mc = new modExtraCurricular();
	double md = mc.extraCurriculam(300, 150);
	System.out.println("Cost of two extra curricular activites and registation: $"+md);
			
	studentData sd = new studentData();
	sd.sickdays();
	
}	

}
	
