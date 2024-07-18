import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Classic {

    //Первый вариант: классический подход

    public static void classicMethod() {
        List<String> listStr = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> listInt = new ArrayList<>();
        for (String peremennaya : listStr) {
            listInt.add(Integer.parseInt(peremennaya));
        }
        int multiply = 1;
        for (int i : listInt) {
            multiply *= i;
        }
        System.out.println(multiply);
    }


    //Второй вариант: подход со стримами

    public static void streamMethod() {
        int multiply = Stream.of("1", "2", "3", "4", "5")
                .map(Integer::parseInt)
                .reduce(1, ((integer, integer2) -> integer * integer2));
        System.out.println(multiply);

    }

    public static void main(String[] args) {
        Classic.classicMethod();
        Classic.streamMethod();
    }
}