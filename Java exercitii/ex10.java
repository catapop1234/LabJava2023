public class ex10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            System.out.println(arr[9001]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("A fost o eroare");
        }
    }
}