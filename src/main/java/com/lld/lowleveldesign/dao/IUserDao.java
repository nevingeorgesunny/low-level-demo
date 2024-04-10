package com.lld.lowleveldesign.dao;

import com.lld.lowleveldesign.exception.AppException;
import com.lld.lowleveldesign.pojo.entities.postgress.UserEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * @author nevinsunny
 * date 02/04/24
 * time 5:30 pm
 */
public interface IUserDao {

    UserEntity save(UserEntity userEntity);

    UserEntity findById(UUID userId) throws AppException;

    Optional<UserEntity> findByEmail(String email) throws AppException;
}
