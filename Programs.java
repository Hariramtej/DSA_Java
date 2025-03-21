// 1

// public class Introduction {
//     public static void main(String[] args) {
//         System.out.println("Hello World");
//     }
// }

// 2

// import java.util.Scanner;
// public class Introduction {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter first number: ");
//         int num1 = scanner.nextInt();
//         System.out.println("Enter second number: ");
//         int num2 = scanner.nextInt();
//         int sum = num1 + num2;
//         System.out.println(("The sum is : " + sum));
//     }
// }

// 3

// import java.util.Scanner;;
// public class Introduction {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = scanner.nextInt();
//         if (num % 2 == 0){
//             System.out.println("The number " + num + " is a even number");
//         } else {
//             System.out.println("The number " + num + " is a odd number");
//         }
//     }
// }

// 4

// import java.util.Scanner;
// public class Introduction {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int num = scanner.nextInt();
//         int factorial = 1;
//         for (int i = 1; i <= num; i++){
//             factorial *= i;
//         }
//         System.out.println("The factorial of " + num + " is " + factorial);
//     }
// }

// 5

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("Enter the number: ");
//         int num = Scanner.nextInt();

//         int mul;

//         for (int i = 1; i <= 10; i++){
//             mul = i * num;
//             System.out.println(num + " x " + i + " = " + mul);
//         }
//     }
// }

// 6

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the number to check: ");
//         int num = scanner.nextInt();
//         Boolean prime = true;

//         if (num <= 1){
//             prime = false;
//         } else {
//             for (int i = 2; i <= Math.sqrt(num); i ++){
//                 if (num % i == 0){
//                     prime = false;
//                     break;
//                 }
//             }
//         }
//         if (prime){
//             System.out.println("The given number " + num + " is a prime number");
//         } else{
//             System.out.println("The given number " + num + " is not a prime number");
//         }
//     }
// }

// 7

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the number of terms: ");
//         int n = scanner.nextInt();

//         int a = 0, b = 1, c;

//         for (int i = 0; i < n; i ++){
//             System.out.print(a + " ");
//             c = a + b;
//             a = b;
//             b = c;
//         }
//         scanner.close();
//     }
// }

// 8

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the operation you want to perform: ");

//         System.out.print("Enter an operator (+,-,*,/): ");
//         char operator = scanner.next().charAt(0);

//         System.out.println("Enter the fist number: ");
//         double num1 = scanner.nextDouble();

//         System.out.println("Enter the second number: ");
//         double num2 = scanner.nextDouble();

//         double result;
        
//         switch (operator){
//             case '+':
//                 result = num1 + num2;
//                 System.out.println("Result: " + result);
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 System.out.println("Result: " + result);
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 System.out.println("Result: " + result);
//                 break;
//             case '/':
//                 if (num2 != 0){
//                     result = num1 / num2;
//                     System.out.println("Result: " + result);
//                     break;
//                 } else {
//                     System.out.println("Error: Division by zero is not allaowed.");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operator");  
//         }
//         scanner.close();
//     }
// }

// 9

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the first number: ");
//         int num1 = scanner.nextInt();
//         System.out.println("Enter the second number: ");
//         int num2 = scanner.nextInt();
//         System.out.println("Enter the third number: ");
//         int num3 = scanner.nextInt();

//         int largest = (num1 > num2) ? (num1 > num2 ? num1 : num3) : (num2 > num3 ? num2 : num3);

//         System.out.println("The largest number is " + largest);

//         scanner.close();
//     }
// }

// 10

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int num = scanner.nextInt();
//         int reverse = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num /= 10;
//         }

//         System.out.println("Reverse number: " + reverse);
//         scanner.close();
//     }
// }

// 11

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("Enter the number to check");
//         int num = Scanner.nextInt();
//         int reverse = 0;
//         int temp = num;

//         while (num != 0){
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num /= 10;
//         }

//         if (temp == reverse){
//             System.out.println("The entered number " + temp + " is a palendrome");
//         } else {
//             System.out.println("The entered number " + temp + " is not a palendrome");
//         }
//     }
// }

// 12

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("Enter the number to add the digits");
//         int num = Scanner.nextInt();int sum = 0; int rem = 0; int temp = num;

//         while (num != 0){
//             rem = num % 10;
//             sum += rem;
//             num /= 10;
//         }

//         System.out.println("Sum of digits of the number " + temp + " is " + sum);
//     }
// }

// 13

// import java.util.Scanner;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("Enter the principle: ");
//         Double principle = Scanner.nextDouble();

//         System.out.println("Enter the rate of intrest: ");
//         double rate = Scanner.nextDouble();

//         System.out.println("Enter the time period: ");
//         double time = Scanner.nextDouble();

//         double intrest = principle * rate * time / 100;

//         System.out.println("The total intrest is " + intrest);
//         Scanner.close();
//     }
// }

// 14

// import java.util.Scanner;;

// public class Introduction {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("Enter the size of the array: ");
//         int n = Scanner.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter the elements of array:");
//         for (int i = 0; i < n; i ++){
//             arr[i] = Scanner.nextInt();
//         }

//         int max = arr[0];
//         for (int i = 0; i < n; i++){
//             if (arr[i] > max){
//                 max = arr[i];
//             }
//         }

//         System.out.println("The largest number in the array is " + max);
//     }
// }

// 15

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("Enter the length of a rectangle");
//         int length = Scanner.nextInt();

//         System.out.println("Enter the breath");
//         int breath = Scanner.nextInt();

//         int area = length * breath;

//         System.out.println("The area of the rectangle is " + area);
//     }
// }

// 16

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Please enter your age: ");
//         int age = Scanner.nextInt();

//         if (age < 18){
//             System.out.println("You are not eligible to vote since you are just " + age);
//         } else {
//             System.out.println("You are now eligible to vote");
//         }
//     }
// }

// 17

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = Scanner.nextInt();

//         String eligible = (age >= 18) ? "Yes" : "No";
//         System.out.println(eligible);
//     }
// }

// 18

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number : ");
//         int num = Scanner.nextInt();

//         String result = (num > 0) ? "Positive" : (num == 0) ? "Zero" : "Negative";
//         System.out.println("The entered number is " + result);
//     }
// }

// 19

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         switch (Integer.compare(num,0)) {
//             case 1:
//                 System.out.println(num + " is a poitive number ");
//                 break;
//             case -1:
//                 System.out.println(num + " is a neative number");
//                 break;
//             case 0:
//                 System.out.println(num + " is zero");
//                 break;
//             default:
//                 System.out.println("INVALID INPUT");
//                 break;
//         }
//     }
// }

// 20

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("Enter the number for the day: ");
//         int day = Scanner.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Enter a valid number");
//                 break;
//         }
//     }
// }

// 21

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the table number you want: ");
//         int num = Scanner.nextInt();
//         int i = 1;

//         do {
//             System.out.println(num + " X " + i + " = " + num * i);
//             i ++;
//         }
//         while(i < 11);
//     }
// }

// 22

// public class programs {
//     public static void main(String[] args) {
//         int[] num = {1,2,3,4,5,6,7,8,9};

//         for (int i: num){
//             if (i % 2 == 0){
//                 System.out.println(i);
//             }
//         }
//     }
// }

// 23

// public class programs {
//         public static void main(String[] args) {
//             int[] num = {1,2,3,4,5,6,7,8,9};
//             int i = 0; 

//             while (num.length >i){
//                 if (num[i] % 2 == 0){
//                     System.out.println(num[i]);
//                 }
//                 i++;
//             }
//         }
//     }

// 24

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);
//         int choice = 0;

//         while (choice != 5){
//             System.out.println("\nSimple Calculator: ");
//             System.out.println("1. Addition");
//             System.out.println("2. Subtraction");
//             System.out.println("#. Multiplication");
//             System.out.println("4. Division");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice");

//             choice = Scanner.nextInt();

//             if (choice >= 1 && choice <= 4){
//                 System.out.println("Enter the first number: ");
//                 double num1 = Scanner.nextDouble();

//                 System.out.println("Enter the second number: ");
//                 double num2 = Scanner.nextDouble();

//                 switch(choice){
//                     case 1:
//                         System.out.println("Result: " + (num1 + num2));
//                         break;
//                     case 2:
//                         System.out.println("Result: " + (num1 - num2));
//                         break;
//                     case 3:
//                         System.out.println("Result: " + (num1*num2));
//                         break;
//                     case 4:
//                         if (num2 != 0){
//                             System.out.println("Result: " + (num1/num2));
//                         } else {
//                             System.out.println("Error: Division cannot be performed when the num2 is 0");
//                         }
//                         break;
//                     case 5:
//                 } 
//             }else if (choice  != 5){
//                 System.out.println("Invalid choice. Please try again.");
//             }

//             System.out.println("Calculator exited. Goodbye !");
//         }
//     }
// }

// 25

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int a = Scanner.nextInt();

//         System.out.print("Enter the second number: ");
//         int b = Scanner.nextInt();

//         System.out.println("Before swapping: a = " + a + ", b = " + b);

//         a = a + b;
//         b = a - b;
//         a = a - b;

//         System.out.println("After swapping: a = " + a + ", b = " + b );
//     }
// }

// 25

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.println("Enter the number: ");
//         int num = Scanner.nextInt(), a = 0;

//         while (num > 0){
//             num /= 10;
//             a ++;
//         }

//         System.out.println("Numbere of digits: " + a);
//     }
// }

// 26

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);
        
//         System.out.print("Enter the number: ");
//         int number = Scanner.nextInt();
//         int count = 0, sum = 0, rem;
//         int temp = number;

//         while (temp != 0){
//             temp /= 10;
//             count ++;
//         }

//         temp = number;

//         while (temp > 0){
//             rem = temp % 10;
//             sum += Math.pow(rem, count);
//             temp /= 10;
//         }

//         System.out.println(sum);

//         if (number == sum){
//             System.out.println("The entered number is Armstrong number.");
//         } else {
//             System.out.println("The given number is not a Armstrong number.");
//         }
//     }
// }

// 27

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int number = Scanner.nextInt();

//         int temp = number, rem, sum = 0;

//         do {
//             rem = temp % 10;
//             sum += rem;
//             temp /= 10;
//         } while (temp > 0);

//         System.out.println("The sum of digits of the number " + number + " is " + sum);
//     }
// }

// 28

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner= new Scanner(System.in);

//         System.out.println("Enter the number: ");
//         int number = Scanner.nextInt();
//         int rem, rev = 0, temp = number;

//         while (temp > 0){
//             rem = temp % 10;
//             rev = rev * 10 + rem;
//             temp /= 10;
//         }

//         System.out.println("The reversed number is " + rev);

//     }
// }

// 29

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int a = Scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = Scanner.nextInt();

//         while (b != 0){
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }

//         System.out.println("GCD: " + a);
//     }
// }

// 30

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int a = Scanner.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = Scanner.nextInt();
//         int gcd = a, temp = b;

//         while (temp != 0){
//             int rem = gcd % temp;
//             gcd = temp;
//             temp = rem;
//         }

//         int lcm = (a*b) / gcd;
//         System.out.println("LCM: " + lcm);

//     }
// }

