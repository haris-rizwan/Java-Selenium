package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtility {

    private static XSSFWorkbook ExcelWBook;
    private static XSSFSheet ExcelSheet;

    /**
     *
     * @param path*** the excel file path**
     * @param Sheet** the sheet number where the test is *****
     * @throws Exception
     */


    public static void setExcelFile(String path, String Sheet) throws Exception{

        try {
            // Open the Excel file
            FileInputStream ExcelFile = new FileInputStream(path);


//            Access the excel sheet

            ExcelWBook = new XSSFWorkbook(ExcelFile);
            ExcelSheet =ExcelWBook.getSheet(Sheet);

        }catch (Exception e){
            throw (e);
        }
        }

    /**
     *
      * @param tableName*** requires the test data table name the sheet***
     * @return **the test values ****
     */


    public static String[][] getTestData(String tableName){
        String[][] testData = null;

        try {
            XSSFCell[] boundrayCell = findCell(tableName);
            XSSFCell startCell = boundrayCell[0];
            XSSFCell endCell = boundrayCell[1];

            int startRow = startCell.getRowIndex()+1;
            int endRow = endCell.getRowIndex()-1;
            int startCol = startCell.getColumnIndex()+1;
            int endCol  = endCell.getColumnIndex()-1;

            testData = new String[endRow-startRow + 1][endCol-startCol+1];


            for (int i=startRow;i<endRow+1;i++){
                for (int j=startCol;i<=endCol+1,j++){
                    testData[i-startRow][i-startCol]= ExcelSheet.getRow(i).getCell(j).getStringCellValue();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return testData;
    }

    /**
     *
     * @param tableName **provide the test data table name
     * @return it returns the table start and end cell values to the getTestData
     */

    public static XSSFCell[] findCell(String tableName){
        String pos = "begin";
        XSSFCell[] cells = new XSSFCell[2];

        for (Row row :ExcelSheet){
            for (Cell cell:row){
                if (tableName.equals(cell.getStringCellValue())){
                    if (pos.equalsIgnoreCase("begin")){
                        cells[0] = (XSSFCell)cell;
                        pos = "end";
                    }else {
                        cells[1] = (XSSFCell) cell;
                    }
                }
            }
        }
        return cells;
    }


}

