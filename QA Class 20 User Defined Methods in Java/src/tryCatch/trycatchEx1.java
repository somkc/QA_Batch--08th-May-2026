package tryCatch;

public class trycatchEx1 {

	public static void main(String[] args) {
		int[] arr= new int[5];
		try {
		
		arr[3]=890;
		arr[2]=10;
		arr[0]=500;
		arr[1]=300;
		arr[6]=100;
		arr[4]=700;
		
		}
		catch(Exception e){
			System.out.println("cannot store values in array");
			e.printStackTrace();
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		

	}

}
