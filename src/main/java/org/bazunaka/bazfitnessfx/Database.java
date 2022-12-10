package org.bazunaka.bazfitnessfx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static Connection conn;

    public static Connection Connect() throws SQLException, ClassNotFoundException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:bazFitness.db");

        System.out.println("База Подключена!");

        return conn;
    }

    public static void InsertDB() throws SQLException {
        Statement statement = conn.createStatement();
        statement.execute("INSERT INTO 'Accounts' ('AccountName', 'AccountPswd') VALUES('admin', 'admin');");
        System.out.println("Add success!");
    }

    public static List<String> SelectDB(String query, int columnIndex) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(query);
        List<String> lst = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(columnIndex);
            lst.add(name);
        }
        return lst;
    }

    public static List<String> SelectWorkout(String nameMG) throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(
                "SELECT w.WorkoutName FROM Workouts w, MuscleGroups mg WHERE mg.GroupName = '" + nameMG
                        + "' AND w.GroupID = mg.GroupID ORDER BY w.WorkoutName ASC;");
        List<String> workout = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(1);
            workout.add(name);
        }
        return workout;
    }

    public static List<String> SelectTP() throws SQLException {
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM TrainingPlan tg ;");
        List<String> tp = new ArrayList<String>();
        while (result.next()) {
            String name = result.getString(2);
            tp.add(name);
        }
        return tp;
    }
}
