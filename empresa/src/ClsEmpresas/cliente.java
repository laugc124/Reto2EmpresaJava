/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsEmpresas;

/**
 *
 * @author agos1
 */
public class cliente {
    private String nombre;
    private String apellido;
    private String ID;
    private String correo;
    private String direccion;
    private String telefono;

    public cliente(String nombre, String apellido, String ID, String correo, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    
    
    public void comprando(){
        System.out.println("el cliente" + this.nombre+" esta comprando");
    }
    public void cotizando(){
        System.out.println("el cliente" + this.nombre+" esta cotizando");
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
