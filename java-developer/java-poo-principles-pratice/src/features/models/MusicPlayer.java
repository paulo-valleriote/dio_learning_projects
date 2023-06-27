package features.models;

import features.music.Music;

public abstract class MusicPlayer {
  public boolean playing;
  protected long playedAt;
  protected long playedTimeInSeconds;
  protected Music currentMusic;

  public abstract void selectMusic(String name, int durationInMinutes);

  public abstract void play();

  public abstract void pause();
}
