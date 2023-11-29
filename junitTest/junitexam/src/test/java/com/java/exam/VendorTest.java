package com.java.exam;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class VendorTest {
	
	@Test
	public void testConstructor() throws ParseException {
		Vendor vendor = new Vendor();
		assertNotNull(vendor);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String Date;
		Date date = new Date();
		Vendor emp = new Vendor(1001, "Pramita", "Delhi", "pramita@gmail.com", "98675498", "Pending", sdf.parse("2023-09-22"), 5, "Good");
		
		assertEquals(1001,emp.getVendorId());
		assertEquals("Pramita",emp.getVendorName());
		assertEquals("Delhi",emp.getVendorCity());
		assertEquals("pramita@gmail.com",emp.getVendorEmail());
		assertEquals("98675498",emp.getVendorMobile());
		assertEquals("Pending",emp.getVendorStatus());
		assertEquals(sdf.parse("2023-09-22"),emp.getVendorStartedDate());
		assertEquals(5,emp.getVendorRating(),0);
		assertEquals("Good",emp.getVendorReview());
	}
	
	@Test
	public void testGetterAndSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String Date;
		Date date = new Date();
		Vendor vendor = new Vendor();
		vendor.setVendorId(1001);
		vendor.setVendorName("Pramita");
		vendor.setVendorCity("Delhi");
		vendor.setVendorEmail("pramita@gmail.com");
		vendor.setVendorMobile("98675498");
		vendor.setVendorStatus("Pending");
		vendor.setVendorStartedDate(sdf.parse("2023-09-22"));
		vendor.setVendorRating(5);
		vendor.setVendorReview("Good");
		
		assertEquals(1001,vendor.getVendorId());
		assertEquals("Pramita",vendor.getVendorName());
		assertEquals("Delhi",vendor.getVendorCity());
		assertEquals("pramita@gmail.com",vendor.getVendorEmail());
		assertEquals("98675498",vendor.getVendorMobile());
		assertEquals("Pending",vendor.getVendorStatus());
		assertEquals(sdf.parse("2023-09-22"),vendor.getVendorStartedDate());
		assertEquals(5,vendor.getVendorRating(),0);
		assertEquals("Good",vendor.getVendorReview());
		
		}
	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String Date;
		Date date = new Date();	
		Vendor emp = new Vendor(1001,"Pramita", "Delhi","pramita@gmail.com","98675498","Pending",sdf.parse("2023-09-22"), 5,"Good" );
		String result = "Vendor [vendorId=1001, vendorName=Pramita, vendorCity=Delhi, vendorEmail=pramita@gmail.com, vendorMobile=98675498, vendorStatus=Pending, vendorStartedDate=Fri Sep 22 00:00:00 IST 2023, vendorRating=5.0, vendorReview=Good]";
		assertEquals(result, emp.toString());
		
	}
	
	@Test
	public void testhashCode() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String Date;
		Date date = new Date();
		Vendor v1 = new Vendor(1001,"Pramita", "Delhi","pramita@gmail.com","98675498","Pending",sdf.parse("2023-09-22"), 5,"Good");
		Vendor v2 = new Vendor(1001,"Pramita", "Delhi","pramita@gmail.com","98675498","Pending",sdf.parse("2023-09-22"), 5,"Good");
		assertEquals(v1.hashCode(),v2.hashCode());
				
	}
	
	
	
	
	
	

}
