package com.TestHR.demo.aptitudeTest;

import com.TestHR.demo.user.User;
import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AptitudeTest {
    private Long aptitudeTestId;
    private Long userId;
    private int testMark;
    private LocalDateTime testDate;
    private User user;
}
