package com.company;
import java.util.Scanner;

public class docso {

    public static void main(String[] args) {
        // Để nhập dl từ bàn phím
        Scanner scanner  = new Scanner(System.in);
        System.out.println("nhập số cần đọc");
        int number = scanner.nextInt();
        String socandoc = "";
        switch (number){
            case 0:{
                socandoc = "Zero";
                break;

            }
            case 1: {
                socandoc = "One";
                break;
            }
            case 2: {
                socandoc = "Two";
                break;
            }
            case 3: {
                socandoc = "Three";
                break;
            }

        }
        System.out.println("Đọc là: "+socandoc);
    }
}
