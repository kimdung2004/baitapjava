import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so : ");
        num = scanner.nextDouble();
        if( num %2 ==0 )
        System.out.println("so vua nhap la so chan");
        else 
        System.out.println("so vua nhap la so le");
        scanner.close();
    }
}