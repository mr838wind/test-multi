package org.demo.user.member;


import org.demo.common.member.dto.Member;
import org.demo.common.member.service.MemberServiceCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    MemberServiceCustom memberServiceCustom;

    @GetMapping("/")
    public Member get() {
        return new Member("test-user", "test-user@gmail.com");
    }

    @GetMapping("/signup")
    public Member signup() {
        return memberServiceCustom.signUp(new Member("test-user", "test-user@gmail.com"));
    }

}
