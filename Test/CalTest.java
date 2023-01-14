import static org.junit.jupiter.api.Assertions.*;

import calproj.calclass;
class CalTest {
	public void calTestadd() {
		assertEquals(20,calclass.add(10, 20));
	}
	public void calTestsub() {
		assertEquals(20,calclass.sub(50, 20));
	}
	public void calTestmul() {
		assertEquals(20,calclass.mul(6, 5));
	}
	public void calTestdiv() {
		assertEquals(20,calclass.div(30, 5));
	}
	

	}
