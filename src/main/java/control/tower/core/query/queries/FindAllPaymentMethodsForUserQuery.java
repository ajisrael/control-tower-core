package control.tower.core.query.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FindAllPaymentMethodsForUserQuery {

    private String userId;
}
