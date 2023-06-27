package control.tower.core.query.queries;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class DoProductsExistQuery {

    private List<String> productIds;
}
