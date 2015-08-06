import java.sql.*;
class MetaProgram
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection co=DriverManager.getConnection("jdbc:odbc:javadsn");
		PreparedStatement ps=co.prepareStatement("select * from students");
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rm=rs.getMetaData();
		int x=rm.getColumnCount();
		for(int i=1;i<=x;i++)
		{
			System.out.println(rm.getColumnName(i));
			System.out.println(rm.getColumnTypeName(i));
		}
		co.close();
	}
}
	