package engine;

import d;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class Ancient
  extends MIDlet
{
  public static Ancient a;
  public static Display a;
  public static d a;
  public static String a;
  public static String b;
  public static byte a;
  public static byte b;
  
  public Ancient()
  {
    try
    {
      jdField_a_of_type_EngineAncient = this;
      a();
      return;
    }
    catch (Exception localException)
    {
      localException;
    }
  }
  
  public final void startApp()
  {
    if (jdField_a_of_type_D != null) {
      return;
    }
    jdField_a_of_type_D = new d();
    (jdField_a_of_type_JavaxMicroeditionLcduiDisplay = Display.getDisplay(this)).setCurrent(jdField_a_of_type_D);
  }
  
  public final void pauseApp() {}
  
  public final void destroyApp(boolean paramBoolean) {}
  
  private static void a()
  {
    String str;
    if ((str = jdField_a_of_type_EngineAncient.getAppProperty("MIDlet-Version")) == null) {
      str = "100";
    }
    StringBuffer localStringBuffer = new StringBuffer(3);
    int i = -1;
    for (;;)
    {
      i++;
      if (i >= str.length()) {
        break;
      }
      if ((str.charAt(i) >= '0') && (str.charAt(i) <= '9')) {
        localStringBuffer.append(str.charAt(i));
      }
    }
    jdField_a_of_type_Byte = Byte.parseByte(localStringBuffer.toString());
    if ((jdField_b_of_type_JavaLangString = System.getProperty("microedition.platform")) == null) {
      jdField_b_of_type_JavaLangString = "None";
    } else if (jdField_b_of_type_JavaLangString.length() >= 20) {
      jdField_b_of_type_JavaLangString = jdField_b_of_type_JavaLangString.substring(0, 20);
    }
    jdField_a_of_type_JavaLangString = jdField_a_of_type_EngineAncient.getAppProperty("unionID");
    try
    {
      jdField_b_of_type_Byte = Byte.parseByte(jdField_a_of_type_EngineAncient.getAppProperty("sdk"));
      return;
    }
    catch (Exception localException)
    {
      jdField_b_of_type_Byte = 0;
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\engine\Ancient.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */