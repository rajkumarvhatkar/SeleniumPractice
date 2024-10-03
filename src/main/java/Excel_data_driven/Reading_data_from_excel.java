package Excel_data_driven;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Reading_data_from_excel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Test data\\dataDrivenBooks.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("sheet1");
        int row = sheet.getLastRowNum();
        int cell = sheet.getRow(1).getLastCellNum();

        System.out.println("size of row:"+ row);
        System.out.println("sizeof cell:"+ cell);

        workbook.close();
        fis.close();
    }
}
