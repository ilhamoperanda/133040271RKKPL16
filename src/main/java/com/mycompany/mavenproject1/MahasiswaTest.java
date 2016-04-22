package com.mycompany.mavenproject1;

import org.junit.After;
import org.junit.Before;
import junit.framework.Assert;
import junit.framework.Test;

public class MahasiswaTest {
	private static Mahasiswa m;
	
	@Before
	public void awalTest() {
		m = new Mahasiswa();
		System.out.println("awal test");
	}
	
	public static void test1() {
		m.setNrp("133040271");
		assertNotNull("seharusnya tidak null", m.getNrp());
	}
	private static void assertNotNull(String string, String nrp) {
		// TODO Auto-generated method stub
		
	}
	
	public static void test2() {
		m.setNama(null);
		assertNull("seharusnya tidak null", m.getNama());
	}

	public static void test3() {
		m.setNama("ilham");
		assertSame(m.getNama());
	}

	private static void assertSame(String nama) {
		// TODO Auto-generated method stub
		
	}

	private static void assertNull(String string, String nama) {
		// TODO Auto-generated method stub
		
	}

	@After
	public static void akhirTest() {
		System.out.println("test selesai");
	}
	
	public static void main(String[] args) {
		
	}
}
