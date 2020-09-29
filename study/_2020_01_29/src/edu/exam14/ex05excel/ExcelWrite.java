package edu.exam14.ex05excel;

import java.io.*;
import jxl.*;
import jxl.write.*;
/*http://www.andykhan.com/jexcelapi/에서 배포하는 jxl을 이용하여
* 엑셀 파일을 생성하고 기록하는 예제
* 자세한 사용방법은 압축파일에 포함된 API문서를 참조하세요.
*/
public class ExcelWrite {
	public static void main(String[] args) 	{
		WritableWorkbook workbook = null;
		WritableSheet sheet = null;

		File excelFile = new File( "엑셀파일생성.xls");
		Label label = null;
		jxl.write.Number num = null;
		long start = 0;
		long end = 0;
   
		try { 
			workbook = Workbook.createWorkbook( excelFile);
			workbook.createSheet("sheet1", 0);
			sheet = workbook.getSheet(0);
			for(int i = 0 ; i < 3; i++)  {
				for( int j = 0; j < 10; j++){
					num = new jxl.write.Number( j, i, (i*10+j+1.0));
					sheet.addCell( num);
				}
			}
			workbook.write();
			workbook.close();
		}    catch( Exception e)    {
			e.printStackTrace();
		}
    }
}