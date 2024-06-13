//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebPlayer webPlayer = new WebPlayer(0.5, 1);
        ApplePlayer applePlayer = new ApplePlayer(0.2, 2);

        System.out.println("Web Player volume: " + webPlayer.getVolume());

        applePlayer.getVolume();
        applePlayer.close();
        applePlayer.play();
        System.out.println(applePlayer.getVolume());
        applePlayer.increaseVolume();
        System.out.println(applePlayer.getVolume());
    }
}