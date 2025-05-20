public class Avenger {
    private int ID;
    private String nombre;
    private Mision misionAsignada;
    private double pagoMensual;
    private double aporte;
    private double impuesto;

    public Avenger(int ID, String nombre, Mision misionAsignada, double pagoMensual) {
        this.ID = ID;
        this.nombre = nombre;
        this.misionAsignada = misionAsignada;
        this.pagoMensual = pagoMensual;
    }

    public double CalcularFondoHeroes() {
        return pagoMensual * 0.08;
    }

    public double calcularImpuesto() {
        double pagoAnual = pagoMensual * 12;
        if (pagoAnual <= 50000) {
            return 0;
        } else if (pagoAnual <= 100000) {
            return pagoAnual * 0.10;
        } else if (pagoAnual <= 200000) {
            return pagoAnual * 0.20;
        } else {
            return pagoAnual * 0.30;
        }
    }


    @Override
    public String toString() {
        return
                "PagoMensual= " + pagoMensual+ "\n" +
                " MisionAsignada= " + misionAsignada.getDescripcion() + "\n" +
                " Peligrosidad= " + misionAsignada.getNivelPeligrosidad() + "\n" +
                " Nombre=" + nombre + "\n" +
                " ID=" + ID;
    }
}
