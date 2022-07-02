package org.kosta.myproject.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {	
	private DataSource dataSource;
	@Autowired
	public MemberDAOImpl(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
		System.out.println("dbcp DI "+dataSource);
	}
	@Override
	public MemberVO findMemberById(String id) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		MemberVO mvo=null;
		try {
			con=dataSource.getConnection();
			String sql="select password,name,address from spring_member where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next())
				mvo=new MemberVO(id,rs.getString(1),rs.getString(2),rs.getString(3));
		}finally {
			closeAll(rs,pstmt,con);
		}
		return mvo;
	}
	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null)
			rs.close();
		if(pstmt!=null)
			pstmt.close();
		if(con!=null)
			con.close();		
	}
}








