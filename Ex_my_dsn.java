import java.sql.*;
public class Ex_my_dsn
{
	public static void main(String s[])
	{
		try
		{
			Connection con;
			PreparedStatement ps;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:MY_DSN");
			ps = con.prepareStatement("insert into Student values(3,'qqq','Jaipur',12345)");
			ps = con.prepareStatement("delete from Student where ID = 2");
			ps.executeUpdate();
			con.close();
			ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}