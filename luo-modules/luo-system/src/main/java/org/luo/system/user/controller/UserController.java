package org.luo.system.user.controller;

import org.luo.core.domain.Result;
import org.luo.core.exception.ServiceException;
import org.luo.core.tool.utils.FuncUtils;
import org.luo.system.user.entity.User;
import org.luo.system.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public void selectUser(){
        throw new ServiceException();
//        return Result.ok();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.save(user);
        System.err.println(user.getId());
    }

    @DeleteMapping
    public void deleteUser(@RequestParam String ids){
        userService.removeByIds(FuncUtils.toLongList(ids));
    }

}
