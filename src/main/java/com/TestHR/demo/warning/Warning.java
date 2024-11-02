package com.TestHR.demo.warning;

import com.TestHR.demo.contractor.Contractor;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warning {
    private Long warningId;
    private Long contractorId;
    private LocalDateTime dateIssue;
    private WarningReason reason;
    private WarningState state;
    private Contractor contractor;

    public enum WarningReason {
        LATE, ABSENT
    }

    public enum WarningState {
        APPEALED, ACTIVE, REMOVED, FINAL
    }
}