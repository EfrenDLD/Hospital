public class Paciente{
    private String nombre;
    private String apellido;
    private String apellido2;
    private String edad;
    private String telefono;
    private String correo;

    private String nombreMedico;
    private String horaCita;
    private String fecha;
    private String motivo;

    public Paciente(String nombre, String apellido, String apellido2, String edad, String telefono, String correo,String motivo, String nombreMedico, String horaCita, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.nombreMedico = nombreMedico;
        this.horaCita = horaCita;
        this.fecha = fecha;
        this.motivo=motivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public String getFecha() {
        return fecha;
    }
    public String getMotivo() {
        return motivo;
    }

}
