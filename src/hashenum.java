import java.util.*;

public class hashenum {
    public static void main(String[] args) {
        Set<DaysOfWeek> ts = new TreeSet<>();
        ts.add(DaysOfWeek.FRIDAY);
        ts.add(DaysOfWeek.MONDAY);
        ts.add(DaysOfWeek.SUNDAY);
        ts.add(DaysOfWeek.TUESDAY);

        Map<Integer,DaysOfWeek> tm=new TreeMap<>();
        tm.put(1,DaysOfWeek.FRIDAY);
        tm.put(3,DaysOfWeek.WEDNESDAY);
        tm.put(5,DaysOfWeek.SUNDAY);

        for(Map.Entry e:tm.entrySet()){
            System.out.println(e.toString());
        }

        Iterator i = ts.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
