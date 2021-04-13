package lab3.dp.fm.product;

public class Main {
    public static void main(String[] args) {
        BrowserAnalyzer browserAnalyzer = new BrowserAnalyzer();
        System.out.println(browserAnalyzer.analyze(new ChromeFactory()));
        System.out.println(browserAnalyzer.analyze(new FirefoxFactory()));
        System.out.println(browserAnalyzer.analyze(new OperaFactory()));
    }
}
