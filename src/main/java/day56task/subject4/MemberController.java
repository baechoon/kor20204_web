package day56task.subject4;

import org.springframework.web.bind.annotation.*;

import java.util.AbstractList;
import java.util.ArrayList;

@RestController
@RequestMapping("day56task/subject4")
public class MemberController {

    // 요청:http://localhost:8080/day56task/subject4/join
    //body{ "code":1,"id":choon","pwd":"1234","name":"춘배","phone":"000-0000-0000"}
    @PostMapping("/join")
    public boolean join(@RequestBody MemberDto memberDto){
        System.out.println("MemberController.join");
        System.out.println("memberDto = " + memberDto);
        return true;
    }
    // 요청:http://localhost:8080/day56task/subject4/login
    //body{"id":choon","pwd":"1234"}
    @PostMapping("/login")
    public boolean login(@RequestBody MemberDto memberDto){
        System.out.println("MemberController.login");
        System.out.println("memberDto = " + memberDto);
        return true;
    }
    // 요청:http://localhost:8080/day56task/subject4/update
    //body{"id":"choonbae","pwd":"1234","name":"춘배","phone":"000-0000-1111"}
    @PutMapping("/update")
    public boolean update(@RequestBody MemberDto memberDto){
        System.out.println("MemberController.update");
        System.out.println("memberDto = " + memberDto);
        return true;
    }
   // 요청:http://localhost:8080/day56task/subject4/print?code=1

    @GetMapping("/print")
    public MemberDto print(@RequestParam int code){
        System.out.println("MemberController.print");
        System.out.println("code = " + code);
        MemberDto memberDto=new MemberDto();
        return memberDto ;
    } //--->잘 모르겠음

    //요청:http://localhost:8080/day56task/subject4/delete?code=1
   @DeleteMapping("/delete")
    public boolean delete(@RequestParam int code){
    System.out.println("MemberController.delete");
    System.out.println("code = " + code);
    return true;
}


}
