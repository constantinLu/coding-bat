package String1;

public class Fibonacci {
    public static void main(String args[]) {
        Fibonacci fb = new Fibonacci();
        System.out.print(fb.Fibonacci(44));
    }

    int Fibonacci(int number) {
        if (number <= 1) return number;

        return Fibonacci(number - 2) + Fibonacci(number - 1);
    }
}
