package practica3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class reintegro_ingreso {

    public static void main(String[] args) {

        ArrayList<Cuenta> lista_cuentas = new ArrayList<Cuenta>();//Declaramos el tamaño de la arraylist que lahe puesto en 9 valores
        lista_cuentas.add(new Cuenta("Caixa", "Alvaro", 587.96, 1542.45));  
        lista_cuentas.add(new Cuenta("Caixa", "Rafa", 587.96, 654.87));
        System.out.println("Bienvenido al cajero ingresa la opción mas deseada");
        System.out.println("Cajero IES FRANCESC BORJA MOLL");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Sacar dinero");
        System.out.println("3. Transferir dinero");
        System.out.println("4. Salir");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Elige la opcion"));
        switch (opcion) {
            case 1:
                int ingresar = Integer.parseInt(JOptionPane.showInputDialog("¿Que cantidad quieres ingresar?"));
                JOptionPane.showMessageDialog(null, "Tu dinero en tu cuneta es de:" + " " + (lista_cuentas.get(1)) + ingresar);
                break;
            case 2:
                int sacar = Integer.parseInt(JOptionPane.showInputDialog("¿Que cantidad quieres sacar?"));
                if (Cuenta.lista_cuentas.get(2) > sacar) {
                    JOptionPane.showMessageDialog(null, "Tu dinero en tu cuneta es de:" + " " + (lista_cuentas.get(2) + "Asi que no puedes sacar dinero"));
                } else {
                    JOptionPane.showMessageDialog(null, "En tu cuneta ahora tienes" + " " + (lista_cuentas.get(2)) + sacar);
                }
            case 3:
                String usuario = JOptionPane.showInputDialog("Introduce el usuario para ingresar el dinero a otra persona");
                transferir_dinero();

        }

    }
}