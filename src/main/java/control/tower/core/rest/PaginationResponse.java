package control.tower.core.rest;

import java.util.List;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PaginationResponse<T>
{
    private long totalItems;
    private List<T> content;
}
