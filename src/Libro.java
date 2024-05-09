import java.util.Date;

class Libro extends Ejemplar {
    private String numeroLibro;

    public Libro(int id, String titulo, String autor, int anioPublicacion, String numeroLibro) {
        super(id, titulo, autor, anioPublicacion);
        this.numeroLibro = numeroLibro;
    }
}

class Revista extends Ejemplar {
    private int numero;
    private String numeroLibro;

    public Revista(int id, String titulo, String autor, int anioPublicacion, int numero, String numeroLibro) {
        super(id, titulo, autor, anioPublicacion);
        this.numero = numero;
        this.numeroLibro = numeroLibro;
    }
}

class Periodico extends Ejemplar {
    private Date fechaPublicacion;
    private String numeroLibro;

    public Periodico(int id, String titulo, String autor, int anioPublicacion, Date fechaPublicacion, String numeroLibro) {
        super(id, titulo, autor, anioPublicacion);
        this.fechaPublicacion = fechaPublicacion;
        this.numeroLibro = numeroLibro;
    }
}