// 31

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the day number: ");
//         int num = Scanner.nextInt();

//         switch (num) {
//             case 1 -> System.out.println("Monday");
//             case 2 -> System.out.println("Tuesday");
//             case 3 -> System.out.println("Wednesday");
//             case 4 -> System.out.println("Thursday");
//             case 5 -> System.out.println("Friday");
//             case 6 -> System.out.println("Saturday");
//             case 7 -> System.out.println("Sunday");
//         }
//     }
// }

// 32

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the day number: ");
//         int num = Scanner.nextInt();

//         switch (num) {
//             case 1,2,3,4,5 -> System.out.println("Weekday");
//             case 6,7 -> System.out.println("weekend");
//         }
//     }
// }

// 33

// import java.util.Scanner;

// public class programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the day number: ");
//         int num = Scanner.nextInt();

//         switch (num) {
//             case 1:
//             case 2:
//             case 3:
//             case 4:
//             case 5:
//                 System.out.println("Weekday");
//                 break;
//             case 6:
//             case 7:
//                 System.out.println("Weekend");
//                 break;
//         }
//     }
// }

// 34

// import java.util.Scanner;

// public class programs {

//     public static int add(int num1, int num2){
//         return num1 + num2;
//     }
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int num1 = Scanner.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = Scanner.nextInt();

//         int result = add(num1 , num2);

//         System.out.println("The sum of 2 numbers is : " + result);
//     }
// }

// 35

// import java.util.Scanner;

// public class programs {

//     public static int add() {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int num1 = Scanner.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = Scanner.nextInt();

//         int sum = num1 + num2;

//         return sum;
//     }

//     public static void main(String[] args) {

//         int result = add();

//         System.out.println("The sum of both the numbers is " + result);
//     }
// }

// 36

// public class programs {

//     public static String greet(){
//         return "Hello World";
//     }

//     public static void main(String[] args) {
//         System.out.println(greet());
//     }
// }

// 37

// import java.util.Scanner;

// public class programs {

//     public static int even(int num) {
//         if (num % 2 == 0){
//             return num;
//         } else {
//             return -1;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         int result = even(num);

//         if (result != -1){
//             System.out.println(num + " is even number.");
//         } else {
//             System.out.println(num + " is odd number.");
//         }
//     }
// }

// 38

// import java.util.Scanner;

// public class programs {

//     public static int largest(int num1, int num2, int num3){
//         int largest = (num1 > num2) ? (num1 > num3) ? num1:num3 : (num2 > num3) ? num2 : num3 ;

//         return largest;
//     }

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int num1 = Scanner.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = Scanner.nextInt();

//         System.out.print("Enter the third number: ");
//         int num3 = Scanner.nextInt();

//         int largest = largest(num1, num2, num3);

//         System.out.println("The largest number is : " + largest);
//     }
// }

// 39

// import java.util.Scanner;

// public class programs {

//     public static int fact(int num){

//         int result = 1;

//         for (int i = 1; i <= num; i ++){
//             result *= i;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         int factorial = fact(num);

//         System.out.println("The factorial of " + num + " is " + factorial);
//     }
// }

// 40

// import java.util.Scanner;

// public class programs {

//     public static int add(int num1, int num2){
//         return num1 + num2;
//     }

//     public static int sub(int num1, int num2){
//         return num1 - num2;
//     }

//     public static int mul(int num1, int num2){
//         return num1 * num2;
//     }

//     public static int div(int num1, int num2){
//         if (num2 != 0) {
//             return num1/num2;
//         } else {
//             return 0;
//         }
//     }

//     public static void calc(){
//         Scanner Scanner = new Scanner(System.in);

//         for (;;){
//             System.out.println("Calculator");
//             System.out.println("Enter 1 for addition:\nEnter 2 for subraction:\nEnter 3 for multiplication:\nEnter 4 for division:\nEnter 5 to exit:");
//             int choice = Scanner.nextInt();
//             int result;

//             if (choice == 5){
//                 System.out.println("Exiting the calculator !");
//                 break;
//             }

//             System.out.print("Enter the first number: ");
//             int num1 = Scanner.nextInt();
//             System.out.print("Enter the second number: ");
//             int num2 = Scanner.nextInt();

//             switch (choice) {
//                 case 1 -> result = add(num1, num2);
//                 case 2 -> result = sub(num1, num2);
//                 case 3 -> result = mul(num1, num2);
//                 case 4 -> result = div(num1, num2);
//                 default -> {
//                     System.out.println("Invalid choice!");
//                     continue;
//                 }
//             }  

//             System.out.println("Result = " + result);
//         }

//         Scanner.close();
//     }

//     public static void main(String[] args) {
//         calc();
//     }
// }

// 41

// public class programs {
//     public static void main(String[] args) {
//         int[] numbers = {5,8,12,3,15,7};

//         int max = numbers[0];

//         for (int num: numbers){
//             if (num > max){
//                 max = num;
//             }
//         }

//         System.out.println("Largest number: "+max);
//     }
// }

// 42

// public class programs {

//     public static void main(String[] args) {
//         int[] numbers = {1,2,3,4,5};

//         System.out.println("Original array: ");
        
//         for (int num : numbers){
//             System.out.println(num +" ");
//         }

//         System.out.println("Reversed array: ");
        
//         for (int i = numbers.length - 1; i >= 0; i --){
//             System.out.println(numbers[i] + " ");
//         }
//     }
// }

// 43

// import java.util.Scanner;

// public class programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the length of the array: ");
//         int len = Scanner.nextInt();
//         Scanner.nextLine();

//         String[] names = new String[len];

//         for (int i = 0; i < len; i ++){
//             System.out.println("Enter the element number " + i);
//             names[i] =  Scanner.nextLine();
//         }

//         System.out.println("Entered names are: ");
//         for (String i: names){
//             System.out.println(i);
//         }
//     }
// }

// 44

// public class programs {
//     public static void main(String[] args) {
//         int[][] numbers = {{1,2,3},{4,5,6}};

//         for (int i = 0; i < numbers.length; i ++){
//             for (int j = 0; j < numbers[i].length; j ++){
//                 System.out.println(numbers[i][j]);
//             }
//         }
//         for (int[] i: numbers){
//             for (int j: i){
//                 System.out.println(j);
//             }
//         }
//     }
// }

// 45

// import java.util.Scanner;

// public class programs {

//     public static int sum(int a, int b){
//         return a + b;
//     }

//     public static double sum(double a, double b){
//         return a + b;
//     }

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number as integer: ");
//         int a = Scanner.nextInt();

//         System.out.print("Enter the second number as integer: ");
//         int b = Scanner.nextInt();

//         System.out.print("Enter the first number as a double: ");
//         double c = Scanner.nextDouble();

//         System.out.print("Enter the second number as a double: ");
//         double d = Scanner.nextDouble();

//         int result1 = sum(a, b);
//         double result2 = sum(c, d);

//         System.out.println("Integer: " + result1);
//         System.out.println("Double: " + result2);
//         Scanner.close();
//     }
// }

// 46

// import java.util.Scanner;;

// public class programs {

//     public static int fact(int num){
//         if (num == 0){
//             return 1;
//         } else {
//             return num*fact(num -1) ;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         int result = fact(num);
//         System.out.println("Factorial of " + num + " is " + result);
//         Scanner.close();
//     }
// }

// 47

// import java.util.Scanner;

// public class programs {

//     public static int Sum(int num){
//         if (num == 0){
//             return 0;
//         } else {
//             return num + Sum(num - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         int result = Sum(num);
        
//         System.out.println("Sum of natual numbers is " + result);
//         Scanner.close();
//     }
// }

// 48

// public class programs {

//     public static void main(String[] args) {
//         int[] array = new int[5];

//         for (int num : array){
//             System.out.println(num);
//         }
//     }
// }

// 49

// import java.util.Scanner;
// import java.util.Arrays;

// public class programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         String[] str = new String[5];

//         for (int i = 0; i < str.length; i ++){
//             str[i] = Scanner.next();
//         }

//         System.out.println(Arrays.toString(str));
//     }
// }

// 50

// public class Programs {
//     public static void main(String[] args) {
//         int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = 0; j < numbers[i].length; j++) {  
//                 System.out.println(numbers[i][j]);
//             }
//         }
//     }
// }

// 51

// import java.util.ArrayList;

// public class Programs {
//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>(10);

//         System.out.println(numbers);
//         System.out.println(numbers.size());

//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);
//         numbers.add(40);
//         numbers.add(50);

//         System.out.println(numbers);
//         System.out.println(numbers.contains(40));
//         System.out.println(numbers.contains(60));

//         for (int i : numbers){
//             System.out.println(i);
//         }

//         numbers.set(0, 60);
//         System.out.println(numbers);

//         numbers.remove(0);
//         System.out.println(numbers);

//         for(int i = 0; i < numbers.size();i ++){
//             System.out.println(numbers.get(i));
//         }
//     }
    
// }

// 52

// import java.util.ArrayList;

// public class Programs {

//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

//         numbers.add(new ArrayList<>());
//         numbers.add(new ArrayList<>());
//         numbers.add(new ArrayList<>());

//         numbers.get(0).add(1);numbers.get(0).add(2);numbers.get(0).add(3);
//         numbers.get(0).add(4);numbers.get(0).add(5);numbers.get(0).add(6);
//         numbers.get(0).add(7);numbers.get(0).add(8);numbers.get(0).add(9);

//         for (int i = 0; i < numbers.size(); i ++){
//             for (int j = 0; j < numbers.get(i).size();j ++){
//                 System.out.println(numbers.get(i).get(j));
//             }
//         }
        
//         for (int i = 0; i < numbers.size(); i++) {
//             for (int j = 0; j < numbers.get(i).size(); j++) {
//                 System.out.print(numbers.get(i).get(j) + " ");
//             }
//             System.out.println();  
//         }
//     }
// }

// 53

// import java.util.ArrayList;

// public class Programs {

//     public static void main(String[] args) {

//         ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

//         numbers.add(new ArrayList<>());
//         numbers.add(new ArrayList<>());
//         numbers.add(new ArrayList<>());

//         numbers.get(0).add(1);numbers.get(0).add(2);numbers.get(0).add(3);
//         numbers.get(0).add(4);numbers.get(0).add(5);numbers.get(0).add(6);
//         numbers.get(0).add(7);numbers.get(0).add(8);numbers.get(0).add(9);

//         int max = Integer.MIN_VALUE;

//         for (ArrayList<Integer> row : numbers){
//             for (int num : row){
//                 if (num > max){
//                     max = num;
//                 }
//             }
//         }
//         System.out.println("Maximum value is " + max);
        
//     }
// }

// 54

// public class Programs {

//     public static void main(String[] args) {
//         int[] arr = {1,3,23,8,17};

//         int maxValue = arr[0];

//         for (int num: arr){
//             if (num > maxValue){
//                 maxValue = num;
//             }
//         }

//         System.out.println("Maximum value is " + maxValue);
//     }
// }

// 55

// public class Programs {

//     public static void main(String[] args) {
//         String str = "Hariram";
//         System.out.println(str.length());

//         System.out.println(str.charAt(4));

//         System.out.println(str.substring(1, 5));

//         System.out.println(str.toLowerCase());

