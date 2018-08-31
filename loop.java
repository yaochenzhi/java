class loop {
    public static void main (String[] args) {
        int a;
        a = 0;

        while (a < 3) {
            System.out.println("Hello world from 'while do' loop: " + a);
            a++;
        }


        int b = 0;
        do {
            System.out.println("Hello world from 'do while' loop: " + b);
            b++;
        }while(b < 5);


        for (int c=0; c<7; c++){
            System.out.println("Hello world from 'for' loop: " + c);
        }
    }
}