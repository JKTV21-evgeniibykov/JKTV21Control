
import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class JKTV21Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Before random array:");
        Random random = new Random();
        int[][] arr = new int[5][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[7];
        arr[3] = new int[8];
        arr[4] = new int[9];
        for (int[] row: arr) {
            for (int i=0; i<row.length; i++) {
                row[i] = random.nextInt(51)+50;
            }
            System.out.println(Arrays.toString(row));
        }
        
        System.out.println("Array after sort:");
        int a,b;
        for (int x=0; x<(arr[0].length+arr[0].length+arr[1].length+arr[2].length+arr[2].length+arr[4].length); x++) {
            for (int y=0; y<arr.length-1; y++) {
                b = arr[y].length-1;
                if (arr[y][b] > arr[y+1][0]) {
                    a = arr[y][b];
                    arr[y][b] = arr[y+1][0];
                    arr[y+1][0] = a;
                }
                for (int[] row: arr) {
                    for (int j=0; j<row.length; j++) {
                        for (int i=0; i<row.length-1; i++) {
                            if (row[i] > row[i+1]) {
                                a = row[i];
                                row[i] = row[i+1];
                                row[i+1] = a;
                            }
                        }
                    }
                }
            }
        }
        for (int[] row: arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    
}
