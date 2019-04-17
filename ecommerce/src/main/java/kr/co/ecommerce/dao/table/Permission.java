package kr.co.ecommerce.dao.table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "permission")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(exclude = { "createDate", "updateDate" })
public class Permission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "permission_Id")
	private Long permissionId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "session_flag")
	private int sessionFlag;

	@Column(name = "create_date")
	private Date createDate;

	@Column(name = "update_date")
	private Date updateDate;

	@Builder
	public Permission(Long userId, int sessionFlag, Date createDate, Date updateDate) {
		this.userId = userId;
		this.sessionFlag = sessionFlag;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

}
