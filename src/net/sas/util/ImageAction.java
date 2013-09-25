package net.sas.util;

import net.sas.model.bo.Employee;
import net.sas.model.bo.Vehicle;
import net.sas.model.dao.GenericDao;

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

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public byte[] getImage() {
		GenericDao dao = null;
		if (entity.equals("employee")) {
			dao = (GenericDao<Employee>) ContextUtil.getInstance().getBean(
					"employeeDao");
			Employee e = (Employee) dao.findById(id);
			return e.getPicture();
		} else if (entity.equals("vehicle")) {
			dao = (GenericDao<Vehicle>) ContextUtil.getInstance().getBean(
					"vehicleDao");
			Vehicle v = (Vehicle) dao.findById(id);
			return v.getPicture();
		}
		return null;
	}

	public String getContentType() {
		return "image/jpeg";
	}
}
