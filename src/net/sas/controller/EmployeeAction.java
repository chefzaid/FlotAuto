package net.sas.controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import net.sas.model.bo.Employee;
import net.sas.model.dao.EmployeeDao;
import net.sas.model.service.ContextUtil;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	
	private static final long serialVersionUID = 1L;
	private EmployeeDao dao = (EmployeeDao) ContextUtil.getInstance().getBean("employeeDao");
	private List<Employee> employees;
	private Employee currentEmployee;
	private Employee newEmployee = new Employee();
	private File image;
	
	public String load(){
		employees = dao.read();
		
		Employee e1 = new Employee();
		e1.setFirstName("aze");
		employees.add(e1);
		Employee e2 = new Employee();
		e2.setFirstName("foo");
		employees.add(e2);
		Employee e3 = new Employee();
		e3.setFirstName("abcdef");
		employees.add(e3);
		
		return Action.SUCCESS;
	}
	
	public String view(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		currentEmployee = dao.findById(id);
		load();
		return Action.SUCCESS;
	}
	
	public String delete(){
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		Employee e = dao.findById(id);
		dao.delete(e);
		load();
		return Action.SUCCESS;
	}
	
	public String save(){
		newEmployee = getModel();
		if(image != null){
			newEmployee.setPicture(getPicture());
		}
//		if(currentEmployee != null){
//			System.out.println("update..................................");
//			dao.update(newEmployee);
//		}else{
//			System.out.println("create..................................");
//			dao.create(newEmployee);
//		}
		dao.update(newEmployee);
		load();
		return Action.SUCCESS;
	}

	public String clear(){
		currentEmployee = new Employee();
		return Action.SUCCESS;
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employee getCurrentEmployee() {
		return currentEmployee;
	}

	public void setCurrentEmployee(Employee currentEmployee) {
		this.currentEmployee = currentEmployee;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public Employee getModel() {
		return newEmployee;
	}
	
	public void setImage(File image) {
		this.image = image;
	}
	public File getImage() {
		return image;
	}
	private byte[] getPicture() {
		byte[] imageInByte = null;
		BufferedImage originalImage;
		try {
			originalImage = ImageIO.read(image);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(originalImage, "jpg", baos);
			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return imageInByte;
	}
}
