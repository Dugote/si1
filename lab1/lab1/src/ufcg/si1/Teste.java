package ufcg.si1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Teste {

	@Test
	public void testXpto() {
		String expected = "Bla";
		assertEquals(expected, ImprimeAlgo.xpto());
	}

}
