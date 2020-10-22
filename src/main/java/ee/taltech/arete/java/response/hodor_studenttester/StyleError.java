package ee.taltech.arete.java.response.hodor_studenttester;

import lombok.*;

@Data
@Builder
@ToString
@Deprecated(forRemoval = true)
@NoArgsConstructor
@AllArgsConstructor
public class StyleError {
	private String fileName;

	private String severityLevel;

	private Integer lineNo;

	private Integer columnNo;

	private String message;
}
