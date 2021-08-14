package org.demo.common.member;

import org.demo.common.member.dto.Member;
import org.demo.common.member.service.MemberServiceCustom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberServiceCustomTest {

    @Autowired
    private MemberServiceCustom memberServiceCustom;

    @Test
    public void save() {
        Member member = new Member("test-user", "test-user@gmail.com");
        Long id = memberServiceCustom.singup(member);
        assertThat(id, is(1l));
    }

}
