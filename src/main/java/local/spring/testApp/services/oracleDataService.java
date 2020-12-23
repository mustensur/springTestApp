package local.spring.testApp.services;

import oracle.jdbc.pool.OracleDataSource;
import java.sql.*;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.sql.SQLException;

@Service
public class oracleDataService {

    private Connection connection;

    @PostConstruct
    public void initConnection() throws SQLException {
        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@localhost:1521:XE");
        ods.setUser("SYSTEM");
        ods.setPassword("vagrant");
        connection = ods.getConnection();

        // execute statement
        String query = "INSERT INTO CLIENTS VALUES ( CLIENT_ID_SEQ.NEXTVAL, 'JAVANEW', 'User')";
        Statement stmt = connection.createStatement();
        stmt.executeQuery(query);
    }

}