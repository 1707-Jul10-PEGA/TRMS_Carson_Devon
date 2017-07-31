package com.revature.database_connections;

import java.sql.SQLException;
import java.util.List;
import com.revature.events.*;
import com.revature.message_system.*;
import com.revature.users.*;

public interface TRMSDAO_interface {
	
	Employee login(String username, String password) throws SQLException;
	
	Employee getEmployee(int id) throws SQLException;
	
	BenCo getBenCo(int id) throws SQLException;
	
	Event getEvent(int id) throws SQLException;
	
	EventType getEventType(int id) throws SQLException;
	
	GradingFormat getGradingFormat(int id) throws SQLException;
	
	Attachment getAttachment(int id) throws SQLException;
	
	FileType getFileType(int id) throws SQLException;
	
	Message getMessage(int id) throws SQLException;
	
	TRF getTRF(int id) throws SQLException;

	int saveEmployee(Employee e) throws SQLException;
	
	int saveBenCo(BenCo bc) throws SQLException;
	
	int saveEvent(Event ev) throws SQLException;
	
	int saveEventType(EventType evt) throws SQLException;
	
	int saveGradingFormat(GradingFormat gf) throws SQLException;
	
	int saveAttachment(Attachment at) throws SQLException;
	
	int saveFileType(FileType ft) throws SQLException;
	
	int saveMessage(Message me) throws SQLException;
	
	int saveTRF(TRF trf) throws SQLException;
	
	void updateEmployee(Employee e) throws SQLException;
	
	void updateBenCo(BenCo bc) throws SQLException;
	
	void updateEvent(Event ev) throws SQLException;
	
	void updateEventType(EventType evt) throws SQLException;
	
	void updateGradingFormat(GradingFormat gf) throws SQLException;
	
	void updateAttachment(Attachment at) throws SQLException;
	
	void updateFileType(FileType ft) throws SQLException;
	
	void updateMessage(Message me) throws SQLException;
	
	void updateTRF(TRF trf) throws SQLException;
	
	List<Employee> getAllEmployees() throws SQLException;
	
	List<BenCo> getAllBenCos() throws SQLException;
	
	List<Event> getAllEvents() throws SQLException;
	
	List<EventType> getAllEventTypes() throws SQLException;
	
	List<GradingFormat> getAllGradingFormats() throws SQLException;
	
	List<Attachment> getAllAttachments() throws SQLException;
	
	List<FileType> getAllFileTypes() throws SQLException;
	
	List<Message> getAllMessages() throws SQLException;
	
	List<TRF> getAllTRFs() throws SQLException;
	
	int deleteEmployee(int id) throws SQLException;
	
	int deleteBenCo(int id) throws SQLException;
	
	int deleteEvent(int id) throws SQLException;
	
	int deleteEventType(int id) throws SQLException;
	
	int deleteGradingFormat(int id) throws SQLException;
	
	int deleteAttachment(int id) throws SQLException;
	
	int deleteFileType(int id) throws SQLException;
	
	int deleteMessage(int id) throws SQLException;
	
	int deleteTRF(int id) throws SQLException;
	
	void printLogs() throws SQLException;
}
