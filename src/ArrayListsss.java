import java.util.ArrayList;

public class ArrayListsss {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Susan");
        names.add("Pete");
        names.add("Eric");
        names.add("Maria");
        names.add("Duffy");
        names.add("Penny");

        System.out.println(names);

        names.remove(1); // removes element at specified index
        names.removeFirst(); // removes first element
        names.removeLast(); // removes last element

        names.set(1, "Wolly");

        System.out.println(names);

        System.out.println(names.get(1));
        System.out.println(names.size());
    }

}
