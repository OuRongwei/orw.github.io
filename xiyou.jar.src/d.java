import engine.Ancient;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public final class d
  extends Canvas
  implements Runnable
{
  public static int a;
  public static int b;
  private static final byte[] jdField_a_of_type_ArrayOfByte = new byte[20];
  private static final byte[] jdField_b_of_type_ArrayOfByte = new byte[20];
  private static byte jdField_a_of_type_Byte;
  private static int f;
  private static int[] jdField_a_of_type_ArrayOfInt = new int[15];
  private static int g;
  public static int c;
  private static boolean jdField_b_of_type_Boolean = true;
  public static boolean a;
  private static int h;
  private static int i;
  public static int d = -1;
  public static int e = -1;
  private static int j;
  private static int k;
  private static int l;
  private static int m;
  private static int n;
  
  public d()
  {
    setFullScreenMode(true);
    jdField_a_of_type_Int = getWidth();
    jdField_b_of_type_Int = getHeight();
    e.jdField_a_of_type_Bc = new bc(Ancient.a);
    d locald = this;
    new Thread(locald).start();
    a((byte)0, 0);
  }
  
  public static final void a(byte paramByte, int paramInt)
  {
    int i1 = -1;
    int i2 = -1;
    do
    {
      i2++;
      if (i2 >= g) {
        break;
      }
    } while ((jdField_a_of_type_ArrayOfInt[i2] & 0xF) != paramByte);
    i1 = i2;
    if (i1 < 0)
    {
      boolean bool1 = b();
      jdField_a_of_type_ArrayOfInt[(g++)] = (paramInt | paramByte);
      if (bool1)
      {
        int i3 = jdField_a_of_type_ArrayOfInt[(g - 1)];
        jdField_a_of_type_ArrayOfInt[(g - 1)] = jdField_a_of_type_ArrayOfInt[(g - 2)];
        jdField_a_of_type_ArrayOfInt[(g - 2)] = i3;
      }
      switch (paramByte)
      {
      case 0: 
        e.a();
        return;
      case 1: 
        return;
      case 3: 
        e.f();
        return;
      case 7: 
        e.i();
        return;
      case 8: 
        return;
      case 9: 
        e.n();
        return;
      case 13: 
        e.q();
        return;
      case 12: 
        return;
      case 4: 
        e.C();
      }
      return;
    }
    System.arraycopy(jdField_a_of_type_ArrayOfInt, i1 + 1, jdField_a_of_type_ArrayOfInt, i1, g - 1 - i1);
    boolean bool2 = b();
    jdField_a_of_type_ArrayOfInt[(g - 1)] = (paramInt | paramByte);
    if ((bool2) && (i1 != g - 1))
    {
      int i4 = jdField_a_of_type_ArrayOfInt[(g - 1)];
      jdField_a_of_type_ArrayOfInt[(g - 1)] = jdField_a_of_type_ArrayOfInt[(g - 2)];
      jdField_a_of_type_ArrayOfInt[(g - 2)] = i4;
    }
  }
  
  public static final int a()
  {
    if (g == 0) {
      return -1;
    }
    switch (jdField_a_of_type_ArrayOfInt[(g - 1)] & 0xF)
    {
    case 0: 
      e.b();
      break;
    case 1: 
      e.d();
      break;
    case 3: 
      e.g();
      break;
    case 7: 
      e.j();
      break;
    case 8: 
      e.l();
      break;
    case 9: 
      e.o();
      break;
    case 13: 
      e.r();
      break;
    case 12: 
      e.z();
      break;
    case 4: 
      e.D();
    }
    return jdField_a_of_type_ArrayOfInt[(g-- - 1)] & 0xF;
  }
  
  public static final int b()
  {
    if (g == 0) {
      return -1;
    }
    return jdField_a_of_type_ArrayOfInt[(g - 1)] & 0xF;
  }
  
  private static boolean b()
  {
    if (g == 0) {
      return false;
    }
    return (jdField_a_of_type_ArrayOfInt[(g - 1)] & 0x40) != 0;
  }
  
  public static final boolean a(byte paramByte)
  {
    int i1 = -1;
    do
    {
      i1++;
      if (i1 >= g) {
        break;
      }
    } while ((jdField_a_of_type_ArrayOfInt[i1] & 0xF) != paramByte);
    return true;
    return false;
  }
  
  protected final void paint(Graphics paramGraphics)
  {
    paramGraphics.setClip(0, 0, jdField_a_of_type_Int, jdField_b_of_type_Int);
    Graphics localGraphics = paramGraphics;
    if (g != 0)
    {
      int i1 = jdField_a_of_type_ArrayOfInt[(g - 1)] & 0xF0;
      int i2 = -1;
      for (;;)
      {
        i2++;
        if (i2 >= g) {
          break;
        }
        if ((i2 == g - 1) || ((i1 & 0x20) == 0)) {
          switch (jdField_a_of_type_ArrayOfInt[i2] & 0xF)
          {
          case 0: 
            e.a(localGraphics);
            break;
          case 1: 
            break;
          case 3: 
            e.b(localGraphics);
            break;
          case 7: 
            e.c(localGraphics);
            break;
          case 8: 
            e.d(localGraphics);
            break;
          case 9: 
            e.e(localGraphics);
            break;
          case 13: 
            e.f(localGraphics);
            break;
          case 12: 
            e.g(localGraphics);
            break;
          case 4: 
            e.h(localGraphics);
          }
        }
      }
    }
    if (e.jdField_b_of_type_Boolean) {
      ae.a(paramGraphics, jdField_a_of_type_Int / 2 - 10, jdField_b_of_type_Int - 21);
    }
  }
  
  public final void a()
  {
    repaint();
    serviceRepaints();
  }
  
  public final void hideNotify()
  {
    jdField_a_of_type_Boolean = true;
  }
  
  public final void showNotify()
  {
    jdField_a_of_type_Boolean = false;
  }
  
  public final void run()
  {
    long l1 = System.currentTimeMillis();
    while (jdField_b_of_type_Boolean)
    {
      e.jdField_a_of_type_Q.b();
      long l2;
      if ((l2 = System.currentTimeMillis() - l1) > 100L)
      {
        l1 += 100L;
        if (g != 0)
        {
          f |= 0x2;
          int i1 = jdField_a_of_type_ArrayOfInt[(g - 1)] & 0xF0;
          int i2 = -1;
          for (;;)
          {
            i2++;
            if (i2 >= g) {
              break;
            }
            if (i2 == g - 1) {
              f &= 0x1;
            } else {
              if ((i1 & 0x10) != 0) {
                continue;
              }
            }
            switch (jdField_a_of_type_ArrayOfInt[i2] & 0xF)
            {
            case 0: 
              e.c();
              break;
            case 1: 
              e.e();
              break;
            case 3: 
              e.h();
              break;
            case 7: 
              e.k();
              e.b(7);
              break;
            case 8: 
              e.m();
              e.b(8);
              break;
            case 9: 
              e.p();
              break;
            case 13: 
              e.s();
              e.b(13);
              break;
            case 12: 
              e.A();
              e.b(12);
              break;
            case 4: 
              e.E();
            }
          }
          jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte + 1);
          for (i1 = 19; i1 >= 0; i1--) {
            if (jdField_b_of_type_ArrayOfByte[i1] == 0)
            {
              if (jdField_a_of_type_ArrayOfByte[i1] == 1) {
                jdField_a_of_type_ArrayOfByte[i1] = 2;
              } else if (jdField_a_of_type_ArrayOfByte[i1] == -1) {
                jdField_a_of_type_ArrayOfByte[i1] = 0;
              }
            }
            else
            {
              jdField_a_of_type_ArrayOfByte[i1] = jdField_b_of_type_ArrayOfByte[i1];
              jdField_b_of_type_ArrayOfByte[i1] = 0;
            }
          }
          n += 1;
          if (m == 0)
          {
            if (l == 1) {
              l = 2;
            } else if (l == -1) {
              l = 0;
            }
          }
          else
          {
            l = m;
            m = 0;
          }
        }
        if (l2 < 200L)
        {
          repaint();
          serviceRepaints();
        }
        else
        {
          l1 += 100L;
        }
        if ((f & 0x4) != 0)
        {
          f &= 0xFFFFFFFB;
          l1 = System.currentTimeMillis();
        }
        c += 1;
      }
      else
      {
        try
        {
          Thread.sleep(10L);
        }
        catch (Exception localException) {}
      }
    }
    Ancient.a.destroyApp(false);
    Ancient.a.notifyDestroyed();
  }
  
  protected final void keyPressed(int paramInt)
  {
    if ((paramInt = a(paramInt)) >= 0)
    {
      jdField_a_of_type_Byte = 0;
      if (jdField_a_of_type_ArrayOfByte[paramInt] == -1)
      {
        jdField_b_of_type_ArrayOfByte[paramInt] = 1;
        return;
      }
      jdField_a_of_type_ArrayOfByte[paramInt] = 1;
      jdField_b_of_type_ArrayOfByte[paramInt] = 0;
    }
  }
  
  private static final byte a(int paramInt)
  {
    switch (paramInt)
    {
    case 50: 
    case 116: 
      return 6;
    case -1: 
      return 0;
    case 52: 
    case 102: 
      return 8;
    case -3: 
      return 2;
    case 53: 
    case 103: 
      return 9;
    case -5: 
      return 4;
    case 54: 
    case 104: 
      return 10;
    case -4: 
      return 3;
    case 56: 
    case 98: 
      return 12;
    case -2: 
      return 1;
    case 48: 
    case 109: 
      return 14;
    case 49: 
    case 114: 
      return 5;
    case 55: 
    case 118: 
      return 11;
    case 57: 
    case 110: 
      return 13;
    case 51: 
    case 121: 
      return 7;
    case -6: 
      return 17;
    case -7: 
      return 18;
    case 35: 
    case 106: 
      return 15;
    case 42: 
    case 117: 
      return 16;
    case -8: 
    case 8: 
      return 19;
    }
    return -1;
  }
  
  public static final int c()
  {
    for (int i1 = 19; i1 >= 0; i1--) {
      if (a(i1) == 1) {
        return i1;
      }
    }
    return -1;
  }
  
  public static final int d()
  {
    for (int i1 = 19; i1 >= 0; i1--) {
      if (a(i1) > 0) {
        return i1;
      }
    }
    return -1;
  }
  
  public static final boolean a()
  {
    return c() >= 0;
  }
  
  protected final void keyReleased(int paramInt)
  {
    if ((paramInt = a(paramInt)) >= 0)
    {
      if (jdField_a_of_type_ArrayOfByte[paramInt] == 1)
      {
        jdField_b_of_type_ArrayOfByte[paramInt] = -1;
        return;
      }
      jdField_a_of_type_ArrayOfByte[paramInt] = -1;
      jdField_b_of_type_ArrayOfByte[paramInt] = 0;
    }
  }
  
  public static final void b()
  {
    for (int i1 = 19; i1 >= 0; i1--)
    {
      jdField_a_of_type_ArrayOfByte[i1] = 0;
      jdField_b_of_type_ArrayOfByte[i1] = 0;
    }
    jdField_a_of_type_Byte = 0;
  }
  
  public static final int a(int paramInt)
  {
    if ((paramInt >= 20) || (paramInt < 0)) {
      return 0;
    }
    if ((f & 0x3) > 0) {
      return 0;
    }
    return jdField_a_of_type_ArrayOfByte[paramInt];
  }
  
  public static final void c()
  {
    f &= 0xFFFFFFFE;
  }
  
  public static final void d()
  {
    f |= 0x4;
  }
  
  public static final void e()
  {
    jdField_b_of_type_Boolean = false;
  }
  
  public static final int e()
  {
    if ((f & 0x3) > 0) {
      return 0;
    }
    return l;
  }
  
  public static final int f()
  {
    return h;
  }
  
  public static final int g()
  {
    return j;
  }
  
  public static final int h()
  {
    return i;
  }
  
  public static final int i()
  {
    return k;
  }
  
  protected final void pointerPressed(int paramInt1, int paramInt2)
  {
    d = h = paramInt1;
    e = i = paramInt2;
    n = 0;
    if (l == -1)
    {
      m = 1;
      return;
    }
    l = 1;
    m = 0;
  }
  
  protected final void pointerReleased(int paramInt1, int paramInt2)
  {
    j = paramInt1;
    k = paramInt2;
    if (l == 1)
    {
      m = -1;
      return;
    }
    l = -1;
    m = 0;
  }
  
  protected final void pointerDragged(int paramInt1, int paramInt2)
  {
    h = paramInt1;
    i = paramInt2;
    if (l != 3)
    {
      if ((Math.abs(h - d) > 8) || (Math.abs(i - e) > 8)) {
        l = 3;
      }
    }
    else {
      l = 3;
    }
  }
  
  public static final void f()
  {
    l = 0;
    m = 0;
    n = 0;
    d = e = -1;
  }
  
  static
  {
    jdField_a_of_type_Boolean = false;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\d.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */