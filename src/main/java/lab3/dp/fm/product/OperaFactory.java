package lab3.dp.fm.product;

public class OperaFactory implements BrowserHandlerFactory{
    @Override
    public BrowserHandler createBrowser() {
        return new OperaHandler();
    }
}
