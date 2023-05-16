package Day12;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C02_Excel {

    @Test
    public void readExcel() throws IOException {

        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fis);

        // Oncelikle devamli wb objesi kullanarak sheet row cell locate etmek yerine bir seferligine tum datayi
        // Javanin Map objesine tasiyabiliriz (2 sutun oldugu takdirde)

        Map<String, String> data = new HashMap<>();

        Sheet sheet1 = wb.getSheetAt(0);


        //getLastRowNum() methodu son kullanilan row un INDEX bilgisini bize verir.

        int lastRowIndex = sheet1.getLastRowNum();
        System.out.println("lastRowIndex = " + lastRowIndex);


        // Kullanilan row sayisini bize verir. Rowlar 1 den basladigi icin kullanilan row sayisi = son index + 1
        int lastRowNumber = sheet1.getPhysicalNumberOfRows();
        System.out.println("lastRowNumber = " + lastRowNumber);


        for (int i = 0; i <= lastRowIndex; i++) {

            // Ilk row key ikinci row value olarak map objesine ekleyecegiz

            String country = sheet1.getRow(i).getCell(0).toString();

            String area = sheet1.getRow(i).getCell(1).toString();

            data.put(country, area);


        }
    }
}


// Eger sutun ve satir sayisi bilinmiyorsa ic ice 2 for dongusune ihtiyacimiz vardir.
// satir sayisi bilgisini sheet uzerinden, sutun sayisi bilgisini ise row uzerinden aliriz
