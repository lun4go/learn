package abstractfactory;

import static org.junit.Assert.*;

public class IDbUtilsTest {
    public static void main(String[] args) {
        IDbUtils iDbUtils = null;
        IconnectionDb connectionDb = iDbUtils.getConnectionDb();
        connectionDb.connection();
        ICloseDb closeDb = iDbUtils.getCloseDb();
        closeDb.close();
    }
}