package com.TestHR.demo.hearing;

import com.TestHR.demo.contractor.Contractor;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hearings {
    private Long hearingsId;
    private Long contractorId;
    private LocalDate scheduleDate;
    private HearingOutcome outcome;
    private String reason;
    private Contractor contractor;  // For relationship mapping

    public enum HearingOutcome {
        NULL, SUSPENDED, CLEARED
    }
}
