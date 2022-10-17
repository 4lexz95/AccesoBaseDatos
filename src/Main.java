import principal.bd.controladores.DataBaseController;
import principal.bd.modelos.Animal;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        try {
            DataBaseController dtc = new DataBaseController();
            Animal animal = new Animal(1,"MARINO","Nemo","Naranja",1,1);
            Connection connection = dtc.obtenerConexion();
           // dtc.insertarAnimal(animal,connection);
            System.out.println(dtc.getAnimal(1,connection));

        } catch (SQLException e) {
           // System.out.println(e.getLocalizedMessage());
            e.printStackTrace();

        }


    }
}