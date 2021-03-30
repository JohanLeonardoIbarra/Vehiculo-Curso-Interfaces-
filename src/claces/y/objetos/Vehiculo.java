/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claces.y.objetos;

/**
 *
 * @author User
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private short año;

    public Vehiculo(){
        this.año = 2019;
        this.marca = "chevrolet";
        this.modelo = "Sonic";
    }
    
    public Vehiculo(String marca, String modelo, Short año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public String mostrarDatos(){
        return "marca: "+this.marca+" modelo: "+this.modelo+" año: "+this.año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public short getAño() {
        return año;
    }

    public void setAño(short año) {
        this.año = año;
    }
    
}
