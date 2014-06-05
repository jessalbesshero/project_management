package edu.uv.modelo.pojos.admproy;
// Generated 27/05/2014 12:50:36 PM by Hibernate Tools 3.6.0



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private String nombreU;
     private String nombre;
     private String paterno;
     private String materno;
     private String contraseñaU;
     private String calle;
     private String colonia;
     private String numero;
     private String ciudad;
     private String municipio;
     private String estado;
     private String correoInstitucional;
     private String correoAlternativo;
     private String telefono;

    public Usuario() {
    }

	
    public Usuario(String nombreU, String nombre, String paterno, String materno, String contraseñaU) {
        this.nombreU = nombreU;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.contraseñaU = contraseñaU;
    }
    public Usuario(String nombreU, String nombre, String paterno, String materno, String contraseñaU, String calle, String colonia, String numero, String ciudad, String municipio, String estado, String correoInstitucional, String correoAlternativo, String telefono) {
       this.nombreU = nombreU;
       this.nombre = nombre;
       this.paterno = paterno;
       this.materno = materno;
       this.contraseñaU = contraseñaU;
       this.calle = calle;
       this.colonia = colonia;
       this.numero = numero;
       this.ciudad = ciudad;
       this.municipio = municipio;
       this.estado = estado;
       this.correoInstitucional = correoInstitucional;
       this.correoAlternativo = correoAlternativo;
       this.telefono = telefono;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreU() {
        return this.nombreU;
    }
    
    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaterno() {
        return this.paterno;
    }
    
    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }
    public String getMaterno() {
        return this.materno;
    }
    
    public void setMaterno(String materno) {
        this.materno = materno;
    }
    public String getContraseñaU() {
        return this.contraseñaU;
    }
    
    public void setContraseñaU(String contraseñaU) {
        this.contraseñaU = contraseñaU;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCorreoInstitucional() {
        return this.correoInstitucional;
    }
    
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    public String getCorreoAlternativo() {
        return this.correoAlternativo;
    }
    
    public void setCorreoAlternativo(String correoAlternativo) {
        this.correoAlternativo = correoAlternativo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




}


