package abstractfactory;

public interface IDbUtils {

   IconnectionDb getConnectionDb();
   ICloseDb getCloseDb();


}
