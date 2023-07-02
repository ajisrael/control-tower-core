package control.tower.core.query.queries;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class FindAllPaymentMethodsForUserQuery extends PageableQuery{

    private String userId;
}
