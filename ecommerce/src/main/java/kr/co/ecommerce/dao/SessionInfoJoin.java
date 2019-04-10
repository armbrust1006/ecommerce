package kr.co.ecommerce.dao;

import java.sql.Timestamp;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Entity(name = "member")
public class SessionInfoJoin extends MemberTable {

	public SessionInfoJoin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SessionInfoJoin(Long memberCode, String name, String age, Timestamp createDate, Timestamp updateDate) {
		super(memberCode, name, age, createDate, updateDate);
		// TODO Auto-generated constructor stub
	}

}
