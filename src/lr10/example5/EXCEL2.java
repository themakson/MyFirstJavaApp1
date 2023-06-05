package lr10.example5;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
public class EXCEL2 {
    public static void main(String[] args) {
        try{
            // открываем файл Excel для чтения
            String filePath = "C:\\Users\\Максим\\IdeaProjects\\MyFirstJavaApp 1\\src\\lr10\\example5\\excel.xlsx";
            FileInputStream inputStream = new FileInputStream(filePath);

            // Создаем экземпляр книги из файла
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            // Получаем лист из книги по  его имени
            XSSFSheet sheet = workbook.getSheet("товары");

            // Перебираем строки и ячейки листа
            for (Row row : sheet){
                for (Cell cel : row){
                    //Выводим значение ячейки на экран
                    System.out.println(cel.toString() + "\t");
                }
                System.out.println();
            }
            // Закрываем файл и освобождаем ресурсы
            workbook.close();
            inputStream.close();
        }catch (FileNotFoundException e){
            System.out.println("Такого файла не существует");
        }catch (NullPointerException e){
            System.out.println("Такого листа не существует");
        } catch (NoSuchFileException e){
            System.out.println("не правильный формат файла");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
