import devices.Iphone;
import features.music.IphoneMusicPlayer;
import features.web.Safari;

public class App {
    public static void main(String[] args) throws Exception {
        String[] myPhoneParams = new String[2];
        myPhoneParams[0] = "MyPhone";
        myPhoneParams[1] = "(any_ddd) my_number";
        Iphone myPhone = new Iphone(myPhoneParams);

        System.out.println("Iphone");
        myPhone.call("(any_ddd) another_number");
        myPhone.acceptCall(true);
        myPhone.showCurrentTime();

        System.out.println("Browser");
        String[] firstPageParams = new String[2];
        firstPageParams[0] = "WebPage";
        firstPageParams[1] = "www.webpage.com";
        Safari browser = new Safari(firstPageParams);
        browser.showPage();
        String[] secondPageParams = new String[2];
        secondPageParams[0] = "AnotherWebPage";
        secondPageParams[1] = "www.anotherwebpage.com";
        browser.newPageTab(secondPageParams);

        System.out.println("MusicPlayer");
        IphoneMusicPlayer musicPlayer = new IphoneMusicPlayer();
        musicPlayer.selectMusic("Fear of the dark", 3);
        musicPlayer.play();
        musicPlayer.pause();
    }
}
