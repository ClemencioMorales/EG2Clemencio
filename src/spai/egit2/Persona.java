package spai.egit2;

public class Persona {
    private String nombre;

    private String apellido;

    private String format(String cadena) {
        cadena = cadena.trim();
        return cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();
    }

    public Persona(String nombre, String apellido) {
        this.setNombre(nombre);
        this.setApellido(apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = this.format(nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = this.format(apellido);
    }

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public String inicial() {
        return this.nombre.substring(0, 1) + ".";
    }
    
    public boolean validaDni(String dni){
    	return false;
    }
    
    public String iniciales(){
    	return null;
    }
}
