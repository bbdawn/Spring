package org.kosta.myproject.service;

import org.kosta.myproject.vo.MemberVO;
import org.kosta.myproject.vo.PointVO;

public interface MemberService {

	int getTotalMemberCount();

	MemberVO findMemberById(String id);

	PointVO findPointById(String id);

	void registerMemberAndPoint(MemberVO memberVO, PointVO pointVO);

}