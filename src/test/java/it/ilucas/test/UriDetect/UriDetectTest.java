package it.ilucas.test.UriDetect;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import it.ilucas.beans.ServerBean;
import it.ilucas.checker.UriDetect;

public class UriDetectTest {

	@Test
	public void test() {
		String text = "ciao ciao ciao www.ilucas.it and google.com";
		
		UriDetect detect = new UriDetect(text);
		List<ServerBean> broke = detect.broke();
		//fail("Not yet implemented");
		assertEquals(1, broke.size());
		
	}

}
