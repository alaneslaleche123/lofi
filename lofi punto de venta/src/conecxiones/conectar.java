
package conecxiones;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conectar {
    private static Connection conn;
    //hacemos referencia la driver que importamos 
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user ="root";
    private static final String password ="";
    private static final String url="jdbc:mysql://localhost:3306/lifo";
    //creamos el metodo constructor 
    public conectar(){
        conn= null;
        try{
            Class.forName(driver);
            conn= (Connection) DriverManager.getConnection(url,user,password);
            if(conn != null){
                System.out.print("Conecxion establercida.. ");
            }
        } catch(ClassNotFoundException | SQLException e){
            System.out.print("Error al conectar : "+e);
        }
    }
    //este metodo me da la conecxion 
public Connection getConnection(){
    return conn;
    }
public void desconectar(){
    conn = null;
    if(conn == null){
        System.out.print("Estas desconectado ");
        }
    }
}