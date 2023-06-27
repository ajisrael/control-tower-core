package control.tower.core.query.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DoesPaymentMethodExistForUserQuery {

    private String paymentId;
    private String userid;
}
