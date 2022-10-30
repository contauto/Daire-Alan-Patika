import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yarıçap değerini giriniz.");
        double yaricap=scanner.nextDouble();
        System.out.println("Açı değerini giriniz.");
        double aci=scanner.nextDouble();
        double alan=pi*yaricap*yaricap*aci/360;
        System.out.println("Dairenin alanı:"+alan);
    }
}
