import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Orange", "Apple"); 

        List<String> apples2 = list.stream()
                .filter(Predicate.isEqual("Apple"))
                .collect(Collectors.toList());

        System.out.println("isEqual を使った方法 (Apple): " + apples2); 
        System.out.println("---");
    }
}