package features.clock;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Clock {
  public long currentTime;

  public Clock() {
    currentTime = LocalTime.now().getLong(ChronoField.MILLI_OF_SECOND);
  }

  public long compareTime(long time) {
    return currentTime - time;
  }
}
