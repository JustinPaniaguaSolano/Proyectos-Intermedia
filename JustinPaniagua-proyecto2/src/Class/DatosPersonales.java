
package Class;

import java.util.Date;//libreria para el manejo de variables tipo date

public class DatosPersonales {
    //atritutos de la clase
    private String id;
    private String cedula;
    private String nombre;
    private String direccion;
    private String correo;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String estadoCivil;
    private String objetivoProfeccional;
    
//constructor vacio//he inicializar los atributos
    public DatosPersonales() {
        this.id = "";
        this.cedula = "";
        this.nombre = "";
        this.direccion = "";
        this.correo = "";
        this.fechaNacimiento=new Date();
        this.nacionalidad = "";
        this.estadoCivil = "";
        this.objetivoProfeccional = "";

    }
//constructor lleno
    public DatosPersonales(String id, String cedula, String nombre, String direccion, String correo, Date fechaNacimiento, String nacionalidad, String estadoCivil, String objetivoProfeccional) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.objetivoProfeccional = objetivoProfeccional;
    }
//getter y setter de los atributos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getObjetivoProfeccional() {
        return objetivoProfeccional;
    }

    public void setObjetivoProfeccional(String objetivoProfeccional) {
        this.objetivoProfeccional = objetivoProfeccional;
    }
//override
    @Override
    public String toString() {
        return "DatosPersonales{" + "id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", estadoCivil=" + estadoCivil + ", objetivoProfeccional=" + objetivoProfeccional + '}';
    }

}


