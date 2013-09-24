package net.sas.util;

import net.sas.model.bo.Employee;
import net.sas.model.bo.Vehicle;
import net.sas.model.dao.EmployeeDao;
import net.sas.model.dao.VehicleDao;

import com.opensymphony.xwork2.Action;

public class ImageAction implements Action {
	
	private String entity;
	private Integer id;
 
	@Override
	public String execute() {
		return Action.SUCCESS;
	}
	
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getImage() {
		if(entity.equals("employee")){
			EmployeeDao dao = (EmployeeDao) ContextUtil.getInstance().getBean("employeeDao");
			Employee e = (Employee) dao.findById(id);
			return e.getPicture();			
		}else if(entity.equals("vehicle")){
			VehicleDao dao = (VehicleDao) ContextUtil.getInstance().getBean("vehicleDao");
			Vehicle v = (Vehicle) dao.findById(id);
			return v.getPicture();
		}
		return null;
	}
 
	public String getContentType() {
		return "image/jpeg";
	}
}
