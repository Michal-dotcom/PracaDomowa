package Zadania1;

public class Factorial {

    public int factorial(int number) {
        int result = 0;

        for(int i = 0; i <= number; i++) {
            result += number * i;
        }

        return result;
    }


}
