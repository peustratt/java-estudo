import java.util.Arrays;

public class exec01 {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[a.length];
    
        for (int i=0; i < a.length; i++) {
            b[i] = a[i] * 3;
        }

        System.out.println(Arrays.toString(a) + '\n' + Arrays.toString(b));
    }
}