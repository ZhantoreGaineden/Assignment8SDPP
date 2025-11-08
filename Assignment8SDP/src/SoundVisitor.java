public class SoundVisitor implements Visitor {
    @Override
    public void visitDombyra (Dombyra dombyra) {
        System.out.println("SoundVisitor produces the Dombyra sound");
        SoundPlayer.play("src/sounds/dombyra.wav");
    }
    @Override
    public void visitGuitar (Guitar guitar) {
        System.out.println("SoundVisitor produces the Guitar sound");
    }
}
