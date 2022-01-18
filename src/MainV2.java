import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MainV2 {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        hs.add("One");
        hs.add("Five");
        hs.add("Three");
        hs.add("Two");
        hs.add("Four");

        Iterator<String> i= hs.iterator();
        while (i.hasNext()){
            String s= i.next();
            int x=0;
            for(int j=0;j<s.length();j++)
                x+=s.codePointAt(j);
            System.out.println(s+" "+s.hashCode()+" "+hs.hashCode()+" "+x);
        }

    }
}
