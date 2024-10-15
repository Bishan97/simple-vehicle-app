public class Main {
    public static void main(String[] args) {

        Suv Prado = new Suv("prado", false);
        Prado.move(40,0);
        Prado.accelerate(20);
        Prado.accelerate(-60);

        System.out.println("Current Gear  : "  +Prado.getCurrentGear());
        System.out.println("Current Speed : " +Prado.getCurrentSpeed());
    }
}