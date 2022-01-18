import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> al1 = new ArrayList<>();
        al1.add("abc");
        al1.add("abc1");
        al1.add("pqr");
        al1.add(1,"orange");
//        for (String s : al1) {
//            System.out.print(s+" ");
//        }
        System.out.println();
        al1.set(2,"mango");
//        Iterator itr= al1.listIterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
        Collections.sort(al1);
        ListIterator lt= al1.listIterator(al1.size());
        while (lt.hasPrevious()){
            System.out.println(lt.previous());
        }
//        System.out.println(al1);
    }
}
