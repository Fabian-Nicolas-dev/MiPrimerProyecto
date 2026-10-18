import java.beans.JavaBean;

public class DesafioControl {
    public static void main(String[] args) {

        int velocidad = 140;

        if (velocidad > 130) {
            System.out.println("Velocidad Permitida. Buen viaje!");
        } else {
            System.out.println("¡MULTA POR EXCESO DE VELOCIDAD!");
        }

    }
}
