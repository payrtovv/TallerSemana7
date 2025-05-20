public class Mision {
    private String descripcion;
    private int nivelPeligrosidad;

    public Mision(String descripcion, int nivelPeligrosidad) {
        this.descripcion = descripcion;
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }
}
