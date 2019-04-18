package kr.co.ecommerce.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
	private String name;
	private String age;
	private Timestamp createDate;
	private Timestamp updateDate;

	public MemberDto() {
		super();
	}

	public MemberDto(String name, String age, Timestamp createDate, Timestamp updateDate) {
		super();
		this.name = name;
		this.age = age;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
}
