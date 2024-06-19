package SQLserverConexion;

import java.sql.*;

/**
 *
 * @author HP
 */
public class Conexion {
    
public static Connection obtenerConexion(){
    String url = "jdbc:sqlserver://localhost:1433;"
            +"database = miscelanea;"
            +"user = sa;"
            +"password = 12345678";
    
    try{
        Connection con = DriverManager.getConnection(url);
    return con;
    
    }catch(SQLException ex){
        System.out.println(ex.toString());
       return null;
    }
}
    
    
    
}
