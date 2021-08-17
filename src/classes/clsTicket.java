/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.LinkedList;

/**
 *
 * @author mayko
 */
public class clsTicket {

    /**
     * @return the listaObjetosPasajeroAdulto
     */
    public LinkedList<clsPasajeroAdulto> getListaObjetosPasajeroAdulto() {
        return listaObjetosPasajeroAdulto;
    }

    /**
     * @param listaObjetosPasajeroAdulto the listaObjetosPasajeroAdulto to set
     */
    public void setListaObjetosPasajeroAdulto(LinkedList<clsPasajeroAdulto> listaObjetosPasajeroAdulto) {
        this.listaObjetosPasajeroAdulto = listaObjetosPasajeroAdulto;
    }
    
    
    private LinkedList<clsPasajero> listaObjetosPasajero = new LinkedList<>();
    private LinkedList<clsPasajeroAdulto> listaObjetosPasajeroAdulto = new LinkedList<>();
    private String salida;
    private String llegada;
    private String fechaSalida;
    private String hora;
    private int cantidadAdultos;
    private int cantidadNiños;
    private double valor;
    private boolean retorno;
    private clsPasajero pasajero;

    public clsTicket(String salida, String llegada, String fechaSalida, String hora, int cantidadAdultos, int cantidadNiños, double valor, boolean retorno, clsPasajero pasajero) {
        this.salida = salida;
        this.llegada = llegada;
        this.fechaSalida = fechaSalida;
        this.hora = hora;
        this.cantidadAdultos = cantidadAdultos;
        this.cantidadNiños = cantidadNiños;
        this.valor = valor;
        this.retorno = retorno;
        this.pasajero = pasajero;
        //System.out.println(pasajero.getClass());
        if(pasajero.getClass().toString().equals("class classes.clsPasajeroAdulto")){
            listaObjetosPasajeroAdulto.add((clsPasajeroAdulto)pasajero);
           
        }
        else
            listaObjetosPasajero.add(pasajero);
            
    }

    
    
    public String imprimirTicket(){
        
        double valorTotal = valor*(cantidadAdultos+cantidadNiños);
        if(isRetorno())
            valorTotal = valorTotal *2;
        String informacionTicket = "";
        System.out.println("______________________________________");
        System.out.print("Lugar de salida: " + this.salida);
        System.out.println("Lugar de destino: " + this.llegada);
        System.out.print("Fecha de salida: " + this.fechaSalida);
        System.out.println("Hora salida: " +this.hora);
        System.out.println("Pasajeros adultos: " + this.cantidadAdultos + " Pasajeros niños: "+ this.cantidadNiños);
        System.out.println("Ida y Vuelta: " + this.isRetorno());
        System.out.println("Valor: " + valorTotal);
        return informacionTicket;
    }

    /**
     * @return the listaObjetosPasajero
     */
    public LinkedList<clsPasajero> getListaObjetosPasajero() {
        return listaObjetosPasajero;
    }

    /**
     * @param listaObjetosPasajero the listaObjetosPasajero to set
     */
    public void setListaObjetosPasajero(LinkedList<clsPasajero> listaObjetosPasajero) {
        this.listaObjetosPasajero = listaObjetosPasajero;
    }

    /**
     * @return the salida
     */
    public String getSalida() {
        return salida;
    }

    /**
     * @param salida the salida to set
     */
    public void setSalida(String salida) {
        this.salida = salida;
    }

    /**
     * @return the llegada
     */
    public String getLlegada() {
        return llegada;
    }

    /**
     * @param llegada the llegada to set
     */
    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the cantidadAdultos
     */
    public int getCantidadAdultos() {
        return cantidadAdultos;
    }

    /**
     * @param cantidadAdultos the cantidadAdultos to set
     */
    public void setCantidadAdultos(int cantidadAdultos) {
        this.cantidadAdultos = cantidadAdultos;
    }

    /**
     * @return the cantidadNiños
     */
    public int getCantidadNiños() {
        return cantidadNiños;
    }

    /**
     * @param cantidadNiños the cantidadNiños to set
     */
    public void setCantidadNiños(int cantidadNiños) {
        this.cantidadNiños = cantidadNiños;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the retorno
     */
    public boolean isRetorno() {
        return retorno;
    }

    /**
     * @param retorno the retorno to set
     */
    public void setRetorno(boolean retorno) {
        this.retorno = retorno;
    }

    /**
     * @return the pasajero
     */
    public clsPasajero getPasajero() {
        return pasajero;
    }

    /**
     * @param pasajero the pasajero to set
     */
    public void setPasajero(clsPasajero pasajero) {
        this.pasajero = pasajero;
    }
}
