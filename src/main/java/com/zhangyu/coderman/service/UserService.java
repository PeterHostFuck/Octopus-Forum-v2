package com.zhangyu.coderman.service;

import com.zhangyu.coderman.dto.NewUserDTO;
import com.zhangyu.coderman.dto.ResultTypeDTO;
import com.zhangyu.coderman.modal.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    void save(User user);

    User findUserByToken(String token);

    void SaveOrUpdate(User user);

    List<NewUserDTO> findNewsUsers(Integer top);

    List<User> getFollowList( User user);

    List<User> getFansList(User user);

    ResultTypeDTO signIn(Integer id);

    boolean isSigined(Integer id);
}
