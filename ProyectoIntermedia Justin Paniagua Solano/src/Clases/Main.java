/*
    Proyecto 1 programacion intermedia 

    Autor del proyecto:Justin Paniagua Solano

    Celula:305530632

    Segundo Cuatrimestre 2024
*/
package Clases;

import java.util.Scanner;//importar la libreria scanner 

public class Main {

    private static Repuesto repuesto;//atrituto para la clase Repuesto
    private static CalculadoraImpuestos calculardoraImpuestos;//atrituto para la clase CalculadoraImpuesto
    private static Inventario inventario;//atrituto para la clase Inventario

    static Scanner Lector = new Scanner(System.in);//usado para solicitar datos por medio del teclado

    //metodo principal(main)
    public static void main(String[] args) {
        solicitarRepuestos();//llamado del metodo solicitar repuestos
        inventario.mostrarVector();//llamado del metodo mostrar vector
        inventario.precioSinImpuestosCategoria();//llamado del metodo precioSinImpuestosCategoria
        inventario.mostrarPrecioSinImpuestosCategoria();//llamado del metodo mostrarPrecioSinImpuestosCategoria
        inventario.precioConImpuestosCategoria();//llamado del metodo precioConImpuestosCategoria
        inventario.mostrarPrecioConImpuestosCategoria();//llamado del metodo mostrarPrecioConImpuestosCategoria
        inventario.mostrarPromedioBajo();//llamado del metodo mostrarPromedioBajo
        inventario.calcularValorTotalInventario();//llamado del metodo calcularValorTotalInventario
    }

    //metodo para solicitar los datos
    public static void solicitarRepuestos() {
        String respuesta;//variable para guardar la informacion antes de enviarla al Repuesto
        String validacion;//variable usada para validar que se cumplo los requisitos del nombre/marca
        float validacionPrecio;//variable usada para validar que el precio sea mayor a 0
        int cantidad;//variable para guardar la cantidad de datos que contiene los String
        //do while para el ingreso de mas datos al vector
        do {
            //try catch para en caso de error
            try {
                repuesto = new Repuesto();//reservar espacio en memoria
                //do while para la verificacion del nombre cumpla los requisitos
                do {
                    System.out.println("-------------AutoPartesCR----------------");
                    System.out.print("Digite el NOMBRE para el repuesto: ");//solicitu del nombre
                    validacion = Lector.next();//guardar el nombre
                    //.length() sacado de 
                    //https://www.shecodes.io/athena/54957-what-is-the-length-property-in-javascript
                    cantidad = validacion.length();//verificar el tamaño del nombre

                    if (cantidad > 50) {//en caso del nombre tengo mas de 50 caracteres
                        System.out.println("El NOMBRE tiene demaciado caracteres:");//mensaje de error

                    } else {//en caso contrario
                        repuesto.setNombre(validacion);//guardar lo que este en validacion en nombre de la clase Repuesto
                    }

                } while (cantidad > 50);//condicion de salida del do while

                //do while para la verificacion de la marca cumpla los requisitos
                do {
                    System.out.print("Digite la MARCA para el repuesto: ");//solicitu del nombre
                    validacion = Lector.next();//guardar el nombre
                    //.length() sacado de 
                    //https://www.shecodes.io/athena/54957-what-is-the-length-property-in-javascript
                    cantidad = validacion.length();//verificar el tamaño del nombre

                    if (cantidad > 20) {//en caso de la marca tengo mas de 20 caracteres
                        System.out.println("La MARCA tiene demaciado caracteres:");//mensaje de error
                    } else {
                        repuesto.setMarca(validacion);//guardar lo que este en validacion en marca de la clase Repuesto
                    }
                } while (cantidad > 20);//condicion de salida del do while

                //do while para la verificacion del precio cumpla con los requisitos
                do {
                    System.out.print("Digite el PRECIO del repuesto (Sin impuesto): ");
                    validacionPrecio = Lector.nextFloat();
                    if (validacionPrecio <= 0) {
                        System.out.println("El PRECIO debe de ser mayor de 0:");//mensaje de error
                    } else {
                        repuesto.setPrecioSinImpuesto(validacionPrecio);
                    }

                } while (validacionPrecio <= 0);

                //do{}while para la verificacion de la categoria
                do {

                    System.out.print("Digite una CATEGORIA para el repuesto: ");//solicitu del repuesto
                    validacion = Lector.next();//guardado del repuesto

                    cantidad = validacion.length();//verificar el tamaño del repuesto
                    if (cantidad > 20) {//en caso de la marca tengo mas de 20 caracteres
                        System.out.println("La CATEGORIA contiene demaciado caracteres:");//mensaje de error
                    } else {
//codigo para comparar strin sacado de :
                        //https://www.youtube.com/watch?v=oBiHlzYimpE
                        if (validacion.equalsIgnoreCase("Moto") || validacion.equalsIgnoreCase("carro")//verificar que el repuesto sea alguna categoria disponible
                                || validacion.equalsIgnoreCase("camion")) {
                            repuesto.setCategoria(validacion);//guardar lo que este en validacion en marca de la clase Repuesto
                            break;
                        } else {//en caso de que la categoria no este
                            System.out.println("La CATEGORIA debe de ser algunas de las siguiente opciones(moto,carro,camion)");
                        }

                    }

                } while (true);//condiion de salida
   } catch (Exception ex) {
                for(int i=0;i<3;i++){
                    System.out.println("");
                }//mensaje de erro al ingresar los datos
                System.out.println("Sucedio un error al capturar los datos");
                System.out.print("Digite el PRECIO del repuesto (Sin impuesto): ");
                Lector.next();//Limpia el Buffer
                validacionPrecio = Lector.nextFloat();//guarda el nuevo precio
            }
            calcularImpuesto();//llamado del metodo para calcular impuestos
            
            
            precioConImpuesto();//llamado del metodo para calcular precio con impuestos
            
            inventario.ingresarDatosVector(repuesto);//llamado del metodo ingresar datos al vector
            
            System.out.print("Desea agregar mas repuestos? (S o N): ");
            respuesta = Lector.next();
            for(int i=0;i<5;i++){
                System.out.println("");
            }
        } while (respuesta.equalsIgnoreCase("S"));
    }

    //metodo para calcular el impuesto
    public static void calcularImpuesto() {
        CalculadoraImpuestos calculadoraImpuestos = new CalculadoraImpuestos();//crear atrituvo de la clase CalculadoraImpuestos
        calculadoraImpuestos.calcularImpuesto(repuesto);//pasar los parametros 
    }
    
    //metodo para calcular el precio con el impuesto
    public static void precioConImpuesto() {
        CalculadoraImpuestos calculadoraImpuestos = new CalculadoraImpuestos();//crear atrituvo de la clase CalculadoraImpuestos
        calculadoraImpuestos.PrecioConImpuesto(repuesto);//pasar los parametros 

    }
}