package StudentInformation;

public class StudentGrade {

	public int classGrade(int math, int english){
		int total= math+english;
		return total;
}
	public int classGrade(int math, int english, int scince){
		int total= math+english+scince;
		return total;	
}
	public int classGrade(int math, int english, int scince,  int geography){
		int total= math+english+scince+geography;
		return total;
}


}