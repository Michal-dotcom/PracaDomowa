package Zadania1;

public class PowerOfNumber {


    public long power(int a, int b) {
        long result = 0;

        for (int i = 0; i <= b; i++) {
            result += a * a;
        }

        return result;
    }


    public static void main(String[] args) {

    }
}
