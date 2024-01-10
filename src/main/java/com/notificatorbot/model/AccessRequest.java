package com.notificatorbot.model;

import java.time.LocalDateTime;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "access_request")
public class AccessRequest {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chatid", nullable = false, unique = true)
    private Long chatId;

    @Column(name = "logid")
    private String logid;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "requestdate")
    private LocalDateTime requestDate;

    @Enumerated(EnumType.STRING)
    private Step step;
}
