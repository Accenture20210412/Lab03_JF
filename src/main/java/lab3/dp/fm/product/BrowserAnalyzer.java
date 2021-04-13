package lab3.dp.fm.product;

import java.util.List;

public class BrowserAnalyzer {
    public int analyze(BrowserHandlerFactory browser){
        BrowserHandlerFactory factory = browser;
        BrowserHandler browserHandler = factory.createBrowser();

        return browserHandler.openPages(List.of("www.wp.pl", "www.nk.pl", "www.fb.pl"));
    }





}
