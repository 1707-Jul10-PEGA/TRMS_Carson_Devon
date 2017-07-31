package com.revature.database_connections;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.revature.events.*;
import com.revature.message_system.*;
import com.revature.users.*;

public class TRMSDAO implements TRMSDAO_interface{
	
	Connection conn = null;
	
	public TRMSDAO() {
		setup();
	}
	
	public void setup() {
		conn = ConnectionFactory.getInstance().getConnection();
	}
	
	public void disconnect() {
		try {
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Employee login(String username, String password) throws SQLException
	{
		Statement stmt = conn.createStatement();
		String sql = "select * from employee where username = '" + username + "' and password = '" + password + "'";
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next())
		{
			Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7));
			rs.close();
			stmt.close();
			return e;
		}
		return null;
	}
	
	public void reject(TRF form, Employee currStep) throws SQLException {
		//Should call form's setApproval(false) method, then update the trf record in the database and send a rejection message to the employee
	}
	
	public void approve(TRF form, Employee currStep) {
		//Should call form's setApproval(true) method, update database trf record, and send messages to both the employee and next step in the process
	}

	public Employee getEmployee(int id) throws SQLException
	{
		Statement stmt = conn.createStatement();
		String sql = "select * from employee where e_id = " + id;
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next())
		{
			Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7));
			rs.close();
			stmt.close();
			return e;
		}
		return null;
	}

	public BenCo getBenCo(int id) throws SQLException
	{
		Statement stmt = conn.createStatement();
		String sql = "select e.* from employee e, benco bc where e.e_id = " + id + " and bc.e_id = " + id;
		ResultSet rs = stmt.executeQuery(sql);
		if (rs.next())
		{
			BenCo bc = new BenCo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7));
			rs.close();
			stmt.close();
			return bc;
		}
		return null;
	}

	public Event getEvent(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public EventType getEventType(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public GradingFormat getGradingFormat(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Attachment getAttachment(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public FileType getFileType(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public Message getMessage(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public TRF getTRF(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public int saveEmployee(Employee e) throws SQLException
	{
		String sql = "insert into employee(first_name, last_name, username, password, ds_id, dh_id) values(?, ?, ?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, e.getfName());
		pstmt.setString(2, e.getlName());
		pstmt.setString(3, e.getUsername());
		pstmt.setString(4, e.getPassword());
		pstmt.setInt(5, e.getDs());
		pstmt.setInt(6, e.getDh());
		pstmt.executeUpdate();
		pstmt.close();
		return 0;
	}

	public int saveBenCo(BenCo bc) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int saveEvent(Event ev) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int saveEventType(EventType evt) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int saveGradingFormat(GradingFormat gf) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int saveAttachment(Attachment at) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int saveFileType(FileType ft) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int saveMessage(Message me) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int saveTRF(TRF trf) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateEmployee(Employee e) throws SQLException
	{
		String sql = "update employee set first_name = ?, last_name = ?, username = ?, password = ?, ds_id = ?, dh_id = ? where e_id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, e.getfName());
		pstmt.setString(2, e.getlName());
		pstmt.setString(3, e.getUsername());
		pstmt.setString(4, e.getPassword());
		pstmt.setInt(5, e.getDs());
		pstmt.setInt(6, e.getDh());
		pstmt.setInt(7, e.geteID());
		pstmt.executeUpdate();
		pstmt.close();
	}

	public void updateBenCo(BenCo bc) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	public void updateEvent(Event ev) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	public void updateEventType(EventType evt) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	public void updateGradingFormat(GradingFormat gf) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	public void updateAttachment(Attachment at) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	public void updateFileType(FileType ft) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	public void updateMessage(Message me) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	public void updateTRF(TRF trf) throws SQLException
	{
		// TODO Auto-generated method stub
		
	}

	public List<Employee> getAllEmployees() throws SQLException
	{
		List<Employee> es = new ArrayList<Employee>();
		Statement stmt = conn.createStatement();
		String sql = "select * from employee";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7));
			es.add(e);
		}
		rs.close();
		stmt.close();
		return es;
	}

	public List<BenCo> getAllBenCos() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<Event> getAllEvents() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<EventType> getAllEventTypes() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<GradingFormat> getAllGradingFormats() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<Attachment> getAllAttachments() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<FileType> getAllFileTypes() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<Message> getAllMessages() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<TRF> getAllTRFs() throws SQLException
	{
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteEmployee(int id) throws SQLException
	{
		String sql = "delete from employee where e_id = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		pstmt.close();
		return 0;
	}

	public int deleteBenCo(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteEvent(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteEventType(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteGradingFormat(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteAttachment(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteFileType(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteMessage(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteTRF(int id) throws SQLException
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public void printLogs() throws SQLException
	{
		// TODO Auto-generated method stub
		
	}
}
