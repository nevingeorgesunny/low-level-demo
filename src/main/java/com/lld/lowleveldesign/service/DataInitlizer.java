package com.lld.lowleveldesign.service;

import com.lld.lowleveldesign.dao.IUserDao;
import com.lld.lowleveldesign.pojo.entities.postgress.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author nevinsunny
 * date 02/04/24
 * time 9:53 pm
 */
@Component
@Slf4j
public class DataInitlizer implements ApplicationRunner {

    private final IUserDao userDao;

    public DataInitlizer(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        userDao.save(UserEntity.builder()
                .id(UUID.randomUUID())
                .email("nevin.sunny@gmail.com")
                .firstName("Nevin")
                .lastName("Sunny")
                .build());

        userDao.save(UserEntity.builder()
                .id(UUID.randomUUID())
                .email("user.one@gmail.com")
                .firstName("User")
                .lastName("One")
                .build());

        log.info("User data created");
    }
}
