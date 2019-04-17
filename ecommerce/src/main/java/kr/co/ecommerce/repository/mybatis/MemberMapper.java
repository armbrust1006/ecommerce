package kr.co.ecommerce.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.ecommerce.dao.table.User;

@Mapper
@Repository
public interface MemberMapper {

	User selectMember(int memberId);

}
