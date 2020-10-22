package ee.taltech.arete.java.response.hodor_studenttester;

import ee.taltech.arete.java.response.arete.ConsoleOutputDTO;
import lombok.*;

import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class HodorUnitTest {

    List<String> groupsDependedUpon;
    String status;
    Integer weight;
    Boolean printExceptionMessage;
    Boolean printStackTrace;
    Long timeElapsed;
    List<String> methodsDependedUpon;
    String stackTrace;
    String name;
    List<ConsoleOutputDTO> stdout;
    String exceptionClass;
    String exceptionMessage;
    List<ConsoleOutputDTO> stderr;

}