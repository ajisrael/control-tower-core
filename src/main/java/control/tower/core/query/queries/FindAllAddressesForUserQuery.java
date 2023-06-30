package control.tower.core.query.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class FindAllAddressesForUserQuery extends PageableQuery {

    private String userId;
}
