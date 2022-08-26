
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;


import lombok.Data;

@Data
public class Users_list {
    int ID;
    String nombre;
    String apellido;
    int telefono;
    String email;
    String usuario;
    String clave;
    Users_list(int ID, String nombre, String apellido, int telefono, String email, String usuario, String clave)  {
        this.ID=ID;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.usuario=usuario;
        this.clave=clave;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID)
    {this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre)
    {this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido)
    {this.apellido = apellido;}
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono)
    {this.telefono = telefono;}
    public String getEmail() {
        return email;
    }
    public void setEmail(String email)
    {this.email =email;}

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario)
    {this.usuario = usuario;}
    public String getClave() {
        return clave;
    }
    public void setClave(String clave)
    {this.nombre = clave;}
}

class MainUsers{
    private ArrayList<Users_list> usuarios;
    public  ArrayList<Users_list>getUsuarios(){
        return usuarios;

    }
    public MainUsers(){
        usuarios=new ArrayList<Users_list>();
    }
    public  void add(Users_list object){
        usuarios.add(object);
    }
}

class New_User_list{
    private ArrayList<Users_list> usuarios;

    public void getAllUserFromMainStore(ArrayList<Users_list> list) {
        // first syntax
        this.usuarios = list;
        // Second syntax
        // this.books = (ArrayList<Book>) list.clone();

    }

    public void printUsers() {
        for (Users_list b : this.usuarios) {
            System.out.println(b.getID() + " " + b.getNombre()+ " " + b.getApellido()+ " " + b.getTelefono()+ " " + b.getEmail()+ " " + b.getUsuario()+ " " + b.getClave());
        }
    }
}

