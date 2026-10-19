public class Auto {
    String marca;
    String modelo;
    int anio;

    // ¡EL CONSTRUCTOR! La línea de montaje automática
    public Auto(String marcaFabrica, String modeloFabrica, int anioFabrica) {
        marca = marcaFabrica;
        modelo = modeloFabrica;
        anio = anioFabrica;
    }

    public void tocarBocina() {
        System.out.println("¡BEEP BEEP! El " + marca + " está tocando bocina.");
    }
}