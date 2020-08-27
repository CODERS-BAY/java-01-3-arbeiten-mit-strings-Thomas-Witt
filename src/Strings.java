public class Strings {
    public static void main(String[] args) {
        String greeting = " Hello World! \n";
        String target = "World";
        String replacement = "Codersbay";

        System.out.print(greeting);
        System.out.printf("The previous message is %d characters long.\n",greeting.length());
        System.out.print(greeting.toUpperCase());
        System.out.print(greeting.toLowerCase());
        System.out.print(greeting.replace(target, replacement));
        System.out.println(greeting.strip());
        System.out.print(greeting.repeat(15));

    }
}
