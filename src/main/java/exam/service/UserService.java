package exam.service;


import exam.dao.UserRepository;
import exam.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserInfo getUserInfoByName(String userName){
        return userRepository.findByUserName(userName);
    }

}
