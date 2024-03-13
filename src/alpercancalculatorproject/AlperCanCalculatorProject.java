/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alpercancalculatorproject;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Alper
 */
public class AlperCanCalculatorProject {

     // Method for calculating the sum of two numbers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    // Method for calculating the sum of three numbers (overloading)
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    // Method for calculate the sum of four numbers (overloading)
    public static int sum(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
    // Method for subtracting two numbers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    // Method for subtracting three numbers (overloading)
    public static int subtract(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }
     // Method for subtracting four numbers (overloading)
    public static int subtract(int num1, int num2, int num3, int num4) {
        return num1 - num2 - num3 - num4;
    }
    //Method for multiplying two integers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    //Method for multiplying two float
    public static float multiply(float num1, float num2) {
        return num1 * num2;
    }
   //Method for dividing two integers
    public static int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return num1 / num2;
    }
    // Method for dividing two floats
    public static float divide(float num1, float num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0.0f;
        }
        return num1 / num2;
    }
    // Method for calculating the factorial of a number
    public static int factorial(int number) {
        if (number < 0) {
            System.out.println("Error: Cannot compute factorial of a negative number");
            return 0;
        }

        int result = 1;
        while (number > 0) {
            result *= number;
            number--;
        }
        return result;
    }
     // Method for calculating the sum of numbers from start to end 
    public static int calculateSum(int startNum, int endNum) {
        if(startNum>endNum){
            System.out.println("Start number can't  be bigger than end number");
        } 
        int sum = 0;
        for (int i = startNum; i <= endNum; i++) {
            sum += i;
        }
        return sum;
    }
     // Method for calculating the sum of corresponding elements in two arrays
    public static int[] sumArrays(int[] array1, int[] array2) {
        int length = array1.length;
        int[] sumArray = new int[length];
        for (int i = 0; i < length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        return sumArray;
    }
    // Method for check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Method for check if a number is present in an array
    public static boolean isNumberInArray(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }
    // Method calculate the standard deviation of a set of 100 numbers in an aray
   public static double calculateStandardDeviation() 
    int length = 100;
    int[] array = new int[length];
    Random random = new Random();

    
    for (int i = 0; i < length; i++) {
        array[i] = random.nextInt(100); 
    }

    double sum = 0;
    for (int num : array) {
        sum += num;
    }
    double mean = sum / length;

    
    double squaredDiffSum = 0;
    for (int num : array) {
        double diff = num - mean;
        squaredDiffSum += diff * diff;
    }

    double variance = squaredDiffSum / length;
    double standardDeviation = Math.sqrt(variance);

    
    System.out.print("Array elements: ");
    for (int num : array) {
        System.out.print(num + " ");
    }
    System.out.println();

    return standardDeviation;
}
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("-------- Hello --------");
        System.out.println("=======================");
      // Calculator menu loop
        while (true) {
            // Print calculator options
            System.out.println("What you want to do: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Factorial");
            System.out.println("6. Summation");
            System.out.println("7. Sum Arrays");
            System.out.println("8. Prime");
            System.out.println("9. Number in Array");
            System.out.println("10. Standard Deviation");
            System.out.println("11. Stop");
            System.out.println("Enter Operation:");
  
            // Read user input for the selected operation
            int operation = scanner.nextInt();
          
            
            // Check if the user wants to stop the program
            if (operation == 11) {
                break;
            }

            switch (operation) {
                case 1:
                    // Addition menu
                    System.out.println("Enter the number of values to add (2, 3, or 4):");
                    int addChoice = scanner.nextInt();

                    switch (addChoice) {
                        case 2:
                            // Addition with two numbers
                            System.out.println("Enter two numbers:");
                            int addNum1 = scanner.nextInt();
                            int addNum2 = scanner.nextInt();
                            System.out.println("Result: " + sum(addNum1, addNum2));
                            break;

                        case 3:
                            // Addition with three numbers
                            System.out.println("Enter three numbers:");
                            int addNum3 = scanner.nextInt();
                            int addNum4 = scanner.nextInt();
                            int addNum5 = scanner.nextInt();
                            System.out.println("Result: " + sum(addNum3, addNum4, addNum5));
                            break;

                        case 4:
                            // Addition with four numbers
                            System.out.println("Enter four numbers:");
                            int addNum6 = scanner.nextInt();
                            int addNum7 = scanner.nextInt();
                            int addNum8 = scanner.nextInt();
                            int addNum9 = scanner.nextInt();
                            System.out.println("Result: " + sum(addNum6, addNum7, addNum8, addNum9));
                            break;

                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;

                case 2:
                    // Subtraction menu
                    System.out.println("How many numbers for subtraction (2, 3, or 4):");
                    int subChoice = scanner.nextInt();

                    switch (subChoice) {
                        case 2:
                            // Subtraction with two numbers
                            System.out.println("Enter two numbers:");
                            int subNum1 = scanner.nextInt();
                            int subNum2 = scanner.nextInt();
                            System.out.println("Result: " + subtract(subNum1, subNum2));
                            break;

                        case 3:
                            // Subtraction with three numbers
                            System.out.println("Enter three numbers:");
                            int subNum3 = scanner.nextInt();
                            int subNum4 = scanner.nextInt();
                            int subNum5 = scanner.nextInt();
                            System.out.println("Result: " + subtract(subNum3, subNum4, subNum5));
                            break;

                        case 4:
                            // Subtraction with four numbers
                            System.out.println("Enter four numbers:");
                            int subNum6 = scanner.nextInt();
                            int subNum7 = scanner.nextInt();
                            int subNum8 = scanner.nextInt();
                            int subNum9 = scanner.nextInt();
                            System.out.println("Result: " + subtract(subNum6, subNum7, subNum8, subNum9));
                            break;

                        default:
                            System.out.println("Invalid choice!");
                            break;
                    }
                    break;

                case 3:
                     // Multiplication menu
                    System.out.println("Enter two numbers (integer or float):");
                    float multNum1 = scanner.nextFloat();
                    float multNum2 = scanner.nextFloat();
                    System.out.println("Result: " + multiply(multNum1, multNum2));
                    break;

                case 4:
                    // Division menu
                    System.out.println("Enter two numbers (integer or float):");
                    float divNum1 = scanner.nextFloat();
                    float divNum2 = scanner.nextFloat();
                    System.out.println("Result: " + divide(divNum1, divNum2));
                    break;

                case 5:
                    // Factorial menu
                    System.out.println("Enter a number:");
                    int factorialNum = scanner.nextInt();
                    System.out.println("Result: " + factorial(factorialNum));
                    break;

                case 6:
                     // Summation menu
                    System.out.println("Enter the starting and ending numbers:");
                    int startNum = scanner.nextInt();
                    int endNum = scanner.nextInt();
                    System.out.println("Result: " + calculateSum(startNum, endNum));
                    break;

                case 7:
                     // Sum Arrays menu
                    System.out.println("Enter the length of the arrays:");
                    int arrayLength = scanner.nextInt();

                    System.out.println("Enter the elements of the first array:");
                    int[] array1 = new int[arrayLength];
                    for (int i = 0; i < arrayLength; i++) {
                        array1[i] = scanner.nextInt();
                    }

                    System.out.println("Enter the elements of the second array:");
                    int[] array2 = new int[arrayLength];
                    for (int i = 0; i < arrayLength; i++) {
                        array2[i] = scanner.nextInt();
                    }

                    int[] sumArray = sumArrays(array1, array2);
                    System.out.println("Result: " + Arrays.toString(sumArray));
                    break;

                case 8:
                    // Prime menu
                    System.out.println("Enter a number:");
                    int primeNum = scanner.nextInt();
                    System.out.println("Result: " + isPrime(primeNum));
                    break;

                case 9:
                    // Number in Array menu
                    System.out.println("Enter the length of the array:");
                    int arrayLength2 = scanner.nextInt();

                    System.out.println("Enter the elements of the array:");
                    int[] array = new int[arrayLength2];
                    for (int i = 0; i < arrayLength2; i++) {
                        array[i] = scanner.nextInt();
                    }

                    System.out.println("Enter a number to check:");
                    int checkNum = scanner.nextInt();
                    System.out.println("Result: " + isNumberInArray(array, checkNum));
                    break;

                case 10:
                    // Standard Deviation menu
                    double standardDeviation = calculateStandardDeviation();
                    System.out.println("Standard Deviation: " + standardDeviation);
    
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }

            System.out.println("========================");
        }
              // Print goodbye message
                    System.out.println("=========================");
                    System.out.println("-------- Thanks ----------");
                    System.out.println("=========================");
    }
}
