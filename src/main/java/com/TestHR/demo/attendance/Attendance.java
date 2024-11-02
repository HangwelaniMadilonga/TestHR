package com.TestHR.demo.attendance;

import com.TestHR.demo.contractor.Contractor;
import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Attendance {
    private Long attendanceId;
    private Long contractorId;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private RegisterStatus register;
    private Contractor contractor;

    public enum RegisterStatus {
        PRESENT, ABSENT, LATE
    }
}
