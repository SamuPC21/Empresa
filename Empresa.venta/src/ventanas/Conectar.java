
package ventanas;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    Connection conectar=null;
    public Connection Conexion()
    {
    try
    { 
        Class.forName("com.mysql.jdbc.Driver");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost/bs_alm","root","");
        
        
    }
    catch (Exception e){
        System.out.print(e.getMessage());
    }
    return conectar;
    }
    
   
    
}
