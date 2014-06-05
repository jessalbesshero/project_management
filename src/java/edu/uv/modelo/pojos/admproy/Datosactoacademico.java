package edu.uv.modelo.pojos.admproy;
// Generated 27/05/2014 12:50:36 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Datosactoacademico generated by hbm2java
 */
public class Datosactoacademico  implements java.io.Serializable {


     private Integer idActoAcademico;
     private String nomActoacademico;
     private String modalidad;
     private String tipoActo;
     private String nombreEntidadA;
     private String calleEntidadA;
     private int numeroEntidad;
     private String ciudadEntidadA;
     private String correoEntidadA;
     private String correoAlternativoEnt;
     private String areaAcademica;
     private String nombreSede;
     private String calleSede;
     private int numeroSede;
     private String telefonoSede;
     private String telefonoAltSede;
     private BigDecimal cuotaRec;
     private int cupoMin;
     private int cupoMax;
     private Date fechaInicio;
     private Date fechaFin;
     private int numSesiones;
     private String horario;
     private int totalHoras;
     private String dirigido;
     private String requisitos;
     private String objetivo;
     private String acreditacion;
     private String procedimientoEval;
     private String bibliografia;
     private Integer cartaC;
     private Integer sintesisC;
     private int presupuesto;
     private Set datoscursos = new HashSet(0);
     private Set academicos = new HashSet(0);
     private Set datosevaluacions = new HashSet(0);

    public Datosactoacademico() {
    }

	
    public Datosactoacademico(String nomActoacademico, String modalidad, String tipoActo, String nombreEntidadA, String calleEntidadA, int numeroEntidad, String ciudadEntidadA, String correoEntidadA, String areaAcademica, String nombreSede, String calleSede, int numeroSede, String telefonoSede, BigDecimal cuotaRec, int cupoMin, int cupoMax, Date fechaInicio, Date fechaFin, int numSesiones, String horario, int totalHoras, String requisitos, String objetivo, String acreditacion, String procedimientoEval, int presupuesto) {
        this.nomActoacademico = nomActoacademico;
        this.modalidad = modalidad;
        this.tipoActo = tipoActo;
        this.nombreEntidadA = nombreEntidadA;
        this.calleEntidadA = calleEntidadA;
        this.numeroEntidad = numeroEntidad;
        this.ciudadEntidadA = ciudadEntidadA;
        this.correoEntidadA = correoEntidadA;
        this.areaAcademica = areaAcademica;
        this.nombreSede = nombreSede;
        this.calleSede = calleSede;
        this.numeroSede = numeroSede;
        this.telefonoSede = telefonoSede;
        this.cuotaRec = cuotaRec;
        this.cupoMin = cupoMin;
        this.cupoMax = cupoMax;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numSesiones = numSesiones;
        this.horario = horario;
        this.totalHoras = totalHoras;
        this.requisitos = requisitos;
        this.objetivo = objetivo;
        this.acreditacion = acreditacion;
        this.procedimientoEval = procedimientoEval;
        this.presupuesto = presupuesto;
    }
    public Datosactoacademico(String nomActoacademico, String modalidad, String tipoActo, String nombreEntidadA, String calleEntidadA, int numeroEntidad, String ciudadEntidadA, String correoEntidadA, String correoAlternativoEnt, String areaAcademica, String nombreSede, String calleSede, int numeroSede, String telefonoSede, String telefonoAltSede, BigDecimal cuotaRec, int cupoMin, int cupoMax, Date fechaInicio, Date fechaFin, int numSesiones, String horario, int totalHoras, String dirigido, String requisitos, String objetivo, String acreditacion, String procedimientoEval, String bibliografia, Integer cartaC, Integer sintesisC, int presupuesto, Set datoscursos, Set academicos, Set datosevaluacions) {
       this.nomActoacademico = nomActoacademico;
       this.modalidad = modalidad;
       this.tipoActo = tipoActo;
       this.nombreEntidadA = nombreEntidadA;
       this.calleEntidadA = calleEntidadA;
       this.numeroEntidad = numeroEntidad;
       this.ciudadEntidadA = ciudadEntidadA;
       this.correoEntidadA = correoEntidadA;
       this.correoAlternativoEnt = correoAlternativoEnt;
       this.areaAcademica = areaAcademica;
       this.nombreSede = nombreSede;
       this.calleSede = calleSede;
       this.numeroSede = numeroSede;
       this.telefonoSede = telefonoSede;
       this.telefonoAltSede = telefonoAltSede;
       this.cuotaRec = cuotaRec;
       this.cupoMin = cupoMin;
       this.cupoMax = cupoMax;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.numSesiones = numSesiones;
       this.horario = horario;
       this.totalHoras = totalHoras;
       this.dirigido = dirigido;
       this.requisitos = requisitos;
       this.objetivo = objetivo;
       this.acreditacion = acreditacion;
       this.procedimientoEval = procedimientoEval;
       this.bibliografia = bibliografia;
       this.cartaC = cartaC;
       this.sintesisC = sintesisC;
       this.presupuesto = presupuesto;
       this.datoscursos = datoscursos;
       this.academicos = academicos;
       this.datosevaluacions = datosevaluacions;
    }
   
    public Integer getIdActoAcademico() {
        return this.idActoAcademico;
    }
    
