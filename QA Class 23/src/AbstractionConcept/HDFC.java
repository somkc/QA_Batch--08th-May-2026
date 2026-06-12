package AbstractionConcept;

public class HDFC extends AbstractionConcept  {

	public static void main(String[] args) {
		
		HDFC h = new HDFC();
		h.savings();
		h.insurance();
		h.kyc();

	}

	@Override
	public void savings() {
		System.out.println("saivngs interest 5.0");
		
	}

	@Override
	public void insurance() {
		System.out.println("insurace cost 100$");
		
	}

	

}
