import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Currency> currencyList = new ArrayList<>();
        currencyList.add(new Ruble(120));
        currencyList.add(new Yuan(50));
        currencyList.add(new Euro(1));
        currencyList.add(new Dollar(2));
        for(var i : currencyList){
            System.out.println(i.Value() + " " + i.name);
        }
        System.out.println("Sorting");
        currencyList.sort(Currency::compareTo);
        for(var i : currencyList){
            System.out.println(i.Value() + " " + i.name);
        }
    }
}