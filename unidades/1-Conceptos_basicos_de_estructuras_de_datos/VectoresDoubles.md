
```java
package mx.edu.uttt.arreglos;
import javax.swing.JOptionPane;
public class VectoresDoubles {


    public static void main(String [] args) {
        int tamanio = 0;
        tamanio = obtenerTamanio();
        double arr [] = new double[tamanio];
        llenarArreglo(arr);
        imprimir(arr);

    }

    public static int obtenerTamanio (){
        return Integer.parseInt(
                JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));
    }

    public static void llenarArreglo ( double [] vector ){
        for (int i = 0; i < vector.length ; i++) {
            vector[i] = Double.parseDouble(JOptionPane.showInputDialog
                    ("Introduce el valor de la posición [ " + i + "]"));
        }
    }

    public static void imprimir( double vector []){
        String salida = "";
        for(double valor : vector){
            salida+= "| " + valor + " |";
        }

        JOptionPane.showMessageDialog(null, salida);
    }
}
```