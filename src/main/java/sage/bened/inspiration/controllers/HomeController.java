package sage.bened.inspiration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import sage.bened.inspiration.models.SiteView;
import sage.bened.inspiration.repositories.SiteViewRepository;

@Controller
public class HomeController {
    private final SiteViewRepository siteViewRepo;

    @Autowired
    public HomeController(SiteViewRepository siteViewRepo) {
        this.siteViewRepo = siteViewRepo;
    }

    @GetMapping("/")
    public String home() {
        SiteView sv = new SiteView(1, "another site view");
        siteViewRepo.save(sv);
        return "home";
    }
}