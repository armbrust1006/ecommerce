package kr.co.ecommerce.repository.qdsl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import kr.co.ecommerce.dao.table.MemberTable;

/**
 * @author kim
 * @version 0.1
 * @see Member Table QueryDSL
 */
@Repository
public class MemberRepository extends QuerydslRepositorySupport {

	@Autowired
	private final JPAQueryFactory queryFactory;

	public MemberRepository(JPAQueryFactory queryFactory) {
		super(MemberTable.class);
		this.queryFactory = queryFactory;
	}

	public MemberTable findByAge(String age) {
//		queryFactory.select(MemberTable).
		return null;
	}

}
