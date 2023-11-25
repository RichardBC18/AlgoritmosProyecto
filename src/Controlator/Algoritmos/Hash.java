/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlator.Algoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Edu
 */
public class Hash {
    public String[] arreglo;
    public int tamanio, contador;

    public Hash(int tam) {
        tamanio = tam;
        arreglo = new String[tam];
        Arrays.fill(arreglo, "-1");
    }

    public void funcionHash(String[] dni, String[] arreglo) {
        for (int i = 0; i < dni.length; i++) {
            String elemento = dni[i];
            int indiceArreglo = Integer.parseInt(elemento) % (tamanio - 1);
            System.out.println("El indice es " + indiceArreglo + " para el elemento " + elemento);
            while (arreglo[indiceArreglo] != "-1"){
                indiceArreglo++;
                System.out.println("Ocurrio una colision en el indice " + (indiceArreglo - 1) + ". Cambiar al indice " + indiceArreglo);
                indiceArreglo%=tamanio;
            }
            arreglo[indiceArreglo] = elemento;
        }
    }

    public void mostrar(String[] dni) {
        int incremento = 0;

        for (int j = 0; j < dni.length; j++) { // tamaño del arreglo
            System.out.println("Elemento " + j + ": " + arreglo[j]);
        }

    }

    public String buscarClave(String elemento, String[]dni) {
        int indiceArreglo = Integer.parseInt(elemento) % (tamanio - 1);
        int contador = 0;
        while (arreglo[indiceArreglo] != "-1") {
            if (arreglo[indiceArreglo].equals(elemento)) {
                System.out.println("Elemento " + elemento + " fue encontrado en el indice " + indiceArreglo);
                return arreglo[indiceArreglo];
            }
            indiceArreglo++;
            indiceArreglo %= tamanio;
            contador++;
            if (contador > (tamanio - 1)) {
                break;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] elementos = {"20","33","21","10","12","14","56","100"};
        Hash hash = new Hash(elementos.length);
        hash.funcionHash(elementos, hash.arreglo);
        hash.mostrar(elementos);
        
        String buscado = hash.buscarClave("33", elementos);
        if (buscado == null) {
            System.out.println("El elemento no se encuentra");
        }
    }

}
