package com.hjservice.ma.controller;

import com.hjservice.ma.dto.User;
import com.hjservice.ma.dto.auth.SessionUser;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class IndexController {
    private final HttpSession httpSession;

    @GetMapping("/")
    public ResponseEntity<?> index() {
        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
