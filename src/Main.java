import core.GBList;
import core.lists.GBArrayList;
import core.lists.GBLinkedList;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<String> list = new GBLinkedList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Bonjour");
        list.add("Ola");
        System.out.println(list);
        //System.out.println(list.size());
        //System.out.println(list.get(3));
        list.remove(2);
        //list.addFirst(1);
        System.out.println(list);
        System.out.println(list.size());
    }
}