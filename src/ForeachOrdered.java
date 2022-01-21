import java.util.ArrayList;
import java.util.List;

public class ForeachOrdered {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("------------Iterating by passing lambda expression---------------");
        gamesList.stream().sorted().forEach(System.out::println);
//        System.out.println("------------Iterating by passing lambda expression---------------");
//        gamesList.stream().forEachOrdered(games -> System.out.println(games));
        System.out.println("------------Iterating by passing method reference---------------");
        gamesList.stream().sorted().forEachOrdered(System.out::println);
    }
}
