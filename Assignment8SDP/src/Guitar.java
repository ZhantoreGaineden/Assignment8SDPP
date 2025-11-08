class Guitar implements Instruments {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitGuitar(this);
    }
}