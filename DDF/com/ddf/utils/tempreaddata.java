package com.ddf.utils;

/*
 * This class is not used in the framework
 */

public class tempreaddata {

	public static void main(String agrs[]) {
		ReadExcelDataFile readData = new ReadExcelDataFile(System.getProperty("user.dir") + "//src//main//java//testData//TestData.xlsx");
		
		int totalRows = readData.getRowCount("SampleData");
		System.out.println("Total Number of Rows : " + totalRows);
		
		int totalCol = readData.getColumnCount("SampleData");
		System.out.println("Total Number of Columns : " + totalCol);

		System.out.println(readData.getCellData("SampleData", 1, 2));

		System.out.println(readData.getCellData("SampleData", 1, 3));
		System.out.println(readData.getCellData("SampleData", 0, 4));
		
//		System.out.println(readData.getColumnCount("SampleData"));
	
	
	}

}