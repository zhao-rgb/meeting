package com.example.meeting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author zhao
 * @className User
 * @Description TODO
 * @Date 2022/4/18
 * @Version 1.0
 **/
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meetings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String people;
    private String subject;
    private String context;
}
