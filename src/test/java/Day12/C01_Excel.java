package Day12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_Excel {


    // Read
    @Test
    public void readExcel() throws IOException {

        // Okunacak excel dosyamizin pathi
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\excelData.xlsx";

        // Path kullanilarak olusturulan file input stream objesi
        FileInputStream fis = new FileInputStream(path);

        // File input stream ile olusturulan workbook objesi
        Workbook wb = WorkbookFactory.create(fis);


        // Sonunda okuma islemlerine baslayabiliriz

        // Workbook - Sheet - Row - Cell

        // workbook.getSheet("informationData") -> sheet ismi ile Sheet alir
        // workbook.getSheetAt(0) -> index ile Sheet alir

        Sheet sheet = wb.getSheetAt(0);

        Row row4 = sheet.getRow(3); // 4. row u bize verir

        Cell cell4_6 = row4.getCell(5);

        String cellValue = cell4_6.toString();

        System.out.println("cellValue = " + cellValue);

        // row4 bir kere degiskenlestirildigi icin bir daha degisken olusturmamiza gerek yoktur.
        Cell cell4_3 = row4.getCell(2);


        wb.close();
        fis.close();
    }
}
