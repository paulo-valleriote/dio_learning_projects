package features.music;

import features.clock.Clock;
import features.models.MusicPlayer;

public class IphoneMusicPlayer extends MusicPlayer {

  @Override
  public void selectMusic(String name, int durationInMinutes) {
    Music selectedMusic = new Music(name, durationInMinutes);
    currentMusic = selectedMusic;
    System.out.println("Musica selecionada: " + name);
    System.out.println("Duração: " + durationInMinutes + " minutos");
  }

  @Override
  public void play() {
    playedAt = new Clock().currentTime;
    playing = true;
    System.out.println("Tocando música...");
  }

  @Override
  public void pause() {
    Clock timeManager = new Clock();
    playedTimeInSeconds = timeManager.compareTime(playedAt) / 1000;
    System.out.println("Pausada após: " + playedTimeInSeconds + " segundos");
    playedAt = 0;
  }

}
