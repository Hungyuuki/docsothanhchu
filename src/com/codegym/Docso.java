package com.codegym;
import java.util.Scanner;
public class Docso {

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
            case 4: {
                socandoc = "Four";
                break;
            }
            case 5: {
                socandoc = "Five";
                break;
            }
            case 6: {
                socandoc = "Six";
                break;
            }
            case 7: {
                socandoc = "Seven";
                break;
            }
            case 8: {
                socandoc = "Eight";
                break;
            }
            case 9: {
                socandoc = "Nine";
                break;
            }
            case  10: {
                socandoc = "Tèn tén ten";
                break;
            }
            default: socandoc = "dekinai";
        }
        System.out.println("Đọc là: "+socandoc);
    }
}
