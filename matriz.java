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
    
    for (int i = 1; i <= 4; i++) {//fila

        //i=fila3
        for (int j = 1; j <= 4; j++) {//columna
            //j=columnas
            //i=3,j=1
            //j=1,j=2,j=3

            //System.out.println(a[i][j]+"-"+a[i][j+1]);
            //j++;
        }
        //i=2+1=3
    }
    /*
    matrices normales
            0(x,y)    1     2(x,y)
    i=0->// j=1,    j=2,    j=3
    i=1->// j=1,    j=2,    j=3
            (x,y)         
    i=2->// j=1,    j=2,    j=3
    */
}
}