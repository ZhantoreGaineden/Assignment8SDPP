class Dombyra implements Instruments{

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDombyra(this);
    }
}
