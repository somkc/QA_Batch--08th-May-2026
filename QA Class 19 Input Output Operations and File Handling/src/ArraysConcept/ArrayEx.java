package ArraysConcept;

public class ArrayEx {

	public static void main(String[] args) {
		
		String[] stud= new String[5];
		stud[3]="Peter";
		stud[1]="Kevin";
		stud[0]="Joe";
		stud[2]="bob";
		stud[4]="Bruce";
		stud[2]="Mark";
		stud[0]="Jack";
		stud[2]="henry";
		stud[1]="John";
		/*
		 * System.out.println(stud[0]); System.out.println(stud[1]);
		 * System.out.println(stud[2]); System.out.println(stud[3]);
		 * System.out.println(stud[4]);
		 */
		
		for(int i=0;i<stud.length;i++) {
			System.out.println(stud[i]);
		}

	}

}
