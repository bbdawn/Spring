package org.kosta.myproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kosta.myproject.vo.MemberVO;

@Mapper
public interface MemberMapper {
	public MemberVO findMemberById(String id);

	public int getTotalMemberCount();

	public int register(MemberVO memberVO);
}
