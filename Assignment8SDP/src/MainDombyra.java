public class MainDombyra {
    public static void main(String[] args) {
        Instruments dombyra = new Dombyra();

        Visitor sound = new SoundVisitor();
        Visitor action = new ActionVisitor();
        Visitor music = new MusicVisitor();

        dombyra.accept(sound);
        dombyra.accept(action);
        dombyra.accept(music);
    }
}