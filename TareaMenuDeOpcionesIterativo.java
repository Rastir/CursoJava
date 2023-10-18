import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class TareaMenuDeOpcionesIterativo {
    public static void main(String[] args) {

        int opcionIndice = 0;

        Map <String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

        if (opcion == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            opcionIndice = opciones.get(opcion.toString());

            //Como mencionó el profesor se va a ir agregando uno a uno los casos solicitandole al programa que haga:
            do {
                // Le pedimos que regrese a la opcion madre que es "OpcionIndice", para eso es el switch
                switch (opcionIndice){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente"
                        );
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,"Usuarios listados correctamente");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"Ha salido exitosamente");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
                        break;
                }
                //Una vez que agregamos los posibles escenarios le pedimos al programa que nos vuelva a mostrar el menu
                // en caso de querer agregar o seguir en el
                opcion = JOptionPane.showInputDialog(null,"Selecciones una opción", "Mantenedor de productos",
                        JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

                // Agregaos la condición, si no se selecciona algo que pida que se seleccione
                if (opcion == null){
                    JOptionPane.showMessageDialog(null,"Debe seleccionar una operación");
                    opcionIndice = 0;
                } else {
                    opcionIndice = opciones.get(opcion.toString());
                }

                /*Este loop funciona como se ha explicado en ocaciones pasadas,
                 el if funciona en cascada hasta que tope con un break, de lo contrario seguirá iterando en un loop
                 de la misma forma aqui abajo se muestra el while que explica qué: MIENTRAS NO APACHURRES LA OPCION 5 NO
                 SE VA A SALIR DEL LOOP.*/
            } while (opcionIndice != 5);

            /*Una vez que seleccione el 5 se ejecuta la última línea que es el mensaje de salida y con eso cierra el
            programa*/
            JOptionPane.showMessageDialog(null, "Ha salido exitosamente!");
        }
    }
}
