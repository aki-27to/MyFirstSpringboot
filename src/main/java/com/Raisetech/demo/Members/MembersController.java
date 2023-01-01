package com.Raisetech.demo.Members;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MembersController {
    @GetMapping("/names")
    public String getName(@RequestParam("name") String param1) {
        // テスト用のURL
        // http://localhost:8080/names/name?get_param=test
        return param1;
    }


}
