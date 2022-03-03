package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Monitoring.MysqlCon;

class MysqlConTest {

	@Test
	void test() {
		
		MysqlCon mysqltest = new MysqlCon();
		mysqltest.connect();
		
		assertEquals(16, Math.round(mysqltest.getArbeitsspeicher()));

		
	}

}
