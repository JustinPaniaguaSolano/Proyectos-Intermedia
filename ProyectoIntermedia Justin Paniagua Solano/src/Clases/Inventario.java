
/*
    Proyecto 1 programacion intermedia 

    Autor del proyecto:Justin Paniagua Solano

    Celula:305530632

    Segundo Cuatrimestre 2024
 */
package Clases;

public class Inventario {
//como crear el vector sacado de:
//https://www.youtube.com/watch?v=uzDcQLRPXLQ
    private static Repuesto[] vectorRepuesto = new Repuesto[20];

    private static int contador = 0;//variable para llevar el contador de los repuestos

    private static Inventario inventario;//creara atrituvo de la clase

    private static float precioSinImpuestosMotos;//variable para guardar el precio sin impuesto de la categoria motos
    private static float precioSinImpuestosCarros;//variable para guardar el precio sin impuesto de la categoria carros
    private static float precioSinImpuestosCamiones;//variable para guardar el precio sin impuesto de la categoria camiones

    private static float precioConImpuestosMotos;//variable para guardar el impuesto  de la categoria motos
    private static float precioConImpuestosCarros;//variable para guardar el impuesto  de la categoria carros
    private static float precioConImpuestosCamiones;//variable para guardar el impuesto  de la categoria camiones

    private static int CantidadRepuestosMotos;//variable para guardar la cantidad de repuestos  de la categoria motos
    private static int CantidadRepuestosCarros;//variable para guardar la cantidad de repuestos  de la categoria carros
    private static int CantidadRepuestosCamiones;//variable para guardar la cantidad de repuestos  de la categoria camiones

    private static float promedioMotos;//variable para guardar el promedio de la categoria motos
    private static float promedioCarros;//variable para guardar el promedio de la categoria carros
    private static float promedioCamiones;//variable para guardar el promedio de la categoria camiones

    private static float promedioBajo;//variable para guardar el promedio mas bajo
    private static float valorInventario;//variable para guardar el valor total de inventario

    //constructor vacio
    public Inventario() {
        recorrerVector();
    }

    //getter and setter(termian en la linea 182)
    public static Repuesto[] getVectorRepuesto() {
        return vectorRepuesto;
    }

    public static void setVectorRepuesto(Repuesto[] vectorRepuesto) {
        Inventario.vectorRepuesto = vectorRepuesto;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Inventario.contador = contador;
    }

    public static Inventario getInventario() {
        return inventario;
    }

    public static void setInventario(Inventario inventario) {
        Inventario.inventario = inventario;
    }

    public static float getPrecioSinImpuestosMotos() {
        return precioSinImpuestosMotos;
    }

    public static void setPrecioSinImpuestosMotos(float precioSinImpuestosMotos) {
        Inventario.precioSinImpuestosMotos = precioSinImpuestosMotos;
    }

    public static float getPrecioSinImpuestosCarros() {
        return precioSinImpuestosCarros;
    }

    public static void setPrecioSinImpuestosCarros(float precioSinImpuestosCarros) {
        Inventario.precioSinImpuestosCarros = precioSinImpuestosCarros;
    }

    public static float getPrecioSinImpuestosCamiones() {
        return precioSinImpuestosCamiones;
    }

    public static void setPrecioSinImpuestosCamiones(float precioSinImpuestosCamiones) {
        Inventario.precioSinImpuestosCamiones = precioSinImpuestosCamiones;
    }

    public static float getPrecioConImpuestosMotos() {
        return precioConImpuestosMotos;
    }

    public static void setPrecioConImpuestosMotos(float precioConImpuestosMotos) {
        Inventario.precioConImpuestosMotos = precioConImpuestosMotos;
    }

    public static float getPrecioConImpuestosCarros() {
        return precioConImpuestosCarros;
    }

    public static void setPrecioConImpuestosCarros(float precioConImpuestosCarros) {
        Inventario.precioConImpuestosCarros = precioConImpuestosCarros;
    }

    public static float getPrecioConImpuestosCamiones() {
        return precioConImpuestosCamiones;
    }

