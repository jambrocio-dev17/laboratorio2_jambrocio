/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio2_jambrocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josue Ambrocio
 */
public class gestorUsuarios {
    
    // Lista estática que vive durante toda la ejecución
    private static List<String[]> listaUsuarios = new ArrayList<>();

    // Retorna la lista
    public static List<String[]> getLista() {
        return listaUsuarios;
    }

    // Agrega un usuario
    public static void agregar(String usuario, String nombre, String correo, String estado) {
        listaUsuarios.add(new String[]{usuario, nombre, correo, estado});
    }

    // Modifica un usuario por índice
    public static void modificar(int index, String usuario, String nombre, String correo, String estado) {
        listaUsuarios.set(index, new String[]{usuario, nombre, correo, estado});
    }

    // Inactiva un usuario por índice
    public static void inactivar(int index) {
        listaUsuarios.get(index)[3] = "INACTIVO";
    }

    // Verifica si el usuario ya existe
    public static boolean existe(String usuario) {
        for (String[] u : listaUsuarios) {
            if (u[0].equalsIgnoreCase(usuario)) {
                return true;
            }
        }
        return false;
    }
    
}
