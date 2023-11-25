package Modelo;

public class Taxis {

    String placa;
    String modeloTaxi;
    String zona;
    String tipoServicio;

    public Taxis(String Placa, String ModeloTaxi, String Zona, String TipoServicio) {
        this.placa = Placa;
        this.modeloTaxi = ModeloTaxi;
        this.zona = Zona;
        this.tipoServicio = TipoServicio;
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


}
