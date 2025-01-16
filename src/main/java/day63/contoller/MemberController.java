package day63.contoller;

import day63.model.dto.MemberDto;
import day63.model.entity.MemberEntity;
import day63.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
   @Autowired private MemberService memberService;
   //1. 회원가입
   //{"mid":"choon","mpwd":"1234", "mname":"춘배","mphone":"010-0000-0000"}
   @PostMapping("/member/signup")
    private boolean signup(@RequestBody MemberDto memberDto){
       //관례적으로 controller에서는 엔티티를 사용하지 않는다


       return memberService.signup(memberDto);
   }

   //2. 모든회원 목록조회
   // {"mno": 1,"mid": "choon","mpwd": "1234","mname": "춘배","mphone": "010-0000-0000"}
    @GetMapping("/member/infolist")
    private List<MemberDto>infolist(){
       return memberService.infolist();
    }
}
