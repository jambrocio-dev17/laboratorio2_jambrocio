/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.ArrayList;
import model.usuario;
import model.rol;

/**
 *
 * @author Josue Ambrocio
 */
public class registro {
    
    public static ArrayList<usuario> usuarios = new ArrayList<>();

    static {
        usuarios.add(new usuario("jambrocio", "Ambrocio17$$", rol.ADMIN, true, "Josue Ambrocio", "jambrocio@gmail.com"));
        usuarios.add(new usuario("cjuarez", "Juarez18$$", rol.USER, true, "Carlos Juarez", "cjuarez@gmail.com"));
        usuarios.add(new usuario("oflores", "Flores63$$", rol.USER, true, "Oscar Flores", "oflores@gmail.com"));
        usuarios.add(new usuario("bdaniela", "Daniel@a27", rol.USER, true, "Daniela B", "bdaniela@gmail.com"));
    }
    
}
