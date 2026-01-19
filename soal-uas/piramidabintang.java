public class piramidabintang {
    public static void main(String[] args) {
        int n = 5;
        int i, j;

        for (i = 0; i < n; i++) {
            
            for (j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
           
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}