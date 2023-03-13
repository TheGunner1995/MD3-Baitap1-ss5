import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BaiTap1 circle = new BaiTap1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh duong tron : ");
        double r = scanner.nextDouble();
        System.out.println("dien tich hinh tron la: " + circle.getArea(r));
    }
}