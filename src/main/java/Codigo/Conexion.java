package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;

public class Conexion {
    
    private static String urlConexion = "jdbc:sqlserver://Ing-Rodrigo:1433;" +
            "databaseName=HotelKing;encrypt=true;trustServerCertificate=true;" +
            "user=sa;password=jhuan160899";
    
public static Connection obtenerConexion() {
    try {
        Connection connection =
        DriverManager.getConnection(urlConexion);
        
        return connection;
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    
    }
    public String generarToken(String email) {
       String secretKey = "mySecretKey";
       String token = Jwts.builder()
           .setSubject(email)
           .setIssuedAt(new Date(System.currentTimeMillis()))
           .setExpiration(new Date(System.currentTimeMillis() + 600000))
           .signWith(SignatureAlgorithm.HS512, secretKey.getBytes())
           .compact();
       return token;
    }
}
