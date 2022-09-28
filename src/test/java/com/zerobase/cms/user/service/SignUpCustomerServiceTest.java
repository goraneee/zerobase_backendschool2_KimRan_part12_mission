package com.zerobase.cms.user.service;

import com.zerobase.cms.user.domain.SignUpForm;
import com.zerobase.cms.user.service.test.SignUpCustomerService;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.util.Assert;

@SpringBootTest
public class SignUpCustomerServiceTest {
    @Autowired
    private SignUpCustomerService service;

    @Test
    void signUp(){
        SignUpForm form = SignUpForm.builder()
            .name("name")
            .birth(LocalDate.now())
            .email("abc@gmail.com")
            .password("1")
            .phone("010-0000-0000")
            .build();
            Assert.isTrue(service.signUp(form).getId() != null);
    }
}
