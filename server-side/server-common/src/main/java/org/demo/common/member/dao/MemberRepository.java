package org.demo.common.member.dao;

import org.demo.common.member.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
