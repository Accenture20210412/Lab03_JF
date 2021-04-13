package lab3.dp.fm.product;

public class ChromeFactory implements BrowserHandlerFactory {
    @Override
    public BrowserHandler createBrowser() {
        return new ChromeHandler();
    }
}
