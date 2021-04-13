package lab3.dp.fm.product;

public class ChromeFactory implements BrowserFactory{
    @Override
    public BrowserHandler createBrowser() {
        return new ChromeHandler();
    }
}
