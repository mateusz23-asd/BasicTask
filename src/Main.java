import java.util.Scanner;


public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("You will give a number for an array size!");
        System.out.println("Give the number!");
        int num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Give me " + num + " number(s)! ");
        array = scanNumbers(array);
        System.out.println("This is your numbers!");
        System.out.println();
        ShowArray(array);
        System.out.println();
        System.out.println();
        System.out.println("I will calculate the average, maximum and minimum,");
        System.out.println("also how many even or odd numbers there are!");
        System.out.println();
        double sum = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        for (int j : array) {
            sum += j;
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        average = (sum / num );
        int max = MaxFinding(array);
        int min = MinFinding(array);
        ShowResults(sum, average, min, max, even, odd);
    }
    private static void ShowArray(int[] array) {
        for(int i: array) {
            System.out.print(i + ", ");
        }
    }
    private static int MaxFinding (int[] array) {
        int max = 0;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
    private static int MinFinding (int[] array){
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (min > j)
                min = j;
        }
        return min;
    }
    private static void ShowResults(double sum, double average, int min, int max, int even, int odd) {
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println();
        System.out.println("That's it! Bye!");
    }
    private static int[] scanNumbers(int[] array){
        int i = 0;
        while (i < array.length) {
            array[i] = sc.nextInt();
            int s = (array.length-(i+1));
            if(s == 0) {
                System.out.println("We are done, you gave all the numbers!");
            }else
                System.out.println("You have " + (array.length-(i+1)) + " left.");
            i++;
        }
        return array;
    }
}