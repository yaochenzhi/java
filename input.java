import java.util.Scanner;


class input{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);

        input.nextLine();

        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is " + name);

        System.out.println();
        System.out.println("Hello world!");
        System.out.println();

        System.out.println("Please enter your age: ");
        try{
            int age2 = Integer.parseInt(input.nextLine());
            // used inside block
            System.out.println("Your age is " + age2);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }

        System.out.println("Please enter your name: ");
        String name2 = input.nextLine();
        System.out.println("Your name is " + name2);
    }
}