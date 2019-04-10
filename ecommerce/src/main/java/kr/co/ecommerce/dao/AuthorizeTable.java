package kr.co.ecommerce.dao;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Entity
@Table(name = "authorize")
public class AuthorizeTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "authorize_code")
	private Long authorizeCode;

	@Column(name = "member_code")
	private Long memberCode;

	@Column(name = "session_flag")
	private Long sessionFlag;

	@Column(name = "create_date")
	private Timestamp createDate;

	@Column(name = "update_date")
	private Timestamp updateDate;

	public AuthorizeTable() {
		super();
	}

	public AuthorizeTable(Long authorizeCode, Long memberCode, Long sessionFlag, Timestamp createDate,
			Timestamp updateDate) {
		super();
		this.authorizeCode = authorizeCode;
		this.memberCode = memberCode;
		this.sessionFlag = sessionFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	@Setter
	@Getter
	@OneToOne(mappedBy = "sessionInfo")
	private MemberTable meberTableInfo;

}
