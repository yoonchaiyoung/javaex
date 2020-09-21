package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestbookDaoImpl implements GuestbookDao {
	String dburl = "jdbc:mariadb://192.168.1.134:3306/mysite?useSSL=false";
	String dbuser = "mysite";
	String dbpass = "mysite";

	//	공통 메서드 : 접속
	private Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			//	드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			//	접속 객체 생성 -> return
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
		} catch (ClassNotFoundException e) {
			System.err.println("접속 실패");
		}

		return conn;
	}
	@Override
	public List<GuestbookVo> searchAll() {
		// SELECT ... FROM guestbook ORDER BY reg_date DESC
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		List<GuestbookVo> list = new ArrayList<>();

		String sql = "SELECT no, name, password, message, reg_date " +
				"FROM guestbook ORDER BY reg_date DESC";

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			//	커서 루프
			while(rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String message = rs.getString(4);
				Date regDate = rs.getDate(5);

				//	VO 객체 생성
				GuestbookVo vo = new GuestbookVo(no, name, password, message, regDate);
				//	반환할 List에 vo 추가
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//	자원 정리
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;	//	list 객체 반환(ResultSet -> List로 변환)
	}

	@Override
	public int insert(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(GuestbookVo vo) {
		// TODO 연습문제
		return 0;
	}

	@Override
	public int delete(Long no, String password) {
		// TODO 연습문제
		return 0;
	}

	@Override
	public List<GuestbookVo> searchByKeyword(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}