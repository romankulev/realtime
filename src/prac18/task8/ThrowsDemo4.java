package prac18.task8;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo4 {
    public void getKey() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Input: ");
            String key = sc.next();
            try {
                printDetails(key);
                break;
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void printDetails(String key) throws Exception{
        String message = getDetails(key);
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "a")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo4 throwsDemo4 = new ThrowsDemo4();
        throwsDemo4.getKey();
    }
}
