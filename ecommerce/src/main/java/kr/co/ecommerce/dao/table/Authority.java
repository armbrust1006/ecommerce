package kr.co.ecommerce.dao.table;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "authority")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(exclude = { "createDate", "createUserId" })
public class Authority {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "authority_Id")
	private Long authorityId;

	@Column(name = "member_id")
	private Long memberId;

	@Column(name = "authority_char")
	private String authorityChar;

	@Column(name = "authority_number")
	private int authorityNumber;

	@CreationTimestamp
	@Column(name = "create_date")
	private LocalDateTime createDate;

	@Column(name = "create_user_id")
	private Long createUserId;

	@Builder
	public Authority(Long memberId, String authorityChar, int authorityNumber, LocalDateTime createDate,
			Long createUserId) {
		super();
		this.memberId = memberId;
		this.authorityChar = authorityChar;
		this.authorityNumber = authorityNumber;
		this.createDate = createDate;
		this.createUserId = createUserId;
	}

}
