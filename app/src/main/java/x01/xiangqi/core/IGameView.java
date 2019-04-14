package x01.xiangqi.core;

public interface IGameView {
    void postRepaint();
    void drawPiece(int pc, int x, int y);
    void drawSelected(int x, int y);
}
