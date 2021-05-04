package cz.educanet;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import java.lang.reflect.Array;
import java.sql.*;
import java.util.ArrayList;

@ApplicationScoped
public class AnimalsManager {

    public ArrayList<Animals> getAnimals() throws SQLException {
        ArrayList<Animals> animalsArrayList = new ArrayList<>();

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/c3zoo", "root", "");

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT Z.id, Z.jmeno, D.nazev \n" +
                "FROM Zvirata AS Z JOIN Druhy AS D ON (Z.druh = D.id)\n" +
                "GROUP BY Z.id\n" +
                "LIMIT 50");

        while(result.next()) {
            Animals animal = new Animals();

            animal.setZvireId(Integer.parseInt(result.getString("id")));
            animal.setZvireJmeno(result.getString("jmeno"));
            animal.setDruhJmeno(result.getString("nazev"));

            animalsArrayList.add(animal);
        }
        connection.close();

        return animalsArrayList;
    }


}
