package uk.gov.hmcts.example.messageversioningstandards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SuppressWarnings("HideUtilityClassConstructor") // Spring needs a constructor, its not a utility class
public class MessageVersioningStandardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessageVersioningStandardsApplication.class, args);
    }

}
