import java.util.Scanner;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validTriangle = false;

        while (!validTriangle) {
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = sc.nextDouble();

            System.out.print("Nhập cạnh thứ hai: ");
            double b = sc.nextDouble();

            System.out.print("Nhập cạnh thứ ba: ");
            double c = sc.nextDouble();

            if(isValidTriangle(a,b,c)){
                validTriangle = true;
                double perimeter = calculatePerimeter(a,b,c);
                double area = calculateArea(a,b,c);

                System.out.println("Ba cạnh này tạo thành 1 tam giác");
                System.out.println("Chu vi của tam giác là: "+ perimeter);
                System.out.println("Diện tích của tam giác là: "+area);
            }else {
                System.out.println("Ba cạnh tam giác này không hợp lẹ. Vui lòng nhập lại!");
            }
        }
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a+b>c) && (a+c>b) && (b+c>a);
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return (a+b+c);
    }

    public static double calculateArea(double a, double b, double c) {
        double s = calculatePerimeter(a,b,c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
