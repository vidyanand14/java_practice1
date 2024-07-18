import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(50);
        System.out.println(list.indexOf(50));


    }


}