//         System.out.println(str.toUpperCase());

//         System.out.println("Java".equals("Java"));

//         System.out.println("Java".equalsIgnoreCase("java"));

//         System.out.println("apple".compareTo("banana"));

//         System.out.println("Java programming".contains("Java"));
//     }
// }

// 56

// import java.util.ArrayList;

// public class Programs {

//     public static void main(String[] args) {
//         float num = 453.1234f;
//         System.out.printf("Formated number is %.2f", num);
//         System.out.println();
//         System.out.printf("Pie : %.3f", Math.PI);
//         System.out.println();
//         System.out.printf("Hello my name is %s and my last name is %s", "Hari", "Tej");
//         System.out.println();
//         System.out.println('a' + 'b'); // Adding the Acsie values
//         System.out.println("A" + "B");
//         System.out.println((char)('a' + 3));//Adds the ascie values and then changes into a character
//         System.out.println("a" + 1);

//         System.out.println("Hari" + new ArrayList<>());


//     }
// }

// 57

// public class Programs {

//     public static void main(String[] args) {
//         StringBuilder newString = new StringBuilder(); // Builder class allows us to change the string without creating a new instance

//         for (int i = 0; i < 26; i++){
//             char ch = 'a' + 1;
//             newString.append(ch);
//         }
//         System.out.println(newString.toString()); //toString method prints the value in the console as a string
//     }
// }

// 58

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the string: ");
//         String Str = Scanner.nextLine();
//         int isPalindrome = 0;

//         if (Str == null || Str.length() == 0){
//             isPalindrome = 0;
//         } else{
//             for (int i = 0;i <= Str.length()/2; i ++){
//                 char start = Str.charAt(i);
//                 char end = Str.charAt(Str.length() - 1 - i);
    
//                 if (start != end){
//                     isPalindrome = 1;
//                 }
//             }
    
//             if (isPalindrome == 0){
//                 System.out.println("The entered String is a Palindrome");
//             } else {
//                 System.out.println("The entered Palindrome is not a Palindrome");
//             }
//         }
//         Scanner.close();
//     }
// }

