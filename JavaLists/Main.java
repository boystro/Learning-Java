package JavaLists;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<Integer>();
        for (int i=0; i<5; i++) lst1.add(i);

        List<Integer> lst2 = new ArrayList<Integer>();
        for (int i=5; i<10; i++) lst2.add(i);
        
        for (int data : lstCAT(lst1, lst2)) System.out.printf("%d ", data);
    }

    public static List<Integer> lstCAT(List<Integer> lst1, List<Integer> lst2) {
        List<Integer> r_lst = new ArrayList<Integer>();

        for (int data : lst1) r_lst.add(data);
        for (int data : lst2) r_lst.add(data);

        return r_lst;
    }
}
