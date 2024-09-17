import java.lang.reflect.Method;


/*Explanation:

Class.forName("java.util.ArrayList") loads the ArrayList class.
getDeclaredMethods() retrieves all methods of the ArrayList class.
Reflection is powerful but should be used carefully as it can break encapsulation and is less performant.*/
public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.util.ArrayList");
            Method[] methods = clazz.getDeclaredMethods();

            for (Method method : methods) {
                System.out.println("Method name: " + method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}