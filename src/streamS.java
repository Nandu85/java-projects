import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamS {
    static long counter=0;
    private static void wasCalled() {
        counter++;
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("harry");
        names.stream()
//intermediate operation
                .map(name -> name.toUpperCase())
//intermediate operation
                .filter(name -> name.length() > 3)
//terminal operation
                .forEach(name -> System.out.println(name));
        List<String> result = Stream.of(Locale.getISOCountries()).collect(Collectors.toList());
        System.out.println(result);
//
//        List<String> list = Arrays.asList("abc1", "abc2","abc3");
//        System.out.println(list.stream().filter(element -> {
//            wasCalled();
//            return element.contains("2") || element.contains("3");
//        }).skip(1).findFirst());
//        System.out.println(counter);
//        Stream st = names.stream();
////        Stream strm = Stream.of("Ram", "Shyam", "harry");
//        st.forEach(s -> System.out.println(s.toString()));
        IntStream s = Stream.generate(() -> Math.random() * 10).mapToInt(x -> x.intValue()).distinct()./*skip(3).*/limit(10);
        int sum=s.reduce(0,(a,b)->a+b);
        System.out.println(sum);
//        System.out.println(s.filter(x -> x < 50).count());
////        s.forEach(x -> System.out.print(x+" "));
//        Stream.iterate(1, x -> x + 1).limit(5).forEach(System.out::print);
////        Stream.generate(() -> String.valueOf(System.currentTimeMillis())).limit(5).forEach(e -> System.out.println(e));
//        System.out.println();
//        Stream.generate(() -> String.valueOf(System.currentTimeMillis())).limit(7)
//                .forEach(e -> System.out.println(e));
    }
}
