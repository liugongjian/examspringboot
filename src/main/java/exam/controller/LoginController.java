package exam.controller;


import exam.dao.QuizDao;
import exam.model.ResponseData;
import exam.model.Quiz;
import exam.model.UserInfo;
import exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserService userService;


    @PostMapping("/manage/login")
    public ResponseEntity<ResponseData<UserInfo>> login(@RequestParam("username") String username, @RequestParam("password") String password){
        UserInfo user = userService.getUserInfoByName(username);
        if (user != null && password.equals(user.getPassword())){
            ResponseData<UserInfo> responseData = new ResponseData<UserInfo>(0,"登录成功！",user);
            return new ResponseEntity(responseData,HttpStatus.OK);
        }else if(user == null) {
            ResponseData<UserInfo> responseData = new ResponseData<UserInfo>(-1,"用户不存在",null);
            return new ResponseEntity(responseData,HttpStatus.OK);
        }else {
            ResponseData<UserInfo> responseData = new ResponseData<UserInfo>(-1,"密码错误，请重新输入",null);
            return new ResponseEntity(responseData,HttpStatus.OK);
        }
    }



}
