

package Modelos;


public class EmpleadosModel {
    int Codigo;
    String Nombre;
    String Apellidos;
    String Telefono;

    public EmpleadosModel(int Codigo, String Nombre, String Apellidos) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
     public void AgreagarEmpleados(int Codigo,String Apellidos,String Nombre,String Telefono){
        this.Apellidos= Apellidos;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        
    }
    
}
