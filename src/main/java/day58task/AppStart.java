package day58task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AppStart {
    public static void main(String[] args) {
        SpringApplication.run(AppStart.class);
    }

}
//템플릿(타임리프)사용 동적파일--> 순수한 html로(정적파일)변환
//사용이유? 여러개의 html을 하나의 html로 불러올 수 있다 --> 코드 재사용
@Controller //@Restcontroller,@ResponseBody  사용 x --> 객체를 반환하기 때문
class viewController{
    //1. 메인페이지
    @GetMapping("/student")
    public String index(){
        return "/day58/subject1/student/index.html";
    } //템플릿의 파일명(파일위치)를 리턴한다

    //2. 점수 등록페이지
    @GetMapping("/student/regist")
    public String regist(){
        return "/day58/subject1/student/regist.html";
    }
    //3. 점수 조회 페이지
    @GetMapping("/student/list")
    public String list(){
        return "/day58/subject1/student/list.html";
    }
    //4.점수 수정페이지
    @GetMapping("/student/update")
    public String update(){
        return "/day58/subject1/student/update.html";
    }
    //5. 점수 삭제 페이지
    @GetMapping("/student/delete")
        public String delete(){
        return "/day58/subject1/student/delete.html";
    }

}
