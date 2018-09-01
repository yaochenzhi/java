import java.util.Scanner;

class condition {
    public static void main (String[] args){
        for (int i=0; i<10; i++){
            System.out.print(i + " ");
            if (i>6) {
                System.out.println("i is greater than 6, breaking ...");
                break;
            }else
                System.out.println("ok ");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());
        if (age > 60){
            System.out.println("You are old.");
        }else{
            // take a whole look of the rest inside 'else' block
            System.out.println("You are not that old.");

            // no whole look. just divide with limits with 'else if'
            if (age > 50){
                System.out.println("You are in your 50s.");
            }else if (age > 40){
                System.out.println("You are young.");
            }else{
                System.out.println("You are very yong. Move forward without any hesitation with your passion.");
            }
        }

        System.out.println("Chose one from 'a', 'b', 'c', 'd': ");
        String choice = scanner.nextLine();
        switch (choice) {
            // String is double quotated
            // things go wired without break statement inside case
            case "a":
                System.out.println("Your choice is a");
                break;
            case "b":
                System.out.println("Your choice is b");
                break;
            case "c":
                System.out.println("Your choice is c");
                break;
            case "d":
                System.out.println("Your choice is d");
                break;
            default:
                System.out.println("This is not a valid choice.");
        }

        if ( 1 == 1 && 2 == 2 )
            System.out.println("Both conditions are true.");
        if (1 == 1 || 1 == 3)
            System.out.println("One of the conditions is true.");
        if (1 == 2 || 2 == 3)
            System.out.println("This will never be printed.");

        System.out.println("Well done!");
    }
}