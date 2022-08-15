package sage.bened.inspiration.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class SiteView {
    private final Integer id;
    private final String message;
}
