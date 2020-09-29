package edu.exam14.ex05excel;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class excelTest {
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException{
		// 엑셀 파일 지정
		File file = new File("test.xls");
		// 파일이 없을 시 파일 생성
		if(!file.exists()){	file.createNewFile(); }
		
		// 엑셀 객체 생성
		WritableWorkbook workbook = Workbook.createWorkbook(file);
		
		// 쉬트 생성 ( 쉬트명, 인덱스)
		WritableSheet sheet = workbook.createSheet("hong", 0);

		// 셀(Label) 생성
		Label label; 
		for(int i=0; i<10; i++){
			for(int j=0; j<3; j++){
				// Label 방식으로 생성하여 Add 하여야 한다.
				label = null;
				label = new Label(j,i,"홍길동("+String.valueOf(i)+","+String.valueOf(j)+")");
				sheet.addCell(label);
			}
		}
		
		// 저장 및 닫기
		workbook.write();
		workbook.close();
	}
}
