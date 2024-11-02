package com.TestHR.demo.contractor;

import com.TestHR.demo.user.User;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contractor {
    private Long contractorId;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;
    private ContractorStatus status;
    private User user;

    public enum ContractorStatus {
        EXTERNAL, SUSPENDED, ACTIVE, ON_LEAVE
    }
}
