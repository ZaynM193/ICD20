package Assignment1.java;
import java.lang.Math;//adds math library
import java.util.Scanner;//adds scanner library
/* *
 *
 * @author Zayn 1058601
 */
    public class Assignment1.java {

    /* *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);//adds the scanner
        int length;//declares length as an integer
        int width;//declares width as an integer
        System.out.print("Input length of rectangle: ");//Prompts the user to give the length
        length = sc.nextInt();//assigns their input as length
        System.out.print("Input width of rectangle: ");//Prompts the user to give the width
        width = sc.nextInt();//assigns the user's input as the width
        System.out.println(length*width);//calculates and provides the area of the rectangle
       
        int radius;//declares radius as an integer
        System.out.print("Input radius of circle: ");//Prompts the user to give the radius of the circle
        radius = sc.nextInt();//assigns the user's input as the radius
        System.out.println(Math.PI*(radius*radius));//calculates and provides the area of the circle
       
        int CR;//declares the cylinder radius as an integer
        int H;//declares the cylinder height as an integer
        System.out.print("input radius of cylinder: ");//Prompts the user to give the radius of the cylinder
        CR = sc.nextInt();//assigns the user's input as the cylinder radius
        System.out.print("input height of cylinder: ");//Prompts the user to give the height of the cylinder
        H = sc.nextInt();//assigns their input as the height
        System.out.println(Math.PI*(CR*CR)*H);//provides the volume of the cylinder
        System.out.println((2*Math.PI)*CR*H +(2*Math.PI)*(CR*2));//provides the surface area of the cylinder
       
        int L;//declares the pendulum length as an integer
        double G;//declares gravity as an integer
        G = 9.8;//gives gravity a value of 9.8
        System.out.print("input length of pendulum in meters: ");//Prompts the user to input the length of the pendulum
        L = sc.nextInt();//assigns the user's input as the length of the pendulum
                System.out.print((Math.PI*Math.PI)*Math.sqrt(L/G));//calculates and prints the pendulum swing time
    }
   
  }
