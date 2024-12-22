package com.telusko.JobApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@Scope("prototype")
@Entity
public class UserInfo {

    @Id
    private int userId;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userRole; // e.g., admin, job seeker, recruiter
    private String resume;   // Path or URL to the user's resume

    public void setResume(String originalFilename) {
    }

    public int getUserId() {

        return 0;
    }
}
