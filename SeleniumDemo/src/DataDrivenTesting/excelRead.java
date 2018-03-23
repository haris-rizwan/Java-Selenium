package DataDrivenTesting;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class excelRead {

    public static void main(String[] args){
        XSSFWorkbook ExcelWBook;
        XSSFSheet Sheet;
        XSSFCell cell;

        String path = "/Users/harisrizwan/IntelliJ WorkSpace/SeleniumDemo/src/utilities/Excelread.xlsx";
        String sheetName = "Sheet1";


        try {
            FileInputStream ExcelFile = new FileInputStream(path);
            ExcelWBook = new XSSFWorkbook(ExcelFile);
            Sheet = ExcelWBook.getSheet(sheetName);

            cell = Sheet.getRow(0).getCell(0);
            String cellData = cell.getStringCellValue();

            System.out.println("Cell Data: " + cellData);

        }catch (Exception e){

            e.printStackTrace();

        }
    }
}
