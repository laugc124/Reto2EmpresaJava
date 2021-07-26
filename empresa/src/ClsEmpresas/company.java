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
public class company {
    private String RazonSocial;
    private String NIT;
    private String direccion;
    private empleado empleado;
    private cliente cliente;
    

    public company(String RazonSocial, String NIT, String direccion, empleado empleado) {
        this.RazonSocial = RazonSocial;
        this.NIT = NIT;
        this.direccion = direccion;
        this.empleado = empleado;
    }

    
    
    /**
     * @return the RazonSocial
     */
    public String getRazonSocial() {
        return RazonSocial;
    }

    /**
     * @param RazonSocial the RazonSocial to set
     */
    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    /**
     * @return the NIT
     */
    public String getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(String NIT) {
        this.NIT = NIT;
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
     * @return the empleado
     */
    public empleado getEmpleado() {
        return empleado;
    }

    /**
     * @param empleado the empleado to set
     */
    public void setEmpleado(empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * @return the cliente
     */
    public cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }
}
