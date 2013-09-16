package net.sas.util;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmployeeDao;

import com.opensymphony.xwork2.ActionSupport;

public class ImageAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
 
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
 
	public String execute() {
		return SUCCESS;
	}
 
	public byte[] getImage() {
		EmployeeDao dao = (EmployeeDao) ContextUtil.getInstance().getBean("employeeDao");
		Employee e = (Employee) dao.findById(id);
		
		return e.getPicture();
	}
 
	public String getContentType() {
		return "image/jpeg";
	}
}
