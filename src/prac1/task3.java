package prac1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        double avg;
        int sum = 0;

        for(int elem : arr) {
            elem = sc.nextInt();
            sum += elem;
        }
        avg = sum / (double) arr.length;
        System.out.printf("avg: %.3f\nsum: %d",avg,sum);
    }
}