// 59

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         for (int i = 0; i < num ; i ++){
//             for (int j = 0; j < i; j ++ ){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//          Scanner.close();
//     }
// }

// 60

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         for (int i = 0; i < num; i ++){
//             for (int j = 0; j < num; j ++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         Scanner.close();
//     }
// }

// 61

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         for (int row = 0; row < num; row++){
//             for (int col = 0; col < num - row; col ++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         Scanner.close();
//     }
// }

// 62

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         for (int row = 0; row < num; row ++){
//             for (int col = 1; col < num - row; col++){
//                 System.out.print(" ");
//             } 
//             for (int col = 1; col <= 2*row-1; col ++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         Scanner.close();
//     }
// }

// 63

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         for (int row = 1; row <= num; row ++ ){
//             for (int col = 1; col <= row; col ++){
//                 System.out.print(col + " ");
//             }
//             System.out.println();
//         }
//         Scanner.close();
//     }
// }

// 64

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         for (int row = 1; row <= num; row++ ){
//             for (int space = 1; space < num - row + 1; space ++){
//                 System.out.print(" ");
//             }
//             for (int disp = 1; disp <=row;disp ++){
//                 System.out.print(disp+" ");
//             }
//             System.out.println();
//         }

//         Scanner.close();
//     }
// }

// 65

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         for (int row = 1; row <= num; row++){
//             for (int space = 1; space <= num - row +1;space++){
//                 System.out.print(" ");
//             }
//             for (int col = 1; col <= 2*row-1;col++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int row = 1;row <= num; row++){
//             for (int space = 1 ; space <= row ; space++){
//                 System.out.print(" ");
//             }
//             for (int col = 1; col <= 2*num - (2*row-1); col ++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         Scanner.close();
//     }
// }

// 66

// public class Programs {

//     public static void main(String[] args) {
//         int a = 10; int b = 20;

//         System.out.println(a + b);
//         System.out.println(a - b);
//         System.out.println(a * b);
//         System.out.println(a / b);
//         System.out.println(a % b);
//         System.out.println(a ++);
//         System.out.println(b--);
//         System.out.println(a += 5);
//         System.out.println(b -= 5);
//         System.out.println(a *= 5);
//         System.out.println(b /= 10);
//         System.out.println(a %= 10);
//     }
// }

// 67

// public class Programs {

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 3;

//         System.out.println(a & b);
//         System.out.println(a | b);
//         System.out.println(a ^ b);
//         System.out.println(~a);
//         System.out.println(a << 1);
//         System.out.println(a >> 1);
//         System.out.println(-5 >>> 1); // >>> unassigned right shift is used for negative numbers specifically
//     }
// }

// 68

// public class Programs {

//     public static void main(String[] args) {
//         System.out.println("Constants");
//         System.out.println("Pie : " + Math.PI);
//         System.out.println("e : " + Math.E);
//         System.out.println();

//         System.out.println("Basic functions");
//         System.out.println("Absolute value : " + Math.abs(2.34));
//         System.out.println("maximum : " + Math.max(10, 20));
//         System.out.println("Minimum : " + Math.min(20, 10));
//         System.out.println("Square root : " + Math.sqrt(30));
//         System.out.println("Cube root : " + Math.cbrt(30));
//         System.out.println("Power : " + Math.pow(2, 3));
//         System.out.println();

//         System.out.println("Trigonometric functions");
//         System.out.println("Sine  : " + Math.sin(45));
//         System.out.println("Cosine : " + Math.cos(45));
//         System.out.println("Tangent : " + Math.tan(45));
//         System.out.println("Sine inverse : " + Math.asin(1));
//         System.out.println("cosine inverse : " + Math.acos(1));
//         System.out.println("Tangent inverse : " + Math.atan(1));
//         System.out.println("To degrees : " + Math.toDegrees(Math.PI / 2));
//         System.out.println("To radians : " + Math.toRadians(90));
//         System.out.println();

//         System.out.println("Rounding functions");
//         System.out.println("Rounding : " + Math.round(2.222));
//         System.out.println("Ceiling : " + Math.ceil(2.2));
//         System.out.println("Floor : " + Math.floor(2.2));
//         System.out.println();

//         System.out.println("Logarithemic and Exponential functions");
//         System.out.println("Exponential : " + Math.exp(2));
//         System.out.println("ln : " + Math.log(Math.E));
//         System.out.println("Log : " + Math.log10(100));
//         System.out.println();

//         System.out.println("Random");
//         System.out.println(Math.random());
//     }
// }

// 69

// public class Programs {

//     public static void main(String[] args) {
//         int[] arr = {2,3,3,2,4,6,4};
//         System.out.println("Unique element is " + ans(arr));

//     }

//     private static Integer ans(int[] arr){
        
//         Integer unique = 0;

//         for (int i : arr){
//             unique ^= i;
//         }
        
//         return unique;
//     }
// }

// 70

// import java.util.Scanner;

// public class Programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         System.out.print("Enter the index: ");
//         int index = Scanner.nextInt();
//         int bit = 1; 

//         bit = bit << index -1;

//         int result = num & bit;

//         if(result == 0){
//             System.out.println("bit = 0");
//         } else{
//             System.out.println("bit = 1");
//         }

//         Scanner.close();
//     }
    
// }

// 71

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         System.out.print("Enter the index: ");
//         int index = Scanner.nextInt();

//         System.out.println(bitvalue(num, index));
//         Scanner.close();
//     }

//     private static String bitvalue(int num,int index){
//         int bitval = 1 << index -1;
//         int result = bitval & num;
//         if (result == 0){
//             return "bit = 0";
//         } return "bit = 1";
//     }
// }

// 72

// public class Programs {

//     public static void main(String[] args) {
//         int[] arr = {-2,-3,4,5,-5,6,2,-4,3};

//         int result = 0;

//         for (int num: arr){
//             result += num;
//         }

//         System.out.println("The odd number is " + result);
//     }
// }

// 73 

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = Scanner.nextInt();

//         System.out.println("The entered number is " + evenorodd(num));
//         Scanner.close();
//     }

//     private static String evenorodd(int num){
//         int result = num & 1;

//         if (result == 1){
//             return "Odd";
//         } return "Even";
//     }
// }

// 74

// class Car{
//     Car(){
//         System.out.println("A new car.");
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Car mycar = new Car();
//     }
// }

// 75 

// class Car{
//         String model;
//         int year;

//         Car(String m, int y){
//             model = m;
//             year = y;
//         }

//         void Display(){
//             System.out.println("Model : " + model + ", Year : " + year);
//         }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Car c1 = new Car("M5", 1969);
//         c1.Display();
//     }
// }

// 76 

// class Car{
//     String model;
//     int year;

//     Car(String m, int y){
//         model = m;
//         year = y;
//     }

//     Car(Car c){
//         model = c.model;
//         year = c.year;
//     }

//     void Display(){
//         System.out.println("Model : " + model + ", Year : " + year);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Car c1 = new Car("M5", 1999);
//         Car c2 = new Car(c1);

//         c1.Display();
//         c2.Display();
//     }
// }

// 77

// class Car{
//     String model;
//     int year;

//     Car(){
//         this("Unknown", 2000);
//     }

//     Car(String m, int y){
//         model = m;
//         year = y;
//     }

//     void Display(){
//         System.out.println("Model : " + model + ", Year : " + year);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Car c = new Car();
//         c.Display();
//     }
// }

// 78

// class Car{
//     String model;
//     int year;

//     Car(){
//         model = "Unknown";
//         year = 2000;
//     }

//     Car(String m, int y){
//         model = m;
//         year = y;
//     }

//     void Display(){
//         System.out.println("The entered values are");
//         System.out.println("Model : " + model + ", Year : " + year);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Car c1 = new Car();
//         Car c2 = new Car("M5", 2020);

//         c1.Display();
//         System.out.println();
//         c2.Display();

//         System.out.println();
//         System.out.println("I have a car of model : " + c2.model);
//     }
// }

// 79

// class Addition{
//     int num1, num2;

//     Addition(int a, int b){
//         num1 = a;
//         num2 = b;
//     }

//     int add(){
//         return num1 + num2;
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Addition sum = new Addition(10, 20);
//         System.out.println("The sum of 2 numbers is " + sum.add());
//     }
// }

// 80

// class Subraction{
//     int num1, num2;

//     Subraction(int a, int b){
//         num1 = a;
//         num2 = b;
//     }

//     int sub(){
//         return num1 - num2;
//     }
// }

// class Addition{
//     int num1, num2;

//     Addition(int a, int b){
//         num1 = a;
//         num2 = b;
//     }
    
//     int add(){
//         return num1 + num2;
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Addition add = new Addition(10, 20);
//         Subraction sub = new Subraction(10, 20);

//         System.out.println("Addition of 2 numbers is " + add.add());
//         System.out.println("Subraction of 2 numbers is " + sub.sub());
//     }
// }

// 80

// import java.util.Scanner;

// class Subraction{
//     int num1, num2;

//     Subraction(int a, int b){
//         num1 = a;
//         num2 = b;
//     }

//     int sub(){
//         return num1 - num2;
//     }
// }

// class Addition{
//     int num1, num2;

//     Addition(int a, int b){
//         num1 = a;
//         num2 = b;
//     }
    
//     int add(){
//         return num1 + num2;
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number : ");
//         Integer num1 = Scanner.nextInt();

//         System.out.print("Enter the second numer : ");
//         Integer num2 = Scanner.nextInt();

//         Addition add = new Addition(num1, num2);
//         Subraction sub = new Subraction(num1, num2);

//         System.out.println("Addition of 2 numbers is " + add.add());
//         System.out.println("Subraction of 2 numbers is " + sub.sub());
//     }
// }

// 81

// import java.util.Scanner;

// class Calculator{
//     private int a; private int b;

//     public void setnum1(int num){
//         a = num;
//     }

//     public void setnum2(int num){
//         b = num;
//     }

//     public int add(){
//         return a + b;
//     }

//     public int sub(){
//         return a - b;
//     }

//     public int mul(){
//         return a * b;
//     }

//     public int div(){
//         return a / b;
//     }
// }

// public class Programs {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the value of first number: ");
//         int num1 = Scanner.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = Scanner.nextInt();

//         Calculator cal = new Calculator();

//         cal.setnum1(num1);
//         cal.setnum2(num2);

//         System.out.println("Addition : " + cal.add());
//         System.out.println("Subraction : " + cal.sub());
//         System.out.println("Multiplication : " + cal.mul());
//         System.out.println("Division : " + cal.div());

//         Scanner.close();
//     }
// }

// 82 

// import java.util.Scanner;

// class BankAccount{
//     private String accountholder;
//     private double balance;

//     public BankAccount(String name, double money){
//         accountholder = name;
//         balance = money;
//     }

//     public String getAccountholder(){
//         return accountholder;
//     }

//     public double getBalance(){
//         return balance;
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//        Scanner Scanner = new Scanner(System.in);

//        System.out.print("Enter the accontant name: ");
//        String name = Scanner.next();

//        System.out.print("Enter the balance: ");
//        int Bal = Scanner.nextInt();

//        BankAccount acc1 = new BankAccount(name, Bal);

//        System.out.println("Name of the account holder is : " + acc1.getAccountholder());
//        System.out.println("Balance in the account is : " + acc1.getBalance());

//        Scanner.close();
//     }
// }

// 83

// class Animal{
//     void eat(){
//         System.out.println("This animal eats food");
//     }
// }

// class Dog extends Animal{
//     void Bark(){
//         System.out.println("My dog barks");
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Dog dog =  new Dog();
//         dog.Bark();
//         dog.eat();
//     }
// }

// 84

// class Person{
//     String name;
//     int age;

//     Person(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     void DisplayPerson(){
//         System.out.println("Name : " + name);
//         System.out.println("Age : " + age);
//     }
// }

// class Employee extends Person{
//     double salary;
//     int empid;

//     Employee(String name,int age, double salary, int empid){
//         super(name, age);
//         this.salary = salary;
//         this.empid = empid;
//     }

//     void DisplayEmployee(){
//         DisplayPerson();
//         System.out.println("Salary : " + salary);
//         System.out.println("Empid : " + empid);
//     }
// }

// class Manager extends Employee{
//     String Department;

//     Manager(String name, int empid, double salary, int age, String Department){
//         super(name, age, salary, empid);
//         this.Department = Department;
//     }

//     void DisplayManager(){
//         DisplayEmployee();
//         System.out.println("Department : " + Department);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Manager man = new Manager("Hari", 1201, 900000, 25, "Mechanical");

//         man.DisplayManager();
//         man.DisplayPerson();
//     }
// }

// 85 

// public class Programs {

//     public static void main(String[] args) {
//         final String name = "Hariram";

//         name = "Ram";
//         System.out.println(name);
//     }
// }

// 86 

// class Name{
//     String name = "Hari";

//     final void DisplayName(){
//         System.out.println(name);
//     }
// }

// class Details extends Name{
//     String name = "Ram";
//     int age = 29;

//     void DisplayName(){
//         System.out.println("Name : " + name);
//         System.out.println("Age : " + age);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Details about = new Details();
//         about.DisplayName();
//     }
// }

// 87

// final class Name{
//     String name = "Hari";
// }

// class Details extends Name{
//     void DisplayName(){
//         System.out.println("Name : " + name);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Details info = new Details();

//         info.DisplayName();
//     }
// }

// 88

// class Addition{
//     int a, b, c;
//     double d,e;
    

//     Addition(int a, int b){
//         this.a = a;
//         this.b = b;
//         System.out.println("Sum : " + (a+b));
//     }

//     Addition(int a, int b, int c){
//         this.a = a;
//         this.b = b;
//         this.c = c;
//         System.out.println("Sum : " + (a+b+c));
//     }

//     Addition(double a, double b){
//         this.d = a;
//         this.e = b;
//         System.out.println("Sum : " + (d + e));
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Addition add = new Addition(1.1, 2.2);
//         Addition dd2 = new Addition(10, 20);
//         Addition add3 = new Addition(10, 20, 30);
//     }
// }

// 89

// class Dog{
//     void Display(){
//         System.out.println("My dog is barking");
//     }
// }

// class Animal extends Dog{
//     void Display(){
//         System.out.println("Animal mostly barks");
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Animal org = new Animal();
//         org.Display();
//     }
// }


// 90

// class Employee{
//     protected String name;
//     protected int empId;

//     public Employee (String name, int empid){
//         this.name = name;
//         this.empId = empid;
//     }

//     public double CalculateSalary(){
//         return 0;
//     }

//     public void DisplayDetials(){
//         System.out.println("Employee name : " + name);
//         System.out.println("Employee id : " + empId);
//         System.out.println("Employee salary : " + CalculateSalary());
//     }
// }

// class FulltimeEmployee extends Employee{
//     private double monthlySalary;

//     FulltimeEmployee(String name, int empId, double monthlySalary){
//         super(name, empId);
//         this.monthlySalary = monthlySalary;
//     }

//     public double CalculateSalary(){
//         return monthlySalary;
//     }
// }

// class ParttimeEmployee extends Employee{
//     private int workingHours;
//     private double SalaryperHour;

//     public ParttimeEmployee(String name, int empId, double SalaryperHour, int workingHours){
//         super(name, empId);
//         this.SalaryperHour = SalaryperHour;
//         this.workingHours = workingHours;
//     }

//     public double CalculateSalary(){
//         return SalaryperHour * workingHours;
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         FulltimeEmployee emp1 = new FulltimeEmployee("Alice", 101, 5000);
//         ParttimeEmployee emp2 = new ParttimeEmployee("Bob", 102, 20, 80);

//         System.out.println();

//         System.out.println("Full-Time employee details : " );
//         emp1.DisplayDetials();

//         System.out.println();

//         System.out.println("Part-time employee Details : ");
//         emp2.DisplayDetials();

//     }
// }

// 91

// class Vehicle{
//     protected String brand;
//     protected int speed;

//     public Vehicle(String brand,int speed){
//         this.brand = brand;
//         this.speed = speed;
//     }

//     public void displayinfo(){
//         System.out.println("Vehicle brand: " + brand + ", speed : " + speed);
//     }
// }

// class Bike extends Vehicle{
//     private Boolean hasCarrier;

//     Bike(String brand, int speed, Boolean hasCarrier){
//         this.hasCarrier = hasCarrier;
//         super(brand,speed);
//     }

//     public void displayinfo(){
//         System.out.println("Vehicle brand: " + brand + ", speed : " + speed + " km/h , Carrier : " + hasCarrier);
//     }
// }

// class Car extends Vehicle{
//     private int numDoors;

//     Car(String brand, int speed, int numDoors){
//         super(brand, speed);
//         this.numDoors = numDoors;
//     }

//     public void displayinfo(){
//         System.out.println("Vehicle brand: " + brand + ", speed : " + speed + " km/h , num of doors : " + numDoors);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Vehicle genericVehicle = new Vehicle("Generic", 100);
//         Car myCar = new Car("Toyota", 120, 4);
//         Bike myBike = new Bike("Yamaha", 80, true); 

//         genericVehicle.displayinfo();
//         myCar.displayinfo();
//         myBike.displayinfo();
//     }
// }

// 92

// class BankAccount{
//     private String accountholdername;
//     private int accountNumber;
//     private int balance;

//     BankAccount(String accountholdername, int accountNumber,int balance){
//         this.accountNumber = accountNumber;
//         this.accountholdername = accountholdername;
//         this.balance = balance;
//         System.out.println("Hello and welcome Mr " + accountholdername);
//         System.out.println("Your account number is " + accountNumber);
//         System.out.println("Your balance in the account is " + balance);
//     }

//     public void diposit(int amount){
//         if (amount > 0){
//             balance += amount;
//             System.out.println("Diposited " + amount + " successfully");
//         } else {
//             System.out.println("Please enter a valid amount !");
//         }
//     }

//     public void withdraw(int amount){
//         if (amount > 0 && amount <= balance){
//             balance -= amount;
//             System.out.println("Withdrawed " + amount + " successfully !");
//             System.out.println("Remaining balance is " + balance);
//         }
//     }

//     public void getBalance(){
//         System.out.println("The balance is " + balance);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         BankAccount myacc = new BankAccount("Hariram", 247057, 900000);

//         myacc.diposit(100000);
//         myacc.withdraw(500000);
//         myacc.getBalance();
//     }
// }

// 93

// class Animal{
//     public void Describe(){
//         System.out.println("Different animals make different sounds");
//     }
// }

// class Dog{
//     public void Describe(){
//         System.out.println("Dog barks");
//     }
// }

// class Fish{
//     public void Describe(){
//         System.out.println("Fish doesnot make sound");
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Animal a1 = new Animal();
//         Dog d1 = new Dog();
//         Fish f1 = new Fish();

//         a1.Describe();
//         d1.Describe();
//         f1.Describe();
//     }
// }

// 94

// class Counter{
//     static int count = 0;

//     public Counter(){
//         count ++;
//     }

//     public int getObjectCount(){
//         return count;
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();

//         System.out.println(c3.getObjectCount());
//     }
// }

// 95

// class Citizen{
//     String address;
//     String aadharNnumber;

//     Citizen(String aadharNnumber, String address){
//         this.aadharNnumber = aadharNnumber;
//         this.address = address;
//     }
// }

// class GovernmentEmployee extends Citizen{
//     String department;
//     String desigination;

//     GovernmentEmployee(String address, String aadharNumber, String department, String desigination){
//         super(aadharNumber, address);
//         this.department = department;
//         this.desigination = desigination;
//     }

//     public void displayEmployeeDetails(){
//         System.out.println("Address : "+ address);
//         System.out.println("aadhar number : " + aadharNnumber);
//         System.out.println("Department : " + department);
//         System.out.println("Desigination " + desigination);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         GovernmentEmployee GV = new GovernmentEmployee("Health Department" , "11233445566"  , "Health Department" , "Medical Officer");
//         GV.displayEmployeeDetails();
//     }
// }

// 96

// class Appliance{
//     public void turnOn(){
//         System.out.println("Appliance is turned on.");
//     }
// }

// class WashingMachine extends Appliance{
//     public void turnOn(){
//         System.out.println("Washing machine is turned on");
//     }
// }

// class Refridgrator extends Appliance{
//     public void turnOn(){
//         System.out.println("Cooling food");
//     }
// }

// public class Programs {

//     public static void Appliance(Appliance Appliance){
//         Appliance.turnOn();
//     }

//     public static void main(String[] args) {
//         WashingMachine Wm = new WashingMachine();
//         Refridgrator Rd = new Refridgrator();

//         Appliance(Wm);
//         Appliance(Rd);

//     }
// }

// class Employee{
//     private int Salary;
//     private String name;
//     protected String department;

//     public void Setter(String ename, int esalary, String edepartment){
//         Salary = esalary;
//         name = ename;
//         department = edepartment;
//     }

//     public void Getter(){
//         System.out.println("Name : " + name);
//         System.out.println("Salary : " + Salary);
//         System.out.println("Department : " + department);
//     }
// }

// class Manager extends Employee{

// }

// public class Programs {
//     public static void main(String[] args) {
//         Manager mn = new Manager();
//         mn.Setter("Ramu", 50000, "SCOPE");
//         mn.Getter();
//     }
// }

// 97

// class Address{
//     String city;

//     Address(String city){
//         this.city = city;
//     }
// }

// class Person{
//     String name;
//     Address address;

//     Person(String name, Address address){
//         this.name = name;
//         this.address = address;
//     }

//     public Person(Person other){
//         this.name = other.name;
//         this.address = other.address;
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Address address = new Address("New York");
//         Person person1 = new Person("John" , address);
//         Person person2 = new Person(person1);

//         System.out.println("Original : " + person1.name + " , " + person1.address.city);
//         System.out.println("Shallow copy : " + person2.name + " , " + person2.address.city);

//         person2.address.city = "Los Angeles";

//         System.out.println("After modification");
//         System.out.println("Original: " + person1.name + ", " + person1.address.city);
//         System.out.println("Shallow Copy: " + person2.name + ", " + person2.address.city);
//     }
// }

// 98

// class Address{
//     String city;

//     public Address(String city){
//         this.city = city;
//     }

//     public Address(Address other){
//         this.city = other.city;
//     }
// }

// class Person{
//     String name;
//     Address address;

//     public Person(String name, Address address){
//         this.name = name;
//         this.address = address;
//     }

//     public Person(Person other){
//         this.name = other.name;
//         this.address = new Address(other.address);
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Address address = new Address("New york");
//         Person person1 = new Person("John", address);
//         Person person2 = new Person(person1);

//         System.out.println("Original: " + person1.name + ", " + person1.address.city);
//         System.out.println("Deep Copy: " + person2.name + ", " + person2.address.city);

//         // Modify the address in the copied object
//         person2.address.city = "Los Angeles";

//         System.out.println("After modification:");
//         System.out.println("Original: " + person1.name + ", " + person1.address.city);
//         System.out.println("Deep Copy: " + person2.name + ", " + person2.address.city);    }
// }

// 99

// public class Programs {

//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;

//         try{
//             int result = a/b;
//             System.out.println("Result : " + result);
//         } catch (ArithmeticException e){
//             System.out.println("Exception chought: Division by zero");
//         } finally {
//             System.out.println("This block is always executed.");
//         }

//     }
// }

// 100

// import java.util.Scanner;

// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the first number: ");
//         int num1 = Scanner.nextInt();

//         System.out.print("Enter the second number: ");
//         int num2 = Scanner.nextInt();
//         try{
//             double div = num1/num2;
//             System.out.println("Result: "+div);
//         } catch(ArithmeticException e){
//             System.out.println("Exception occured: Division with zero.");
//         } finally {
//             System.out.println("Division will always be performed");
//         }
//     }
// }

// 101

// public class Programs {

//     public static void main(String[] args) {
//         String text = null;

//         try{
//             System.out.println(text.length());
//         } catch (NullPointerException e){
//             e.getMessage();
//             System.out.println("Exception cought: Thre object is null");
//         }
//     }
// }

// 101

// public class Programs {

//     public static void createGarbage(){
//         for (int i = 0; i < 100000; i ++){
//             String temp = new String("Object " + i);
//         }
//     }

//     public static void main(String[] args) {
//         Runtime runtime = Runtime.getRuntime();
//         System.out.println("Initial free memory : " + runtime.freeMemory()/1024 + " KB");

//         System.gc();

//         System.out.println("Free memory afte rgarage collection: " + runtime.freeMemory()/1024 + " KB");
//     }
// }

// 102

// class Resource{
//     private String name;

//     public Resource(String name){
//         this.name = name;
//         System.out.println("Resource created: " + name);
//     }

//     protected void finalize() throws Throwable{
//         try{
//             System.out.println("Resource cleaned up: " + name);
//         } finally {
//             super.finalize();
//         }
//     }


// }

// public class Programs {

//     public static void main(String[] args) {
//         Resource resource1 = new Resource("Resource 1");
//         Resource resource2 = new Resource("Resource 2");

//         resource1 = null;
//         resource2 = null;

//         System.gc();

//         try{
//             Thread.sleep(1000);
//         } catch (InterruptedException e){
//             e.printStackTrace();
//         }
//     }
// }

// 103

// interface Shape{
//     double calculateArea();

//     default void displayShape(String shapeType){
//         System.out.println("This is a " + shapeType);
//     }
// }

// class Circle implements Shape{
//     private double radius;

//     public Circle(double radius){
//         this.radius = radius;
//     }

//     public double calculateArea(){
//         return Math.PI * radius * radius;
//     }

//     protected void finalize() throws Throwable{
//         System.out.println("Circle object with radius " + radius + " is being garbage collected");
//         super.finalize();
//     }
// }

// class Rectangle implements Shape{
//     private double length;
//     private double breath;

//     public Rectangle(double length, double breath){
//         this.breath = breath;
//         this.length = length;
//     }

//     public double calculateArea(){
//         return length* breath;
//     }

//     protected void finalize() throws Throwable{
//         System.out.println("Rectangle object with length " + length + " and width " + breath + " is being garbage collected");
//         super.finalize();
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Circle circle = new Circle(5.0);
//         circle.displayShape("Circle");
//         System.out.println("Area of the circle is : " + circle.calculateArea());

//         Rectangle rectangle = new Rectangle(4, 6);
//         rectangle.displayShape("Rectangle");
//         System.out.println("Area of the rectangle is + " + rectangle.calculateArea());

//         circle = null;
//         rectangle = null;

//         System.gc();

//         try{
//             Thread.sleep(1000);
//         } catch (InterruptedException e){
//             e.printStackTrace();
//         }

//     }
// }

// 104

// interface PaymentMethod{
//     void processPayment(double amount);
// }

// class CreditCard implements PaymentMethod{
//     private String cardNumber;

//     public CreditCard(String cardNumber){
//         this.cardNumber = cardNumber;
//     }

//     public void processPayment(double amount){
//         System.out.println("Processing credit card payment of $"+amount + " using card number " + cardNumber);
//     }

//     protected void finalize() throws Throwable{
//         System.out.println("Your credit card details has been garbage collected.");
//         super.finalize();
//     }
// }


// class PayPal implements PaymentMethod{
//     private String email;

//     public PayPal(String email){
//         this.email = email;
//     }

//     public void processPayment(double amount){
//         System.out.println("Processing PayPal payment of $" + amount + " using email " + email);
//     }

//     protected void finalize() throws Throwable{
//         System.out.println("Your paypal details has been garbage collected.");
//         super.finalize();
//     }
// }

// class Bitcoin implements PaymentMethod{
//     private String walletAddress;

//     public Bitcoin(String walletAddress){
//         this.walletAddress = walletAddress;
//     }

//     public void processPayment(double amount){
//         System.out.println("Processing Bitcoin payment of $" + amount + " using wallet address " + walletAddress);
//     }

//     protected void finalize() throws Throwable{
//         System.out.println("Your bitcoin details has been garbage collected.");
//         super.finalize();
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         PaymentMethod creditCard = new CreditCard("1234-5678-9012-3456");
//         PaymentMethod payPal = new PayPal("user@example.com");
//         PaymentMethod bitcoin = new Bitcoin("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");

//         creditCard.processPayment(100);
//         payPal.processPayment(50);
//         bitcoin.processPayment(200);

//         System.out.println();

//         creditCard = null;
//         payPal = null;
//         bitcoin = null;

//         System.gc();

//         try{
//             Thread.sleep(1000);
//         } catch (InterruptedException e){
//             e.printStackTrace();
//         }
//     }
// }

// 105

// abstract class Vehicle{
//     void start(){
//         System.out.println("Vehicle started.");
//     }

//     void stop(){
//         System.out.println("Vehicle stopped.");
//     }

//     abstract void move();
// }

// class Car extends Vehicle{
//     void move(){
//         System.out.println("Car is moving on the road.");
//     }
// }

// class Boat extends Vehicle{
//     void move(){
//         System.out.println("Boat is sailing on the water.");
//     }
// }

// public class Programs{
//     public static void main(String[] args) {
//         Vehicle car = new Car();
//         car.start();
//         car.move();
//         car.stop();

//         Vehicle boat = new Boat();
//         boat.start();
//         boat.move();
//         boat.stop();
//     }
// }

// 106

// class Outer{
//     private int outerField = 10;

//     class Inner{
//         void display(){
//             System.out.println("Value of outerField: " + outerField);
//         }
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         Outer.Inner inner = outer.new Inner();

//         inner.display();
//     }
// }

// 107

// class Outer{
//     static class StaticNested{
//         void display(){
//             System.out.println("Static Nested Class");
//         }
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Outer.StaticNested nested = new Outer.StaticNested();
//         nested.display();
//     }
// }

// 108

// interface Greeting{
//     void greet();
// }

// public class Programs {

//     public static void main(String[] args) {
//         Greeting greeting = new Greeting() {
//             public void greet(){
//                 System.out.println("Hello from anonymous Inner Class");
//             }
//         };
//         greeting.greet();
//     }
// }

// 109

// class Outer{
//     void display(){
//         class LocalInner{
//             void show(){
//                 System.out.println("Local ");
//             }
//         }
//         LocalInner inner = new LocalInner();
//         inner.show();
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Outer outer = new Outer();
//         outer.display();
//     }
// }

// 110

// public class Programs{
//     private int count = 0;


//     class RestHandler{
//         void ResetHandler(){
//             count = 0;
//             System.out.println("Counter rest to 0.");
//         }
//     }

//     void increment(){
//         count++;
//         System.out.println("Count: " + count);
//     }

//     public static void main(String[] args) {
//         Programs counterApp = new Programs();
//         Programs.RestHandler restHandler = counterApp.new RestHandler();

//         counterApp.increment();
//         counterApp.increment();
//         restHandler.ResetHandler();
//         counterApp.increment();
//     }
// }

// 111

// public class Programs {

//     class Operations {
//         int add(int a, int b){
//             return a + b;
//         }

//         int subtract(int a,int b){
//             return a - b;
//         }

//         int multiply(int a, int b){
//             return a * b;
//         }

//         double divide(int a, int b){
//             if (b == 0){
//                 throw new ArithmeticException("Cannot divide by zero !");
//             }
//             return a / b;
//         }
//     }

//     public static void main(String[] args) {
//         Programs calulator = new Programs();
//         Programs.Operations operations = calulator.new Operations();

//         System.out.println("Addition: " + operations.add(10, 20));
//         System.out.println("Subraction: "+ operations.subtract(10, 20));
//         System.out.println("Multiplication: " + operations.multiply(10, 20));
//         System.out.println("Division: " + operations.divide(10, 20));
//     }
// }

// 112

// public class Programs{
//     class Converter{
//         double celsiusToFahrenheit(double celsius){
//             return (celsius * 9/5) + 32;
//         }

//         double fahrenheitToCelsius(double fahrenheit){
//             return (fahrenheit - 32) * 5/9;
//         }
//     }

//     public static void main(String[] args) {
//         Programs converterApp = new Programs();
//         Programs.Converter converter = converterApp.new Converter();

//         double celsius = 25;
//         double fahrenheit = 77;

//         System.out.println(celsius + "°C to Fahrenheit: " + converter.celsiusToFahrenheit(celsius));
//         System.out.println(fahrenheit + "°F to Celsius: " + converter.fahrenheitToCelsius(fahrenheit)); 
//     }

// }

// 113

// interface Animal{
//     void eat();
// }

// interface Dog extends Animal{
//     void bark();
// }

// class Labrador implements Dog{
//     public void eat(){
//         System.out.println("Labrador is eating.");
//     }

//     public void bark(){
//         System.out.println("Labrador is barking");
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Labrador lab = new Labrador();
//         lab.eat();
//         lab.bark();
//     }
// }

// 114

// interface Vehicle{
//     void start();
//     void stop();
// }

// interface Drivable extends Vehicle {
//     void drive();
// }

// interface Flyable extends Vehicle {
//     void fly();
// }

// interface Sailable extends Vehicle{
//     void sail();
// }

// class Car implements Drivable {
//     public void start(){
//         System.out.println("Car started");
//     }

//     public void stop(){
//         System.out.println("Car stopped");
//     }

//     public void drive(){
//         System.out.println("Car is driving on the road.");
//     }
// }

// class Airplane implements Flyable {
//     public void start() {
//         System.out.println("Airplane started.");
//     }

//     public void stop(){
//         System.out.println("Airplane stopped.");
//     }

//     public void fly(){
//         System.out.println("Airplane is flying in the sky.");
//     }
// }

// class Boat implements Sailable{
//     public void start(){
//         System.out.println("Boat started.");
//     }

//     public void stop(){
//         System.out.println("Boat stopped.");
//     }

//     public void sail(){
//         System.out.println("Boat is sailing on the water.");
//     }
// }

// class AmphibiousVehicle implements Drivable, Sailable{
//     public void start(){
//         System.out.println("Amphibious vehicle sarted.");
//     }

//     public void stop(){
//         System.out.println("Amphibious vehicle stopped.");
//     }

//     public void sail(){
//         System.out.println("Amphibious vehicle is driving on the road.");
//     }

//     public void drive(){
//         System.out.println("Amphibious vehicle is sailing on the water.");
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Car car = new Car();
//         Airplane airplane = new Airplane();
//         Boat boat = new Boat();
//         AmphibiousVehicle amphibiousVehicle = new AmphibiousVehicle();

//         // Demonstrate car behavior
//         car.start();
//         car.drive();
//         car.stop();

//         // Demonstrate airplane behavior
//         airplane.start();
//         airplane.fly();
//         airplane.stop();

//         // Demonstrate boat behavior
//         boat.start();
//         boat.sail();
//         boat.stop();

//         // Demonstrate amphibious vehicle behavior
//         amphibiousVehicle.start();
//         amphibiousVehicle.drive();
//         amphibiousVehicle.sail();
//         amphibiousVehicle.stop();
//     }
// }

// 115

// interface Animal{
//     void makeSound();
// }

// interface Mammal extends Animal{
//     void breathe();
// }

// class LivingBeing{
//     private String name;

//     public LivingBeing(String name){
//         this.name = name;
//     }

//     public String getName(){
//         return name;
//     }

//     protected void finalize() throws Throwable{
//         System.out.println(name + " is being garbage collected.");
//         super.finalize();
//     }
// }

// class Dog extends LivingBeing implements Mammal{
//     class Bark{
//         void sound(){
//             System.out.println(getName() + " says: Woff!");
//         }
//     }

//     public Dog(String name){
//         super(name);
//     }

//     public void makeSound(){
//         Bark bark = new Bark();
//         bark.sound();
//     }

//     public void breathe(){
//         System.out.println(getName() + " is breathing.");
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         Dog dog = new Dog("Buddy");

//         dog.makeSound();
//         dog.breathe();

//         try{
//             int[] numbers = {1,2,3};
//             System.out.println("Accessing invalid index: " + numbers[5]);
//         } catch (ArrayIndexOutOfBoundsException e){
//             System.out.println("Exception caught: " + e.getMessage());
//         } finally {
//             System.out.println("Finally block executed.");
//         }

//         dog = null;

//         System.gc();;

//         try{
//             Thread.sleep(1000);
//         } catch (InterruptedException e){
//             System.out.println("Thread interrupted");
//         }
//     }
// }

// 116

// public class Programs {

//     public static void main(String[] args) {
        
//         try{
//             int myInt = Integer.parseInt("hello"); 
//         } catch (NumberFormatException e){
//             System.out.println("You cannot make a number out of it.");
//         }
//     }
// }

// 117

// public class Programs {

//     public static void main(String[] args) {
//         try{
//             int[] numbers = {1,2,3};
//             System.out.println(numbers[5]);

//             String text = null;
//             System.out.println(text.length());
//         } catch(ArrayIndexOutOfBoundsException e) {
//             System.out.println("The array is out or bound.");
//             System.out.println(e.getMessage());
//         } catch(NullPointerException e){
//             System.out.println("NUll pointer exception");
//             System.out.println(e.getMessage());
//         } finally {
//             System.out.println("finally block excuted");
//         }
//     }
// }

// 118

// import java.util.*;

// public class Programs {

//     public static void main(String[] args) {
        
//         List<String> fruits = new ArrayList<>();
//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Cherry");

//         System.out.println("ArrayList: " + fruits);

//         Set<String> uniqueFruits = new HashSet<>(fruits);
//         uniqueFruits.add("Apple");
//         System.out.println("Hashset: " + uniqueFruits);

//         Map<String, Integer> fruitPrices = new HashMap<>();
//         fruitPrices.put("Apple", 50);
//         fruitPrices.put("Banana", 30);
//         fruitPrices.put("Cherry", 70);
//         System.out.println("HashMap: " + fruitPrices);
//     }
// }

// 119

// import java.util.ArrayList;

// public class Programs {

//     public static void main(String[] args) {
//         ArrayList<String> fruits = new ArrayList<>();
//         fruits.add("apple");
//         fruits.add("banana");
//         fruits.add("cherry");

//         System.out.println("Fruits: " + fruits);
//         System.out.println();

//         System.out.println("Using foor loop: ");
//         for (int i = 0; i < fruits.size(); i++){
//             System.out.println(fruits.get(i));
//         }

//         System.out.println();
//         System.out.println("Using enhanced for loop: ");
//         for (String fruit : fruits){
//             System.out.println(fruit);
//         }
//     }
// }

// 120

// import java.util.ArrayList;

// public class Programs {

//     public static void main(String[] args) {
//         ArrayList<String> animals = new ArrayList<>();

//         animals.add("Lion");
//         animals.add("Tiger");
//         animals.add("Giraffe");
//         animals.add("Elephant");

//         System.out.println("Original Arraylist: " + animals);
//         animals.remove("Tiger");
//         System.out.println("New Arraylist: " + animals);
//     }
// }

// 121

// import java.util.ArrayList;
// import java.util.Collections;

// public class Programs {

//     public static void main(String[] args) {
//         ArrayList<Integer> numbers = new ArrayList<>();
//         numbers.add(5);
//         numbers.add(2);
//         numbers.add(9);
//         numbers.add(1);

//         System.out.println("Before sorting: " + numbers);

//         Collections.sort(numbers);
//         System.out.println("Sorted arrayList: " + numbers);

//         if(numbers.contains(10)){
//             System.out.println("ArrayList contains 10");
//         } else {
//             System.out.println("ArrayList doesn't contain 10");
//         }

//         System.out.println();
//         System.out.println("Size of teh arrayList: " + numbers.size());

//         System.out.println();
//         System.out.println("Index of 5 is: " + numbers.indexOf(5));

//         System.out.println();
//         Collections.reverse(numbers);
//         System.out.println("Reversed ArrayList is: " + numbers);
//     }
// }

// 122

// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Set;

// public class Programs {

//     public static void main(String[] args) {
//         Set<String> fruits = new HashSet<>();

//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Cherry");

//         System.out.println("Fruits: " + fruits);

//         System.out.println();
//         System.out.println("ash set Elements: ");
//         for(String fruit: fruits){
//             System.out.println(fruit);
//         }

//         System.out.println();
//         fruits.remove("Banana");
//         System.out.println("HashSet after removal: " + fruits);

//         System.out.println();
//         if (fruits.contains("Apple")){
//             System.out.println("Fruits HashSet has Apple in it.");
//         } else {
//             System.out.println("Fruits HashSet doesnot contain Apple in it.");
//         }

//         System.out.println();
//         System.out.println("Size of the HashSet is: " + fruits.size());

//         String[] fruitArray = fruits.toArray(new String[0]);

//         System.out.println("Array elements");
//         for (String fruit : fruitArray){
//             System.out.println(fruit);
//         }
//     }
// }

// 123

// class InvalidAgeException extends Exception{
//     public InvalidAgeException(String message){
//         super(message);
//     }
// }

// public class Programs {

//     static void validate(int age) throws InvalidAgeException {
//         if (age < 18){
//             throw new InvalidAgeException("Age must be 18 or older");
//         } else {
//             System.out.println("Age is valid");
//         }
//     }

//     public static void main(String[] args) {
//         try{
//             validate(15);
//         } catch (InvalidAgeException e){
//             System.out.println("Caught the exception: " + e.getMessage());
//         }
//     }
// }

// 124

// import java.util.Scanner;

// class NegativeAgeException extends Exception{
//     public NegativeAgeException (String message){
//         super(message);
//     }
// }

// public class Programs {

//     void FindErrorAge(int age) throws NegativeAgeException{
//         if (age < 1){
//             throw new NegativeAgeException("The age cannot be zero.");
//         } else {
//             System.out.println("The entered age is correct.");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter the age: ");
//         int age = Scanner.nextInt();

//         Programs program = new Programs();

//         try{
//             program.FindErrorAge(age);
//         } catch(NegativeAgeException E){
//             System.out.println("Error: " + E.getMessage());;
//         } finally{
//             Scanner.close();
//         }
//     }
// }

// 125

// import java.util.Scanner;

// class NegativeSalaryException extends Exception{
//     public NegativeSalaryException(String message){
//         super(message);
//     }
// }

// public class Programs {

//     void FindErrorSalary(int Salary) throws NegativeSalaryException{
//         if (Salary < 0){
//             throw new NegativeSalaryException("Salary cannot be less tha zero.");
//         } else {
//             System.out.println("Entered the Salary.");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);

//         System.out.print("Enter your salary: ");
//         int salary = Scanner.nextInt();

//         Programs program = new Programs();

//         try{
//             program.FindErrorSalary(salary);
//         } catch(NegativeSalaryException e) {
//             System.out.println("Error occured: " + e.getMessage());
//         } finally {
//             Scanner.close();
//         }
//     }
// }

// 126

// import java.util.Scanner;

// class DivisionByZeroException extends Exception{
//     public DivisionByZeroException(String message){
//         super(message);
//     }
// }

// interface MathOperations{
//     double add(double a, double b);
//     double subtract(double a, double b);
//     double multiply(double a, double b);
//     double divide(double a, double b) throws DivisionByZeroException;
// }

// class Calculator implements MathOperations{
//     private double result;

//     public double getResult(){
//         return result;
//     }

//     public void setResult(double result){
//         this.result = result;
//     }

//     public double add(double a, double b){
//         return a + b;
//     }

//     public double subtract(double a, double b){
//         return a - b;
//     }

//     public double multiply(double a, double b){
//         return a*b;
//     }

//     public double divide(double a, double b) throws DivisionByZeroException{
//         if (b == 0){
//             throw new DivisionByZeroException("Error : Division by zero is not allowed.");
//         }
//         return a / b;
//     }
// }

// class AdvancedCalculator extends Calculator{
//     public double power(double base, double exponent){
//         return Math.pow(base, exponent);
//     }
// }


// public class Programs {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);
//         AdvancedCalculator calculator = new AdvancedCalculator();

//         try{
//             System.out.print("Enter first number: ");
//             double num1 = Scanner.nextDouble();

//             System.out.print("Enter second number: ");
//             double num2 = Scanner.nextDouble();

//             System.out.println("Addition: " + calculator.add(num1 , num2));
//             System.out.println("Subraction: " + calculator.subtract(num1, num2));
//             System.out.println("Multiplication: " + calculator.multiply(num1, num2));
//             System.out.println("Division: " + calculator.divide(num1, num2));
//             System.out.println("Power: " + calculator.power(num1,num2));

//             calculator.setResult(calculator.add(num1, num2));
//             System.out.println("Result stored in calculator: " + calculator.getResult());
//         } catch(DivisionByZeroException e){
//             System.out.println(e.getMessage());
//         } catch (Exception e){
//             System.out.println("Invaid input. Please enter numbers only");
//         } finally{
//             Scanner.close();
//             calculator = null;
//             System.gc();

//             System.out.println("Calculator objects set to null.Garbage collection suggested");
//         }
//     }
// }

// 127

// import java.util.HashSet;
// import java.util.Iterator;

// public class Programs {

//     public static void main(String[] args) {
        // HashSet<String> fruits = new HashSet<>();

        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Orange");
        // fruits.add("Kiwi");
        // fruits.add("Apple");

        // System.out.println("HashSet - Fruita: " + fruits);

        // System.out.println("Contains Banan? : " + fruits.contains("Banana"));

        // System.out.println("Size of fruits: " + fruits.size());

        // HashSet<Integer> numbers = new HashSet<>();

        // numbers.add(10);
        // numbers.add(20);
        // numbers.add(30);

        // System.out.println("Iterating using for-each loop");
        // for (int number : numbers){
        //     System.out.println(number);
        // }

        // System.out.println("Iterating using a iterator");
        // Iterator<Integer> iterator = numbers.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // HashSet<String> set1 = new HashSet<>();
        // HashSet<String> set2 = new HashSet<>();

        // set1.add("Apple");
        // set1.add("Banana");
        // set1.add("Orange");

        // set2.add("Banana");
        // set2.add("Kiwi");
        // set2.add("Mango");

        // HashSet<String> union = new HashSet<>(set1);
        // union.addAll(set2);
        // System.out.println("Union : " + union);

        // HashSet<String> intersection = new HashSet<>(set1);
        // intersection.retainAll(set2);
        // System.out.println("Intersection : " + intersection);
//     }
// }

// 128

// import java.util.HashSet;

// class Student{
//     private int id;
//     private String name;

//     public Student( int id,String name){
//         this.id = id;
//         this.name = name;
//     }

//     public boolean equals(Object obj){
//         if (this == obj) return true;
//         if (obj == null || getClass() != obj.getClass()) return false;

//         Student student = (Student) obj;
//         return id == student.id && name.equals(student.name);
//     }

//     public int hashCode(){
//         return id + name.hashCode();
//     }

//     public String toString(){
//         return "Student{id =" + id + ", name = '" + name + "'}";
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         HashSet<Student> students = new HashSet<>();

//         students.add(new Student(1, "Alice"));
//         students.add(new Student(2, "Bob"));
//         students.add(new Student(1, "Alice"));
        
//         System.out.println("Students: " + students);

//         System.out.println("HashCode : " + students.hashCode());
//         System.out.println("toString : " + students.toString());
//     }
// }

// 129

// import java.util.TreeSet;
// import java.util.Iterator;

// public class Programs {

//     public static void main(String[] args) {
//     //     TreeSet<String> fruits = new TreeSet<>();

//     //     fruits.add("Apple");
//     //     fruits.add("Banana");
//     //     fruits.add("Orange");
//     //     fruits.add("Apple");

//     //     System.out.println("TreeSet: " + fruits);

//     //     System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

//     //     fruits.remove("Orange");
//     //     System.out.println("After removing 'orange': " + fruits);

//     //     System.out.println("Size of TreeSet: " + fruits.size());

//         TreeSet<Integer> numbers = new TreeSet<>();

//         numbers.add(10);
//         numbers.add(20);
//         numbers.add(30);

//         System.out.println("Iterating using for-each loop: ");
//         for (int number : numbers){
//             System.out.println(number);
//         }

//         System.out.println("Iterating using Iterator: ");
//         Iterator<Integer> iterator = numbers.iterator();

//         while (iterator.hasNext()) {
//             System.out.println(iterator.next());
//         }
//     }
// }

// 130

// import java.util.TreeSet;

// class Student implements Comparable<Student>{
//     private int id;
//     private String name;

//     public Student(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public int compareTo(Student other){
//         return Integer.compare(this.id,other.id);
//     }

//     public String toString(){
//         return "Student{id =" + id + ", name='" + name + "' }";
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         TreeSet<Student> students = new TreeSet<>();

//         students.add(new Student(3, "Charlie"));
//         students.add(new Student(1, "Alice"));
//         students.add(new Student(2, "Bob"));
//         students.add(new Student(1, "Alice"));

//         System.out.println("Students in TreeSet: ");
//         for (Student student : students){
//             System.out.println(student);
//         }
//     }
// }

// 131

// import java.util.HashSet;
// import java.util.TreeSet;

// class Student implements Comparable<Student>{
//     private int id;
//     private String name;

//     public Student(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public int compareTo(Student other){
//         return Integer.compare(this.id, other.id);
//     }

//     public String toString(){
//         return "Student{id=" + id + ", name='" + name + "'}";
//     }
// }

// public class Programs {

//     public static void main(String[] args) {
//         System.out.println("HashSet Example: ");
//         HashSet<Student> hashSet = new HashSet<>();

//         hashSet.add(new Student(3, "Charlie"));
//         hashSet.add(new Student(1, "Alice"));
//         hashSet.add(new Student(2, "Bob"));
//         hashSet.add(new Student(1, "Alice"));

//         System.out.println("HashSet: " + hashSet);

//         System.out.println("\nTreeSet example: ");
//         TreeSet<Student> treeSet = new TreeSet<>();

//         treeSet.add(new Student(3, "Charlie"));
//         treeSet.add(new Student(1, "Alice"));
//         treeSet.add(new Student(2, "Bob"));
//         treeSet.add(new Student(1, "Alice"));

//         System.out.println("TreeSet : " + treeSet);
//     }
// }

// 132

// import java.util.ArrayList;
// import java.util.List;

// public class Programs {

//     public static void main(String[] args) {
//         List<String> fruits = new ArrayList<>();

//         fruits.add("Apple");
//         fruits.add("Banana");
//         fruits.add("Orange");
//         fruits.add("Apple"); 

//         System.out.println("List of Fruits: " + fruits);

//         System.out.println("First Fruit: " + fruits.get(0));

//         fruits.remove("Banana");
//         System.out.println("After removing Banana: " + fruits);

//         System.out.println("Contains Orange? " + fruits.contains("Orange"));

//         System.out.println("Iterating over the List:");
//         for (String fruit : fruits) {
//             System.out.println(fruit);
//         }
//     }
// }

// 133

// class Address{
//         String city;
//         String state;

//         Address(String city, String state){
//                 this.city = city;
//                 this.state = state;
//         }
// }

// class Person implements Cloneable{
//         String name;
//         Address address;

//         Person(String name, Address address){
//                 this.address = address;
//                 this.name = name;
//         }

//         protected Object clone() throws CloneNotSupportedException{
//                 return super.clone();
//         }
// }

// public class Programs {

//         public static void main(String[] args) {
//                 Address address = new Address("New York", "NY");
//                 Person person1 = new Person("John", address);

//                 try{
//                         Person person2 = (Person) person1.clone();

//                 person2.address.city = "Los Angeles";

//                 System.out.println(person1.address.city);
//                 System.out.println(person2.address.city);
//                 } catch (CloneNotSupportedException e){
//                         e.getMessage();
//                 }
//         }
// }

// 134

// class Address{
//         String city;
//         String state;

//         Address(String city, String state){
//                 this.city = city;
//                 this.state = state;
//         }

//         protected Object clone() throws CloneNotSupportedException{
//                 return new Address(this.city, this.state);
//         }
// }

// class Person implements Cloneable{
//         String name;
//         Address address;

//         Person(String name, Address address){
//                 this.name = name;
//                 this.address = address;
//         }

//         protected Object clone() throws CloneNotSupportedException {
//                 Person cloned = (Person) super.clone();
//                 cloned.address = (Address) this.address.clone();

//                 return cloned;
//         }
// }

// public class Programs {

//         public static void main(String[] args) {
//                 Address address = new Address("New York", "NY");
//                 Person person1 = new Person("John", address);

//                 try{
//                         Person person2 = (Person) person1.clone();

//                         person2.address.city = "Los Angeles";

//                         System.out.println(person1.address.city);
//                         System.out.println(person2.address.city);
//                 } catch (CloneNotSupportedException e){
//                         e.getMessage();
//                 }
//         }
// }

// 135

// interface Vehicle{
//         void start();
//         void stop();
//         void displayinfo();
// }

// class Transport implements Vehicle{
//         String model;
//         int year;
//         double speed;

//         protected Transport(String model, int year, double speed){
//                 this.model = model;
//                 this.year = year;
//                 this.speed = speed;
//         }

//         public void start(){
//                 System.out.println("The vehicle has been started.");
//         };

//         public void stop(){
//                 System.out.println("The vehicle has been stoped.");
//         }

//         public void displayinfo(){
//                 System.out.println("Model : " + model + "\nYear : " + year + "\nTopSpeed : " + speed + " km/h");
//         }
// }

// class Car extends Transport implements Vehicle{
//         String model;
//         int year;
//         double speed;

//         public Car(String model,int year, int speed){
//                 super(model, year, speed);
//         }

//         public void start(){
//                 System.out.println("Car has been started.");
//         }

//         public void stop(){
//                 System.out.println("Car has been stoped.");
//         }

//         public void honk(){
//                 System.out.println("Car is honking!.");
//         }

//         public void honk(String honkString){
//                 System.out.println("Car is honking! : " + honkString);
//         }
// }

// class Bike extends Transport implements Vehicle{
//         String model;
//         int year;
//         double speed;

//         public Bike(String model, int year, int speed){
//                 super(null, year, speed);
//         }

//         public void start(){
//                 System.out.println("The bike has been started.");
//         }

//         public void stop(){
//                 System.out.println("The bike was stoped.");
//         }

//         public void honk(){
//                 System.out.println("Bike is ringing the bell.");
//         }
// }

// public class Programs {

//         public static void main(String[] args) {
//                 Car car = new Car("Sedan", 2020, 120);
//                 Bike bike = new Bike("Mountain Bike", 2018, 30);

//                 car.start();
//                 car.stop();
//                 car.displayinfo();
//                 car.honk("Beep Beep");

//                 bike.start();
//                 bike.stop();
//                 bike.displayinfo();
//                 bike.honk();
//         }
// }

//  136

// import java.util.HashSet;

// public class Programs {

//         public static void main(String[] args) {
//                 HashSet<String> fruits = new HashSet<>();

//                 fruits.add("Apple");
//                 fruits.add("Banana");
//                 fruits.add("Orange");
//                 fruits.add("Mango");
//                 fruits.add("Grapes");

//                 if (fruits.contains("Apple")){
//                         System.out.println("The hashset contains Apple");
//                 } else {
//                         System.out.println("The hashset doesnot contains Apple");
//                 }

//                 fruits.remove("Orange");

//                 System.out.println("HashSet fruits : " + fruits);
//         }
// }

// 137

// import java.util.TreeSet;

// public class Programs {

//         public static void main(String[] args) {
//                 TreeSet<Integer> numbers = new TreeSet<>();

//                 numbers.add(10);
//                 numbers.add(5);
//                 numbers.add(20);
//                 numbers.add(15);
//                 numbers.add(25);

//                 System.out.println("First number : " + numbers.first());
//                 System.out.println("Last number : " + numbers.last());

//                 numbers.remove(15);

//                 System.out.println(numbers);

//                 if(numbers.isEmpty()){
//                         System.out.println("The TreeSet is empty.");
//                 } else {
//                         System.out.println("The TreeSet is not empty.");
//                 }

//                 for(Integer number : numbers)        {
//                         System.out.println(number);
//                 }
//         }
// }

// 138

// public class Programs {

//         public static void main(String[] args) {
//                 int[] originalArray = {1,2,3,4,5};
//                 int[] shallowCopy = originalArray;

//                 originalArray[0] = 99;

//                 System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));
//                 System.out.println("Shallow copy : " + java.util.Arrays.toString(shallowCopy));
//         }
// }

// class Person{
//         String name;
//         int age;

//         Person(String name, int age){
//                 this.name = name;
//                 this.age = age;
//         }

//         public String toString(){
//                 return "Person{name='" + name + "', age=" + age +"}";
//         }
// }

// public class Programs {

//         public static void main(String[] args) {
//                 Person originalPerson = new Person("Alice",25);
//                 Person shallowCpy = originalPerson;

//                 originalPerson.name = "Bob";

//                 System.out.println("Original Person: " + originalPerson);
//                 System.out.println("Shallow Copy: " + shallowCpy);
//         }
// }

// 139

// import java.util.Arrays;

// public class Programs {

//         public static void main(String[] args) {
//                 int[] originalArray = {1,2,3,4,5};
//                 int[] deepcopy = Arrays.copyOf(originalArray, originalArray.length);

//                 originalArray[0] = 99;
//                 System.out.println("Original Array: " + Arrays.toString(originalArray));
//                 System.out.println("Deep copy: " + Arrays.toString(deepcopy));
//         }
// }

// class Address{
//         String city;
//         String state;

//         Address(String city, String state){
//                 this.city = city;
//                 this.state = state;
//         }

//         Address(Address address){
//                 this.city = address.city;
//                 this.state = address.state;
//         }
// }

// class Person{
//         String name;
//         Address address;

//         Person(String name, Address address){
//                 this.name = name;
//                 this.address = address;
//         }

//         Person(Person person){
//                 this.name = person.name;
//                 this.address = new Address(person.address);
//         }

//         public String toString(){
//                 return "Name: " + name + ", City: " + address.city + ", State: " + address.state;
//         }
// }

// public class Programs {
//         public static void main(String[] args){
//                 Address address = new Address("New York", "NY")
//                 Person person1 = new Person("John",address);
//                 Person person2 = new Person(person1);

//                 System.out.println("Original: " + person1);
//                 System.out.println("Depp copy: " + person2);

//                 person1.address.city = "Los Angeles";

//                 System.out.println("After Modification: ");
//                 System.out.println("Original: " + person1);
//                 System.out.println("Depp copy: " + person2);
//         }
// }

// 140

// import java.util.Scanner;

// public class Programs {

//         public static void main(String[] args) {
//                 Scanner Scanner = new Scanner(System.in);

//                 System.out.print("Enter the length of the Array: ");
//                 int len = Scanner.nextInt();

//                 int[][] numArray = new int[len][];
//                 int noOfColumns;

//                 for (int i = 0; i < len ; i ++){
//                         System.out.print("Enter the no of elements in " + i + " row:");
//                         noOfColumns = Scanner.nextInt();
//                         numArray[i] = new int[noOfColumns];

//                         for (int j = 0;j< noOfColumns; j++){
//                                 System.out.print("Enter the elements: ");
//                                 numArray[i][j] = Scanner.nextInt();
//                         }
//                 }

//                 for (int i = 0; i < numArray.length; i++){
//                         for (int j = 0; j < numArray[i].length; j++){
//                                 System.out.print(numArray[i][j] + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

// 141

// public class Programs {

//         public static void main(String[] args) {
//                 int[][] numArray = new int[3][];

//                 numArray[0] = new int[]{7,8,9};
//                 numArray[1] = new int[]{1,5,};
//                 numArray[2] = new int[]{6,3,9,4};

//                 for (int i = 0; i < numArray.length; i++){
//                         for (int j = 0; j < numArray[i].length; j++){
//                                 System.out.print(numArray[i][j] + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

// 142

// import java.util.HashMap;

// public class Programs{
//         public static int[] twoSum(int[] nums, int target) {
//                 HashMap<Integer, Integer> map = new HashMap<>();
//                 for (int i = 0; i < nums.length; i++){
//                         int complement = target - nums[i];
//                         if (map.containsKey(complement)){
//                                 return new int[] {map.get(complement), i};
//                         }
//                         map.put(nums[i],i);
//                 }
//                 throw new IllegalArgumentException("No two sum solution");
//         }

//         public static void main(String[] args) {
//                 int[] nums = {2,7,11,15};
//                 int target = 9;
//                 int[] result = twoSum(nums, target);
//                 System.out.println("Tndices: " + result[0] + ", " + result);
//         }
// }

// 143

// import java.util.HashMap;

// public class Programs {

//         public static void main(String[] args) {
//                 HashMap<String, Integer> map = new HashMap<>();

//                 map.put("Alice", 25);
//                 map.put("Bob", 30);
//                 map.put("Charlie", 35);

//                 System.out.println("HashMap after adding elements: " + map);

//                 System.out.println("Bod's age: " + map.get("Bob"));

//                 System.out.println("Contains key Alice: " + map.containsKey("Alice"));

//                 System.out.println("Contains value 35: " + map.containsKey(35));

//                 map.remove("Charlie");

//                 System.out.println("HashMap after removing Charlie: "  + map);

//                 System.out.println("Size of the HashMap: " + map.size());

//                 System.out.println("Is the HashMap empty? " + map.isEmpty());
//         }
// }

// 144

// interface rules{
//         void result();
// }

// class Addition implements rules{
//         int num1;
//         int num2;

//         Addition(int num1, int num2){
//                 this.num1 = num1;
//                 this.num2 = num2;
//         }

//         public void result(){
//                 System.out.println(num1 + num2);
//         }

//         protected void finalize() throws Throwable{
//                 try{
//                         System.out.println("Resources cleaned");
//                 } finally{
//                         super.finalize();
//                 }
//         }
// }

// class Subraction implements rules{
//         int num1;
//         int num2;

//         Subraction(int num1, int num2){
//                 this.num1 = num1;
//                 this.num2 = num2;
//         }

//         public void result(){
//                 System.out.println(num1 - num2);
//         }

//         protected void finalize() throws Throwable{
//                 try{
//                         System.out.println("Resources cleaned");
//                 } finally{
//                         super.finalize();
//                 }

//         }
// }


// class Multiplication implements rules{
//         int num1;
//         int num2;

//         Multiplication(int num1, int num2){
//                 this.num1 = num1;
//                 this.num2 = num2;
//         }

//         public void result(){
//                 System.out.println(num1 * num2);
//         }

//         protected void finalize() throws Throwable{
//                 try{
//                         System.out.println("Resources cleaned");
//                 } finally{
//                         super.finalize();
//                 }
//         }
// }

// class Division implements rules{
//         int num1;
//         int num2;

//         Division(int num1, int num2){
//                 this.num1 = num1;
//                 this.num2 = num2;
//         }

//         public void result(){
//                 try{
//                  int result = num1 / num2;
//                  System.out.println(result);
//                 } catch (ArithmeticException e){
//                  System.out.println("Error: Division by zero is not allowerd.");
//                 } 
//         }

//         protected void finalize() throws Throwable{
//                 try{
//                         System.out.println("Resources cleaned");
//                 } finally{
//                         super.finalize();
//                 }
//         }
// }

// public class Programs {

//         public static void main(String[] args) {
//                 int num1 = 10;
//                 int num2 = 0;

//                 Addition add = new Addition(num1, num2);
//                 Subraction subract = new Subraction(num1, num2);
//                 Multiplication multiply = new Multiplication(num1, num2);
//                 Division divide = new Division(num1, num2);


//                 add.result();
//                 subract.result();
//                 multiply.result();
//                 divide.result();

//                 add = null;
//                 subract = null;
//                 multiply = null;
//                 divide = null;

//                 System.gc();

//                 try {
//                         Thread.sleep(1000);
//                 } catch (InterruptedException e){
//                         e.printStackTrace();
//                 }
//         }
// }

// 145

import java.util.Scanner;

class ageBelowRequired extends Exception{
        public ageBelowRequired(){
                super("The age is not satisfied");
        }

        public ageBelowRequired(String message){
                super(message);
        }
}

public class Programs {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter your are: ");
                int age = scanner.nextInt();

                try{
                        if (age < 18){
                                throw new ageBelowRequired("Age must be 18 or above.");
                        }       
                } catch (ageBelowRequired e){
                        System.out.println(e.getMessage());
                } finally {
                        scanner.close();
                }
        }
}








