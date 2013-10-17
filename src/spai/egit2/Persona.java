package spai.egit2;

public class Persona {
    private String nombre;

    private String apellido;

    private String format(String cadena) {
        cadena = cadena.trim();
        return cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();
    }
    
    private String dni;
    
	public static final String[] LETRA_DNI = { "T", "R", "W", "A", "G", "M",
		"Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H",
		"L", "C", "K", "E" };

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
    
    public String getDni() {
		return this.dni;
	}

	private void setDni(String dni) {
		if(Persona.validaDni(dni)){
			this.dni = dni;
		}
		else{
			throw new IllegalArgumentException("Introduce un DNI válido con 8 numeros y una letra");
		}
	}
	
	public static boolean validaDni(String dni) {
		String patron = "\\d{6,8}[a-zA-Z]";
		if (!dni.matches(patron)) {
			return false;
		}
		int numDni = Integer.parseInt(dni.substring(0, dni.length() - 1));
		return (LETRA_DNI[(numDni % 23)].equals(dni.substring(dni.length() - 1, dni.length())));
	}

    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    public String inicial() {
        return this.nombre.substring(0, 1) + ".";
    }
    
    public String iniciales(){
    	return this.getNombre().substring(0, 1) + this.getApellido().substring(0, 1) + ".";
    }
}
