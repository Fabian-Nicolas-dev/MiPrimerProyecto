import java.beans.JavaBean;

public class DesafioControl {
    public static void main(String[] args) {

        boolean tieneComputadora = true;
        int experienciaMeses = 3;

        if (tieneComputadora && experienciaMeses > 5) {
            System.out.println("¡CONTRATADO PARA HOME OFFICE!");
        } else {
            System.out.println("No cumple los requisitos mínimos.");
        }

    }
}
