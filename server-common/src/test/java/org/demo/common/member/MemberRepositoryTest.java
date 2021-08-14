package org.demo.common.member;

import org.demo.common.member.dao.MemberRepository;
import org.demo.common.member.dto.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void add() {
        memberRepository.save(new Member("test-user", "test-user@gmail.com"));
        Member saved = memberRepository.findById(1l).get();
        assertThat(saved.getName(), is("test-user"));
    }

}
