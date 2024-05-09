import java.util.List;
import java.util.ArrayList;

public class Catalogo {
    private List<Ejemplar> ejemplares;

    public Catalogo() {
        this.ejemplares = new ArrayList<>();
    }

    public Ejemplar buscarEjemplar(String titulo) {
        for (Ejemplar ejemplar : ejemplares) {
            if (ejemplar.getTitulo().equals(titulo)) {
                return ejemplar;
            }
        }
        return null;
    }

    public void agregarEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public boolean prestarEjemplar(Ejemplar ejemplar, Usuario usuario) {
        if (ejemplar.isDisponible()) {
            ejemplar.setDisponible(false);
            // Aquí iría la lógica para registrar el préstamo
            return true;
        }
        return false;
    }

    public boolean reservarEjemplar(Ejemplar ejemplar, Usuario usuario) {
        if (ejemplar.isDisponible()) {
            // Aquí iría la lógica para registrar la reserva
            return true;
        }
        return false;
    }

    public boolean devolverEjemplar(Ejemplar ejemplar) {
        ejemplar.setDisponible(true);
        // Aquí iría la lógica para registrar la devolución
        return true;
    }
}
