import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainHashmap {
    public static void main(String[] args) {
        Map<Integer,Book> map = new TreeMap<>();


        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        Book b5=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        map.put(1,b1);
        map.put(2,b2);
        map.put(3,b3);
        map.putIfAbsent(6,b5);
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.toString());
            System.out.println(entry.hashCode() +" " );
        }
//        map.replace(2,b3);
//        System.out.println(map.get(5).equals(map.get(2)));
        map.remove(2);
        System.out.println(map.get(2));
        System.out.println(map.size());
        System.out.println(map.values());
    }
}
