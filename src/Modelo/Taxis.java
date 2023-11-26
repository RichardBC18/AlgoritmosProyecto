package Modelo;

public class Taxis {

    String Placa;
    String ModeloTaxi;
    String Zona;
    String TipoServicio;
    String Chofer;
    
    Taxis hijoIzq, hijoDer;

    public Taxis(String placa, String modelo, String zona, String chofer, String servicio) {
        this.Placa = placa;
        this.ModeloTaxi = modelo;
        this.Zona = zona;
        this.Chofer = chofer;
        this.TipoServicio= servicio;
        
        this.hijoDer=null;
        this.hijoIzq=null;
    }

    public String getPlaca() {
        return Placa;
    }

    public String getModeloTaxi() {
        return ModeloTaxi;
    }

    public String getZona() {
        return Zona;
    }

    public String getTipoServicio() {
        return TipoServicio;
    }

    public String getChofer() {
        return Chofer;
    }

    public Taxis getHijoIzq() {
        return hijoIzq;
    }

    public Taxis getHijoDer() {
        return hijoDer;
    }
}
