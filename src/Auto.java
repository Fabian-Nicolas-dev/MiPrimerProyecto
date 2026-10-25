public class Auto {

    // Atributos privados (la caja fuerte)
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Auto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // GETTERS (Para leer los datos de forma segura)
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    // SETTERS (Para modificar el año con validación)
    public void setAnio(int nuevoAnio) {
        if (nuevoAnio > 1886) {
            this.anio = nuevoAnio;
        } else {
            System.out.println("Error: ¡Año inválido!");
        }
    }
}