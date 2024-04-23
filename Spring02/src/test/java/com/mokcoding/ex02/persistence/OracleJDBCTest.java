package com.mokcoding.ex02.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mokcoding.ex02.config.WebConfig;

import lombok.extern.log4j.Log4j;
import oracle.jdbc.OracleDriver;

@RunWith(SpringJUnit4ClassRunner.class) // 스프링 JUint test 연결
@ContextConfiguration(classes = {WebConfig.class}) // 설정 파일 연결
@Log4j
public class OracleJDBCTest {	
	private static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USER = "STUDY";
	private static String PASSWORD = "1234";
	
	@Test
	public void testConnection() {
		Connection conn =null;
		
		try {
			DriverManager.registerDriver(new OracleDriver());
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			log.info("oracle 연결 성공 : conn = " + conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("oracle 연결 실패 : " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
