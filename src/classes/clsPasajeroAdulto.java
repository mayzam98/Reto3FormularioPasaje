/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author mayko
 */
public class clsPasajeroAdulto extends clsPasajero {
    private String contacto;
    private String correoElectronico;
    
    public clsPasajeroAdulto(String nombre, String apellido, String tipoDocumento, String numeroDocumento, String sexo, String contacto, String correoElectronico) {
        super(nombre, apellido, tipoDocumento, numeroDocumento, sexo);
        this.contacto = contacto;
        this.correoElectronico = correoElectronico;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * @param correoElectronico the correoElectronico to set
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
    
    
}
