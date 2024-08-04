import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu: ");
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số");
            System.out.println("2. Kiểm tra số nguyên tố");
            System.out.println("3. Kiểm tra một số chia hết cho ba không");
            System.out.println("4. Thoát");

            System.out.print("Lựa chọn menu: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkOddEven(sc);
                    break;
                case 2:
                    checkPrime(sc);
                    break;
                case 3:
                    checkDivisbleByThree(sc);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        }
    }

    public static void checkOddEven(Scanner sc) {
        System.out.print("Nhập số: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Là số chẵn");
        }else {
            System.out.println("Là số lẻ");
        }
    }

    public static boolean isPrime(int number) {
        if(number <=1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checkPrime(Scanner sc) {
        System.out.print("Nhập số: ");
        int number = sc.nextInt();
        if(isPrime(number)) {
            System.out.println("Là số nguyên tố");
        }else {
            System.out.println("Không phải số nguyên tố");
        }
    }

    public static void checkDivisbleByThree(Scanner sc) {
        System.out.print("Nhập số: ");
        int number = sc.nextInt();
        if(number % 3 == 0) {
            System.out.println("Là số chia hết cho 3");
        }else {
            System.out.println("Không phải số chia hết cho 3");
        }
    }
}
