/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class usuario {
    private String username;
    private String password;
    private rol rol;
    private boolean activo;
    private String nombre;
    private String correo;

    public usuario(String username, String password, rol rol, boolean activo, String nombre, String correo) {
        this.username = username;
        this.password = password;
        this.rol = rol;
        this.activo = activo;
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public void setRol(rol rol) {
        this.rol = rol;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public rol getRol() { return rol; }
    public boolean isActivo() { return activo; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }

    public void setPassword(String password) { this.password = password; }
    public void setActivo(boolean activo) { this.activo = activo; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCorreo(String correo) { this.correo = correo; }
}