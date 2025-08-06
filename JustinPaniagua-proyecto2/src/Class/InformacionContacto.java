
package Class;

public class InformacionContacto {
    //atributos
    private String id;
    private String telefono;
    private String dirrecionCorreo;
    private String pais;
    private String ciudad;  
    private String codigoPostal;
//Constructor vacio//he inicializar los atributos
    public InformacionContacto() {
        this.id = "";
        this.telefono = "";
        this.dirrecionCorreo = "";
        this.pais = "";
        this.ciudad = "";
        this.codigoPostal = "";
    }
//Constructor lleno
    public InformacionContacto(String id, String telefono, String dirrecionCorreo, String pais, String ciudad, String codigoPostal) {
        this.id = id;
        this.telefono = telefono;
        this.dirrecionCorreo = dirrecionCorreo;
        this.pais = pais;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }
//getter y setter de los atributos
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirrecionCorreo() {
        return dirrecionCorreo;
    }

    public void setDirrecionCorreo(String dirrecionCorreo) {
        this.dirrecionCorreo = dirrecionCorreo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "InformacionContacto{" + "id=" + id + ", telefono=" + telefono + ", dirrecionCorreo=" + dirrecionCorreo + ", pais=" + pais + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + '}';
    }
    
}


