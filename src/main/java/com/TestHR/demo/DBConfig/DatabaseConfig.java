package com.TestHR.demo.DBConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
//// User.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class User {
//    private Long userId;
//    private String username;
//    private String passwordHash;
//    private String email;
//    private String firstName;
//    private String lastName;
//    private UserRole role;
//    private UserStatus status;
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//}
//
//// Enums for User
//@Getter
//public enum UserRole {
//    ADMIN, INSTRUCTOR, CONTRACTOR, APPLICANT
//}
//
//@Getter
//public enum UserStatus {
//    ACTIVE, SUSPENDED, PENDING
//}
//
//// ContractPeriod.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class ContractPeriod {
//    private Long periodId;
//    private LocalDate startDate;
//    private LocalDate endDate;
//    private String description;
//    private LocalDateTime createdAt;
//}
//
//// Document.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Document {
//    private Long documentId;
//    private Long userId;
//    private Long contractPeriodId;
//    private DocumentType documentType;
//    private String filePath;
//    private DocumentStatus status;
//    private LocalDateTime submissionDate;
//    private Long verifiedBy;
//    private LocalDateTime verificationDate;
//}
//
//@Getter
//public enum DocumentType {
//    ID, MATRIC_CERTIFICATE, TIMESHEET, LEAVE_FORM, PROJECT_FILE, CERTIFICATION, SHARED_RESOURCE
//}
//
//@Getter
//public enum DocumentStatus {
//    PENDING, VERIFIED, REJECTED
//}
//
//// AptitudeTest.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class AptitudeTest {
//    private Long testId;
//    private Long applicantId;
//    private LocalDateTime testDate;
//    private BigDecimal score;
//    private TestStatus status;
//}
//
//@Getter
//public enum TestStatus {
//    SCHEDULED, COMPLETED, MISSED
//}
//
//// Contract.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Contract {
//    private Long contractId;
//    private Long contractorId;
//    private Long contractPeriodId;
//    private LocalDate startDate;
//    private LocalDate endDate;
//    private ContractStatus status;
//}
//
//@Getter
//public enum ContractStatus {
//    ACTIVE, COMPLETED, TERMINATED
//}
//
//// Attendance.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Attendance {
//    private Long attendanceId;
//    private Long contractorId;
//    private LocalDateTime loginTime;
//    private LocalDateTime logoutTime;
//    private AttendanceStatus status;
//}
//
//@Getter
//public enum AttendanceStatus {
//    ON_TIME, LATE, ABSENT
//}
//
//// Warning.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Warning {
//    private Long warningId;
//    private Long contractorId;
//    private Long attendanceId;
//    private WarningType warningType;
//    private String description;
//    private WarningStatus status;
//    private LocalDateTime issuedDate;
//    private Long issuedBy;
//}
//
//@Getter
//public enum WarningType {
//    LATE, ABSENT, MISCONDUCT
//}
//
//@Getter
//public enum WarningStatus {
//    ACTIVE, APPEALED, RESOLVED
//}
//
//// DisciplinaryHearing.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class DisciplinaryHearing {
//    private Long hearingId;
//    private Long contractorId;
//    private LocalDateTime scheduledDate;
//    private HearingStatus status;
//    private String outcome;
//    private Long conductedBy;
//}
//
//@Getter
//public enum HearingStatus {
//    SCHEDULED, COMPLETED, CANCELLED
//}
//
//// LeaveRequest.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class LeaveRequest {
//    private Long leaveId;
//    private Long contractorId;
//    private Long documentId;
//    private LocalDate startDate;
//    private LocalDate endDate;
//    private LeaveStatus status;
//    private Long approvedBy;
//    private LocalDateTime approvalDate;
//}
//
//@Getter
//public enum LeaveStatus {
//    PENDING, APPROVED, REJECTED
//}
//
//// SharedResource.java
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class SharedResource {
//    private Long resourceId;
//    private Long contractPeriodId;
//    private Long documentId;
//    private Long uploadedBy;
//    private String description;
//}
    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
