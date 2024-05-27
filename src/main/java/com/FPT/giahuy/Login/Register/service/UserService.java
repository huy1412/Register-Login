package com.FPT.giahuy.Login.Register.service;

import com.FPT.giahuy.Login.Register.Entity.UserEntity;
import com.FPT.giahuy.Login.Register.dto.UserDTO;
import com.FPT.giahuy.Login.Register.mapper.RoleMap;
import com.FPT.giahuy.Login.Register.mapper.UserMap;
import com.FPT.giahuy.Login.Register.reposity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private  UserRepository userRepository;

    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userEntity= UserMap.mapToEntity(userDTO);
        UserEntity createdUser = userRepository.save(userEntity);
        return UserMap.mapToDTO(createdUser);

    }
}
