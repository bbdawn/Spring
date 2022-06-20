package org.kosta.myproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 기본 생성자 , getter, setter , toString , equals , hashCode 등을 자동 생성
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO {
	private String id;
	private String password;
	private String name;
	private String address;
}
