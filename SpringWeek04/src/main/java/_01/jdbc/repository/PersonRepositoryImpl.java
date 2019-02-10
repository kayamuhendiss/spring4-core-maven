package _01.jdbc.repository;

import _01.jdbc.model.Person;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonRepositoryImpl implements PersonRepository {

     //// veritabani baglantilari icin javax.sql.DataSource kullaniriz.
     //	// DataSource , Connectionlari yonetmek icin kullanilir.


    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private static String INSERT_PERSON="INSERT INTO PERSON (id,name,surname,birthYear) VALUES(?,?,?,?)";
    public void save(Person person) {

        try {
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(INSERT_PERSON);
            preparedStatement.setInt(1,person.getId());
            preparedStatement.setString(2,person.getName());
            preparedStatement.setString(3,person.getSurname());
            preparedStatement.setInt(4,person.getBirthYear());
            preparedStatement.executeUpdate();
            preparedStatement.close();

            ///logging

            System.out.println("Person is inserted...."+person);
        } catch (SQLException e) {

        }

    }
}
