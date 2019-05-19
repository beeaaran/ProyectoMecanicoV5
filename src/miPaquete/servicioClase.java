/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miPaquete;

/**
 *
 * @author Coooper
 */
public class servicioClase extends clienteClase{
    private String idDeServicio;
    private String nombreDelSevicio;
    private double costo;
    private String mecanicoAsignado;
    private String obeservacionesCliente;
    private String fechaLLegada;
    private String fechaEntrega;
    private String modelo;
    private String marca;
    private String color;
    private String submarca;
    private String placas;
    private String kilometraje;
    private String numeroDeSerie;
    private String observacionesMecanico;

    public servicioClase(String idDeServicio, String nombreDelSevicio, double costo, String mecanicoAsignado, String obeservacionesCliente, String fechaLLegada, String fechaEntrega, String modelo, String marca, String color, String submarca, String placas, String kilometraje, String numeroDeSerie, String nombreCliente, String direccion, String telefono, String correo, String ultimaVisita, String observacionesMecanico) {
        super(nombreCliente, direccion, telefono, correo, ultimaVisita);
        this.idDeServicio = idDeServicio;
        this.nombreDelSevicio = nombreDelSevicio;
        this.costo = costo;
        this.mecanicoAsignado = mecanicoAsignado;
        this.obeservacionesCliente = obeservacionesCliente;
        this.fechaLLegada = fechaLLegada;
        this.fechaEntrega = fechaEntrega;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.submarca = submarca;
        this.placas = placas;
        this.kilometraje = kilometraje;
        this.numeroDeSerie = numeroDeSerie;
        this.observacionesMecanico = observacionesMecanico;
    }

    public servicioClase() {
    }

    

    public String getIdDeServicio() {
        return idDeServicio;
    }

    
    public void setIdDeServicio(String idDeServicio) {
        this.idDeServicio = idDeServicio;
    }
    
    public String getNombreDelSevicio() {
        return nombreDelSevicio;
    }

    public void setNombreDelSevicio(String nombreDelSevicio) {
        this.nombreDelSevicio = nombreDelSevicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMecanicoAsignado() {
        return mecanicoAsignado;
    }

    public void setMecanicoAsignado(String mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }

    public String getObeservacionesCliente() {
        return obeservacionesCliente;
    }

    public void setObeservacionesCliente(String obeservacionesCliente) {
        this.obeservacionesCliente = obeservacionesCliente;
    }

  

    public String getFechaLLegada() {
        return fechaLLegada;
    }

    public void setFechaLLegada(String fechaLLegada) {
        this.fechaLLegada = fechaLLegada;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSubmarca() {
        return submarca;
    }

    public void setSubmarca(String submarca) {
        this.submarca = submarca;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getObservacionesMecanico() {
        return observacionesMecanico;
    }

    public void setObservacionesMecanico(String observacionesMecanico) {
        this.observacionesMecanico = observacionesMecanico;
    }

    
     
    
}
