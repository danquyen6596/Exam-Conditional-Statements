package vn.codegym;
import java.util.Scanner;
import java.util.Random;

public class Lottery {
    Scanner scan = new Scanner(System.in);
    String lottery = "";
    String num0 = "0";
    int money = 100;
    int opt;
    Random rd = new Random();

    public static void main(String[] args) {
        Lottery lot = new Lottery();

        Create();
        System.out.println("Vui lòng lựa chọn!!");
        do{
            System.out.println("1. Bắt đầu chơi.");
            System.out.println("0. Thoát.\n");
            lot.opt = lot.scan.nextInt();

            switch (lot.opt){
                case 1: {
                    if(CheckingAcc(lot)==0)
                        break;
                    StartLottery(lot);
                    lot.Sw_Case(lot);
                }
                case 0:
                    System.out.println("Hẹn gặp lại lần sau!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!");
            }
        }while (lot.opt >1);
    }

    //Phương thức giới thiệu
    public static void Create(){
        System.out.println("===Chào mừng bạn đến với CodeGym Lotte===");
        System.out.println("Bạn đang có $1000 trong tài khoản.");
        System.out.println("======================================================");
    }

    //Phương thức kiểm tra số tiền còn lại
    public static int CheckingAcc(Lottery lot){

        if(lot.money < 100) {
            System.out.println("Số tiền trong tài khoản nhỏ hơn quy định.");
            return 0;
        }
        else {
            System.out.println("Bạn đang có "+lot.money+ " trong tài khoản.");
            return 1;
        }

    }

    //Chọn và quay số dự thưởng.
    public static void Sw_Case(Lottery lot){
        System.out.println("==============================================");
        System.out.println("Bạn muốn chơi tiếp?");
        int opt;
        do{
            System.out.println("1. Chơi tiếp.");
            System.out.println("0. Dừng chơi.");
            opt = lot.scan.nextInt();
            switch (opt){
                case 1: {
                    if(CheckingAcc(lot)==0)
                        break;
                    lot.StartLottery(lot);
                    lot.Sw_Case(lot);
                }
                case 0:{
                    System.out.println("Hẹn gặp lại lần sau!");
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Vui lòng nhập lại.");
            }
        }while (opt > 1);
    }

    public static void StartLottery(Lottery lot){
        System.out.print("Nhập vào số dự thưởng (2 chữ số): ");
         lot.lottery= lot.scan.next();

        //Khởi tạo số trúng thưởng, ép về kiểu String
        String num = Integer.toString(lot.rd.nextInt(100));

        if(num.length() == 1)
            num = lot.num0.concat(num);
        //concat là phương thức nối chuỗi

        //CompareTo() so sánh 2 chuỗi lottery và num
        if(lot.lottery.compareTo(num) == 0){
            System.out.println("Mã số trúng thưởng là: " + num);
            System.out.println("Chúc mừng bạn đã trúng giải ĐỘC ĐẮC với số dự thưởng: "
                    + num + " phần thưởng của bạn là $10,000");
            lot.money += 10000;
            System.out.println("Bạn đang có "+lot.money+" trong tài khoản.");
        }
        else {
            //Đảo ngược số dự thưởng
            String rev = new StringBuilder(lot.lottery).reverse().toString();

            if (rev.compareTo(num) == 0) {
                System.out.println("Mã số trúng thưởng là: " + num);
                System.out.println("Chúc mừng bạn đã trúng GIẢI NHÌ với số dự thưởng: "
                        + lot.lottery + " phần thưởng của bạn là $3,000");
                lot.money += 3000;
                System.out.println("Bạn đang có "+lot.money+" trong tài khoản.");
            }
            else {
                String lot1;
                lot1 = lot.lottery.substring(0, 1);
                String lot2;
                lot2 = lot.lottery.substring(1, 2);

                if (num.indexOf(lot1) != -1 || num.indexOf(lot2) != -1) {
                    System.out.println("Mã số trúng thưởng là: " + num);
                    System.out.println("Chúc mừng bạn đã trúng GIẢI BA với số dự thưởng: "
                            + lot.lottery + " phần thưởng của bạn là $1,000");
                    lot.money += 1000;
                    System.out.println("Bạn đang có "+lot.money+" trong tài khoản.");
                }
                else {
                    System.out.println("Mã số trúng thưởng là: " + num);
                    System.out.println("Chúc bạn may mắn lần sau!!!");
                    lot.money -= 100;
                    System.out.println("Bạn đang có "+lot.money+" trong tài khoản.");
                }
            }
        }
    }
}
