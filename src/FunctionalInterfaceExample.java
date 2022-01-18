import java.util.List;

public class FunctionalInterfaceExample {
    static Integer AddList(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).sum();
    }//refer main v3 for further process
}
