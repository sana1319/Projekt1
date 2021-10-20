import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        while(true){
            System.out.println("Wybierz rodzaj figury ktora chcesz narysowac: ");
            System.out.println("1. Prostokat");
            System.out.println("2. Trojkat");
            System.out.println("3. Wyjdz z programu");
            x = scan.nextInt();

            if (x == 1) {
                Rectangle rectangle = new Rectangle();
                rectangle.drawRectangle();
            } else if (x == 2) {
                Triangle triangle = new Triangle();
                triangle.drawTriangle();
            } else {
                System.exit(0);
            }
        }
    }
}
