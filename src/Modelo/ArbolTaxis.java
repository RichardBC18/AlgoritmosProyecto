package Modelo;

import javax.swing.table.DefaultTableModel;

public class ArbolTaxis {

    Taxis raiz;

    public ArbolTaxis() {
        raiz = null;
    }

    public void agregarNodo(String placa, String modelo, String zona, String chofer, String servicio) {
        Taxis nuevo = new Taxis(placa, modelo, zona, chofer, servicio);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Taxis auxiliar = raiz;
            Taxis padre;
            while (true) {
                padre = auxiliar;
                int comparacion = placa.compareTo(auxiliar.Placa);

                if (comparacion < 0) {
                    auxiliar = auxiliar.hijoIzq;

                    if (auxiliar == null) {
                        padre.hijoIzq = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDer;

                    if (auxiliar == null) {
                        padre.hijoDer = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void inOrden(Taxis r, DefaultTableModel model) {
        if (r != null) {
            inOrden(r.hijoIzq, model);
            model.addRow(new Object[]{r.Placa, r.Chofer, r.ModeloTaxi, r.Zona, r.TipoServicio});
            inOrden(r.hijoDer, model);
        }
    }

    public void preOrden(Taxis r, DefaultTableModel model) {
        if (r != null) {
            model.addRow(new Object[]{r.Placa, r.Chofer, r.ModeloTaxi, r.Zona, r.TipoServicio});
            preOrden(r.hijoIzq, model);
            preOrden(r.hijoDer, model);
        }
    }

    public void postOrden(Taxis r, DefaultTableModel model) {
        if (r != null) {
            postOrden(r.hijoIzq, model);
            postOrden(r.hijoDer, model);
            model.addRow(new Object[]{r.Placa, r.Chofer, r.ModeloTaxi, r.Zona, r.TipoServicio});
        }
    }

    public Taxis buscarNodo(String placa) {
        Taxis aux = raiz;
        while (!aux.Placa.equals(placa)) {
            int comparacion = placa.compareTo(aux.Placa);

            if (comparacion < 0) {
                aux = aux.hijoIzq;
            } else {
                aux = aux.hijoDer;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    public boolean eliminar(String placa) {
        Taxis auxiliar = raiz;
        Taxis padre = raiz;
        boolean esHijoIzq = true;

        while (!auxiliar.Placa.equals(placa)) {
            padre = auxiliar;
            int comparacion = placa.compareTo(auxiliar.Placa);

            if (comparacion < 0) {
                esHijoIzq = true;
                auxiliar = auxiliar.hijoIzq;
            } else {
                esHijoIzq = false;
                auxiliar = auxiliar.hijoDer;
            }

            if (auxiliar == null) {
                return false;
            }
        }

        Taxis reemplazo = obtenerNodoReemplazo(auxiliar);

        if (auxiliar.hijoIzq == null && auxiliar.hijoDer == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (esHijoIzq) {
                padre.hijoIzq = null;
            } else {
                padre.hijoDer = null;
            }
        } else if (auxiliar.hijoDer == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.hijoIzq;
            } else if (esHijoIzq) {
                padre.hijoIzq = auxiliar.hijoIzq;
            } else {
                padre.hijoDer = auxiliar.hijoIzq;
            }
        } else if (auxiliar.hijoIzq == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.hijoDer;
            } else if (esHijoIzq) {
                padre.hijoIzq = auxiliar.hijoDer;
            } else {
                padre.hijoDer = auxiliar.hijoDer;
            }
        } else {
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (esHijoIzq) {
                padre.hijoIzq = reemplazo;
            } else {
                padre.hijoDer = reemplazo;
            }
            reemplazo.hijoIzq = auxiliar.hijoIzq;
        }

        return true;
    }

    public Taxis obtenerNodoReemplazo(Taxis nodoReemp) {
        Taxis reemplazarPadre = nodoReemp;
        Taxis reemplazo = nodoReemp;
        Taxis auxiliar = nodoReemp.hijoDer;

        while (auxiliar != null) {
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoIzq;
        }

        int comparacion = reemplazo.Placa.compareTo(nodoReemp.Placa);

        if (reemplazo != nodoReemp.hijoDer) {
            reemplazarPadre.hijoIzq = reemplazo.hijoDer;
            reemplazo.hijoDer = nodoReemp.hijoDer;
        }

        return reemplazo;
    }

    public Taxis getRaiz() {
        return raiz;
    }

}
