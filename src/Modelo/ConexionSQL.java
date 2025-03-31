package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionSQL {   
    protected static Connection CON = null;
    static String BD = "Nombre_de_la_BD";
    static String DB_URL = "jdbc:mysql://localhost/" + BD;
    static String USER = "root";
    static String PASSWORD = "";
    static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    public Connection Conectar() throws ClassNotFoundException {
        try { 
            Class.forName(JDBC_DRIVER); 
            CON = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CON;
    }
    
    public Connection Cerrar() throws SQLException {
        if (CON != null) {
            if (!CON.isClosed()) {
                CON.close();
            }
        }
        return CON;
    }
}


