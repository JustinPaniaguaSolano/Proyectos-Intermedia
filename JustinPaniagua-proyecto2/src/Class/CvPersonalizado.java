package Class;

//importa librerias usadas
import java.io.File;//libreria para manejo de archivos
import java.io.FileWriter;//liberia para escribir en los archivos
import java.io.IOException;//libreria para el manejo de expectiones
import javax.swing.JOptionPane;

public class CvPersonalizado {

    File archivo;//declarar variable

    //void para crear archivo curriculom
    public void crearArchivo() {
        archivo = new File("Curriculom.txt");//Nombre del archivo

        try {
            if (archivo.createNewFile()) {//crear archivo
                JOptionPane.showMessageDialog(null, "Guardado con exito");
            }
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");//en caso de error
        }
    }

    //void para agregar los datos en archivo txt del curriculom
    public void agregarDatos(String datosPersonales, String experienciaLaboral, String informacionContacto) {
        try {
            FileWriter escribir = new FileWriter(archivo, true);//declarar variable y pasarle el archivo

            escribir.write("\tCURRICULOM VITAE\n");
            escribir.write("\tDATOS PERSONALES\n");
            //escribimos en el archivos los datos personaes
            escribir.write(CambiarDatosPersonales(datosPersonales) + "\n\n");//guardamos los datos con el formato

            escribir.write("\tExperiencia Laboral\n");

            //escribimos en el archivos los datos personaes
            escribir.write(CambiarExperienciaLaboral(experienciaLaboral) + "\n\n");//guardamos los datos con el formato

            escribir.write("\tInformacion de Contacto\n");

            //escribimos en el archivos los datos personaes
            escribir.write(CambiarInformacionContacto(informacionContacto) + "\n\n");//guardamos los datos con el formato

            escribir.close();//cerrar archivo

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar datos al archivo");//en caso de error
        }
    }

//reemplazar algo dentro de un string
//https://www.youtube.com/watch?v=wakA_Gvz3lk&ab_channel=VieraClass
    //metodo para ordenar los datos personales en el cv
    private String CambiarDatosPersonales(String datos) {
        // Aquí procesamos y reemplazmos los datos personales
        datos = datos.replace("DatosPersonales{", "")
                .replace("}", "")
                .replace(", ", "\n");
        return datos;//regresa los datos ordenados 
    }

//reemplazar algo dentro de un string
//https://www.youtube.com/watch?v=wakA_Gvz3lk&ab_channel=VieraClass
//metodo para ordenar la experencia laboral en el cv
    private String CambiarExperienciaLaboral(String datos) {
        // Aquí procesamos y reemplazmos la experiencia laboral
        datos = datos.replace("ExperienciaLaboral{", "")
                .replace("}", "")
                .replace(", ", "\n");
        return datos;//regresa los datos ordenados 
    }

//reemplazar algo dentro de un string
//https://www.youtube.com/watch?v=wakA_Gvz3lk&ab_channel=VieraClass
//metodo para ordenar la Informacion contacto l en el cv
    private String CambiarInformacionContacto(String datos) {
        // Aquí procesamos y reemplazmos la información de contacto
        datos = datos.replace("InformacionContacto{", "")
                .replace("}", "")
                .replace(", ", "\n");
        return datos; //regresa los datos ordenados 
    }
}
