import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class f
{
  private static byte[] jdField_a_of_type_ArrayOfByte;
  private static byte[] jdField_b_of_type_ArrayOfByte;
  private static byte[] c;
  private static int h;
  private static int i;
  public static int a;
  public static int b;
  private static Graphics jdField_a_of_type_JavaxMicroeditionLcduiGraphics;
  private static Image jdField_a_of_type_JavaxMicroeditionLcduiImage;
  private static Image[] jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage;
  private static boolean jdField_a_of_type_Boolean;
  private static int j;
  private static int k;
  private static int l;
  private static int m;
  private static int n;
  private static int o;
  private static int p;
  public static int c;
  private static int q;
  private static int r;
  public static int d;
  public static int e;
  public static int f;
  private static int s;
  private static byte jdField_a_of_type_Byte;
  public static a[] a;
  public static int g;
  private static int t;
  public static int[] a;
  private static int[] jdField_b_of_type_ArrayOfInt;
  
  public static final int a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if ((jdField_a_of_type_ArrayOfByte != null) || (jdField_b_of_type_ArrayOfByte != null) || (jdField_c_of_type_ArrayOfByte != null)) {
      e.jdField_a_of_type_C.a();
    }
    if (paramBoolean) {
      jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte | 0x8);
    } else {
      jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte & 0xFFFFFFF7);
    }
    if (paramBoolean)
    {
      jdField_a_of_type_ArrayOfByte = null;
      jdField_b_of_type_ArrayOfByte = null;
      jdField_c_of_type_ArrayOfByte = null;
      System.gc();
      Thread.yield();
    }
    int i1 = paramArrayOfByte[0];
    int i2 = paramArrayOfByte[1];
    if ((i1 != f) || (i2 != s))
    {
      f = i1;
      s = i2;
      k = d.jdField_a_of_type_Int + (f << 1) - 1 & (f - 1 ^ 0xFFFFFFFF);
      l = d.jdField_b_of_type_Int + (s << 1) - 1 & (s - 1 ^ 0xFFFFFFFF);
      jdField_a_of_type_JavaxMicroeditionLcduiGraphics = (jdField_a_of_type_JavaxMicroeditionLcduiImage = Image.createImage(k, l)).getGraphics();
      jdField_a_of_type_Boolean = true;
    }
    if ((i1 = f) >= 65536)
    {
      i3 = 16;
      i2 = 16777216;
    }
    else
    {
      i3 = 0;
      i2 = 256;
    }
    if (i1 >= i2)
    {
      i3 += 8;
      i2 <<= 4;
    }
    else
    {
      i2 >>= 4;
    }
    if (i1 >= i2)
    {
      i3 += 4;
      i2 <<= 2;
    }
    else
    {
      i2 >>= 2;
    }
    if (i1 >= i2)
    {
      i3 += 2;
      i2 <<= 1;
    }
    else
    {
      i2 >>= 1;
    }
    if (i1 >= i2) {
      i3++;
    }
    jdField_c_of_type_Int = i3;
    d = paramArrayOfByte[2] & 0xFF;
    e = paramArrayOfByte[3] & 0xFF;
    h = d << jdField_c_of_type_Int;
    i = e << jdField_c_of_type_Int;
    j = paramArrayOfByte[4];
    if (paramBoolean)
    {
      jdField_a_of_type_ArrayOfByte = new byte[d * e * (j + 1)];
      System.arraycopy(paramArrayOfByte, 5, jdField_a_of_type_ArrayOfByte, 0, jdField_a_of_type_ArrayOfByte.length);
    }
    i1 = 5 + jdField_a_of_type_ArrayOfByte.length;
    int i3 = paramArrayOfByte[(i1++)];
    if (paramBoolean)
    {
      jdField_c_of_type_ArrayOfByte = new byte[i3 << 1];
      i2 = -1;
      for (;;)
      {
        i2++;
        if (i2 >= i3) {
          break;
        }
        jdField_c_of_type_ArrayOfByte[(i2 << 1)] = paramArrayOfByte[(i1++)];
      }
    }
    i1 += i3;
    if (paramBoolean)
    {
      localObject = new int[i3];
      Image[] arrayOfImage = new Image[i3];
      i2 = -1;
      for (;;)
      {
        i2++;
        if (i2 >= i3) {
          break;
        }
        localObject[i2] = (paramArrayOfByte[(i1 + i2)] & 0xFF);
      }
      if (jdField_a_of_type_ArrayOfInt != null)
      {
        i2 = -1;
        for (;;)
        {
          i2++;
          if (i2 >= localObject.length) {
            break;
          }
          int i4 = -1;
          i3 = -1;
          do
          {
            i3++;
            if (i3 >= jdField_a_of_type_ArrayOfInt.length) {
              break;
            }
          } while (localObject[i2] != jdField_a_of_type_ArrayOfInt[i3]);
          i4 = i3;
          if (i4 >= 0) {
            arrayOfImage[i2] = jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i4];
          }
        }
        i2 = -1;
        for (;;)
        {
          i2++;
          if (i2 >= jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage.length) {
            break;
          }
          jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i2] = null;
        }
        jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage = null;
      }
      jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage = arrayOfImage;
      jdField_a_of_type_ArrayOfInt = (int[])localObject;
    }
    i1 += jdField_a_of_type_ArrayOfInt.length;
    i3 = paramArrayOfByte[(i1++)] & 0xFF;
    if (paramBoolean)
    {
      jdField_b_of_type_ArrayOfInt = new int[i3];
      i2 = -1;
      for (;;)
      {
        i2++;
        if (i2 >= i3) {
          break;
        }
        jdField_b_of_type_ArrayOfInt[i2] = (paramArrayOfByte[(i1 + i2)] & 0xFF);
      }
      e.jdField_a_of_type_Ad.a(jdField_b_of_type_ArrayOfInt);
    }
    i1 += jdField_b_of_type_ArrayOfInt.length;
    if (paramArrayOfByte[i1] >>> 7 == 0) {
      jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte & 0xFFFFFFFB);
    } else {
      jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte | 0x4);
    }
    i3 = paramArrayOfByte[(++i1)];
    Object localObject = e.jdField_a_of_type_N.jdField_a_of_type_ArrayOfByte;
    e.jdField_a_of_type_N.a();
    e.jdField_a_of_type_N.jdField_a_of_type_ArrayOfByte = paramArrayOfByte;
    e.jdField_a_of_type_N.e(paramArrayOfByte.length);
    e.jdField_a_of_type_N.a(i1 + 1);
    af.a();
    while (i3 > 0)
    {
      h.a(35, e.jdField_a_of_type_N);
      i3--;
    }
    e.jdField_a_of_type_N.jdField_a_of_type_ArrayOfByte = ((byte[])localObject);
    e.jdField_a_of_type_N.a();
    return i1;
  }
  
  public static final void a()
  {
    if ((jdField_a_of_type_Byte & 0x8) != 0)
    {
      jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage = e.a("/mi", jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage, jdField_a_of_type_ArrayOfInt, 1);
      e.jdField_b_of_type_Int += jdField_a_of_type_ArrayOfInt.length;
      int i1 = -1;
      for (;;)
      {
        i1++;
        if (i1 >= jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage.length) {
          break;
        }
        jdField_c_of_type_ArrayOfByte[((i1 << 1) + 1)] = ((byte)(jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i1].getWidth() >> jdField_c_of_type_Int));
      }
      int[] arrayOfInt = new int[jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage.length];
      int i2 = 0;
      i1 = -1;
      for (;;)
      {
        i1++;
        if (i1 >= jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage.length) {
          break;
        }
        if (i1 - 1 >= 0) {
          i2 = arrayOfInt[(i1 - 1)];
        }
        arrayOfInt[i1] = (i2 + jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i1].getHeight() / jdField_c_of_type_ArrayOfByte[(i1 << 1)] * jdField_c_of_type_ArrayOfByte[((i1 << 1) + 1)]);
      }
      jdField_b_of_type_ArrayOfByte = new byte[arrayOfInt[(arrayOfInt.length - 1)] << 1];
      i1 = -1;
      i1++;
      for (;;)
      {
        if (i1 >= jdField_b_of_type_ArrayOfByte.length) {
          break label232;
        }
        i2 = -1;
        i2++;
        if (i2 < arrayOfInt.length)
        {
          if (i1 >= arrayOfInt[i2]) {
            break;
          }
          jdField_b_of_type_ArrayOfByte[(i1 << 1)] = ((byte)i2);
          if (i2 == 0) {
            jdField_b_of_type_ArrayOfByte[((i1 << 1) + 1)] = ((byte)i1);
          } else {
            jdField_b_of_type_ArrayOfByte[((i1 << 1) + 1)] = ((byte)(i1 - arrayOfInt[(i2 - 1)]));
          }
        }
      }
      label232:
      if (d << jdField_c_of_type_Int <= d.jdField_a_of_type_Int)
      {
        q = d << jdField_c_of_type_Int;
        jdField_a_of_type_Int = -(d.jdField_a_of_type_Int - q >> 1);
        jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte | 0x1);
      }
      else
      {
        q = d.jdField_a_of_type_Int;
        jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte & 0xFFFFFFFE);
      }
      if (e << jdField_c_of_type_Int <= d.jdField_b_of_type_Int)
      {
        r = e << jdField_c_of_type_Int;
        jdField_b_of_type_Int = -(d.jdField_b_of_type_Int - r >> 1);
        jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte | 0x2);
      }
      else
      {
        r = d.jdField_b_of_type_Int;
        jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte & 0xFFFFFFFD);
      }
      e.jdField_a_of_type_Ad.c(jdField_b_of_type_ArrayOfInt);
    }
    else
    {
      e.jdField_b_of_type_Int += jdField_a_of_type_ArrayOfInt.length;
    }
    a(e.jdField_a_of_type_G, true);
    System.gc();
    Thread.yield();
  }
  
  public static final int a(int paramInt1, int paramInt2)
  {
    if (Math.abs(paramInt1) > Math.abs(paramInt2))
    {
      if ((paramInt2 != 0) && (paramInt1 / paramInt2 > 0)) {
        paramInt1 -= paramInt2;
      }
      if (paramInt1 > 0)
      {
        if (paramInt1 < 8) {
          paramInt1 = 1;
        } else if (paramInt1 < 32) {
          paramInt1 = 2;
        } else {
          paramInt1 = 4;
        }
        if (paramInt2 > 0) {
          paramInt1 += paramInt2;
        }
      }
      else
      {
        if (paramInt1 > -8) {
          paramInt1 = -1;
        } else if (paramInt1 > -32) {
          paramInt1 = -2;
        } else {
          paramInt1 = -4;
        }
        if (paramInt2 < 0) {
          paramInt1 += paramInt2;
        }
      }
    }
    return paramInt1;
  }
  
  public static final void a(a parama, boolean paramBoolean)
  {
    int i1 = parama.jdField_b_of_type_Int - d.jdField_a_of_type_Int / 2 - jdField_a_of_type_Int;
    parama = parama.jdField_c_of_type_Int - d.jdField_b_of_type_Int / 2 - jdField_b_of_type_Int;
    if (paramBoolean)
    {
      jdField_a_of_type_Boolean = true;
      if ((jdField_a_of_type_Byte & 0x1) == 0) {
        jdField_a_of_type_Int += i1;
      }
      if ((jdField_a_of_type_Byte & 0x2) == 0) {
        jdField_b_of_type_Int += parama;
      }
    }
    else
    {
      if ((jdField_a_of_type_Byte & 0x1) == 0) {
        if ((jdField_a_of_type_Int = jdField_a_of_type_Int + a(i1, i1 < 0 ? -8 : 8)) < 0) {
          jdField_a_of_type_Int = 0;
        } else if (jdField_a_of_type_Int > h - d.jdField_a_of_type_Int) {
          jdField_a_of_type_Int = h - d.jdField_a_of_type_Int;
        }
      }
      if ((jdField_a_of_type_Byte & 0x2) == 0)
      {
        jdField_b_of_type_Int += a(parama, parama < 0 ? -8 : 8);
        if (t > 0)
        {
          jdField_b_of_type_Int += (t % 2 == 1 ? 8 : -8);
          t -= 1;
        }
        if (jdField_b_of_type_Int < 0)
        {
          jdField_b_of_type_Int = 0;
          return;
        }
        if (jdField_b_of_type_Int > i - d.jdField_b_of_type_Int) {
          jdField_b_of_type_Int = i - d.jdField_b_of_type_Int;
        }
      }
    }
  }
  
  public static final void a(Graphics paramGraphics)
  {
    int i1 = jdField_a_of_type_Int >> jdField_c_of_type_Int;
    int i2 = jdField_b_of_type_Int >> jdField_c_of_type_Int;
    int i3 = jdField_a_of_type_Int + q >> jdField_c_of_type_Int;
    int i4 = jdField_b_of_type_Int + r >> jdField_c_of_type_Int;
    if (jdField_a_of_type_Boolean)
    {
      jdField_a_of_type_Boolean = false;
      b(jdField_a_of_type_JavaxMicroeditionLcduiGraphics, i1, i2, i3, i4);
      m = i1;
      n = i2;
      o = i3;
      p = i4;
    }
    else
    {
      if ((m != i1) || (o != i3))
      {
        if ((m < i1) || (o < i3))
        {
          i5 = o + 1;
          i6 = i3;
        }
        else
        {
          i5 = i1;
          i6 = m - 1;
        }
        b(jdField_a_of_type_JavaxMicroeditionLcduiGraphics, i5, i2, i6, i4);
        m = i1;
        o = i3;
      }
      if ((n != i2) || (p != i4))
      {
        if ((n < i2) || (p < i4))
        {
          i5 = p + 1;
          i6 = i4;
        }
        else
        {
          i5 = i2;
          i6 = n - 1;
        }
        b(jdField_a_of_type_JavaxMicroeditionLcduiGraphics, i1, i5, i3, i6);
        n = i2;
        p = i4;
      }
    }
    int i5 = jdField_a_of_type_Int % k;
    int i6 = jdField_b_of_type_Int % l;
    i1 = (jdField_a_of_type_Int + q) % k;
    i2 = (jdField_b_of_type_Int + r) % l;
    if (i1 > i5)
    {
      if (i2 > i6)
      {
        a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, 0, 0, i5, i6, q, r, 0);
      }
      else
      {
        a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, 0, 0, i5, i6, q, r - i2, 0);
        a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, 0, r - i2, i5, 0, q, i2, 0);
      }
    }
    else if (i2 > i6)
    {
      a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, 0, 0, i5, i6, q - i1, r, 0);
      a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, q - i1, 0, 0, i6, i1, r, 0);
    }
    else
    {
      a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, 0, 0, i5, i6, q - i1, r - i2, 0);
      a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, 0, r - i2, i5, 0, q - i1, i2, 0);
      a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, q - i1, 0, 0, i6, i1, r - i2, 0);
      a(paramGraphics, jdField_a_of_type_JavaxMicroeditionLcduiImage, q - i1, r - i2, 0, 0, i1, i2, 0);
    }
    if ((jdField_a_of_type_Byte & 0x1) != 0)
    {
      a(paramGraphics, 0, 0, -jdField_a_of_type_Int, d.jdField_b_of_type_Int);
      a(paramGraphics, d.jdField_a_of_type_Int + jdField_a_of_type_Int, 0, -jdField_a_of_type_Int, d.jdField_b_of_type_Int);
    }
    if ((jdField_a_of_type_Byte & 0x2) != 0)
    {
      a(paramGraphics, 0, 0, d.jdField_a_of_type_Int, -jdField_b_of_type_Int);
      a(paramGraphics, 0, d.jdField_b_of_type_Int + jdField_b_of_type_Int, d.jdField_a_of_type_Int, -jdField_b_of_type_Int);
    }
  }
  
  private static final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setClip(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
    paramGraphics.setColor(0);
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private static final void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 = paramInt3 >= 0 ? paramInt3 : 0;
    paramInt3 = paramInt1 >= 0 ? paramInt3 : paramInt3 - paramInt1;
    paramInt4 = paramInt4 >= 0 ? paramInt4 : 0;
    paramInt4 = paramInt2 >= 0 ? paramInt4 : paramInt4 - paramInt2;
    paramInt1 = paramInt1 >= 0 ? paramInt1 : 0;
    int i1 = ((paramInt2 = paramInt2 >= 0 ? paramInt2 : 0) * d + paramInt1) * 3;
    int i2 = (d - 1 - paramInt3 + paramInt1) * 3;
    int i3 = (paramInt1 << jdField_c_of_type_Int) % k;
    int i4 = (paramInt2 << jdField_c_of_type_Int) % l;
    for (int i11 = paramInt2; i11 <= paramInt4; i11++)
    {
      paramInt2 = i3;
      for (int i12 = paramInt1; i12 <= paramInt3; i12++) {
        if (i1 < jdField_a_of_type_ArrayOfByte.length)
        {
          int i5 = jdField_a_of_type_ArrayOfByte[(i1++)] & 0xFF;
          if (i1 < jdField_a_of_type_ArrayOfByte.length)
          {
            int i6 = jdField_a_of_type_ArrayOfByte[(i1++)] & 0xFF;
            int i10 = jdField_a_of_type_ArrayOfByte[(i1++)];
            int i7;
            Image localImage;
            int i9;
            int i8;
            if (i5 != 255)
            {
              i7 = jdField_b_of_type_ArrayOfByte[(i5 << 1)];
              localImage = jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i7];
              i5 = jdField_b_of_type_ArrayOfByte[((i5 << 1) + 1)];
              i9 = jdField_c_of_type_ArrayOfByte[((i7 << 1) + 1)];
              i8 = jdField_c_of_type_ArrayOfByte[(i7 << 1)];
              i7 = i5 % i9 << jdField_c_of_type_Int;
              i5 = i5 / i9 * i8 + i8 - s;
              a(paramGraphics, localImage, paramInt2, i4, i7, i5, f, s, i10 & 0x3);
            }
            if (i6 != 255)
            {
              i7 = jdField_b_of_type_ArrayOfByte[(i6 << 1)];
              localImage = jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i7];
              i6 = jdField_b_of_type_ArrayOfByte[((i6 << 1) + 1)];
              i9 = jdField_c_of_type_ArrayOfByte[((i7 << 1) + 1)];
              i8 = jdField_c_of_type_ArrayOfByte[(i7 << 1)];
              i7 = i6 % i9 << jdField_c_of_type_Int;
              i5 = i6 / i9 * i8 + i8 - s;
              a(paramGraphics, localImage, paramInt2, i4, i7, i5, f, s, i10 >> 2 & 0x3);
            }
            i10 = i1 - 2;
            int i13 = 0;
            for (;;)
            {
              i13++;
              if ((i13 >= 7) || (i10 += d * 3 >= jdField_a_of_type_ArrayOfByte.length)) {
                break;
              }
              if ((i5 = jdField_a_of_type_ArrayOfByte[i10] & 0xFF) != 255)
              {
                i7 = jdField_b_of_type_ArrayOfByte[(i5 << 1)];
                if ((i8 = jdField_c_of_type_ArrayOfByte[(i7 << 1)]) > i13 << 4)
                {
                  localImage = jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i7];
                  i9 = jdField_c_of_type_ArrayOfByte[((i7 << 1) + 1)];
                  i7 = (i6 = jdField_b_of_type_ArrayOfByte[((i5 << 1) + 1)]) % i9 << jdField_c_of_type_Int;
                  i5 = i6 / i9 * i8 + i8 - (i13 + 1 << jdField_c_of_type_Int);
                  a(paramGraphics, localImage, paramInt2, i4, i7, i5, f, s, jdField_a_of_type_ArrayOfByte[(i10 + 1)] >> 2 & 0x3);
                }
              }
            }
            if (paramInt2 += f >= k) {
              paramInt2 -= k;
            }
          }
        }
      }
      i1 += i2;
      if (i4 += s >= l) {
        i4 -= l;
      }
    }
  }
  
  public static final void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    for (;;)
    {
      if ((paramInt1 < 0) || (paramInt1 > d - 1) || (paramInt2 < 0)) {
        return;
      }
      int i6 = -1;
      int i2;
      int i3;
      do
      {
        do
        {
          i6++;
          if (i6 >= 7) {
            break;
          }
          if (paramInt2 + i6 > e - 1) {
            return;
          }
          i5 = ((paramInt2 + i6) * d + paramInt1) * 3;
        } while ((i1 = jdField_a_of_type_ArrayOfByte[(i5 + 1)] & 0xFF) == 255);
        i2 = jdField_b_of_type_ArrayOfByte[(i1 << 1)];
        i3 = jdField_c_of_type_ArrayOfByte[(i2 << 1)];
        i4 = i6 == 0 ? 1 : i6;
      } while (i3 <= i4 << 4);
      int i1 = jdField_b_of_type_ArrayOfByte[((i1 << 1) + 1)];
      int i4 = jdField_c_of_type_ArrayOfByte[((i2 << 1) + 1)];
      int i5 = jdField_a_of_type_ArrayOfByte[(i5 + 2)];
      a(paramGraphics, jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i2], (paramInt1 << jdField_c_of_type_Int) - jdField_a_of_type_Int, (paramInt2 + i6 << jdField_c_of_type_Int) - jdField_b_of_type_Int + s - i3, i1 % i4 << jdField_c_of_type_Int, i1 / i4 * i3, f, i3, i5 >> 2 & 0x3);
      paramInt2 = paramInt2 + i6 + 1;
      paramInt1 = paramInt1;
      paramGraphics = paramGraphics;
    }
  }
  
  public static final int b(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= d) || (paramInt2 < 0) || (paramInt2 >= e)) {
      return 0;
    }
    paramInt1 = paramInt2 * d + paramInt1;
    return jdField_a_of_type_ArrayOfByte[(paramInt1 * 3 + 2)] >>> 4;
  }
  
  public static final void b(Graphics paramGraphics)
  {
    int i1 = jdField_a_of_type_Int;
    int i2 = jdField_b_of_type_Int;
    a[] arrayOfa = jdField_a_of_type_ArrayOfA;
    int i3;
    for (int i7 = g - 1; i7 >= 0; i7--)
    {
      arrayOfa[0].a(paramGraphics, i1, i2);
      i3 = 0;
      arrayOfa[0] = arrayOfa[i7];
      int i4 = 1;
      while ((i4 <<= 1) - 1 <= i7 - 1)
      {
        a locala;
        if (i4 <= i7 - 1)
        {
          if (arrayOfa[(i4 - 1)].jdField_c_of_type_Int > arrayOfa[i4].jdField_c_of_type_Int)
          {
            if (arrayOfa[i3].jdField_c_of_type_Int <= arrayOfa[i4].jdField_c_of_type_Int) {
              break;
            }
            locala = arrayOfa[i4];
            arrayOfa[i4] = arrayOfa[i3];
            arrayOfa[i3] = locala;
            i3 = i4;
            i4++;
          }
          else
          {
            if (arrayOfa[i3].jdField_c_of_type_Int <= arrayOfa[(i4 - 1)].jdField_c_of_type_Int) {
              break;
            }
            locala = arrayOfa[(i4 - 1)];
            arrayOfa[(i4 - 1)] = arrayOfa[i3];
            arrayOfa[i3] = locala;
            i3 = i4 - 1;
          }
        }
        else
        {
          if (arrayOfa[i3].jdField_c_of_type_Int <= arrayOfa[(i4 - 1)].jdField_c_of_type_Int) {
            break;
          }
          locala = arrayOfa[(i4 - 1)];
          arrayOfa[(i4 - 1)] = arrayOfa[i3];
          arrayOfa[i3] = locala;
          i3 = i4 - 1;
        }
      }
    }
    if ((g.i != null) && (e.jdField_a_of_type_G.e == 1) && (g.i.e == 1))
    {
      i3 = i2;
      i2 = i1;
      Graphics localGraphics = paramGraphics;
      if ((((paramGraphics = g.i).j & 0x10) != 0) && (paramGraphics.e == 1) && (e.jdField_a_of_type_G.e == 1))
      {
        i2 = paramGraphics.jdField_b_of_type_Int - i2;
        i3 = paramGraphics.jdField_c_of_type_Int - i3;
        String[] arrayOfString = e.a(e.jdField_a_of_type_ArrayOfJavaLangString[paramGraphics.jdField_a_of_type_Short], 160, bg.a);
        int i5 = -45;
        int i6 = paramGraphics.jdField_a_of_type_J.f - 10 - arrayOfString.length * bg.b - 5;
        if (i2 >= d.jdField_a_of_type_Int * 3 / 4) {
          i5 -= 75;
        }
        if (i3 <= (d.jdField_b_of_type_Int << 1) / 5) {
          i6 += 20;
        }
        paramGraphics.q = (i2 + i5 - 1);
        paramGraphics.r = (i3 + i6 - 1);
        paramGraphics.s = 162;
        paramGraphics.t = (arrayOfString.length * bg.b + 4);
        localGraphics.setColor(0);
        localGraphics.drawRoundRect(paramGraphics.q, paramGraphics.r, paramGraphics.s, paramGraphics.t, 2, 2);
        localGraphics.setColor(-1);
        localGraphics.fillRoundRect(paramGraphics.q + 1, paramGraphics.r + 1, paramGraphics.s - 1, paramGraphics.t - 1, 2, 2);
        paramGraphics = -1;
        for (;;)
        {
          paramGraphics++;
          if (paramGraphics >= arrayOfString.length) {
            break;
          }
          localGraphics.setColor(5590067);
          localGraphics.drawString(arrayOfString[paramGraphics], i2 + i5 + 1, i3 + i6 + paramGraphics * bg.b, 20);
        }
      }
    }
  }
  
  public static final void b(a parama, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (g >= 50) {
        g = 49;
      }
    }
    else if (g >= 50) {
      return;
    }
    paramBoolean = g;
    jdField_a_of_type_ArrayOfA[paramBoolean] = parama;
    parama = paramBoolean + true;
    a[] arrayOfa = jdField_a_of_type_ArrayOfA;
    while ((parama >>= 1 != 0) && (arrayOfa[(parama - 1)].jdField_c_of_type_Int > arrayOfa[paramBoolean].jdField_c_of_type_Int))
    {
      a locala = arrayOfa[(parama - 1)];
      arrayOfa[(parama - 1)] = arrayOfa[paramBoolean];
      arrayOfa[paramBoolean] = locala;
      paramBoolean = parama - 1;
    }
    g += 1;
  }
  
  public static final void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    switch (paramInt7)
    {
    case 0: 
      paramInt7 = paramGraphics.getClipX();
      int i1 = paramGraphics.getClipY();
      int i2 = paramGraphics.getClipWidth();
      int i3 = paramGraphics.getClipHeight();
      paramInt5 += paramInt3 * (paramInt3 >> 31);
      paramInt6 += paramInt4 * (paramInt4 >> 31);
      if (paramInt7 + i2 < paramInt1) {
        return;
      }
      if (i1 + i3 < paramInt2) {
        return;
      }
      if (paramInt1 + paramInt5 < paramInt7) {
        return;
      }
      if (paramInt2 + paramInt6 < i1) {
        return;
      }
      if (paramInt1 < paramInt7) {
        paramInt5 -= paramInt7 - paramInt1;
      }
      if (paramInt2 < i1) {
        paramInt6 -= i1 - paramInt2;
      }
      if (paramInt5 <= 0) {
        return;
      }
      if (paramInt6 <= 0) {
        return;
      }
      paramGraphics.setClip(Math.max(paramInt7, paramInt1), Math.max(i1, paramInt2), Math.min(i2, paramInt5), Math.min(i3, paramInt6));
      paramGraphics.drawImage(paramImage, paramInt1 - paramInt3, paramInt2 - paramInt4, 0);
      paramGraphics.setClip(paramInt7, i1, i2, i3);
      return;
    }
    paramGraphics.drawRegion(paramImage, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt1, paramInt2, 20);
  }
  
  public static void b()
  {
    int i1 = -1;
    for (;;)
    {
      i1++;
      if (i1 >= jdField_a_of_type_ArrayOfA.length) {
        break;
      }
      if (jdField_a_of_type_ArrayOfA[i1] != null) {
        jdField_a_of_type_ArrayOfA[i1] = null;
      }
    }
    g = 0;
  }
  
  static
  {
    jdField_a_of_type_ArrayOfA = new a[50];
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\f.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */