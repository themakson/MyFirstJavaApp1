package lr10.example3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
public class JSON3 {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", "Дюна");
        book1.put("author", "Фрэнк Герберт");
        book1.put("year", "1965");

        JSONObject book2 = new JSONObject();
        book2.put("title", "О дивный новый мир");
        book2.put("author", "Олдос Хаскли");
        book2.put("year", "1932");

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try (FileWriter file = new FileWriter("C:\\Users\\Максим\\IdeaProjects\\MyFirstJavaApp 1\\src\\lr10\\example3\\JSON3.json"))
        {
            file.write(library.toString());
            System.out.println("Json успешно записан");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
