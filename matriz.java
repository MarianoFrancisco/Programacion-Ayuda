/**
 * matriz
 */
public class matriz {

    
public static void main(String[] args) {
    String [][] a = new String[6][6];//i fila, j columna
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            a[i][j]= String.valueOf(i);
            System.out.print(a[i][j]);
        }
        System.out.println("");
    }
    /*(x,y)
    (0,0)(0,1)(0,2)
    (1,0)(posicionJugador(x,y))(1,2)
    (2,0)(2,1)(2,2)
    */
    System.out.println("");
    for (int i = 1; i < 3; i++) {//fila
        for (int j = 1; j < 2; j++) {//columna
            a[i][j]="#";
            a[i][j+1]="*";
            j++;
        }
    }
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[i][j]);
        }
        System.out.println("");
    }
    for (int i = 1; i < 3; i++) {//fila
        for (int j = 1; j < 2; j++) {//columna
            System.out.println(a[i][j]+"-"+a[i][j+1]);
            j++;
        }
    }
}
}