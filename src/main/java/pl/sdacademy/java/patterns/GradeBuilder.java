package pl.sdacademy.java.patterns;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class GradeBuilder {
    private UUID courseUuid;
    private GradeType gradeType;
    private BigDecimal value;
    private LocalDateTime issueDateTime;

    public GradeBuilder() {
        this.courseUuid = courseUuid;
        this.gradeType = gradeType;
        this.value = value;
        this.issueDateTime = issueDateTime;
    }

    public Grade build() {
        return new Grade(courseUuid, gradeType, value, issueDateTime);
    }
}
