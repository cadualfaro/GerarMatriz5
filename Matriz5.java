/*
Matriz 5

0	2	4	6	8
1	3	5	7	9
2	4	6	8	10
3	5	7	9	11
 */
package matriz5;
import java.util.Arrays;
public class Matriz5 {

    public static void main(String[] args) {
        System.out.println("Matriz");
            
    int matriz [][] = new int [4][5];
    
        for (int i=0;i<matriz.length;i++)
            for (int j=0;j<matriz[i].length; j++){
                matriz [i][j] = j+j+i;
            }
        for (int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
}
