package sage.bened.inspiration.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sage.bened.inspiration.models.SiteView;

@Repository
public class JdbcSiteViewRepository implements SiteViewRepository {
    private JdbcTemplate jdbc;

    @Autowired
    public JdbcSiteViewRepository (JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public SiteView save(SiteView siteView) {
        jdbc.update(
                "insert into siteviews (id, message) values (?, ?)",
                siteView.getId(),
                siteView.getMessage()
        );
        return siteView;
    }
}