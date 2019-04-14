package x01.xiangqi.core;

public interface IGameCallback {
    void postPlaySound(int soundIndex);
    void postShowMessage(String message);
    void postShowMessage(int messageId);
    void postStartThink();
    void postEndThink();
}
