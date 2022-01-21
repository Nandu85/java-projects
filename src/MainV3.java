import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.function.Function;

public class MainV3 {
    public static void main(String[] args) {
        List<Integer> lt=new ArrayList<>();
        lt.add(12);
        lt.add(56);
        lt.add(34);
        lt.add(23);
        //Referring
        Function<List<Integer>, Integer> fn = FunctionalInterfaceExample::AddList;
        int Result= fn.apply(lt);
        System.out.println(Result);
        //Encoding Decoding.....................................
        Base64.Encoder enc=Base64.getMimeEncoder();
        String str=lt.get(0).toString()+lt.get(1).toString()+lt.get(2).toString()+lt.get(3).toString();
        System.out.println(str);
        String estr=enc.encodeToString(str.getBytes());
        System.out.println(estr);
        Base64.Decoder dec=Base64.getMimeDecoder();
        System.out.println(Integer.parseInt(new String(dec.decode(estr))));

    }
}
