public class Main {
    public static void main(String[] args) {

        Avenger avenger = new Avenger(123, "IronMan", new Mision("Derrotar a nisequien", 5), 10000);

        System.out.println(avenger.toString());

        System.out.println(avenger.CalcularFondoHeroes());
        System.out.println(avenger.calcularImpuesto());
    }
}
