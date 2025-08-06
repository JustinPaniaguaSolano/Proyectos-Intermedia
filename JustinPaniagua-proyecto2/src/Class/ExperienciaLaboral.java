package Class;

import java.util.Date;//libreria para el manejo de variables tipo date

public class ExperienciaLaboral {

    //atributos
    private String id;
    private String nombreEmpresa;
    private String puesto;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    
//constructor vacio
    public ExperienciaLaboral() {
        this.id = "";
        this.nombreEmpresa = "";
        this.puesto = "";
        this.fechaInicio = new Date();
        this.fechaFin = new Date();
        this.descripcion = "";
    }
//constructor lleno
    public ExperienciaLaboral(String id, String nombreEmpresa, String puesto, Date fechaInicio, Date fechaFin, String descripcion) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }
//getter y setter de los atributos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ExperienciaLaboral{" + "id=" + id + ", nombreEmpresa=" + nombreEmpresa + ", puesto=" + puesto + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", descripcion=" + descripcion + '}';
    }

}
