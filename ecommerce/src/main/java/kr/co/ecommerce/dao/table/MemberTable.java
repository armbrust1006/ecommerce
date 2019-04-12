package kr.co.ecommerce.dao.table;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;

/**
 * @author kim.gh
 * @version 0.1
 */
@Getter
@Entity
@Table(name = "member")
public class MemberTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "member_Id")
	private int memberId;

	@Column(name = "permission_id")
	private int permissionId;

	@Column
	private String name;

	@Column
	private String age;

	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name = "update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public MemberTable() {
		super();
	}

	public MemberTable(int memberId, int permissionId, String name, String age, Timestamp createDate,
			Timestamp updateDate) {
		super();
		this.memberId = memberId;
		this.permissionId = permissionId;
		this.name = name;
		this.age = age;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

}
