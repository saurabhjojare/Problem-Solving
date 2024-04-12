package Basics;

public class AsciiValue {
    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        // You can also cast char to int
        char castAscii = (char) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}