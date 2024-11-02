package com.TestHR.demo.files;

import com.TestHR.demo.user.User;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Files {
    private Long fileId;
    private Long userId;
    private String fileType;
    private FileCategory category;
    private LocalDateTime dateAdded;
    private String path;
    private User user;

    public enum FileCategory {
        TIMESHEET, USER_DOCUMENTS, CONTRACT, LEAVE_FORM, PROJECT, OTHER
    }
}