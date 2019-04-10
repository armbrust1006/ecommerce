package kr.co.ecommerce.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Entity
@Table(name = "member")
public class MemberTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "member_code")
	private Long memberCode;

	@Column
	private String name;

	@Column
	private String age;

	@Column(name = "create_date")
	private Timestamp createDate;

	@Column(name = "update_date")
	private Timestamp updateDate;

	public MemberTable() {
		super();
	}

	public MemberTable(Long memberCode, String name, String age, Timestamp createDate, Timestamp updateDate) {
		super();
		this.memberCode = memberCode;
		this.name = name;
		this.age = age;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	@Setter
	@Getter
	@OneToOne
	@JoinColumn(name = "member_code", insertable = false, updatable = false)
	private AuthorizeTable sessionInfo;

}
