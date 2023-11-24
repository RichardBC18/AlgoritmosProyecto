package Modelo;

public class Taxis {

    String placa;
    String modeloTaxi;
    String zona;
    String tipoServicio;
    Conductores actor;

    public Taxis(String Placa, String ModeloTaxi, String Zona, String TipoServicio, Conductores actor) {
        this.placa = Placa;
        this.modeloTaxi = ModeloTaxi;
        this.zona = Zona;
        this.tipoServicio = TipoServicio;
        this.actor = actor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModeloTaxi() {
        return modeloTaxi;
    }

    public void setModeloTaxi(String modeloTaxi) {
        this.modeloTaxi = modeloTaxi;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Conductores getActor() {
        return actor;
    }

    public void setActor(Conductores actor) {
        this.actor = actor;
    }

}
