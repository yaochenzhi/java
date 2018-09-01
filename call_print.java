class call_print {
    public static void main(String[] args) {
        print_hello printer = new print_hello();
        printer.print_hello();

        print_hello.static_print_hello();
    }
}