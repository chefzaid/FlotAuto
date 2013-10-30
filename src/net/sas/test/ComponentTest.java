package net.sas.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;
import net.sas.model.bo.Address;
import net.sas.model.bo.Component;
import net.sas.model.bo.ComponentType;
import net.sas.model.bo.Cycle;
import net.sas.model.bo.MeasureUnit;
import net.sas.model.bo.Supplier;
import net.sas.model.bo.SupplierType;
import net.sas.model.bo.Warranty;
import net.sas.model.dao.GenericDao;
import net.sas.util.ContextUtil;

import org.junit.BeforeClass;
import org.junit.Test;

public class ComponentTest extends TestCase {

	private GenericDao<Component> dao;
	private Component c;

	@SuppressWarnings("unchecked")
	@BeforeClass
	public void setUp() {
		dao = (GenericDao<Component>) ContextUtil.getInstance().getBean(
				"componentDao");
		c = new Component();

		c.setLabel("manahjd");
		c.setBrand("pwdodp");
		c.setType(ComponentType.PART);
		c.setPrice(244.00);
		c.setStockQuantity(5);
		c.setReference("azedcvg");
		
		Supplier s1 = new Supplier();
		s1.setCompanyName("AZERTY");
		s1.setType(SupplierType.DEALER);
		s1.setPhone("4654334564");
		s1.setFax("7654324551");
		s1.setEmail("oooo@pppp.com");
		s1.setNotes("test...");
		Address a1 = new Address();
		a1.setAddress("abcdefgh");
		a1.setCity("casa");
		a1.setZip(23456);
		s1.setAddress(a1);
		Supplier s2 = new Supplier();
		s2.setCompanyName("mmmmmmmmmmpppp");
		s2.setType(SupplierType.GARAGE);
		s2.setPhone("4654334564");
		s2.setFax("7654324551");
		s2.setEmail("oooo@pppp.com");
		s2.setNotes("test...");
		Address a2 = new Address();
		a2.setAddress("abcdefgh");
		a2.setCity("casa");
		a2.setZip(23456);
		s2.setAddress(a2);
		List<Supplier> suppliers = new ArrayList<Supplier>();
		suppliers.add(s1); suppliers.add(s2);
		c.setSuppliers(suppliers);
		
		Warranty w = new Warranty();
		w.setBeginDate(new Date());
		Cycle cy = new Cycle();
		cy.setFrequence(360);
		cy.setUnit(MeasureUnit.DAY);
		w.setValidity(cy);
		c.setWarranty(w);
		
	}

	@Test
	public void testCreate() {
		dao.create(c);
	}
}
