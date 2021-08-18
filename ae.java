import java.util.TimeZone;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class ae
{
  private static au jdField_a_of_type_Au = new au();
  private static au jdField_b_of_type_Au = new au();
  private static au c = new au();
  private static short jdField_a_of_type_Short = 0;
  private static int jdField_a_of_type_Int = 0;
  private static short jdField_b_of_type_Short = 0;
  private static byte jdField_a_of_type_Byte = 35;
  
  private static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramGraphics.getClipX();
    int j = paramGraphics.getClipY();
    int k = paramGraphics.getClipWidth();
    int m = paramGraphics.getClipHeight();
    paramGraphics.setClip(paramInt1, paramInt2, paramInt3, paramInt4);
    for (paramInt3 = 0; paramInt3 < paramInt4; paramInt3 += 10) {
      paramGraphics.drawImage(e.a(15), paramInt1, paramInt2 + paramInt3, 0);
    }
    paramGraphics.setClip(i, j, k, m);
  }
  
  public static final void a(Graphics paramGraphics)
  {
    Object localObject1 = null;
    int i;
    if (jdField_a_of_type_Au.jdField_a_of_type_Int > 0)
    {
      i = bg.a.stringWidth((String)jdField_a_of_type_Au.a(0));
      if (jdField_a_of_type_Int == 0) {
        if (i <= d.jdField_a_of_type_Int) {
          jdField_a_of_type_Short = (short)((d.jdField_a_of_type_Int >> 1) + (i >> 1));
        } else {
          jdField_a_of_type_Short = (short)d.jdField_a_of_type_Int;
        }
      }
      if (++jdField_a_of_type_Int < 10) {
        break label253;
      }
      if ((jdField_a_of_type_Short < i + d.jdField_a_of_type_Int) && (i > d.jdField_a_of_type_Int))
      {
        jdField_a_of_type_Short = (short)(jdField_a_of_type_Short + 2);
      }
      else if ((i > d.jdField_a_of_type_Int) || (jdField_a_of_type_Int > 30))
      {
        e.jdField_a_of_type_Bg.jdField_b_of_type_Short = ((short)d.b);
        jdField_a_of_type_Int = 0;
        jdField_a_of_type_Au.b(0);
      }
    }
    if (jdField_b_of_type_Au.jdField_a_of_type_Int > 0)
    {
      i = bg.a.stringWidth((String)jdField_b_of_type_Au.a(0));
      if (jdField_b_of_type_Short < i + d.jdField_a_of_type_Int)
      {
        jdField_b_of_type_Short = (short)(jdField_b_of_type_Short + 4);
      }
      else
      {
        e.jdField_a_of_type_Bg.jdField_b_of_type_Short = ((short)d.b);
        jdField_b_of_type_Short = 0;
        jdField_b_of_type_Au.b(0);
      }
    }
    if (c.jdField_a_of_type_Int > 0) {
      if (jdField_a_of_type_Byte > 0)
      {
        jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte - 1);
      }
      else
      {
        jdField_a_of_type_Byte = 100;
        c.b(0);
      }
    }
    label253:
    if (!d.a((byte)12)) {
      y.a(paramGraphics);
    }
    if (!d.a((byte)13))
    {
      paramGraphics = e.jdField_a_of_type_Bg;
      Graphics localGraphics = paramGraphics;
      int m;
      if ((jdField_a_of_type_Au.jdField_a_of_type_Int > 0) && (jdField_a_of_type_Short < bg.a.stringWidth((String)jdField_a_of_type_Au.a(0)) + d.jdField_a_of_type_Int))
      {
        int j = d.jdField_a_of_type_Int;
        m = bg.jdField_b_of_type_Byte + 6;
        a(localGraphics, 0, d.b - 30 - (bg.a.getHeight() * 5 + 10), j, m);
        a(localGraphics, d.jdField_a_of_type_Int - jdField_a_of_type_Short, d.b - 30 - (bg.a.getHeight() * 5 + 7), (String)jdField_a_of_type_Au.a(0));
      }
      Object localObject2 = null;
      if ((jdField_b_of_type_Au.jdField_a_of_type_Int > 0) && (jdField_b_of_type_Short >= 0))
      {
        int k = d.jdField_a_of_type_Int;
        m = bg.jdField_b_of_type_Byte + 6;
        a(localGraphics, 0, d.b - 30 - ((bg.a.getHeight() << 2) + 6), k, m);
        a(localGraphics, d.jdField_a_of_type_Int - jdField_b_of_type_Short, d.b - 30 - ((bg.a.getHeight() << 2) + 3), (String)jdField_b_of_type_Au.a(0));
      }
      Object localObject3 = null;
      if ((c.jdField_a_of_type_Int > 0) && (jdField_a_of_type_Byte >= 0))
      {
        localObject3 = (String)c.a(0);
        int n = d.jdField_a_of_type_Int - 108 >> 1;
        m = (localObject3 = ba.a((String)localObject3, 108, bg.a)).length * (bg.a.getHeight() + 1);
        a(localGraphics, n, 30, 108, m);
        m = -1;
        for (;;)
        {
          m++;
          if (m >= localObject3.length) {
            break;
          }
          a(localGraphics, n + 1, 30 + m * (bg.a.getHeight() + 1), localObject3[m], 16643712, 20);
        }
      }
      e.jdField_a_of_type_Bg = paramGraphics;
    }
  }
  
  public static void a()
  {
    jdField_a_of_type_Au.a();
    jdField_b_of_type_Au.a();
    c.a();
  }
  
  public static void a(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {
      return;
    }
    if ((paramInt == 5) || (paramInt == 6))
    {
      jdField_a_of_type_Au.a(paramString);
      if (jdField_a_of_type_Au.jdField_a_of_type_Int > 10) {
        jdField_a_of_type_Au.b(0);
      }
      if (jdField_a_of_type_Au.jdField_a_of_type_Int == 1) {
        jdField_a_of_type_Int = 0;
      }
    }
    if (paramInt == 1)
    {
      jdField_b_of_type_Au.a(paramString);
      if (jdField_b_of_type_Au.jdField_a_of_type_Int > 10) {
        jdField_b_of_type_Au.b(0);
      }
    }
    else if (paramInt == 7)
    {
      c.a(paramString);
      if (c.jdField_a_of_type_Int > 10) {
        c.b(0);
      }
    }
  }
  
  private static void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString)
  {
    paramGraphics.setColor(16643712);
    int i = paramString.length();
    int j = 0;
    int k = 1;
    int i1 = 0;
    int i2 = -1;
    for (;;)
    {
      i2++;
      if (i2 >= i) {
        break;
      }
      char c1;
      int m;
      int i3;
      if ((c1 = paramString.charAt(i2)) == '^')
      {
        i1 = 0;
        m = 1;
        i3 = 0;
        for (;;)
        {
          i3++;
          if (i3 > 2) {
            break;
          }
          if (i2 + i3 >= i)
          {
            m = 0;
            break;
          }
          int n;
          if (((n = paramString.charAt(i2 + i3)) < '0') || (n > 57))
          {
            m = 0;
            break;
          }
          i1 += (n - 48) * (i3 == 1 ? 10 : 1);
        }
        if ((m != 0) && (i1 >= 0) && (i1 < 9))
        {
          f.a(paramGraphics, e.a(10), paramInt1, paramInt2 + (bg.jdField_b_of_type_Byte - 14 >> 1), i1 * 15, 0, 15, 14, 0);
          paramInt1 += 15;
          i2 += 2;
        }
      }
      else if (c1 == '#')
      {
        i3 = 0;
        e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
        for (m = 1;; m++)
        {
          if (m >= 7) {
            break label309;
          }
          if (i2 + m >= i)
          {
            paramGraphics.setColor(16643712);
            break;
          }
          if (((i3 = paramString.charAt(i2 + m)) < '0') || (i3 > 102))
          {
            if (j != 0)
            {
              j = j == 0 ? 1 : 0;
              paramGraphics.setColor(16643712);
              break;
            }
            k = 0;
          }
          e.jdField_a_of_type_JavaLangStringBuffer.append(i3);
        }
        label309:
        if (k != 0)
        {
          i2 += 6;
          j = 1;
          m = e.a(e.jdField_a_of_type_JavaLangStringBuffer.toString(), 16643712);
          paramGraphics.setColor(m);
          e.jdField_a_of_type_JavaLangStringBuffer.delete(0, e.jdField_a_of_type_JavaLangStringBuffer.length());
          continue;
        }
      }
      paramGraphics.drawChar(c1, paramInt1, paramInt2, 0);
      paramInt1 += paramGraphics.getFont().charWidth(c1);
    }
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(paramInt3);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, paramInt4);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4, int paramInt5)
  {
    paramGraphics.setColor(paramInt4);
    paramGraphics.drawString(paramString, paramInt1 + 1, paramInt2, paramInt5);
    paramGraphics.drawString(paramString, paramInt1 - 1, paramInt2, paramInt5);
    paramGraphics.drawString(paramString, paramInt1, paramInt2 + 1, paramInt5);
    paramGraphics.drawString(paramString, paramInt1, paramInt2 - 1, paramInt5);
    paramGraphics.setColor(paramInt3);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, paramInt5);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    int i = (paramString = ba.a(paramString, paramInt3, bg.a)).length * bg.jdField_b_of_type_Byte;
    paramGraphics.setColor(7498083);
    paramGraphics.fillRect(paramInt1, paramInt2 + 1, paramInt3, i);
    paramGraphics.setColor(-1);
    for (i = 0; i < paramString.length; i++) {
      paramGraphics.drawString(paramString[i], paramInt1 + (paramInt3 - bg.a.stringWidth(paramString[i]) >> 1), paramInt2 + i * bg.jdField_b_of_type_Byte, 20);
    }
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    switch (d.c % 10)
    {
    case 0: 
    case 1: 
    case 2: 
      f.a(paramGraphics, e.a(7), paramInt1, paramInt2, 67, 0, 21, 21, 0);
      return;
    case 3: 
    case 4: 
    case 5: 
      f.a(paramGraphics, e.a(7), paramInt1, paramInt2, 88, 0, 21, 21, 0);
      return;
    case 6: 
    case 7: 
      f.a(paramGraphics, e.a(7), paramInt1, paramInt2, 109, 0, 21, 21, 0);
      return;
    case 8: 
    case 9: 
      f.a(paramGraphics, e.a(7), paramInt1, paramInt2, 109, 0, 21, 21, 2);
    }
  }
  
  public static void b(Graphics paramGraphics)
  {
    if (e.jdField_a_of_type_G.b)
    {
      String str = "一键挂机中,按#键取消挂机";
      int i = bg.a.getHeight() * 6 + 2;
      String[] arrayOfString;
      int j = (arrayOfString = ba.a(str, i, bg.a)).length * (bg.a.getHeight() + 1);
      int k = d.jdField_a_of_type_Int - i >> 1;
      int m = d.b - j >> 1;
      a(paramGraphics, k, m, i, j);
      i = -1;
      for (;;)
      {
        i++;
        if (i >= arrayOfString.length) {
          break;
        }
        a(paramGraphics, k + 2, m + i * (bg.a.getHeight() + 1), arrayOfString[i], 16643712, 20);
      }
    }
  }
  
  static
  {
    TimeZone.getDefault();
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ae.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */