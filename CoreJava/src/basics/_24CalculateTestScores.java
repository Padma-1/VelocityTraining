package basics;

//code to calculate whether each student 
//in the class except lucy has passed their recent test
public class _24CalculateTestScores {

	public static void main(String[] args) {
		
		String[] students = {"Mark", "Bill", "Lucy", "Chole"};
		int grades[] = {16,25,0,19};
		for(int i=0;i<students.length;++i) {
			if(students[i].equals("Lucy")) {
				continue;
			}
			if(grades[i]>17) {
				System.out.println(students[i]+ " has passed their test with grade "+grades[i]);
			}else {
				System.out.println(students[i]+" has passed their test with grade "+grades[i]);
			}
		}
	}

}
