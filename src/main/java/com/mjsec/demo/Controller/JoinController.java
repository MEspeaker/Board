package com.mjsec.demo.Controller;

import com.mjsec.demo.Dto.JoinDto;
import com.mjsec.demo.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {
    private final JoinService joinService;
    public JoinController(JoinService joinService){
        this.joinService = joinService;
    }
    @PostMapping("/join")
    public String joinProcess(JoinDto joinDto) {
        System.out.println(joinDto.getUsername());
        joinService.joinProcess(joinDto);

        return "ok";
    }
}
