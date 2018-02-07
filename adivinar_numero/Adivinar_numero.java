package adivinar_numero;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Adivinar_numero {

    public static void main(String[] args) {
        String a;String b;String c;String d;String e;String f;
        
        List<Integer> Numeros = new ArrayList<Integer>();
        int size = Numeros.size();
        System.out.println("1 11 21 31 41 51");
        System.out.println("3 13 23 33 43 53");
        System.out.println("5 15 25 35 45 55");
        System.out.println("7 17 27 37 47 57");
        System.out.println("9 19 29 39 49 59");
        a = JOptionPane.showInputDialog("¿Esta tu numero el que has pensado aqui?");
        if (a == "si") {
            Numeros.add(1);
        }

        System.out.println("-------------------");
        System.out.println("2 3 6 7 10");
        System.out.println("11 14 15 18 19");
        System.out.println("22 23 26 27 30");
        System.out.println("31 34 35 38 39");
        System.out.println("42 43 46 47 50");
        System.out.println("51 54 55 58 59");
        System.out.println("-------------------");
        b = JOptionPane.showInputDialog("¿Esta tu numero el que has pensado aqui?");
        if (b == "si") {
            Numeros.add(2);
        }

        System.out.println("-------------------");
        System.out.println("4 13 22 31 44 53");
        System.out.println("5 14 23 36 45 54");
        System.out.println("6 15 28 37 46 55");
        System.out.println("7 20 29 38 47 60");
        System.out.println("12 21 30 39 52 *");
        System.out.println("-------------------");
        c = JOptionPane.showInputDialog("¿Esta tu numero el que has pensado aqui?");
        if (c == "si") {
            Numeros.add(4);
        }

        System.out.println("-------------------");
        System.out.println("8 13 26 31 44 57");
        System.out.println("9 14 27 40 45 58");
        System.out.println("10 15 28 41 46 59");
        System.out.println("11 24 29 42 47 60");
        System.out.println("12 25 30 43 56 *");
        System.out.println("-------------------");
        d = JOptionPane.showInputDialog("¿Esta tu numero el que has pensado aqui?");
        if (d == "si") {
            Numeros.add(8);
        }

        System.out.println("-------------------");
        System.out.println("16 21 26 31 52 57");
        System.out.println("17 22 27 48 53 58");
        System.out.println("18 23 28 49 54 59");
        System.out.println("19 24 29 50 55 60");
        System.out.println("20 25 30 51 56 *");
        System.out.println("-------------------");
        e = JOptionPane.showInputDialog("¿Esta tu numero el que has pensado aqui?");
        if (e == "si") {
            Numeros.add(16);
        }

        System.out.println("-------------------");
        System.out.println("32 37 42 47 52 57");
        System.out.println("33 38 43 48 53 58");
        System.out.println("34 39 44 49 54 59");
        System.out.println("35 40 45 50 55 60");
        System.out.println("36 41 46 51 56 *");
        System.out.println("-------------------");
        f = JOptionPane.showInputDialog("¿Esta tu numero el que has pensado aqui?");
        if (f == "si") {
            Numeros.add(32);
        }
        
        for (int i=0; i<Numeros.size();i++){
            System.out.println("Estos osn los numeros" +Numeros.get(i));
        }
        
        // https://es.stackoverflow.com/questions/50088/es-posible-a%C3%B1adir-un-valor-a-un-array
    }

}
