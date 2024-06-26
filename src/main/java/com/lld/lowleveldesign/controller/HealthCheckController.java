package com.lld.lowleveldesign.controller;

import com.lld.lowleveldesign.dao.IUserDao;
import com.lld.lowleveldesign.pojo.communicators.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nevinsunny
 * date 02/04/24
 * time 5:00 pm
 */

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class HealthCheckController {

    private final IUserDao userDao;

    public HealthCheckController(IUserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/health-check")
    public ResponseEntity<BaseResponse> healthCheck() {
        return ResponseEntity.ok(BaseResponse.builder()
                .data("Success")
                .code(HttpStatus.OK)
                .build());
    }
}