    public void setIdActoAcademico(Integer idActoAcademico) {
        this.idActoAcademico = idActoAcademico;
    }
    public String getNomActoacademico() {
        return this.nomActoacademico;
    }
    
    public void setNomActoacademico(String nomActoacademico) {
        this.nomActoacademico = nomActoacademico;
    }
    public String getModalidad() {
        return this.modalidad;
    }
    
    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    public String getTipoActo() {
        return this.tipoActo;
    }
    
    public void setTipoActo(String tipoActo) {
        this.tipoActo = tipoActo;
    }
    public String getNombreEntidadA() {
        return this.nombreEntidadA;
    }
    
    public void setNombreEntidadA(String nombreEntidadA) {
        this.nombreEntidadA = nombreEntidadA;
    }
    public String getCalleEntidadA() {
        return this.calleEntidadA;
    }
    
    public void setCalleEntidadA(String calleEntidadA) {
        this.calleEntidadA = calleEntidadA;
    }
    public int getNumeroEntidad() {
        return this.numeroEntidad;
    }
    
    public void setNumeroEntidad(int numeroEntidad) {
        this.numeroEntidad = numeroEntidad;
    }
    public String getCiudadEntidadA() {
        return this.ciudadEntidadA;
    }
    
    public void setCiudadEntidadA(String ciudadEntidadA) {
        this.ciudadEntidadA = ciudadEntidadA;
    }
    public String getCorreoEntidadA() {
        return this.correoEntidadA;
    }
    
    public void setCorreoEntidadA(String correoEntidadA) {
        this.correoEntidadA = correoEntidadA;
    }
    public String getCorreoAlternativoEnt() {
        return this.correoAlternativoEnt;
    }
    
    public void setCorreoAlternativoEnt(String correoAlternativoEnt) {
        this.correoAlternativoEnt = correoAlternativoEnt;
    }
    public String getAreaAcademica() {
        return this.areaAcademica;
    }
    
    public void setAreaAcademica(String areaAcademica) {
        this.areaAcademica = areaAcademica;
    }
    public String getNombreSede() {
        return this.nombreSede;
    }
    
    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }
    public String getCalleSede() {
        return this.calleSede;
    }
    
    public void setCalleSede(String calleSede) {
        this.calleSede = calleSede;
    }
    public int getNumeroSede() {
        return this.numeroSede;
    }
    
    public void setNumeroSede(int numeroSede) {
        this.numeroSede = numeroSede;
    }
    public String getTelefonoSede() {
        return this.telefonoSede;
    }
    
    public void setTelefonoSede(String telefonoSede) {
        this.telefonoSede = telefonoSede;
    }
    public String getTelefonoAltSede() {
        return this.telefonoAltSede;
    }
    
    public void setTelefonoAltSede(String telefonoAltSede) {
        this.telefonoAltSede = telefonoAltSede;
    }
    public BigDecimal getCuotaRec() {
        return this.cuotaRec;
    }
    
    public void setCuotaRec(BigDecimal cuotaRec) {
        this.cuotaRec = cuotaRec;
    }
    public int getCupoMin() {
        return this.cupoMin;
    }
    
    public void setCupoMin(int cupoMin) {
        this.cupoMin = cupoMin;
    }
    public int getCupoMax() {
        return this.cupoMax;
    }
    
    public void setCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    public int getNumSesiones() {
        return this.numSesiones;
    }
    
    public void setNumSesiones(int numSesiones) {
        this.numSesiones = numSesiones;
    }
    public String getHorario() {
        return this.horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public int getTotalHoras() {
        return this.totalHoras;
    }
    
    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
    public String getDirigido() {
        return this.dirigido;
    }
    
    public void setDirigido(String dirigido) {
        this.dirigido = dirigido;
    }
    public String getRequisitos() {
        return this.requisitos;
    }
    
    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
    public String getObjetivo() {
        return this.objetivo;
    }
    
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    public String getAcreditacion() {
        return this.acreditacion;
    }
    
    public void setAcreditacion(String acreditacion) {
        this.acreditacion = acreditacion;
    }
    public String getProcedimientoEval() {
        return this.procedimientoEval;
    }
    
    public void setProcedimientoEval(String procedimientoEval) {
        this.procedimientoEval = procedimientoEval;
    }
    public String getBibliografia() {
        return this.bibliografia;
    }
    
    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }
    public Integer getCartaC() {
        return this.cartaC;
    }
    
    public void setCartaC(Integer cartaC) {
        this.cartaC = cartaC;
    }
    public Integer getSintesisC() {
        return this.sintesisC;
    }
    
    public void setSintesisC(Integer sintesisC) {
        this.sintesisC = sintesisC;
    }
    public int getPresupuesto() {
        return this.presupuesto;
    }
    
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    public Set getDatoscursos() {
        return this.datoscursos;
    }
    
    public void setDatoscursos(Set datoscursos) {
        this.datoscursos = datoscursos;
    }
    public Set getAcademicos() {
        return this.academicos;
    }
    
    public void setAcademicos(Set academicos) {
        this.academicos = academicos;
    }
    public Set getDatosevaluacions() {
        return this.datosevaluacions;
    }
    
    public void setDatosevaluacions(Set datosevaluacions) {
        this.datosevaluacions = datosevaluacions;
    }




}


