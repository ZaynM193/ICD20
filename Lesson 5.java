import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();

       
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

       
        int doubledYear = yearOfBirth * 2;

       
        int addedFive = doubledYear + 5;

       
        int multipliedByFifty = addedFive * 50;

       
        int addedAge = multipliedByFifty + age;

       
        int subtractedResult = addedAge - 250;

       
        double finalResult = subtractedResult / 100.0;

       
        System.out.println("The final result is: " + finalResult);

       
        scanner.close();
    }
}
