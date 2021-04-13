package lab3.dp.fm.product;

public class FirefoxFactory implements BrowserHandlerFactory {
    @Override
    public BrowserHandler createBrowser() {
        return new FirefoxHandler();
    }
}
