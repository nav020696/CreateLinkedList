import core.GBList;
import core.lists.GBArrayList;
import core.lists.GBLinkedList;

public class Main {
    public static void main(String[] args) {
//        GBList<Integer> list = new GBArrayList<>();
//
//        list.add(3);
//        list.add(5);
//        list.add(6);
//        System.out.println(list);
//
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.size());
        GBList<Integer> list = new GBLinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        System.out.println(list);
        System.out.println(list.size());
    }
}