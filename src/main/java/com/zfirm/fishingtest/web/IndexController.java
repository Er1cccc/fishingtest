package com.zfirm.fishingtest.web;

import com.zfirm.fishingtest.entity.UserEntity;
import com.zfirm.fishingtest.service.UserService;
import com.zfirm.fishingtest.utils.PageUtils;
import com.zfirm.fishingtest.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    UserService userService;

    @GetMapping("/qq")
    public String qqPage(){
        return "qq";
    }

    @GetMapping("/act/a20130522cdkey")
    public String qqspeedPage(){
        return "qqspeed";
    }

    @PostMapping("/login")
    public String login(UserEntity userEntity){
        userService.login(userEntity);
        return "redirect:http://speed.qq.com/act/a20130522cdkey";
    }
}
