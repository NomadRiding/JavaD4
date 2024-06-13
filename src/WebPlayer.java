public class WebPlayer extends Player{

    public WebPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Now closing Web Player");
    }


}
