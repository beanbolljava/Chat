package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
	private final String url="jdbc:mysql://101.101.101.00:3306/work_user_name";
	private final String username="work_user_name";
	private final String password="KHRaLFF4yRkWCcWt";
	private Connection con=null;
	
	public Jdbc(){
	try{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("数据库连接失败");
		}
	}
	
	public Boolean creatConnection(){
		try{
			con=DriverManager.getConnection(url,username,password);
			con.setAutoCommit(true);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return true;
		
	}
	//添加至数据库
		public Boolean executeUpdateName(String user,String text){
			if(con==null){
				
				creatConnection();
			}
			try{
				PreparedStatement ptmt = con.prepareStatement("insert into record(user,record) values (?,?)");
				ptmt.setString(1,user);
				ptmt.setString(2,text);
				ptmt.executeUpdate();
				return true;
			}catch(SQLException e){
				
				return false;
			}
			
		}
		
		public ResultSet executeQuery_work(String sql){
			ResultSet rs;
			try{
				if(con==null){
					creatConnection();
				}
				PreparedStatement ptmt = con.prepareStatement(sql);
				rs=ptmt.executeQuery();
				return rs;
			}catch(Exception e){
				return null;
			}
			
		}
}
