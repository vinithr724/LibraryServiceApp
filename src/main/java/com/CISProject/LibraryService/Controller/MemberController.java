package com.CISProject.LibraryService.Controller;
import com.CISProject.LibraryService.entity.LibraryMember;
//import com.CISProject.LibraryService.model.Member;
import com.CISProject.LibraryService.model.Member;
import com.CISProject.LibraryService.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping
    public Member getMember(Integer memberId){

        return memberService.getMember(memberId);
    }

    // create a member
    @PostMapping
    public Member createMember(@RequestBody  Member member){
        return memberService.createMember(member);
    }

    @PutMapping
    public Member updateMember(@RequestBody Member Member){
        // Set the memberId for the member object to be updated
        return memberService.updateMember(Member);
    }

    @DeleteMapping
    public void deleteMember(Integer memberId){
        memberService.deleteMember(memberId);
    }
}