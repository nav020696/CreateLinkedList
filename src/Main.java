import core.GBList;
import core.lists.GBArrayList;
import core.lists.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> list = new GBLinkedList<>();
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(9);
        System.out.println(list);
        //System.out.println(list.size());
        //System.out.println(list.get(3));
        //list.remove(2);
        list.addFirst(1);
        System.out.println(list);
    }
}