    public static void setPrecioConImpuestosCamiones(float precioConImpuestosCamiones) {
        Inventario.precioConImpuestosCamiones = precioConImpuestosCamiones;
    }

    public static int getCantidadRepuestosMotos() {
        return CantidadRepuestosMotos;
    }

    public static void setCantidadRepuestosMotos(int CantidadRepuestosMotos) {
        Inventario.CantidadRepuestosMotos = CantidadRepuestosMotos;
    }

    public static int getCantidadRepuestosCarros() {
        return CantidadRepuestosCarros;
    }

    public static void setCantidadRepuestosCarros(int CantidadRepuestosCarros) {
        Inventario.CantidadRepuestosCarros = CantidadRepuestosCarros;
    }

    public static int getCantidadRepuestosCamiones() {
        return CantidadRepuestosCamiones;
    }

    public static void setCantidadRepuestosCamiones(int CantidadRepuestosCamiones) {
        Inventario.CantidadRepuestosCamiones = CantidadRepuestosCamiones;
    }

    public static float getPromedioMotos() {
        return promedioMotos;
    }

    public static void setPromedioMotos(float promedioMotos) {
        Inventario.promedioMotos = promedioMotos;
    }

    public static float getPromedioCarros() {
        return promedioCarros;
    }

    public static void setPromedioCarros(float promedioCarros) {
        Inventario.promedioCarros = promedioCarros;
    }

    public static float getPromedioCamiones() {
        return promedioCamiones;
    }

    public static void setPromedioCamiones(float promedioCamiones) {
        Inventario.promedioCamiones = promedioCamiones;
    }

    public static float getPromedioBajo() {
        return promedioBajo;
    }

    public static void setPromedioBajo(float promedioBajo) {
        Inventario.promedioBajo = promedioBajo;
    }

    public static float getValorInventario() {
        return valorInventario;
    }

