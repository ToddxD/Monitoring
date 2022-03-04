package monitoring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlCon {

	private int prozess = 0;
	private float arbeitsspeicher = 0.0f;
	private String letztesDatum = "";

	public void connect() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://17.28.163.3:3306/logger?user=root&password=");// here 17.28.163.3:3306 is host with port,
																		// logger is database name and root is username
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(
					"SELECT Datum, Prozesse, Arbeitsspeicher FROM Monitoring WHERE Datum = (SELECT max(Datum) FROM Monitoring)");

			if (rs.next()) {
				prozess = rs.getInt("Prozesse");// je nachdem wie gezählt wird eventuell 2
				arbeitsspeicher = rs.getFloat("Arbeitsspeicher");// je nachdem wie gezählt wird eventuell 3
				letztesDatum = rs.getString("Datum");
			}
			con.close();
		}

		catch (Exception e) {
			throw new IllegalArgumentException(e);

		}

	}

	public int getProzess() {
		return prozess;
	}

	public float getArbeitsspeicher() {
		return arbeitsspeicher;
	}
	
	public String getLetztesDatum() {
		return letztesDatum;
	}

}
