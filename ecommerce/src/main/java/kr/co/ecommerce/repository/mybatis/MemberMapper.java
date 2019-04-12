package kr.co.ecommerce.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.ecommerce.dao.table.MemberTable;

@Mapper
@Repository
public interface MemberMapper {

	public MemberTable selectMember(int memberId);

}
