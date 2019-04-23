package kr.co.ecommerce.dao;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "member")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(exclude = { "createDate", "updateDate" })
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "meber_Id")
	private Long memberId;

	@Column
	private String account;

	@Column
	private String password;

	@Column
	private String name;

	@Column(name = "birthday_year")
	private int birthdayYear;

	@Column(name = "birthday_month")
	private int birthdayMonth;

	@Column(name = "birthday_date")
	private int birthdayDate;

	@Column
	private String email;

	@Column
	private String address;

	@CreationTimestamp
	@Column(name = "create_date")
	private LocalDateTime createDate;

	@UpdateTimestamp
	@Column(name = "update_date")
	private LocalDateTime updateDate;

	@Builder
	public Member(String account, String password, String name, int birthdayYear, int birthdayMonth, int birthdayDate,
			String email, String address, LocalDateTime createDate, LocalDateTime updateDate) {
		super();
		this.account = account;
		this.password = password;
		this.name = name;
		this.birthdayYear = birthdayYear;
		this.birthdayMonth = birthdayMonth;
		this.birthdayDate = birthdayDate;
		this.email = email;
		this.address = address;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

}
