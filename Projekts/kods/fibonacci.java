package Projekts.kods;

public class fibonacci {
    public static void main(String[] args) {
        long[] skaitlis = new long[100];

        skaitlis[0] = 0;
        skaitlis[1] = 1;

        int n = 100;

        for (int i = 2; i < n; i++) {
            skaitlis[i] = skaitlis[i-1] + skaitlis[i-2];
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.print(skaitlis[i] + " ");
        }
    }
}