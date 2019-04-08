package kr.co.ecommerce.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@ToString
@Getter
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long member_code;
	@NonNull
	@Column
	private String name;
	@NonNull
	@Column
	private String age;
	@NonNull
	@Column
	private Timestamp create_date;
	@NonNull
	@Column
	private Timestamp update_date;

	public Member() {
		super();
	}

	public Member(Long member_code, String name, String age, Timestamp create_date, Timestamp update_date) {
		super();
		this.member_code = member_code;
		this.name = name;
		this.age = age;
		this.create_date = create_date;
		this.update_date = update_date;
	}
}
