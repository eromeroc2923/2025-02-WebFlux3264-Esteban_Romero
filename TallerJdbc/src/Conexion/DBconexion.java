package Conexion;

import java.sql.*;

public class DBconexion {

    public static final String URL = "jdbc:mysql://localhost:3306/bd_estudiantes";
    public static final String USER = "root";
    public static final String PASSWORD = "";


    public static Connection conectar(){

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);

        }catch (SQLException e) {

            e.printStackTrace();
            return null;
        }



    }


}
