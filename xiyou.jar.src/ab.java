import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class ab
{
  private static int jdField_a_of_type_Int = 16;
  private static String[] jdField_a_of_type_ArrayOfJavaLangString = null;
  private static int b = -1;
  
  public static void a()
  {
    jdField_a_of_type_Int = 16;
  }
  
  public static void a(Graphics paramGraphics)
  {
    if (jdField_a_of_type_Int < 0) {
      return;
    }
    jdField_a_of_type_Int -= 2;
    paramGraphics.setColor(0);
    for (int i = 0; i < (d.b >> 4) + 1; i++) {
      for (int j = 0; j < (d.jdField_a_of_type_Int >> 4) + 1; j++) {
        paramGraphics.fillRect((j << 4) - (jdField_a_of_type_Int >> 1), (i << 4) - (jdField_a_of_type_Int >> 1), jdField_a_of_type_Int, jdField_a_of_type_Int);
      }
    }
  }
  
  public static boolean a()
  {
    return jdField_a_of_type_Int < 0;
  }
  
  public static void a(String paramString)
  {
    if (b >= 0) {
      return;
    }
    b = 20;
    if (paramString != null) {
      jdField_a_of_type_ArrayOfJavaLangString = e.a(paramString, 160 - bg.jdField_a_of_type_Byte, bg.jdField_a_of_type_JavaxMicroeditionLcduiFont);
    }
  }
  
  public static void b(Graphics paramGraphics)
  {
    if (b < 0)
    {
      jdField_a_of_type_ArrayOfJavaLangString = null;
      return;
    }
    b -= 1;
    if (jdField_a_of_type_ArrayOfJavaLangString != null)
    {
      int i = d.jdField_a_of_type_Int - 160 >> 1;
      int j = bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight() * jdField_a_of_type_ArrayOfJavaLangString.length + (jdField_a_of_type_ArrayOfJavaLangString.length + 1 << 1);
      int k = d.b - j >> 1;
      ad.a(paramGraphics, i, k, 160, j);
      paramGraphics.setColor(13881804);
      paramGraphics.drawRect(i, k, 160, j);
      paramGraphics.setColor(16777215);
      i += (bg.jdField_a_of_type_Byte >> 1);
      for (j = 0; j < jdField_a_of_type_ArrayOfJavaLangString.length; j++)
      {
        k += 2;
        paramGraphics.drawString(jdField_a_of_type_ArrayOfJavaLangString[j], i, k, 20);
        k += bg.b;
      }
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ab.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */