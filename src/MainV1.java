import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainV1 {
    public static void main(String[] args) {
        Long t1=System.currentTimeMillis();
        ArrayList<Employee> lt=new ArrayList<>();
        Employee e1=new Employee(1,"paras",3.1);
        Employee e2=new Employee(1,"aman",5.1);
        Employee e3=new Employee(1,"thomas",2.1);
        lt.add(e1);
        lt.add(e2);
        lt.add(e3);
        for(int i=1;i<10000;i++) {
            lt.add(i,e2);
        }
        Long t2=System.currentTimeMillis();
        System.out.println(t2-t1);

        for (Employee e:lt){
//            System.out.println(e.toString()+" "+e.hashCode());
            lt.set(lt.indexOf(e),e3 );
        }
        Long t3=System.currentTimeMillis()-t2;
        System.out.println(t3);
        System.out.println(lt.size());
    }
}
