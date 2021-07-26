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
public class administrativo extends empleado {
    private String cargo;
    private int salario;
    private int NivelJerarquico;
    private int PersonalCargo;

    public administrativo(String cargo, int salario, int NivelJerarquico, int PersonalCargo, String nombre, String apellido, String ID, String correo) {
        super(nombre, apellido, ID, correo);
        this.cargo = cargo;
        this.salario = salario;
        this.NivelJerarquico = NivelJerarquico;
        this.PersonalCargo = PersonalCargo;
    }

    public void RealizarInforme(){
        System.out.println(super.getNombre() + super.getApellido() + " esta realizando el informe");
    }
    
    public void PagarNomina(){
        System.out.println(super.getNombre() + super.getApellido() + " esta pagando la nomina");
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

    /**
     * @return the PersonalCargo
     */
    public int getPersonalCargo() {
        return PersonalCargo;
    }

    /**
     * @param PersonalCargo the PersonalCargo to set
     */
    public void setPersonalCargo(int PersonalCargo) {
        this.PersonalCargo = PersonalCargo;
    }
    
    
}
