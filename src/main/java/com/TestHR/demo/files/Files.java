package com.TestHR.demo.files;

import com.TestHR.demo.user.User;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Files {
    private Long fileId;
    private Long userId;
    private String fileType;
    private FileCategory category;
    private LocalDate dateAdded;
    private String path;
    private User user;  // For relationship mapping

    public enum FileCategory {
        TIMESHEET, USER_DOCUMENTS, CONTRACT, LEAVE_FORM, PROJECT, OTHER
    }
}