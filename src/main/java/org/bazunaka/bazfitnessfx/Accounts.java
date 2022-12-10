package org.bazunaka.bazfitnessfx;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Accounts {
    int AccountID;
    public String AccountName = "";
    public String AccountPswd = "";
    public String AccountQuery = "";

    public boolean CheckAccount(String query, int columnIndex, Connection conn) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(query);
        int count = result.getInt(columnIndex);
        return (count == 1);
    }

    
}
