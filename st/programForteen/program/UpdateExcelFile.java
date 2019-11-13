package program;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class UpdateExcelFile {


    public int updateRecords(int colToUpdate, String newValue){
        int updated = 0;
        try {
            File file = new File("/home/jaseem/IdeaProjects/ReadExcelFile/src/program/mcafifth.xlsx");
            String fileName = file.getName();
            String fileExtension = fileName.substring(fileName.indexOf("."));
            String sheetName = "Sheet1";

            FileInputStream fis = new FileInputStream(file);

            Workbook excelFile = null;

            if(fileExtension.equals(".xlsx")){
                //If it is xlsx file then create XSSFWorkbook object
                excelFile = new XSSFWorkbook(fis);
            }else if(fileExtension.equals(".xls")){
                //If it is xls file then create HSSFWorkbook object
                excelFile = new HSSFWorkbook(fis);
            }


            Sheet sheet = excelFile.getSheet(sheetName);

            System.out.println("Slno  RollNum  Name     Sem");

            for(int row = 1; row < sheet.getLastRowNum() + 1; row++){
                Row sheetRow = sheet.getRow(row);
                for(int col = 0; col < sheetRow.getLastCellNum(); col++){
                    Cell cell = sheetRow.getCell(col);
                    System.out.print(cell + "  ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("Updating...");
            System.out.println();

            for(int row = 1; row < sheet.getLastRowNum() + 1; row++){
                Row sheetRow = sheet.getRow(row);
                for(int col = 0; col < sheetRow.getLastCellNum(); col++){
                    Cell cell = sheetRow.getCell(col);
                    if(col == colToUpdate - 1){
                        cell.setCellValue(newValue);
                        updated++;
                    }
                    System.out.print(cell + "  ");
                }
                System.out.println();

            }

            fis.close();

            FileOutputStream fos = new FileOutputStream(file);
            excelFile.write(fos);

            System.out.println();
            System.out.println("Updated: " + updated + " records.");

            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return updated;
    }
}
