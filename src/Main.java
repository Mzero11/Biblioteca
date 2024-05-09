public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Silva","NASA", "1250217865");


        agregarEjemplares(biblioteca.getCatalogo());


        Ejemplar ejemplarBuscado = biblioteca.buscarEjemplar("Libro1");
        if (ejemplarBuscado != null) {

            boolean prestamoExitoso = biblioteca.prestarEjemplar(ejemplarBuscado, new Usuario(1, "Matico", "NASA", "1200245"));
            if (prestamoExitoso) {
                System.out.println("Libro prestado");
            } else {
                System.out.println("No se presto, no existe en la reserva");
            }
        } else {
            System.out.println("El ejemplar buscado no está disponible en la biblioteca.");
        }
    }
    public static void agregarEjemplares(Catalogo catalogo) {

        Ejemplar libro1 = new Libro(1, "Libro1", "M.Silva", 2002, "1234567890");
        Ejemplar libro2 = new Libro(2, "Libro2", "M.Silva", 2003, "1102111507");

        catalogo.agregarEjemplar(libro1);
        catalogo.agregarEjemplar(libro2);
    }
}
