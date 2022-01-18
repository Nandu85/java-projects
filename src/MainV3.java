import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MainV3 {
    public static void main(String[] args) {
        List<Integer> lt=new ArrayList<>();
        lt.add(12);
        lt.add(56);
        lt.add(34);
        lt.add(23);
        //Reffering
        Function<List<Integer>, Integer> fn = FunctionalInterfaceExample::AddList;
        int Result= fn.apply(lt);
        System.out.println(Result);
    }
}
