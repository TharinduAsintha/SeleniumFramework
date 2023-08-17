//import org.apache.poi.ss.usermodel.*;
////import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class ExcelReader {
//    private String excelFilePath;
//    private String sheetName;
//
//    public ExcelReader(String excelFilePath, String sheetName) {
//        this.excelFilePath = excelFilePath;
//        this.sheetName = sheetName;
//    }
//
//    public String readCellValue(int rowIndex, int columnIndex) throws IOException {
//        try (FileInputStream inputStream = new FileInputStream(excelFilePath);
//            // Workbook workbook = new XSSFWorkbook(inputStream)) {
//
//            Sheet sheet = workbook.getSheet(sheetName);
//            Row row = sheet.getRow(rowIndex);
//            Cell cell = row.getCell(columnIndex);
//
//            return cell.getStringCellValue();
//        }
//    }
//
//    public String readCellValue(int rowIndex, String columnName) throws IOException {
//        try (FileInputStream inputStream = new FileInputStream(excelFilePath);
//            // Workbook workbook = new XSSFWorkbook(inputStream)) {
//
//            Sheet sheet = workbook.getSheet(sheetName);
//            Row headerRow = sheet.getRow(0);
//
//            int columnIndex = -1;
//            for (int i = 0; i < headerRow.getLastCellNum(); i++) {
//                if (headerRow.getCell(i).getStringCellValue().equalsIgnoreCase(columnName)) {
//                    columnIndex = i;
//                    break;
//                }
//            }
//
//            if (columnIndex != -1) {
//                Row dataRow = sheet.getRow(rowIndex);
//                Cell cell = dataRow.getCell(columnIndex);
//                return cell.getStringCellValue();
//            }
//
//            return null; // Column not found
//        }
//    }
//}
