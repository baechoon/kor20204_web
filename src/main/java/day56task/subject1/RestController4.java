package day56task.subject1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("day56task/subject1/rest4")
public class RestController4 {

    @GetMapping("")
    public boolean getRest4(@RequestParam String key1,@RequestParam String key2){
        System.out.println("RestController4.getRest4");
        System.out.println("key1 = " + key1 + ", key2 = " + key2);
        return true;
    }

    @GetMapping("/dto")
    public boolean getRest4(RestDto restDto){
        System.out.println("RestController4.getRest4");
        System.out.println("restDto = " + restDto);
        return false;
    }

    @PutMapping("")
    public String postRest4(@RequestBody RestDto restDto){
        System.out.println("RestController4.postRest4");
        System.out.println("restDto = " + restDto);
        return "응답 보내기";
    }
}
