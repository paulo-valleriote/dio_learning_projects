package devices.models;

public abstract class Phone {
  protected String owner;
  public String phoneNumber;

  public abstract void call(String phoneToCall);

  public abstract void acceptCall(boolean accept);

  public abstract void playVoiceMessage();

  public abstract void showCurrentTime();
}
