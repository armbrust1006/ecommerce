package kr.co.ecommerce.dao.table;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
@EqualsAndHashCode(exclude = { "createDate", "createUserId" })
public class Authority {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "permission_Id")
	private Long permissionId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "permission_char")
	private String permissionChar;

	@Column(name = "permission_number")
	private int permissionNumber;

	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name = "create_user_id")
	private Long createUserId;

	@Builder
	public Authority(Long userId, String permissionChar, int permissionNumber, Date createDate, Long createUserId) {
		this.userId = userId;
		this.permissionChar = permissionChar;
		this.permissionNumber = permissionNumber;
		this.createDate = createDate;
		this.createUserId = createUserId;
	}

}
