package boletin7;

public class Boletin7 {

    public static void main(String[] args) {
        Libro l1 = new Libro("A", "Alicia", 3, 2);
        l1.devolucion();
        l1.prestamo();

        System.out.println(l1.toString());
    }
    
}
