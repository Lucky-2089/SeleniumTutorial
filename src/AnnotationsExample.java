@interface MyAnnotation {
    String value();
}


/*Explanation:

@interface defines a custom annotation MyAnnotation.
The @MyAnnotation is used to annotate the AnnotationsExample class.
At runtime, the presence of the annotation is checked using isAnnotationPresent, and its value is retrieved.
*/
@MyAnnotation(value = "ExampleClass")
public class AnnotationsExample {
    public static void main(String[] args) {
        if (AnnotationsExample.class.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation annotation = AnnotationsExample.class.getAnnotation(MyAnnotation.class);
            System.out.println("Annotation value: " + annotation.value());
        }
    }
}
