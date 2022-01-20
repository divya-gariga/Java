import java.util.*;
class VectorFun {
    public static void main(String[] args)
    {
        int n = 5;
        Vector<Integer> v = new Vector<>(n);
        for (int i = 1; i <= n; i++)
            v.add(i);

        System.out.println(v);
        v.remove(3);
        v.set(0,2);
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}
