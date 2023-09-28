import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Bull(20, 6));
        list.add(new Carp(5, 1));
        list.add(new Eagle(10, 10));

        for(var i : list)
            System.out.println(i.toString());

        System.out.println("Sorting");
        list.sort(Animal::compareTo);

        for(var i : list)
            System.out.println(i.toString());
    }
}