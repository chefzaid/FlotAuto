package net.sas.test;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

import junit.framework.TestCase;
import net.sas.model.bo.Address;
import net.sas.model.bo.DrivingLicense;
import net.sas.model.bo.Employee;
import net.sas.model.bo.HealthCheck;
import net.sas.model.bo.Occupation;
import net.sas.model.dao.EmployeeDao;
import net.sas.util.ContextUtil;

import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeTest extends TestCase {

	private EmployeeDao dao;
	private Employee e;

	@BeforeClass
	public void setUp() {
		dao = (EmployeeDao) ContextUtil.getInstance().getBean("employeeDao");
		e = new Employee();

		e.setLastName("abc3333");
		e.setFirstName("foo");
		
		e.setBirthDate(new Date());

		Address adr = new Address();
		adr.setAddress("rue 8");
		adr.setCity("casa");
		adr.setZip(20420);
		e.setAddress(adr);

		e.setPhone("05224444333");
		e.setEmail("test@test.com");

		e.setTrainings("aaaaa, bbbb, ffff, ddd");

		e.setCin("B656");
		e.setHireDate(new Date());

		HealthCheck ex = new HealthCheck();
		ex.setVisitDate(new Date());
		ex.setExpireDate(new Date());
		ex.setObservations("All OK !");
		e.setHealthCheck(ex);

		e.setOccupation(Occupation.DRIVER);
		e.setNumber("hjk356YU");
		e.setNotes("azefghjklszdfhjkl");

		DrivingLicense dl = new DrivingLicense();
		dl.setNumber("234565");
		dl.setType("B");
		dl.setObtainDate(new Date());
		dl.setExpireDate(new Date());
		e.setDrivingLicense(dl);

		File file = new File("C:\\img.jpg");
		byte[] img = getImage(file);
		e.setPicture(img);

		e.setSalary(20000.00);
		
		dl.setEmployee(e);
		ex.setEmployee(e);
	}

	@Test
	public void testCreate() {
		dao.create(e);
	}

//	@Test
//	public void testUpdate() {
//		Employee e = dao.findById(1);
//		assertNotNull(e);
//		e.setLastName("xyz");
//		dao.update(e);
//	}

//	@Test
//	public void testRead() {
//		List<Employee> list = dao.read();
//		assertNotNull(list);
//		assertTrue(list.size() == 1);
//		assertNotNull(list.get(0));
//	}

//	@Test
//	public void testDelete() {
//		dao.delete(e);
//	}
//
//	@Test
//	public void testFindById() {
//		Employee e = dao.findById(1);
//		assertNotNull(e);
//	}
//
//	@Test
//	public void testFindByLastName() {
//		List<Employee> list = dao.findByLastName("abc");
//		assertNotNull(list);
//	}
//
//	@Test
//	public void testFindByFirstName() {
//		List<Employee> list = dao.findByFirstName("foo");
//		assertNotNull(list);
//	}
//
//	@Test
//	public void testFindByOccupation() {
//		List<Employee> list = dao.findByOccupation(Occupation.DRIVER);
//		assertNotNull(list);
//	}
//
//	@Test
//	public void testFindByNumber() {
//		Employee e = dao.findByNumber("hjk356YU");
//		assertNotNull(e);
//	}
//
//	@Test
//	public void testFindByCin() {
//		Employee e = dao.findByCin("B656");
//		assertNotNull(e);
//	}
//
//	@Test
//	public void testFindByDrivingLicense() {
//		Employee e = dao.findByDrivingLicense("456789");
//		assertNotNull(e);
//	}
	
	public byte[] getImage(File image) {
		byte[] imageInByte = null;
		BufferedImage originalImage;
		try {
			originalImage = ImageIO.read(image);
			// convert BufferedImage to byte array
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(originalImage, "jpg", baos);
			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		return imageInByte;
	}
}
