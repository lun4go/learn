package factocymethod;

/**
 * 工厂实现
 */
public class FactoryA implements Factory {


    public Product CreatInstants() {
        return new ProductA();
    }
}
