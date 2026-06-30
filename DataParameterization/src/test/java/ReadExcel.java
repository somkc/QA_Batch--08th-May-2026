
public class ReadExcel {

	public static void main(String[] args) {
		
		Xls_Reader xls= new Xls_Reader("S:\\STUDY\\JANBASK\\QA Batch - 08th May 2026\\DataParameterization\\src\\test\\java\\TestData\\TESTSUITE.xlsx");
		int rows=xls.getRowCount("GMAIL");
		System.out.println(rows);
		for(int i=2;i<=rows;i++) {
		String c1=xls.getCellData("GMAIL", "TCID", i);
		String c2=xls.getCellData("GMAIL", "TESTCASE", i);
		String c3=xls.getCellData("GMAIL", "STATUS", i);
		System.out.println(c1+"| "+c2+"| "+c3);
		}
	}

}
