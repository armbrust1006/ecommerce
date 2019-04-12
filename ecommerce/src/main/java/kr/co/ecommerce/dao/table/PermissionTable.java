package kr.co.ecommerce.dao.table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

/**
 * @author kim.gh
 * @version 0.1
 */
@Getter
@Entity
@Table(name = "permission")
public class PermissionTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "permission_Id")
	private int permissionId;

	@Column(name = "session_flag")
	private int sessionFlag;

	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "update_date")
	private Date updateDate;

	public PermissionTable() {
		super();
	}

	public PermissionTable(int permissionId, int sessionFlag, Date createDate, Date updateDate) {
		super();
		this.permissionId = permissionId;
		this.sessionFlag = sessionFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

}
