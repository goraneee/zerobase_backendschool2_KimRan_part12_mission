package com.zerobase.cms.user.service.test;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgun.SendMailForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;
    public String sendEmail(){
        SendMailForm form = SendMailForm.builder()
            .from("kimlan4250@gmail.com")
            .to("lan4250@naver.com")
            .subject("메일 제목")
            .text("email text")
            .build();
        return mailgunClient.sendEmail(form);
    }
}
