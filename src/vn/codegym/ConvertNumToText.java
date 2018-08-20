package vn.codegym;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class ConvertNumToText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;


        System.out.println("Nhập vào một số bất kì nhỏ hơn 3 chữ số: ");
        num = scan.nextInt();


        if(num <= 10)
            Sw_Case10(num);
        else {
            if (num > 10 && num <= 20) {
                num = num % 10;
                Sw_Case20(num);
            }
            if(num > 20 && num < 100){
                int num1 = num/10;
                int num2 = num%10;

                if(num2 == 0)
                    Sw_Case99(num1);
                else{
                    Sw_Case99(num1);
                    Sw_Case10(num2);
                }
            }
            else{
                if(num > 99 && num < 1000){
                    int num1 = num%10;
                    int num2 = (num/10)%10;
                    int num3 = (num/100);
                    int num4 = num%100;

                    if(num1 == 0 && num2 == 0)
                    {
                        Sw_Case999(num3);
                    }
                    else{
                        if(num1 == 0 && num2 != 0){
                            Sw_Case999(num3);
                            System.out.print("and ");
                            Sw_Case99(num2);
                        }
                        else{
                            if(num1 != 0 && num2 == 0){
                                Sw_Case999(num3);
                                System.out.print("and ");
                                Sw_Case10(num1);
                            }
                            else{
                                if(num1 != 0 && num2 != 0 && num4 <= 20 && num4 > 10) {
                                    Sw_Case999(num3);
                                    System.out.print("and ");
                                    Sw_Case20(num1);
                                }
                                else {
                                    if (num1 != 0 && num2 != 0 && num4 > 20) {
                                        Sw_Case999(num3);
                                        System.out.print("and ");
                                        Sw_Case99(num2);
                                        Sw_Case10(num1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }

    public static void Sw_Case10(int num){

        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
    }

    public static void Sw_Case20(int num){

        switch (num){
            case 1:
                System.out.println("Eleven");
                break;
            case 2:
                System.out.println("Twelve");
                break;
            case 3:
                System.out.println("Thirteen");
                break;
            case 4:
                System.out.println("Fourteen");
                break;
            case 5:
                System.out.println("Fifteen");
                break;
            case 6:
                System.out.println("Sixteen");
                break;
            case 7:
                System.out.println("Seventeen");
                break;
            case 8:
                System.out.println("Eighteen");
                break;
            case 9:
                System.out.println("Nineteen");
                break;
            case 0:
                System.out.println("Twenty");
                break;
        }
    }

    public static void Sw_Case99(int num) {
        switch (num) {
            case 2:
                System.out.print("Twenty ");
                break;
            case 3:
                System.out.print("Thirty ");
                break;
            case 4:
                System.out.print("Forty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixty ");
                break;
            case 7:
                System.out.print("Seventy ");
                break;
            case 8:
                System.out.print("Eighty ");
                break;
            case 9:
                System.out.print("Ninety ");
                break;
        }
    }

    public static void Sw_Case999(int num) {

        switch (num) {
            case 1:
                System.out.print("One hundred ");
                break;
            case 2:
                System.out.print("Two hundred ");
                break;
            case 3:
                System.out.print("Three hundred ");
                break;
            case 4:
                System.out.print("Four hundred ");
                break;
            case 5:
                System.out.print("Five hundred ");
                break;
            case 6:
                System.out.print("Six hundred ");
                break;
            case 7:
                System.out.print("Seven hundred ");
                break;
            case 8:
                System.out.print("Eight hundred ");
                break;
            case 9:
                System.out.print("Nine hundred ");
                break;
        }
    }
}
