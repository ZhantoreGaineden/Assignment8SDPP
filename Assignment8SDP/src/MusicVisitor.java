public class MusicVisitor implements Visitor {
    @Override
    public void visitDombyra(Dombyra dombyra) {
        System.out.println("MusicVisitor is playing the Dombyra");
    }
    @Override
    public void visitGuitar(Guitar guitar) {
        System.out.println("MusicVisitor is playing the Guitar");
    }
}
