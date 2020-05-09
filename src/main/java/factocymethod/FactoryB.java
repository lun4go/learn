package factocymethod;

public class FactoryB implements Factory {


    public Product CreatInstants() {
        return new ProductB();
    }
}
