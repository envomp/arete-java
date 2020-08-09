package arete.java.response;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonClassDescription("Response sent to Moodle")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AreteResponse {

	final String type = "arete";

	final String version = "arete_2.0";

	@JsonPropertyDescription("List of style, compilation and other errors")
	List<Error> errors = new ArrayList<>();

	@JsonPropertyDescription("List of student files")
	List<File> files = new ArrayList<>();

	@JsonPropertyDescription("List of test files")
	List<File> testFiles = new ArrayList<>();

	@JsonPropertyDescription("List of test suites which each contains unit-tests. Each test file produces an test suite")
	List<TestContext> testSuites = new ArrayList<>();

	@JsonPropertyDescription("(Appended by arete) Console outputs from docker")
	List<ConsoleOutput> consoleOutputs = new ArrayList<>();

	@JsonPropertyDescription("(Overridden by arete) HTML result for student")
	String output;

	@JsonPropertyDescription("Number of tests")
	Integer totalCount = 0;

	@JsonPropertyDescription("Passed percentage")
	String totalGrade = "0";

	@JsonPropertyDescription("Number of passed tests")
	Integer totalPassedCount = 0;

	@JsonPropertyDescription("(Overridden by arete) Docker image used for testing")
	String testingPlatform;

	@JsonPropertyDescription("(Overridden by arete) git path with namespace. iti0102-2019/ex for example")
	String root;

	@JsonPropertyDescription("(Overridden by arete) URL or ssh for test repository")
	String gitTestRepo;

	@JsonPropertyDescription("(Overridden by arete) URL or ssh for student repository")
	String gitStudentRepo;

	@JsonPropertyDescription("Style percentage. Either from 0 to 100")
	Integer style = 100;

	@JsonPropertyDescription("(Overridden by arete) Slug ran for student. for example pr01_something")
	String slug;

	@JsonPropertyDescription("(Overridden by arete) values that are returned the same way they were given in")
	JsonNode returnExtra;

	@JsonPropertyDescription("(Overridden by arete) Commit hash from student git repository")
	String hash;

	@JsonPropertyDescription("(Overridden by arete) Students uniid")
	String uniid;

	@JsonPropertyDescription("(Overridden by arete if left empty) Students mail")
	String email;

	@JsonPropertyDescription("(Overridden by arete if left empty) Testing timestamp")
	Long timestamp;

	@JsonPropertyDescription("(Overridden by arete) Commit message by student when pushing to repository")
	String commitMessage;

	@JsonPropertyDescription("(Overridden by arete) Priority of job on a scale from 1 to 10 inclusive")
	Integer priority;

	@JsonPropertyDescription("(Overridden by arete if left empty) No defaults. You can add (stylecheck) or something. It is sent to smaller tester. Look the possibilities from the small tester repository for more details.")
	private Set<String> dockerExtra;

	@JsonPropertyDescription("(Overridden by arete) No defaults. You can add (anonymous, noMail, noFiles, noTesterFiles, noStudentFiles, noStd, noOverride, noFeedback, minimalFeedback)")
	private Set<String> systemExtra;

	@JsonPropertyDescription("(Overridden by arete) Default docker timeout is 120 seconds. Maximum allowed code execution time.")
	private Integer dockerTimeout;

	@JsonPropertyDescription("(Overridden by arete if left empty) Whether the testing was successful or not. Will be true if tester crashed.")
	Boolean failed = false;

}
