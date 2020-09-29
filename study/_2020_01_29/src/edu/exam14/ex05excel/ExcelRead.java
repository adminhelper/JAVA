package edu.exam14.ex05excel;

import java.io.*;
import jxl.*;
/* http://www.andykhan.com/jexcelapi/에서 배포하는 jxl을 이용하여
* 엑셀 파일을 읽고 내용을 출력하는 예제*/
public class ExcelRead {

	public static void main(String[] args) {
		Workbook workbook = null;
		Sheet sheet = null;
		Cell cell = null;
		String excelFile = "엑셀파일생성.xls";
		try {
			//엑셀파일을 인식
			workbook = Workbook.getWorkbook( new File( excelFile));

			//엑셀파일에 포함된 sheet의 배열을 리턴한다.
			//workbook.getSheets();

			if( workbook != null) {
				//엑셀파일에서 첫번째 Sheet를 인식
				sheet = workbook.getSheet(0);

				if( sheet != null)	{
					//셀인식 Cell a1 = sheet.getCell( 컬럼 Index, 열 Index);
					//셀 내용 String stringa1 = a1.getContents();

					//기록물철의 경우 실제 데이터가 시작되는 Row지정
					int nRowStartIndex = 1;
					//기록물철의 경우 실제 데이터가 끝 Row지정
					int nRowEndIndex   = sheet.getColumn( 2).length - 1;

					//기록물철의 경우 실제 데이터가 시작되는 Column지정
					int nColumnStartIndex = 1;
					//기록물철의 경우 실제 데이터가 끝나는 Column지정
					int nColumnEndIndex = sheet.getRow( 2).length - 1;

					String szValue = "";

					for( int nRow = nRowStartIndex; nRow <= nRowEndIndex; nRow++ )	{
						for( int nColumn = nColumnStartIndex; nColumn <= nColumnEndIndex ; nColumn++)	{
							szValue = sheet.getCell( nColumn, nRow).getContents();

							System.out.print( szValue);
							System.out.print( "\t" );
						}
						System.out.println();
					}
				}
				else	{
					System.out.println( "Sheet is null!!" );
				}
			}
			else	{
				System.out.println( "WorkBook is null!!" );
			}
		}
		catch( Exception e) {
			e.printStackTrace();
		} finally	{
			if( workbook != null) {
				workbook.close();
			}
		}
	}
}