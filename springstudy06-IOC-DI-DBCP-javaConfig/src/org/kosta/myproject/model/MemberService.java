package org.kosta.myproject.model;

import java.sql.SQLException;

public interface MemberService {

	MemberVO findMemberById(String id) throws SQLException;

}