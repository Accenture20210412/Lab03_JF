package lab3.dp.fm.product;

public class FirefoxFactory implements BrowserFactory {
    @Override
    public BrowserHandler createBrowser() {
        return new FirefoxHandler();
    }
}
