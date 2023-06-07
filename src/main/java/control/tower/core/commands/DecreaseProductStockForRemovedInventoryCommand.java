package control.tower.core.commands;

import lombok.Builder;
import lombok.Getter;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import static control.tower.core.utils.Helper.isNullOrBlank;

@Getter
@Builder
public class DecreaseProductStockForRemovedInventoryCommand {

    @TargetAggregateIdentifier
    private String productId;
    private String sku;

    public void validate() {
        if (isNullOrBlank(productId)) {
            throw new IllegalArgumentException("ProductId is required");
        }

        if (isNullOrBlank(sku)) {
            throw new IllegalArgumentException("Sku is required");
        }
    }
}
