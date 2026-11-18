public class Preceptor extends Persona {
    private String cursoAsignado;

    public Preceptor(String nombre, int edad, String cursoAsignado) {
        super(nombre, edad);
        this.cursoAsignado = cursoAsignado;
    }

    public String getCursoAsignado() { return cursoAsignado; }

    public void mostrarInformacion() {
        System.out.println("PRECEPTOR");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Curso asignado: " + cursoAsignado);
    }
}
