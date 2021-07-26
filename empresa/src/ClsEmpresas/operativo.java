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
public class operativo extends empleado {
    private String cargo;
    private int salario;
    private int NivelJerarquico;

    public operativo(String cargo, int salario, int NivelJerarquico, String nombre, String apellido, String ID, String correo) {
        super(nombre, apellido, ID, correo);
        this.cargo = cargo;
        this.salario = salario;
        this.NivelJerarquico = NivelJerarquico;
    }
    
    public void operarMaquinaria(){
        System.out.println(super.getNombre() + super.getApellido() + " esta operando");
    }
    
    public void almorzar(){
        System.out.println(super.getNombre() + super.getApellido() + " esta almorzando");
    }
    



    
    
    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the NivelJerarquico
     */
    public int getNivelJerarquico() {
        return NivelJerarquico;
    }

    /**
     * @param NivelJerarquico the NivelJerarquico to set
     */
    public void setNivelJerarquico(int NivelJerarquico) {
        this.NivelJerarquico = NivelJerarquico;
    }
}
