package com.zerobase.cms.user.domain.model;

import java.time.LocalDateTime;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@MappedSuperclass   // ???
@EntityListeners(value = {AuditingEntityListener.class})
public class BaseEntity {

    @CreatedDate    // 만들어진 날짜를 주입
    private LocalDateTime createdAt;

    @LastModifiedDate   // 마지막 수정 날짜
    private LocalDateTime modifiedAt;
}
