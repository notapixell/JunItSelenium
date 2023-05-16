package Day12.HomeWork_Excel;


import Utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Hwork01_ApachePOI_02 extends TestBase {
    /*
    Store the path of the file as string and open the file.
    Open the workbook.
    Open the first worksheet.
    Go to the first row.
    Create a cell on the 3rd column (2nd index) on the first row.
    Write “POPULATION” on that cell.
    Create a cell on the 2nd row 3rd cell(index2), and write data.
    Create a cell on the 3rd row 3rd cell(index2), and write data.
    Create a cell on the 4th row 3rd cell(index2), and write data.
    Write and save the workbook.
    Close the file.
    Close the workbook.
     */
//dosya bu clasttan once 3. sutun temiz olmalı.. ilk calıstırıldıgında yazar..
// 2. kez calıstırılınca uzerine yazar, hata vermez

    @Test
    public void writeExcel() throws IOException {

        String filePath = ".src/test/resources/excelfile.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook wb = WorkbookFactory.create(fis); // Open the workbook.
        Sheet sheet = wb.getSheetAt(0); //Open the first worksheet.
        Row row = sheet.getRow(0); //Go to the first row.
        Cell cell1 = row.createCell(2);
        cell1.setCellValue("POPULATION");//  Write “POPULATION” on that cell.
        sheet.getRow(1).createCell(2).setCellValue("20000");
        sheet.getRow(2).createCell(2).setCellValue("60000");
        sheet.getRow(3).createCell(2).setCellValue("80000");

        FileOutputStream fos = new FileOutputStream(filePath);
        wb.write(fos);
        fis.close();
        fos.close();
    }

}
