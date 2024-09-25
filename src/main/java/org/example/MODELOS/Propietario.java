package org.example.MODELOS;

public class Propietario {

    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String numeroIdentificacion;
    private int edad;
    private boolean esPropietarioActivo;

    public Propietario() {
    }

    public Propietario(String nombre, String direccion, String telefono, String email, String numeroIdentificacion, int edad, boolean esPropietarioActivo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        this.esPropietarioActivo = esPropietarioActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isEsPropietarioActivo() {
        return esPropietarioActivo;
    }

    public void setEsPropietarioActivo(boolean esPropietarioActivo) {
        this.esPropietarioActivo = esPropietarioActivo;
    }
}
