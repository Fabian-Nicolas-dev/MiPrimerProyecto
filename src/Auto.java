    // La palabra "extends Vehiculo" significa que Auto hereda todo lo del Padre
    public class Auto extends Vehiculo {

        // Atributo exclusivo de los autos (por ejemplo, cantidad de puertas)
        private int cantidadPuertas;

        // Constructor del Auto
        public Auto(String marca, String modelo, int anio, int cantidadPuertas) {
            super(marca, modelo, anio); // "super" llama al constructor de Vehiculo (el padre)
            this.cantidadPuertas = cantidadPuertas;
        }

        // Getter exclusivo del auto
        public int getCantidadPuertas() {
            return cantidadPuertas;
        }

}