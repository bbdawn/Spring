package org.kosta.myproject.model;

import java.sql.SQLException;

public interface MemberDAO {
	public MemberVO findMemberById(String id) throws SQLException;
}
