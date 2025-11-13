import java.util.ArrayList;

public class arraylistex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(37);
        list.add(56);
        list.add(562);
        list.add(223);
        list.add(352);
        list.add(371);
        list.add(353);
        list.add(523);
        list.add(845);
        list.add(542);
        list.add(123);
        list.add(111);
        list.add(511);
        System.out.println(list.contains(111));
        list.set(0,99);
        list.remove(2);
        System.out.println(list);


    }
}
