package InterfaceConcept;

//implements is used to refer interface

public class HDFC implements Central {

	public static void main(String[] args) {
	HDFC h = new HDFC();
	h.loan();
	h.insurance();
	h.insurance();
	h.locker();

	}

	@Override
	public void savings() {
		System.out.println("HDFC savings interest rate is 4%");
		
	}

	@Override
	public void insurance() {
		System.out.println("insurance charges is 100");
		
	}


	@Override
	public void locker() {
		System.out.println("locker charges is 100");
		
	}

	@Override
	public void loan() {
		System.out.println("loan interest rate is 4%");
		
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
