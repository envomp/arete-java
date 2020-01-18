package arete.java.response;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonClassDescription("Unit test")
public class UnitTest {

	@JsonPropertyDescription("Groups of unittests this unittest depends on. If any test fails in that group, this test is skipped")
	List<String> groupsDependedUpon;

	@JsonPropertyDescription("One of the following (success, partial_success, passed, skipped, not_run, failiure, failed, not_set, unknown")
	String status;

	@JsonPropertyDescription("Test weight")
	Integer weight;

	@JsonPropertyDescription("Boolean whether to show exception message to student or not")
	Boolean printExceptionMessage;

	@JsonPropertyDescription("Boolean whether to show stack trace to student or not")
	Boolean printStackTrace;

	@JsonPropertyDescription("Time spent on test")
	Long timeElapsed;

	@JsonPropertyDescription("Methods depended, otherwise skipped")
	List<String> methodsDependedUpon;

	@JsonPropertyDescription("Stacktrace")
	String stackTrace;

	@JsonPropertyDescription("Test name")
	String name;

	@JsonPropertyDescription("List of stdouts")
	List<ConsoleOutput> stdout;

	@JsonPropertyDescription("Exception class")
	String exceptionClass;

	@JsonPropertyDescription("Exception message")
	String exceptionMessage;

	@JsonPropertyDescription("List of stderrs")
	List<ConsoleOutput> stderr;

}