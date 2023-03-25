import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumbers = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11));
        System.out.println("Prime numbers: " + primeNumbers);
        System.out.println("Prime numbers in reverse order: ");
        for (int i = primeNumbers.size() - 1; i >= 0; i--) {
            System.out.println(primeNumbers.get(i));
        }
    }
}