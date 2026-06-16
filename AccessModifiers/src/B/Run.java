package B;

import A.ProtectedExample;

public class Run extends ProtectedExample {

	public static void main(String[] args) {
		//PrivateExample p= new PrivateExample();
		/*
		 * p.method1(); p.method2(); System.out.println(p.name);
		 * System.out.println(p.age);
		 */
		
		
		/*
		 * DefaultExample d= new DefaultExample();
		 * 
		 * System.out.println(d.name); System.out.println(d.grade);
		 */
		 

		/*
		 * ProtectedExample prot= new ProtectedExample(); prot.method1();
		 * prot.method2(); System.out.println(prot.name);
		 * System.out.println(prot.grade);
		 */
		
		Run r = new Run();
		r.method1();
		r.method2();
		System.out.println(r.name);
		System.out.println(r.grade);
		
	}

}
