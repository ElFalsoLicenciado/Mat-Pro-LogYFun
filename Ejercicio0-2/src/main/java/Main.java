import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods mt = new Methods();
        String input;

        while(true){
            System.out.print("\nInput: ");
            input = sc.next();

            switch (input) {
                case "fact" -> {
                    System.out.print("\nFactorial de: ");
                    input = sc.next();
                    System.out.println(" es igual a: "+ mt.factorialRecursivo(Integer.parseInt(input)));
                }

                case "fibo" -> {
                    System.out.print("\nFibonacci hasta: ");
                    input = sc.next();
                    System.out.print(" es igual a: "+ mt.fibonacciRecursivo(Integer.parseInt(input)));
                }
                case "divi" -> {
                    int divisor, dividendo;
                    System.out.print("\nDivision de: ");
                    input = sc.next();
                    dividendo = Integer.parseInt(input);
                    System.out.print("entre ");
                    input = sc.next();
                    divisor = Integer.parseInt(input);
                    System.out.print("es igual a:" + mt.divisionRestasRecursivo(divisor, dividendo));
                }
                case "q" -> {
                    return;
                }
            }
        }
    }
}
