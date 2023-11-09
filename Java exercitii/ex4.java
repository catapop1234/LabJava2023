public class ex4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2,3,20};
        int length = numbers[3];
        char[] chars = new char[length];
        chars[numbers.length + 4] = 'y';
        System.out.println("Done!");
    }
}