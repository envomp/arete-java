package ee.taltech.arete.java.response.hodor_studenttester;

import lombok.*;

import java.util.ArrayList;

@Data
@Builder
@ToString
@Deprecated(forRemoval = true)
@NoArgsConstructor
@AllArgsConstructor
public class TestingResult {

	Integer code;

	Integer count;

	ArrayList<StyleError> errors;

	ArrayList<HodorFile> files;

	ArrayList<Diagnostic> diagnosticList;

	ArrayList<HodorTestContext> TestContexts;

	String identifier;

	String output;

	String result;

	Boolean securityViolation;

	Integer totalCount;

	String totalGrade; // Either Double or NaN

	Integer totalPassedCount;
}