import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class af
{
  private static au jdField_a_of_type_Au = new au();
  private static x jdField_a_of_type_X;
  private static Image jdField_a_of_type_JavaxMicroeditionLcduiImage;
  private static Image b;
  
  public static void a(x paramx)
  {
    jdField_a_of_type_Au.a(paramx);
  }
  
  public static void a(long paramLong)
  {
    int i = jdField_a_of_type_Au.jdField_a_of_type_Int;
    for (int j = 0; j < i; j++) {
      if (((x)jdField_a_of_type_Au.a(j)).jdField_a_of_type_Long == paramLong)
      {
        jdField_a_of_type_Au.b(j);
        return;
      }
    }
  }
  
  public static void a(Graphics paramGraphics)
  {
    if (!e.a(64)) {
      return;
    }
    int i = f.d;
    int j = f.e;
    int k = d.jdField_a_of_type_Int - i - 5;
    if (jdField_a_of_type_JavaxMicroeditionLcduiImage != null) {
      paramGraphics.drawImage(jdField_a_of_type_JavaxMicroeditionLcduiImage, k, 2, 0);
    }
    if (b != null) {
      paramGraphics.drawImage(b, k, 2 + jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight(), 0);
    }
    paramGraphics.setColor(0);
    paramGraphics.drawRect(k - 2, 0, i + 3, j + 3);
    for (j = 0; j < jdField_a_of_type_Au.jdField_a_of_type_Int; j++) {
      ((x)jdField_a_of_type_Au.a(j)).a(paramGraphics, k);
    }
    jdField_a_of_type_X.a(e.jdField_a_of_type_G.b, e.jdField_a_of_type_G.c);
    jdField_a_of_type_X.a(paramGraphics, k);
    i = 2 + jdField_a_of_type_JavaxMicroeditionLcduiImage.getHeight();
    if (b != null) {
      i += b.getHeight();
    }
    j = bg.a.stringWidth(e.jdField_a_of_type_JavaLangString);
    k = paramGraphics.getColor();
    paramGraphics.setColor(0);
    paramGraphics.drawString(e.jdField_a_of_type_JavaLangString, d.jdField_a_of_type_Int - j + 1, i + 1, 0);
    paramGraphics.setColor(-1);
    paramGraphics.drawString(e.jdField_a_of_type_JavaLangString, d.jdField_a_of_type_Int - j, i, 0);
    paramGraphics.setColor(k);
  }
  
  public static void a()
  {
    int i = f.e;
    int j = f.d;
    int k = i >> 1;
    int[] arrayOfInt1 = new int[j * k];
    for (int m = 0; m < k; m++) {
      for (int n = 0; n < j; n++) {
        if (e.a(n, m)) {
          arrayOfInt1[(m * j + n)] = 1872350463;
        } else {
          arrayOfInt1[(m * j + n)] = 1862270976;
        }
      }
    }
    jdField_a_of_type_JavaxMicroeditionLcduiImage = null;
    jdField_a_of_type_JavaxMicroeditionLcduiImage = Image.createRGBImage(arrayOfInt1, j, k, true);
    k = i - k;
    int[] arrayOfInt2 = new int[j * k];
    while (m < i)
    {
      for (int i1 = 0; i1 < j; i1++) {
        if (e.a(i1, m)) {
          arrayOfInt2[(m * j + i1 - arrayOfInt1.length)] = 1872350463;
        } else {
          arrayOfInt2[(m * j + i1 - arrayOfInt1.length)] = 1862270976;
        }
      }
      m++;
    }
    b = null;
    b = Image.createRGBImage(arrayOfInt2, j, k, true);
    if (jdField_a_of_type_Au.jdField_a_of_type_Int > 0) {
      jdField_a_of_type_Au.a();
    }
  }
  
  public static x a(long paramLong)
  {
    x localx = null;
    if (jdField_a_of_type_Au.jdField_a_of_type_Int <= 0) {
      return null;
    }
    int i = -1;
    for (;;)
    {
      i++;
      if (i >= jdField_a_of_type_Au.jdField_a_of_type_Int) {
        break;
      }
      if ((localx = (x)jdField_a_of_type_Au.a(i)).jdField_a_of_type_Long == paramLong) {
        return localx;
      }
    }
    return null;
  }
  
  static
  {
    (jdField_a_of_type_X = new x()).jdField_a_of_type_Int = 255;
    jdField_a_of_type_X.jdField_a_of_type_Byte = 1;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\af.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */