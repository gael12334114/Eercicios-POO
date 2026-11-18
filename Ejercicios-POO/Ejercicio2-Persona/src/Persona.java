public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        if (edad >= 0) {
            this.edad = edad;
        } else {
            this.edad = 0;
            System.out.println("Error: la edad no puede ser negativa. Se asignó 0.");
        }
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: la edad no puede ser negativa.");
        }
    }
}
