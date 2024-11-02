package com.TestHR.demo.leaveRequest;

import com.TestHR.demo.contractor.Contractor;
import com.TestHR.demo.files.Files;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveRequest {
    private Long leaveRequestId;
    private Long contractorId;
    private Long fileId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Decision decision;
    private Contractor contractor;
    private Files file;

    public enum Decision {
        APPROVED, DENIED
    }
}
