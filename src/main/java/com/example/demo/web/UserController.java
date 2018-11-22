package com.example.demo.web;

import com.example.demo.entity.Info;
import com.example.demo.entity.User;
import com.example.demo.service.IInfoService;
import com.example.demo.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Yanghu
 * @since 2018-11-22
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private IInfoService infoService;

    @GetMapping(value = "/get/{userId}")
    public ResponseEntity<Info> getUser(@PathVariable(value = "userId", required = false) String userId) {
        Info user = new Info();
        user.setId(Integer.parseInt(userId));
        Info user1 = this.infoService.getById(user);
        return ResponseEntity.ok(user1);
    }

}
