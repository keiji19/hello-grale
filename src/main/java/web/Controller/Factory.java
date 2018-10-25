package web.Controller;

public abstract class Factory {

    public <T> Product create(T entity) {
        Product p = parse(entity);
        validate(p);
        return p;
    }

    protected abstract <T> Product parse(T entity);
    protected abstract void validate(Product product);


}
