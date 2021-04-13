package lab3.dp.fm.product;

import java.util.List;

public class OperaHandler implements BrowserHandler{
    @Override
    public String getName() {
        return "Opera";
    }

    @Override
    public int openPages(List<String> urls) {
        return 15 * urls.size();
    }
}
