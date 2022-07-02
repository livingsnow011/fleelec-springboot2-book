package com.jojoldu.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
//이 클래스를 상속할 경우, 필드들도 컬럼으로 인식
@MappedSuperclass
//이 클래스에 Auditing기능을 포함시키겠다.
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    //생성시간
    @CreatedDate
    private LocalDateTime createdDate;
    //최종 수정일
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
