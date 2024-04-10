package com.lld.lowleveldesign.dao.impl;

import com.lld.lowleveldesign.dao.IUserDao;
import com.lld.lowleveldesign.exception.AppException;
import com.lld.lowleveldesign.pojo.entities.postgress.UserEntity;
import com.lld.lowleveldesign.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * @author nevinsunny
 * date 02/04/24
 * time 5:30 pm
 */

@Service
public class UserDao implements IUserDao {

    private final UserRepository userRepository;

    public UserDao(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity findById(UUID userId) throws AppException {
        return userRepository.findById(userId).orElseThrow(() -> new AppException(
                String.format("No user with Id : %s found ", userId)
        ));
    }

    @Override
    public Optional<UserEntity> findByEmail(String email) throws AppException {
        return userRepository.findByEmail(email);
    }
}
