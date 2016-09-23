/**
 * 
 */
package com.diallo.zakaria.tp4;

import junit.framework.TestCase;

public class MaClasse2Test extends TestCase {

	public void testSommer() throws Exception {
		MaClasse mc = new MaClasse(1, 1);

		// cas de test 1
		assertEquals(2, mc.sommer());

		// cas de test 2
		try {
			mc.setA(0);
			mc.setB(0);
			mc.sommer();
			fail("Une exception de type IllegalStateException aurait du etre levee");
		} catch (IllegalStateException ise) {
		}

	}
	
	public void testSommerFail() throws Exception {
		MaClasse mc = new MaClasse(1, 1);

		// cas de test 1
		assertEquals(1, mc.sommer());

		// cas de test 2
		try {
			mc.setA(0);
			mc.setB(0);
			mc.sommer();
			fail("Une exception de type IllegalStateException aurait du etre levee");
		} catch (IllegalStateException ise) {
		}

	}
	
}