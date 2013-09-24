package net.sas.test;

import junit.framework.TestCase;
import net.sas.model.bo.Address;
import net.sas.model.bo.Supplier;
import net.sas.model.bo.SupplierType;
import net.sas.model.dao.SupplierDao;
import net.sas.util.ContextUtil;

import org.junit.BeforeClass;
import org.junit.Test;

public class SupplierTest extends TestCase {

	private SupplierDao dao;
	private Supplier s;

	@BeforeClass
	public void setUp() {
		dao = (SupplierDao) ContextUtil.getInstance().getBean("supplierDao");
		s = new Supplier();

		s.setCompanyName("foo qux");
		s.setType(SupplierType.DEALER);
		s.setPhone("4654334564");
		s.setFax("7654324551");
		s.setEmail("oooo@pppp.com");
		s.setNotes("test...");

		Address a = new Address();
		a.setAddress("abcdefgh");
		a.setCity("casa");
		a.setZip(23456);

		s.setAddress(a);

	}

	@Test
	public void testCreate() {
		dao.create(s);
	}
}
