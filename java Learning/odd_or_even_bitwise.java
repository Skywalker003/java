public class odd_or_even_bitwise {
    public static void main(String[] args) {
        int number = 5; // Change this number to test other values

        // Check if the number is even or odd using the bitwise AND operator
        if ((number & 1) == 0) {
            // If (number & 1) gives 0, it's even
            System.out.println(number + " is Even.");
        } else {
            // If (number & 1) gives 1, it's odd
            System.out.println(number + " is Odd.");
        }
    }
}
