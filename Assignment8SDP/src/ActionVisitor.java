public class ActionVisitor implements Visitor {

    @Override
    public void visitDombyra(Dombyra dombyra) {
        System.out.println("ActionVisitor shows how to play the Dombyra");
    }
    @Override
    public void visitGuitar(Guitar guitar) {
        System.out.println("ActionVisitor shows how to play the Guitar");
    }

}
