package org.demo.common.member.service;

import org.demo.common.member.dao.MemberRepository;
import org.demo.common.member.dto.Member;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceCustom {

    private MemberRepository memberRepository;

    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member signUp(Member member) {
        return memberRepository.save(member);
    }
}
