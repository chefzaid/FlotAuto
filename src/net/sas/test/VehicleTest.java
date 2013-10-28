package net.sas.test;

import java.io.File;
import java.util.Date;

import junit.framework.TestCase;
import net.sas.model.bo.Address;
import net.sas.model.bo.Color;
import net.sas.model.bo.Cycle;
import net.sas.model.bo.Insurance;
import net.sas.model.bo.MeasureUnit;
import net.sas.model.bo.Supplier;
import net.sas.model.bo.SupplierType;
import net.sas.model.bo.TechnicalCheck;
import net.sas.model.bo.Vehicle;
import net.sas.model.bo.VehicleTax;
import net.sas.model.bo.VehicleType;
import net.sas.model.bo.Warranty;
import net.sas.model.dao.GenericDao;
import net.sas.util.ContextUtil;
import net.sas.util.ImageUtil;

import org.junit.BeforeClass;
import org.junit.Test;

public class VehicleTest extends TestCase {

	private GenericDao<Vehicle> dao;
	private Vehicle v;

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void setUp() {
		dao = (GenericDao<Vehicle>) ContextUtil.getInstance().getBean(
				"vehicleDao");
		v = new Vehicle();

		v.setBrand("abcd");
		v.setModel("efgh");
		v.setColor(Color.BLACK);
		v.setYear(2010);
		v.setType(VehicleType.VAN);
		v.setPicture(ImageUtil.getImageBytes(new File("C:\\img2.jpg")));
		v.setRegistrationNumber("ijkl");
		v.setChassisNumber("mnop");
		v.setSpecs("qrst");
		v.setNotes("uvwx");

		Supplier s = new Supplier();
		s.setCompanyName("yza");
		s.setType(SupplierType.DEALER);
		s.setPhone("542345");
		s.setEmail("efg");
		s.setFax("743224");
		s.setNotes("hij");
		Address a = new Address();
		a.setAddress("rue 8");
		a.setCity("casa");
		a.setZip(20420);
		s.setAddress(a);

		Warranty w = new Warranty();
		w.setBeginDate(new Date());
		Cycle c = new Cycle();
		c.setFrequence(360);
		c.setUnit(MeasureUnit.DAY);
		w.setValidity(c);

		VehicleTax t = new VehicleTax();
		t.setFees(700.00);
		t.setPaymentDate(new Date());
		t.setVehicle(v);

		Insurance i = new Insurance();
		i.setInsurer("qwerty");
		i.setPolicyNumber("foo");
		i.setBeginDate(new Date());
		i.setEndDate(new Date());
		i.setVehicle(v);

		TechnicalCheck tc = new TechnicalCheck();
		tc.setVisitDate(new Date());
		tc.setExpireDate(new Date());
		tc.setObservations("ok");
		tc.setReminder(c);
		tc.setVehicle(v);

		v.setSupplier(s);
		v.setWarranty(w);
		v.setTax(t);
		v.setInsurance(i);
		v.setTechnicalCheck(tc);

		v.getTax().setVehicle(v);
		v.getInsurance().setVehicle(v);
		v.getTechnicalCheck().setVehicle(v);
	}

	@Test
	public void testCreate() {
		dao.create(v);
	}
}
