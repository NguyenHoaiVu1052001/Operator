package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap a");
     int a = sc.nextInt();
     System.out.println("Nhap b");
     int b = sc.nextInt();
     int tong = a + b;
     int hieu = a - b;
     int tich = a * b;
     int thuong = a / b;
     System.out.println("Tong:" + tong);
     System.out.println("Hieu:" + hieu);
     System.out.println("Tich:" + tich);
     System.out.println("Thuong" + thuong);
     boolean c = a > b;
     System.out.println("So sanh hon c: " + c);
     c = a < b;
     System.out.println("So sanh thua c: " + c);
     c = a >= b;
     System.out.println("So sanh lon hon hoac bang c:" + c);
     c = a <= b;
     System.out.println("so sanh nho hon hoac bang c:" + c);
     
	}
	
}
