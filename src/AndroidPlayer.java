public class AndroidPlayer extends Player implements IPlayable, IShareable{
    public AndroidPlayer(double volume, int currentTrack) {
        super(volume, currentTrack);
    }

    @Override
    public void close() {
        System.out.println("Now closing Android player");
    }

    @Override
    public void play() {
        System.out.println("Now playing Android Player");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Android Player");
    }

    @Override
    public void mute() {
       setVolume(0);
    }

    @Override
    public void increaseVolume() {
        setVolume(getVolume() + 0.1);
        if(getVolume() > MAX_VOLUME) setVolume(MAX_VOLUME);
    }


    @Override
    public void share() {
    }
}
