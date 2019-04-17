package kr.co.ecommerce.dao.join.jpa;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.criteria.Join;

import kr.co.ecommerce.dao.table.PermissionTable;
import lombok.Getter;

/**
 * @author kim.gh
 * @version 0.1
 * @see Join member table and permission table
 */
@Getter
@Entity
@Table(name = "member")
public class SessionInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "member_Id")
	private int memberId;

	@OneToOne
	@JoinColumn(name = "permission_id")
	private PermissionTable permissionId;

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

	public SessionInfo() {
		super();
	}

	public SessionInfo(int memberId, PermissionTable permissionId, String name, String age, Timestamp createDate,
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
