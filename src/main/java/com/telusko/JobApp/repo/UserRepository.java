package com.telusko.JobApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.telusko.JobApp.model.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Integer> {
}
