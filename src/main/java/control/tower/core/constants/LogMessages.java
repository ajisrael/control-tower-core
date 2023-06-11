package control.tower.core.constants;

public class LogMessages {

    private LogMessages() {
        throw new IllegalStateException("Constants class");
    }

    public static final String INTERCEPTED_COMMAND = "Intercepted command: %s";
    public static final String PROCESSING_EVENT_FOR_ID = "Processing %s for %s: [%s]";
    public static final String ISSUING_COMMAND_FOR_ID = "Issuing %s for %s: [%s]";
    public static final String EXCEPTION_ENCOUNTERED_WHEN_ISSUING_COMMAND = "Exception encountered when issuing %s: %s";
    public static final String ISSUING_COMPENSATING_TRANSACTION_WITH_COMMAND_FOR_ID = "Issuing compensating transaction with %s for %s: [%s]";

}
