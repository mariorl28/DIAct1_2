/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pa.cifpaviles.dam.alumno;

/**
 *
 * @author mariorl
 */
public class Alumno {
    private String nombre;
    private String Apellidos;
    private String email;
    private int edad;
    private String telefono;
    
    private static String nmenor = "";
    private static int emenor = 100;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public static String getNmenor() {
        return nmenor;
    }

    public static void setNmenor(String nmenor) {
        Alumno.nmenor = nmenor;
    }

    public static int getEmenor() {
        return emenor;
    }

    public static void setEmenor(int emenor) {
        Alumno.emenor = emenor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Alumno() {
    }

    public Alumno(String nombre, String Apellidos, int edad) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
        if(edad<emenor){
            nmenor=this.nombre +" "+this.Apellidos;
            emenor=this.edad;
        }
    }

    public Alumno(String nombre, String Apellidos, int edad,String email, String telefono) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
        if(edad<emenor){
            nmenor=this.nombre +" "+this.Apellidos;
            emenor=this.edad;
        }
    }
    
    public boolean mayoredad(){
        boolean mayor=false;
        if(this.edad<18){
            mayor = false;
        }
        else {
            mayor = true;
        }
        return mayor;
    }

    public static void main(String[] args) {
        
    }
}
