package Modelo;

public class Conductores extends Persona{
    
    public Conductores(int dni, String nombres, String apellidos, String sexo, int cel) {
        super(dni, nombres, apellidos, sexo, cel);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }
    
}
