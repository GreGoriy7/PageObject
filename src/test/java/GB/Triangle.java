package GB;
import java.util.Scanner;



public class Triangle {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сторону a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите сторону b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите сторону с: ");
        double c = scanner.nextDouble();

        //Площадь треугольника вычисляется по формуле = (a*b*c)/2
        double area = (a*b*c)/2;
        System.out.println("Площадь треугольника равна: " + area);
    }
}