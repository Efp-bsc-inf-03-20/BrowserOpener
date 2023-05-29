import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class BrowserOpener {
    public static void main(String[] args) {
        String[] urls = {
            "https://www.google.com",
            "https://www.openai.com",
            "https://www.facebook.com"
        };

        while (true) {
            for (String url : urls) {
                openBrowser(url);
                delay(50); // Delay between each browser opening (in milliseconds)
            }
        }
    }

    private static void openBrowser(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
