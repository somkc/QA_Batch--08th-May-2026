package ArraysConcept;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] marks=new int[3];
		//last index is always size-1
		marks[0]=60;
		marks[1]=70;
		marks[2]=95;
	
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		
		System.out.println(marks.length);
		int i=0;
		
		System.out.println("************************************************");
		while(i<marks.length) {
			System.out.println(marks[i]);
			i++;
		}

	}

}
