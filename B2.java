import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class B2 {
    public static void main(String[] args) {
        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(0,"zero");
        numberMap.put(1,"one");
        numberMap.put(2,"two");
        numberMap.put(3,"three");
        numberMap.put(4,"four");
        numberMap.put(5,"five");
        numberMap.put(6,"six");
        numberMap.put(7,"seven");
        numberMap.put(8,"eight");
        numberMap.put(9,"nine");
        numberMap.put(10,"ten");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        if(numberMap.containsKey(number)){
            System.out.println(numberMap.get(number));
        }else {
            System.out.println("Not found");
        }
    }
}
