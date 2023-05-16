package Day12.HomeWork_Excel;

import Utilities.TestBase;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

public class ApachePOIHomeworkReadData01 extends TestBase {

    /*
    Add the excel file on the resources folder.
    Open the file.
    Open the workbook using file input stream.
    Open the first worksheet.
    Go to first row.
    Go to first cell on that first row and print.
    Go to second cell on that first row and print.
    Go to 2nd row first cell and assert if the data equal to Russia.
    Go to 3rd row 2nd cell-chain the row and cell.
    Find the number of used row.
    Print country, area key value pairs as map object.
     */
    //workbook(excel) > worksheet(sheet) > row > cell

    @Test
    public void readExcel () throws IOException {

        String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\excelfile.xlsx";
        //Open the file.
        FileInputStream fis = new FileInputStream(filePath); // obje oluşturulup parametre olarak dosya yolu girildi
// fis ile dosya açtık.
        //Open the workbook using file input stream.
        Workbook wb = WorkbookFactory.create((fis)); // workbook objesi oluşturuldu. parametre olarak fis objesi girildi.
  //                                                    fis nesnesi ile belirtilen dosyayı yüklemiş olduk dosya okumaya başlandı.
        //Open the first worksheet.
        Sheet sheet = wb.getSheetAt(0);

      //  Go to first row.  
         Row row1 = sheet.getRow(0);

        //Go to first cell on that first row and print.
        Cell cell1 = row1.getCell(0);
        System.out.println("cell1 = " + cell1);
        
        //Go to second cell on that first row and print.
          Cell cell2 = row1.getCell(1);
        System.out.println("cell2 = " + cell2);

        //Go to 2nd row first cell and assert if the data equal to Russia.
        String row2Cell3 = sheet.getRow(1).getCell(0).toString();
        System.out.println("row2Cell3 = " + row2Cell3);
        Assert.assertEquals("Rusya", row2Cell3);

        //Go to 3rd row 2nd cell-chain the row and cell.
        String row3Cell2= sheet.getRow(2).getCell(1).toString();
        System.out.println("row3Cell2 = " + row3Cell2);

        //Find the number of used row.

       int satirSayisi = sheet.getLastRowNum()+1;
        System.out.println("satirSayisi = " + satirSayisi);

        //Print country, area key value pairs as map object.

        HashMap<String,String> list = new HashMap<>();

        for (int i = 1; i < satirSayisi ; i++) {
            String countries =sheet.getRow(i).getCell(0).toString();
            String areas = sheet.getRow(i).getCell(1).toString();
            list.put(countries,areas);
        }
        System.out.println(list);
        System.out.println(getData(1, 5));
    }

    public static String getData(int satirIndex, int sutunIndex) throws IOException {
        String istenenData= "";
        String filePath  = ".\\src\\test\\java\\tests\\resources\\excelfile.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = WorkbookFactory.create(fis);
        istenenData = wb.getSheet("Sayfa1").
                getRow(satirIndex).
                getCell(sutunIndex).toString();
        return istenenData;
    }
}


