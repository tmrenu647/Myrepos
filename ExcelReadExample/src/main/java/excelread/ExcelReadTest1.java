package excelread;

import java.io.IOException;

public class ExcelReadTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String s=ExcelReadTest2.getStringData(0, 0);
		System.out.println(s);
		String i=ExcelReadTest2.getIntegerData(0, 1);
		System.out.println(i);
	}

}
