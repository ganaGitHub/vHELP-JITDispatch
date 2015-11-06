package com.verizon.JITDispatch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.verizon.JITDispatch.SampleAdd;

public class SampleAddTest {

	private SampleAdd sampleClass;

	@Before
	public void setUp() {
		sampleClass = new SampleAdd();
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(5, sampleClass.add(3, 2));
	}

	@After
	public void settleDown() {
		sampleClass = null;
	}

}
