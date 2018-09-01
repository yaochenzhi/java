class call_print {
    public static void main(String[] args) {
        print_hello printer = new print_hello();
        printer.print_hello();

        print_hello.static_print_hello();


        String[] fullname2 = {"Jack", "Ma"};
        

        String[] fullname = new String[2];
        fullname = new String[] {"Jack", "Ma"};


        String fullname3[] = new String[2];
        fullname3[0] = "Jack";
        fullname3[1] = "Ma";

        print_hello_with_args printer_with_args = new print_hello_with_args(fullname);
    }
}