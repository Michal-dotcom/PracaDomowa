package Zadania1;

public class VarargsProduct {

    public int formatWithVarArgs(int... args) {
        int product = 0;

        for (int i = 0; i <= args.length; i++) {
             product += args[i] * args[i+1];

        }
        return product;
    }



}
