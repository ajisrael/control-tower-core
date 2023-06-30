package control.tower.core.constants;

public class DomainConstants {

    private DomainConstants() {
        throw new IllegalStateException("Constants class");
    }

    public static final String API_GATEWAY_URL = "http://localhost:8082/";

    public static final String DEFAULT_PAGE = "0";
    public static final String DEFAULT_PAGE_SIZE = "20";

    public static final String USER = "User";
}