    public static void setValorInventario(float valorInventario) {
        Inventario.valorInventario = valorInventario;
    }

//metodo para recorre el vecotr
    public static void recorrerVector() {
        for (int i = 0; i < 20; i++) {
            vectorRepuesto[i] = new Repuesto();
        }
    }

//metodo para ingresar datos al vector
    public static void ingresarDatosVector(Repuesto repuesto) {
        if (contador < 20) {
            vectorRepuesto[contador] = repuesto;
            contador++;
            System.out.println("Numero de respuestos guardados:" + contador);
        }
        if(contador >=20){
            System.out.println("Vector ya tiene 20 respuestos ,se encuentra lleno");
        }
    }

//metodo para mostrar todo lo guardado en el vector
    public static void mostrarVector() {
        System.out.println("");
        System.out.println("------------Lista de repuestos----------");
        for (int i = 0; i < contador; i++) {
            System.out.println(vectorRepuesto[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("");
    }

//metodo para calcular el precio sin impuestos por categorias
    public static void precioSinImpuestosCategoria() {
        for (int i = 0; i < contador; i++) {//recorrer el vector
            Repuesto repuesto = vectorRepuesto[i];
            if (vectorRepuesto[i].getCategoria().equalsIgnoreCase("moto")) {
                precioSinImpuestosMotos += vectorRepuesto[i].getPrecioSinImpuesto();

            } else if (vectorRepuesto[i].getCategoria().equalsIgnoreCase("carro")) {
                precioSinImpuestosCarros += vectorRepuesto[i].getPrecioSinImpuesto();

            } else if (vectorRepuesto[i].getCategoria().equalsIgnoreCase("camion")) {
                precioSinImpuestosCamiones += vectorRepuesto[i].getPrecioSinImpuesto();

            }

        }

    }
//metodo para mostrar lo precios sin impuestos por categorias

    public static void mostrarPrecioSinImpuestosCategoria() {
        System.out.println("");
        System.out.println("------------Precios Sin impuestos Categorias----------");
        System.out.println("Total precio sin impuestos MOTOS:" + precioSinImpuestosMotos);
        System.out.println("Total precio sin impuestos CARROS:" + precioSinImpuestosCarros);
        System.out.println("Total precio sin impuestos CAMIONES:" + precioSinImpuestosCamiones);
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
    }
//metodo pára calcular el precio con impuestos por categoria
    public static void precioConImpuestosCategoria() {
        for (int i = 0; i < contador; i++) {
            Repuesto repuesto = vectorRepuesto[i];
            if (vectorRepuesto[i].getCategoria().equalsIgnoreCase("moto")) {
                precioConImpuestosMotos += vectorRepuesto[i].getPrecioConImpuestos();
                CantidadRepuestosMotos++;
            } else if (vectorRepuesto[i].getCategoria().equalsIgnoreCase("carro")) {
                precioConImpuestosCarros += vectorRepuesto[i].getPrecioConImpuestos();
                CantidadRepuestosCarros++;
            } else if (vectorRepuesto[i].getCategoria().equalsIgnoreCase("camion")) {
                precioConImpuestosCamiones += vectorRepuesto[i].getPrecioConImpuestos();
                vectorRepuesto[i].getPrecioConImpuestos();
                CantidadRepuestosCamiones++;
            }
        }
    }
    
//metodo para mostrar y calcular el promedio del precio con impuestos por categoria
    public static void mostrarPrecioConImpuestosCategoria() {
        System.out.println("");
        System.out.println("------------Precios Con impuestos Categorias----------");
        //mostrar el precio con impuestos de la categoria motos y el total de repuestos 
        System.out.println("Total precio Con impuestos MOTOS:" + precioConImpuestosMotos);
        System.out.println("Total repuestos MOTOS:" + CantidadRepuestosMotos);
        promedioMotos = precioConImpuestosMotos / CantidadRepuestosMotos;//calcular promedio motos
        System.out.println("promedio MOTOS:" + promedioMotos);
        System.out.println("");
        
        //mostrar el precio con impuestos de la categoria carros y el total de repuestos 
        System.out.println("Total precio con impuestos CARROS:" + precioConImpuestosCarros);
        System.out.println("Total repuestos CARROS:" + CantidadRepuestosCarros);
        promedioCarros = precioConImpuestosCarros / CantidadRepuestosCarros;//calcular promedio carros
        System.out.println("Promedio CARROS:" + promedioCarros);
        System.out.println("");
        
        //mostrar el precio con impuestos de la categoria camiones y el total de repuestos 
        System.out.println("Total precio con impuestos CAMIONES:" + precioConImpuestosCamiones);
        System.out.println("Total repuestos CAMIONES:" + precioConImpuestosCamiones);
        promedioCamiones = precioConImpuestosCamiones / CantidadRepuestosCamiones;//calcular promedio camiones
        System.out.println("Promedio CAMIONES:" + promedioCamiones);
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
    }
    
//metodo para mostrar y calculare el promedio mas bajo
    public static void mostrarPromedioBajo() {
        System.out.println("----------------------Promedio mas Bajo--------------------------------");
        if (promedioMotos <= promedioCarros && promedioMotos <= promedioCamiones) {
            System.out.println("La categoria MOTOS tiene el impuesto mas bajo con: " + promedioMotos);
        } else if (promedioCarros <= promedioMotos && promedioCarros <= promedioCamiones) {
            System.out.println("La categoria CARROS tiene el impuesto mas bajo con: " + promedioCarros);
        } else {
            System.out.println("La categoria CAMIONES tiene el impuesto mas bajo con: " + promedioCamiones);
        }
        System.out.println("------------------------------------------------------");
        System.out.println("");
    }
//metodo para calcular el precio total del inventario
    public static void calcularValorTotalInventario() {
//for para recorerr el vector
        for (int i = 0; i < contador; i++) {
            Repuesto repuesto = vectorRepuesto[i];//atrituto de la clase repuesto
            valorInventario += vectorRepuesto[i].getPrecioConImpuestos();//sumar todo lo del precio con impuestos
        }
        //mostrar en pantalla el total de valor inventario
        System.out.println("-------------Valor total Inventario-----------");
        System.out.println("Valor total Inventario:" + valorInventario);
        System.out.println("---------------------------------------------");
    }
}