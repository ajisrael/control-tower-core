package control.tower.core.constants;

public class ExceptionMessages {

    private ExceptionMessages() {
        throw new IllegalStateException("Constants class");
    }

    public static final String PARAMETER_CANNOT_BE_EMPTY = "%s cannot be empty";
    public static final String PARAMETER_CANNOT_BE_NULL = "%s cannot be null";
    public static final String ENTITY_WITH_ID_DOES_NOT_EXIST = "%s with id %s does not exist";
    public static final String ENTITY_WITH_ID_ALREADY_EXISTS = "%s with id %s already exists";
    public static final String ENTITY_ALREADY_EXISTS_FOR_USER = "%s already exists for user";

    public static final String PRODUCT_ID_CANNOT_BE_EMPTY = String.format(PARAMETER_CANNOT_BE_EMPTY, "productId");
    public static final String SKU_CANNOT_BE_EMPTY = String.format(PARAMETER_CANNOT_BE_EMPTY, "sku");
    public static final String ADDRESS_ID_CANNOT_BE_EMPTY = String.format(PARAMETER_CANNOT_BE_EMPTY, "addressId");
    public static final String PAYMENT_ID_CANNOT_BE_EMPTY = String.format(PARAMETER_CANNOT_BE_EMPTY, "paymentId");
}
