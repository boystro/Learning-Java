package ListToArray;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        for (int i=0; i<10; i++) lst.add(i);
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Array to List");
        for (int data : toList(arr)) System.out.printf("%d ", data);
        
        System.out.println("");
        System.out.println("List to Array");
        for (int data : toArr(lst)) System.out.printf("%d ", data);
    }

    public static List<Integer> toList(int[] lst) {
        List<Integer> r_lst = new ArrayList<Integer>();
        for (int data : lst) r_lst.add(data);
        return r_lst;
    }

    public static int[] toArr(List<Integer> lst) {
        int l = lst.size();
        int[] r_arr = new int[l];
        for (int i = 0; i < l; i++) r_arr[i] = lst.get(i);
        return r_arr;
    }
}
