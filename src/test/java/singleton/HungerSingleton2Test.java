package singleton;


class HungerSingleton2Test {


    public static void main(String[] args) {
        HungerSingleton2 instants = HungerSingleton2.getInstants();
        HungerSingleton2 instants2 = HungerSingleton2.getInstants();
        System.err.println(instants == instants2);//验证是否为单例
    }
}