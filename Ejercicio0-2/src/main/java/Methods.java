public class Methods {

    public int factorialRecursivo(int n) {
        if (n == 0) return 1;
        return n * factorialRecursivo(n-1);
    }

    public int fibonacciRecursivo(int n) {
        if (n == 0) return 0;
        return n + fibonacciRecursivo(n-1);
    }

    public int divisionRestasRecursivo(int divisor, int dividendo) {
        if ((dividendo -  divisor) < 0 ) return 0;
        return 1 + divisionRestasRecursivo(divisor, dividendo-divisor);
    }

}
