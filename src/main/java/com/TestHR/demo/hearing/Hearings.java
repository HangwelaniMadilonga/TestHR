package com.TestHR.demo.hearing;

import com.TestHR.demo.contractor.Contractor;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hearings {
    private Long hearingsId;
    private Long contractorId;
    private LocalDateTime scheduleDate;
    private HearingOutcome outcome;
    private String reason;
    private Contractor contractor;

    public enum HearingOutcome {
        NULL, SUSPENDED, CLEARED
    }
}