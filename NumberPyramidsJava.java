import java.util.Scanner;

public class NumberPyramidsJava {
    public static void main(String[] args) {
        System.out.print("Enter Number of Rows: ");
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int row = 1;

        System.out.println();

        // pyramid 1

        System.out.println("Pyramid 1: ");

        for (int i = num; i >= 1; i--)

        {

            for (int j = 1; j <= i; j++)

            {

                System.out.print(" ");

            }

            for (int j = 1; j <= row; j++)

            {

                System.out.print(row + " ");

            }

            System.out.println();

            row++;

        }
        System.out.println();
        // pyramid 2

        row = 1;

        System.out.println("Pyramid 2: ");

        for (int i = num; i >= 1; i--)

        {

            for (int j = 1; j <= i; j++)

            {

                System.out.print(" ");

            }

            for (int j = 1; j <= row; j++)

            {

                System.out.print(j + " ");

            }

            System.out.println();

            row++;

        }
        System.out.println();
        // pyramid 3

        System.out.println("Pyramid 3: ");

        row = 1;

        for (int i = num; i >= 1; i--)

        {

            for (int j = 1; j <= i * 2; j++)

            {

                System.out.print(" ");

            }

            for (int j = 1; j <= row; j++)

            {

                System.out.print(j + " ");

            }

            for (int j = row - 1; j >= 1; j--)

            {

                System.out.print(j + " ");

            }

            System.out.println();

            row++;

        }
        System.out.println();
        // pyramid 4

        System.out.println("Pyramid 4: ");

        row = num;

        for (int i = 1; i <= num; i++)

        {

            for (int j = 1; j <= i * 2; j++)

            {

                System.out.print(" ");

            }

            for (int j = 1; j <= row; j++)

            {

                System.out.print(j + " ");

            }

            for (int j = row - 1; j >= 1; j--)

            {

                System.out.print(j + " ");

            }

            System.out.println();

            row--;

        }
        System.out.println();
        // pyramid 5

        System.out.println("Pyramid 5: ");

        row = num;

        for (int i = num; i >= 1; i--)

        {

            for (int j = 1; j <= i * 2; j++)

            {

                System.out.print(" ");

            }

            for (int j = row; j <= num; j++)

            {

                System.out.print(j + " ");

            }

            for (int j = num - 1; j >= row; j--)

            {

                System.out.print(j + " ");

            }

            System.out.println();

            row--;

        }

    }

}