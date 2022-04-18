package com.example.meeting.Repository;

import com.example.meeting.entity.Meetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author zhao
 * @className MeetingsRepository
 * @Description TODO
 * @Date 2022/4/18
 * @Version 1.0
 **/
@Component
public interface MeetingsRepository extends JpaRepository<Meetings,Integer> {
}
