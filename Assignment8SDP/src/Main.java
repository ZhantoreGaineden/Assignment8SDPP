public class Main {

    public static void main(String[] args) {

        Instruments Dombyra = new Dombyra();
        Instruments Guitar = new Guitar();

        Visitor SoundVisitor = new SoundVisitor();
        Visitor ActionVisitor = new ActionVisitor();
        Visitor MusicVisitor = new MusicVisitor();


        Dombyra.accept(SoundVisitor);
        Guitar.accept(SoundVisitor);
        Dombyra.accept(ActionVisitor);
        Guitar.accept(ActionVisitor);
        Dombyra.accept(MusicVisitor);
        Guitar.accept(MusicVisitor);
    }
}