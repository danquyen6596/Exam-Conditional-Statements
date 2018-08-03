package vn.codegym;
import java.util.Scanner;
import java.lang.Math;

public class Equation {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        double dt;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập vào hệ số a= ");
        a = scan.nextFloat();
        System.out.println("Nhập vào hệ số b= ");
        b = scan.nextFloat();
        System.out.println("Nhập vào hệ số c= ");
        c = scan.nextFloat();

//Math.pow hàm bình phương
        dt = Math.pow(b,2) - (4*a*c);
        System.out.println(dt);
        if(dt == 0){
            System.out.println("Phương trình có một nghiệm là: x1 = x1 = "+ (-b/(2*a)));
        }
        else {
            if (dt > 0){
                System.out.println("Phương trình có 2 nghiệm: x1= "
                        + (-b - Math.sqrt(dt)) / (2 * a) + " và x2= " + (-b + Math.sqrt(dt)) / (2 * a));
            } else
                System.out.println("Phương trình vô nghiệm!");
        }
    }
}
