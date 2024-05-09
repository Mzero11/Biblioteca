public class Biblioteca {
    private String nombre;
    private String direccion;
    private String telefono;
    private   Catalogo catalogo;

    public Biblioteca(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.catalogo = new Catalogo();
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }


    public Ejemplar buscarEjemplar(String titulo) {
        return catalogo.buscarEjemplar(titulo);
    }

    public boolean prestarEjemplar(Ejemplar ejemplar, Usuario usuario) {
        return catalogo.prestarEjemplar(ejemplar, usuario);
    }

    public boolean reservarEjemplar(Ejemplar ejemplar, Usuario usuario) {
        return catalogo.reservarEjemplar(ejemplar, usuario);
    }

    public boolean devolverEjemplar(Ejemplar ejemplar) {
        return catalogo.devolverEjemplar(ejemplar);
    }
}
