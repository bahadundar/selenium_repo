package parameterization;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;

import utilities.ExcelReader;

public class DataProviderTest {

	@DataProvider(name = "dp1")
	public Object[][] getUserValues(Method m) {

		Object[][] object = null;

		if (m.getName().equals("login")) {

			object = new Object[][] { { "bahadir", "121212" }, { "tugba", "2323232" } };
			
			return object;

		} else if (m.getName().equals("userReg")) {

			object = new Object[][] { { "bahadir", "121212", "baha@gnmail.com" },
					{ "tugba", "2323232", "tugba@gmail.com" } };
					
				return object;
		}

		return null;
	}

	@DataProvider(name="dp2")
	public static Object[][] getData() {
		// File f = new File (System.getProperty("user.dir")+ "\\src\\myPOI.xls");

//		// ExcelReader reader = null;
//		ExcelReader reader = null;
//
//		reader = new ExcelReader(System.getProperty("user.dir") + "\\test-data\\Login.xlsx");
//
//		int colCount = reader.getColumnCount("Login2");
//		int rowCount = reader.getColumnCount("Login2");
//		Object[][] object = new Object[rowCount][1];
//		System.out.println(colCount);
//		System.out.println(rowCount);
//		Hashtable<String, String> table = null;
//		for (int row = 2; row <= rowCount + 1; row++) {
//
//			table = new Hashtable<String, String>();
//
//			for (int col = 0; col < colCount; col++) {
//
//				// object[row - 2][col] = reader.getCellData("Login2", col, row);
//
//				table.put(reader.getCellData("Login2", col, 1), reader.getCellData("Login2", col, row));
//
//			}
//			object[row - 2][0] = table;
//		}
//
//		return object;
		return null;
	}

}
