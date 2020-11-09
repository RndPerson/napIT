import java.util.Scanner;

public class Palindrome {

        public static void main (String [] args){

            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int x = in.nextInt();

            int x1 = x;
            int x2 = 0;
            while (x / 1 != 0) {
                x2 *=10;
                x2 += x % 10;
                x /=10;
            }
            System.out.println(x1==x2);
            in.close();

        }

    }
