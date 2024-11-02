package com.TestHR.demo.aptitudeTest;

import com.TestHR.demo.user.User;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AptitudeTest {
    private Long aptitudeTestId;
    private Long userId;
    private Integer testMark;
    private LocalDate testDate;
    private User user;  // For relationship mapping
}
