package control.tower.core.commands;

import lombok.Builder;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import static control.tower.core.constants.ExceptionMessages.PRODUCT_ID_CANNOT_BE_EMPTY;
import static control.tower.core.constants.ExceptionMessages.SKU_CANNOT_BE_EMPTY;
import static control.tower.core.utils.Helper.throwExceptionIfParameterIsEmpty;

@Getter
@Builder
public class IncreaseProductStockForNewInventoryCommand {

    @TargetAggregateIdentifier
    private String productId;
    private String sku;

    public void validate() {
        throwExceptionIfParameterIsEmpty(this.getProductId(), PRODUCT_ID_CANNOT_BE_EMPTY);
        throwExceptionIfParameterIsEmpty(this.getSku(), SKU_CANNOT_BE_EMPTY);
    }
}
