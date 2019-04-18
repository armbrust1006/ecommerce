package kr.co.ecommerce.repository.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kr.co.ecommerce.dao.table.Member;

@Mapper
@Repository
public interface MemberMapper {

	Member selectLoginInfo(String account, String password);

}
