package factocymethod;


public class FactoryTest {


    public static void main(String[] args) {
        /**
         * 根据子类实现创建具体对象
         */
        Factory factory = new FactoryA();
        Product product = factory.CreatInstants();
        product.print();
        /**
         * 根据子类实现创建具体对象
         */
        Factory factoryA = new FactoryB();
        Product product2 = factoryA.CreatInstants();
        product2.print();

    }

}