package singleton;

public enum EnumSingleton {
    INSTANTS;

    void print(){
        System.out.println(INSTANTS.hashCode());
    }

}
