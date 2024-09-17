
import java.util.ArrayList;
import java.util.List;


/*Explanation:

List<String> specifies that the list will hold String objects only, ensuring type safety.
Generics prevent runtime errors by catching type mismatches at compile-time.*/
public class GenericsExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String s : stringList) {
            System.out.println(s);
        }
    }
}