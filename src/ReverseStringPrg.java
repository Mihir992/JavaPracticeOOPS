public class ReverseStringPrg {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversedstr = new StringBuilder(str).reverse().toString();
        System.out.println(reversedstr);


        //Reverse string without string builder
        String str1 = "Hello World";
        String reversed = "";

        // Use a for loop to build the reversed string
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i); // Append each character from end to start
        }
        System.out.println("Reversed string: " + reversed);
    }
}