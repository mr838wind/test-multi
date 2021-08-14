package org.demo.user.member;


import org.demo.common.member.dto.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/")
    public Member get() {
        return new Member("test-user", "test-user@gmail.com");
    }
}
