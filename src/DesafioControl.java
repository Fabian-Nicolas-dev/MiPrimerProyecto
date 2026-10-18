import java.beans.JavaBean;

public class DesafioControl {
    public static void main(String[] args) {

        boolean sabeJava = true;
        int nivelIngles = 4;

        if (sabeJava && nivelIngles >= 3) {
            System.out.println("Bienvenido a la empresa. Laburás desde casa.");
        } else {
            System.out.println("No cumple con perfil requerido");
        }
    }
}
