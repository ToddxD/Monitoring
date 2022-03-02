package Monitoring;

import java.sql.*;

class MysqlCon {

	String prozess = "", arbeitsspeicher = "";

	public void connect() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
					"jdbc:mysql://17.28.163.3:3306/logger", "root", "");// here 17.28.163.3:3306 is host with port,
																		// logger is database name and root is username
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(
					"SELECT Datum, Prozesse, Arbeitsspeicher FROM Monitoring WHERE Datum = (SELECT max(Datum) FROM Monitoring)");

			prozess = rs.getString(1);// je nachdem wie gezählt wird eventuell 2
			arbeitsspeicher = rs.getString(2);// je nachdem wie gezählt wird eventuell 3
			System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3)); // Test der einzelnen
																									// Werte
			con.close();
		}

		catch (Exception e) {
			System.out.println(e);

		}

	}

	public String getProzess() {
		return prozess;
	}

	public String getArbeitsspeicher() {
		return arbeitsspeicher;
	}

}
