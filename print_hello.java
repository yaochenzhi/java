class print_hello {
    public void print_hello (){
        System.out.println("Hello world from print_hello method in print_hello.java.");
    }

    public static void static_print_hello (){
        System.out.println("Hello world from static_print_hello method in print_hello.java.");
    }
}

class print_hello_with_args {
    public print_hello_with_args(String[] args){
        String name = args[0];
        System.out.println("Hello " + name);
    }
}