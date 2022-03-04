package test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import monitoring.MysqlCon;

class MysqlConTest {

	@Test
	void test() {
		
		MysqlCon mysqltest = new MysqlCon();
		mysqltest.connect();
		
		assertEquals(16, Math.round(mysqltest.getArbeitsspeicher()));

		
	}

}
