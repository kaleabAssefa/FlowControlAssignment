//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int reverseNumber = 10;
        int primeNumber = 29;
        int n = 50;
        int armstrongNumber = 153;
        int perfectNumber = 28;
        int strongNumber = 145;


        //1. Java program to print all natural numbers from 1 to n using for loop.

        for(int i =1;i<=n;i++){
            System.out.println(i);
        }

        //2. Java program to print all even numbers between 1 to 100 using for loop.
        for(int i =1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

       //3. Java program to print all odd number between 1 to 100 using for loop.
        for(int i =1;i<=100;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

        //4. Java program to print sum of all even numbers between 1 to n using
        //for loop.
        int sum =0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum +=i;
            }
        }
        System.out.println(sum);


       //5. Java program to print sum of all odd numbers between 1 to n using for
        //loop.
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum +=i;
            }
        }
        System.out.println(sum);

        //6. Java program to print multiplication of any number using for loop.

        for(int i=1; i<=10;i++){
            System.out.println(number+" x "+ i + " = "+(number*i));
        }

        int count = 0;

        for (int temp = number; temp > 0; temp = temp / 10) {
            count++;
        }

        System.out.println("7. Number of digits in " + number + " = " + count);

        // 8. Sum of digits
        int sums = 0;

        for (int temp = number; temp > 0; temp = temp / 10) {
            sums = sums + (temp % 10);
        }

        System.out.println("8. Sum of digits of " + number + " = " + sums);

        // 9. Print natural numbers in reverse
        System.out.println("9. Natural numbers in reverse:");

        for (int i = reverseNumber; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // 10. Check Prime Number
        boolean isPrime = true;

        if (primeNumber <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < primeNumber; i++) {
                if (primeNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("10. " + primeNumber + " is a Prime Number.");
        } else {
            System.out.println("10. " + primeNumber + " is NOT a Prime Number.");
        }

        // 11. Print Prime Numbers from 1 to n
        System.out.println("11. Prime numbers from 1 to " + n + ":");

        for (int i = 2; i <= n; i++) {

            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // 12. Sum of Prime Numbers from 1 to n
        int primeSum = 0;

        for (int i = 2; i <= n; i++) {

            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                primeSum = primeSum + i;
            }
        }

        System.out.println("12. Sum of prime numbers from 1 to " + n + " = " + primeSum);

        int original = armstrongNumber;
        int digits = 0;
        int sumN= 0;

        for (int temp = armstrongNumber; temp > 0; temp = temp / 10) {
            digits++;
        }

        for (int temp = armstrongNumber; temp > 0; temp = temp / 10) {

            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sumN = sumN + power;
        }

        if (sum == original) {
            System.out.println("13. " + original + " is an Armstrong Number.");
        } else {
            System.out.println("13. " + original + " is NOT an Armstrong Number.");
        }

        // 14. Print Armstrong Numbers from 1 to n
        System.out.println("\n14. Armstrong Numbers from 1 to " + n + ":");

        for (int num = 1; num <= n; num++) {

            int counter = 0;
            int total = 0;

            for (int temp = num; temp > 0; temp = temp / 10) {
                counter++;
            }

            for (int temp = num; temp > 0; temp = temp / 10) {

                int digit = temp % 10;
                int power = 1;

                for (int i = 1; i <= counter; i++) {
                    power = power * digit;
                }

                total = total + power;
            }

            if (total == num) {
                System.out.print(num + " ");
            }
        }

        // 15. Check Perfect Number
        int perfectSum = 0;

        for (int i = 1; i < perfectNumber; i++) {
            if (perfectNumber % i == 0) {
                perfectSum += i;
            }
        }

        if (perfectSum == perfectNumber) {
            System.out.println("\n\n15. " + perfectNumber + " is a Perfect Number.");
        } else {
            System.out.println("\n\n15. " + perfectNumber + " is NOT a Perfect Number.");
        }

        // 16. Print Perfect Numbers from 1 to n
        System.out.println("\n16. Perfect Numbers from 1 to " + n + ":");

        for (int num = 1; num <= n; num++) {

            int total = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    total += i;
                }
            }

            if (total == num) {
                System.out.print(num + " ");
            }
        }


        // 17. Check Strong Number
        int originalStrong = strongNumber;
        int strongSum = 0;

        //7. Java program to count the digits of a given number using for loop.
        int count=0;
        int num = 25;
        for (; num != 0; num = num / 10) {
            count++;
        }
        System.out.println("Number of digits: " + count);

        for (int temp = strongNumber; temp > 0; temp = temp / 10) {

            int digit = temp % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            strongSum += factorial;
        }

        if (strongSum == originalStrong) {
            System.out.println("\n\n17. " + originalStrong + " is a Strong Number.");
        } else {
            System.out.println("\n\n17. " + originalStrong + " is NOT a Strong Number.");
        }

        // 18. Print Strong Numbers from 1 to n
        System.out.println("\n18. Strong Numbers from 1 to " + n + ":");

        for (int num = 1; num <= n; num++) {

            int total = 0;

            for (int temp = num; temp > 0; temp = temp / 10) {

                int digit = temp % 10;
                int factorial = 1;

                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }

                total += factorial;
            }

            if (total == num) {
                System.out.print(num + " ");
            }
        }

        // 19. Swap First and Last Digit
        int numbers = 12345;
        int lastDigit = numbers % 10;
        int firstDigit = numbers;

        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        int digitsCount = 0;

        for (int temp = numbers; temp > 0; temp /= 10) {
            digitsCount++;
        }

        int power = 1;

        for (int i = 1; i < digitsCount; i++) {
            power *= 10;
        }

        int middle = (numbers % power) / 10;

        int swapped = lastDigit * power + middle * 10 + firstDigit;

        System.out.println("\n\n19. Original Number = " + numbers);
        System.out.println("    Swapped Number = " + swapped);


        // 20. Swap Using Third Variable
        int a = 10;
        int b = 20;

        System.out.println("\n20. Before Swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("    After Swap: a = " + a + ", b = " + b);

        // 21. Swap Without Third Variable
        int x = 30;
        int y = 50;

        System.out.println("\n21. Before Swap: x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("    After Swap: x = " + x + ", y = " + y);

        int number1 = 36;
        int num1 = 24;
        int num2 = 36;
        // 30. Print all alphabets from a to z

        System.out.println("30. Alphabets from a to z:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n");


        // 31. Print all uppercase alphabets

        System.out.println("31. Uppercase Alphabets:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n");


        // 32. Print all lowercase alphabets

        System.out.println("32. Lowercase Alphabets:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println("\n");


        // 33. Print all factors of a number

        System.out.println("33. Factors of " + number1 + ":");

        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");


        // 34. Find HCF (GCD)

        int hcf = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }

        System.out.println("34. HCF of " + num1 + " and " + num2 + " = " + hcf);


        // 35. Find LCM

        int max = (num1 > num2) ? num1 : num2;
        int lcm = max;

        for (; ; lcm++) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break;
            }
        }

        System.out.println("35. LCM of " + num1 + " and " + num2 + " = " + lcm);

        // 36. Print Prime Factors
        //int primeNumber = 84;

        System.out.println("36. Prime factors of " + primeNumber + ":");

        for (int i = 2; i <= primeNumber; i++) {

            while (primeNumber % i == 0) {
                System.out.print(i + " ");
                primeNumber = primeNumber / i;
            }
        }
    }
}
