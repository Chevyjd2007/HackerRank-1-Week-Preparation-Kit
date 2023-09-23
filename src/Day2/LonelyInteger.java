package Day2;

import java.util.ArrayList;
import java.util.List;


public class LonelyInteger {

    public static void main(String[] args){
        List<Integer> a = new ArrayList<>();

        a.add(50);
        a.add(50);
        a.add(75);
        a.add(20);
        a.add(30); //its lonely
        a.add(75);
        a.add(20);

        System.out.println(lonelyinteger(a));
    }
    /*
        We use the XOR operation to add and subtract the binary representations of each number until we are left with the lonely integer
     */
    public static int lonelyinteger(List<Integer> a) {
        Integer lonely = 0;

        for (int i : a) {
            lonely ^=  i;
        }
        return lonely;
    }
}
