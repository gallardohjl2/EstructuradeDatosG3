package mx.edu.uttt.arreglos;
import mx.edu.uttt.poo.Alumno;
import javax.swing.*;

public class AlumnoVector {
    public static void main(String[] args) {
        int tamanio = 0;
        tamanio = obtenerTamanio();
        Alumno alumnos [] = new Alumno[tamanio];

    }

    public static int obtenerTamanio (){
        return Integer.parseInt
                (JOptionPane.showInputDialog
                        ("Introduce el número de Alumos a registrar"));
    }

    public static String menu (){
        return "===== MENU PRINCIPAL =====\n" +
                "1) Llenar Arreglo\n" +
                "2) Imprimir Arreglo\n" +
                "3) Salir\n" +
                "Elegir Opción";
    }

    public static void operaciones ( Alumno [] alumnos){
        String opcion = "";
        boolean sentinel = true;

     do {
         opcion = JOptionPane.showInputDialog(menu());


         switch (opcion) {
             case "1":
                 //Llenar Arreglo
                 break;
             case "2":
                 //Imprimir Arreglo
                 break;
             case "3":
                 //Salir
                 JOptionPane.showMessageDialog(null, "Bye");
                 sentinel = false;
                 break;
             default:
                 JOptionPane.showMessageDialog
                         (null, "Opción no Valida");
         } //cierra switch
     }while(sentinel);

    }

    public static void llenarArreglo (Alumno [] alumnos){
        int i = 0;
        boolean activo = false;
        while(i<alumnos.length){
            Alumno alumno = new Alumno();
            alumno.setNombre(
                    JOptionPane.showInputDialog
                            ("Introduce el Nombre del Alumno [ " + i + " ]"));
            alumno.setEdad(Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("Introduce la edad del Alumno [ " + i + " ]")));
            alumno.setSexo(
                    JOptionPane.showInputDialog
                            ("Introduce la edad del Alumno [ " + i + " ]").charAt(0));
            activo = JOptionPane.showInputDialog
                     ("Introduce el estatus Alumno [ " + i + " ] Activo/Inactivo" )
                    .equalsIgnoreCase("Activo")?true:false;

            alumno.setActivo(activo);
            alumno.setPromedio(Double.parseDouble(
                    JOptionPane.showInputDialog("Introduce la edad del Alumno [ " + i + " ]")));

            alumnos[i] = alumno;
            i++;
        }
    }
}
