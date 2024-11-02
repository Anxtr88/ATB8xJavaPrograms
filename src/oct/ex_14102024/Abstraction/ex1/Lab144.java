package oct.ex_14102024.Abstraction.ex1;

public class Lab144 {
    public static void main(String[] args) {
        ChromeTC c = new ChromeTC();
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");
        c.takeScreenshot();
    }
}
