package prac26;

import java.util.Iterator;
import java.util.Stack;

public class task1 {
    public static <T> Stack<T> rev(Stack<T> st) {
        T lVal = st.pop();
        Iterator<T> iterator = st.iterator();
        T fVal = iterator.next();
        Iterator<T> it = st.iterator();
        T temp = it.next();
        Stack<T> h = new Stack<>();
        Stack<T> helper = new Stack<>();
        helper.push(lVal);
        for (int i = 1; i < st.size(); i++) {
            temp = it.next();
            h.push(temp);
            helper.push(temp);
        }
        helper.push(fVal);
        return helper;
    }
    public static <T> Stack<T> revers(Stack<T> st) {
            Stack<T> helper = rev(st);
            System.out.println(helper);
            int k = 1;
            Iterator<T> iterator;
            while(k < helper.size()/2) {
                iterator = helper.iterator();
                Stack<T> hLast = new Stack<>();
                Stack<T> hFirst = new Stack<>();
                int d = helper.size() - k;
                int g = 0;
                Iterator<T> itm = helper.iterator();
                T sl;
                while(g < d) {
                    sl = itm.next();
                    g++;
                }
                for(int i = 0; i < k; i++) {
                    sl = itm.next();
                    hLast.push(sl);
                    T sf = iterator.next();
                    hFirst.push(sf);
                }
                Stack<T> m = new Stack<>();
                for(int i = k; i < helper.size() - k; i++) {
                    T sf = iterator.next();
                    m.push(sf);
                }
                m = rev(m);
                Iterator<T> it1 = m.iterator();
                while(it1.hasNext()) {
                    hFirst.push(it1.next());
                }
                Iterator<T> it2 = hLast.iterator();
                while(it2.hasNext()) {
                    hFirst.push(it2.next());
                }
                helper = hFirst;
                System.out.println(helper);
                k++;
            }
        return helper;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 11; i++)
            st.push(i);
        System.out.println(st);
        revers(st);
    }
}
