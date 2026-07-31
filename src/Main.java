//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1. Java program to print all natural numbers from 1 to n using for loop.
        int n =10;
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
        int number = 12;
        for(int i=1; i<=10;i++){
            System.out.println(number+" x "+ i + " = "+(number*i));
        }




    }
}