package singleton;


class HungerSingletonTest {


    public static void main(String[] args) {
        HungerSingleton instants = HungerSingleton.getInstants();
        HungerSingleton instants2 = HungerSingleton.getInstants();
        System.err.println(instants == instants2);//验证是否为单例
    }
}