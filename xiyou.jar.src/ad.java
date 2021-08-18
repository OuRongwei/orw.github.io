import engine.Ancient;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class ad
{
  public b[] a;
  public int[] a;
  public Image[] a;
  public int[] b;
  private String a;
  private String b;
  private int[] c;
  
  public ad() {}
  
  public static final void a(int paramInt1, int paramInt2)
  {
    switch (g.w)
    {
    case 0: 
      switch (paramInt1)
      {
      case -1: 
        switch (g.u)
        {
        case 3: 
          g.v = 0;
          return;
        case 4: 
          g.v = 1;
        }
        return;
      case 0: 
      case 1: 
      case 2: 
      case 3: 
        if ((d.a(paramInt2) > 0) || (d.e() == 3))
        {
          paramInt2 = -1;
          switch (paramInt1)
          {
          case 0: 
            paramInt2 = 0;
            e.jdField_a_of_type_G.a(false);
            g.v = e.jdField_a_of_type_G.jdField_d_of_type_Byte == 1 ? 4 : 3;
            break;
          case 2: 
            paramInt2 = 2;
            e.jdField_a_of_type_G.a(true);
            g.v = e.jdField_a_of_type_G.jdField_d_of_type_Byte == 1 ? 4 : 3;
            break;
          case 1: 
            paramInt2 = 1;
            e.jdField_a_of_type_G.jdField_d_of_type_Byte = 1;
            g.v = 4;
            break;
          case 3: 
            e.jdField_a_of_type_G.jdField_d_of_type_Byte = 0;
            paramInt2 = 3;
            g.v = 3;
          }
          switch (g.u)
          {
          case 3: 
            if (e.jdField_a_of_type_G.jdField_d_of_type_Int != paramInt2)
            {
              g.v = 0;
              return;
            }
            break;
          case 4: 
            if (e.jdField_a_of_type_G.jdField_d_of_type_Int != paramInt2)
            {
              g.v = 1;
              return;
            }
            break;
          case 0: 
          case 1: 
            if (paramInt2 != -1) {
              e.jdField_a_of_type_G.jdField_d_of_type_Int = paramInt2;
            }
            break;
          }
          return;
        }
        break;
      case 4: 
        if (d.a(paramInt2) == 1) {
          e.jdField_a_of_type_G.j();
        }
        break;
      }
      return;
    case 1: 
      switch (paramInt1)
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
        if (d.a(paramInt2) == 1) {
          e.jdField_a_of_type_G.c(0);
        }
        break;
      }
      break;
    }
  }
  
  public static final void a()
  {
    if (d.e() == -1)
    {
      if ((d.f() > 0) && (d.f() < d.a) && (d.h() > d.b - 40) && (d.h() < d.b))
      {
        d.f();
        return;
      }
      if ((ag.a()) || (e.jdField_a_of_type_G.b))
      {
        d.f();
        return;
      }
      if (((e.jdField_a_of_type_Short & 0x20) != 0) && (a(d.g(), d.jdField_d_of_type_Int)) && (a(d.i(), d.e)) && (d.i() < d.b - 40))
      {
        if (g.i != null) {
          if (g.i == e.jdField_a_of_type_G)
          {
            if (e.jdField_a_of_type_G.a(d.f() + f.a, d.h() + f.b, -5, -10, 5, 4))
            {
              e.jdField_a_of_type_G.j();
            }
            else
            {
              b(d.f() + f.a, d.h() + f.b);
              e.jdField_a_of_type_G.m();
            }
          }
          else if ((e.jdField_a_of_type_G.e == 1) && (g.i.e == 1))
          {
            int i1 = g.i.t;
            int n = g.i.s;
            int m = g.i.r;
            int k = g.i.q;
            int j = d.h();
            int i;
            if ((((i = d.f()) < k) || (i > k + n) || (j < m) || (j > m + i1) ? 0 : 1) != 0)
            {
              e.jdField_a_of_type_G.j();
            }
            else
            {
              b(d.f() + f.a, d.h() + f.b);
              e.jdField_a_of_type_G.m();
            }
          }
        }
        d.f();
        return;
      }
    }
  }
  
  public static boolean a(int paramInt1, int paramInt2)
  {
    return Math.abs(paramInt1 - paramInt2) <= 8;
  }
  
  public static boolean b(int paramInt1, int paramInt2)
  {
    if (!e.a(paramInt1 >> 4, paramInt2 >> 4))
    {
      ab.a("好象走不到的样子哦!");
      return false;
    }
    e.jdField_a_of_type_G.a(e.jdField_a_of_type_G.b, e.jdField_a_of_type_G.c);
    e.jdField_a_of_type_G.c(paramInt1, paramInt2);
    if (g.w != 1) {
      e.jdField_a_of_type_G.c(1);
    }
    return true;
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    return (paramInt1 >= paramInt3) && (paramInt1 <= paramInt3 + paramInt5) && (paramInt2 >= paramInt4) && (paramInt2 <= paramInt4 + paramInt6);
  }
  
  public static void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int k;
    int i;
    int j;
    switch (paramInt4)
    {
    case 0: 
      k = 0;
      i = 7;
      j = 9;
      break;
    case 1: 
      k = 9;
      i = 7;
      j = 9;
      break;
    case 2: 
      k = 18;
      i = 6;
      j = 7;
      break;
    case 3: 
      k = 25;
      i = 6;
      j = 7;
      break;
    case 4: 
      k = 32;
      i = 6;
      j = 7;
      break;
    case 5: 
      k = 39;
      i = 6;
      j = 7;
      break;
    case 6: 
      k = 46;
      i = 5;
      j = 5;
      break;
    case 7: 
      f.a(paramGraphics, paramImage, paramInt2, paramInt3, 94, 7, 6, 7, 0);
      return;
    default: 
      k = 25;
      i = 6;
      j = 7;
    }
    if ((paramInt1 < 10) && (paramInt1 >= 0))
    {
      f.a(paramGraphics, paramImage, paramInt2, paramInt3, 0 + paramInt1 * i, k, i, j, 0);
      return;
    }
    if (paramInt1 == -3)
    {
      paramInt1 = paramInt4 <= 1 ? 10 : 11;
      f.a(paramGraphics, paramImage, paramInt2, paramInt3, 0 + paramInt1 * i, k, i, j, 0);
      return;
    }
    paramInt1 = Math.abs(paramInt1);
    StringBuffer localStringBuffer;
    (localStringBuffer = new StringBuffer()).append(paramInt1);
    for (int m = 0; m < localStringBuffer.length(); m++)
    {
      if (localStringBuffer.charAt(m) == '-') {
        paramInt1 = paramInt4 <= 1 ? 10 : 11;
      } else {
        paramInt1 = localStringBuffer.charAt(m) - '0';
      }
      f.a(paramGraphics, paramImage, paramInt2, paramInt3, 0 + paramInt1 * i, k, i, j, 0);
      paramInt2 += i;
    }
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    f.a(paramGraphics, e.a(2), paramInt1, paramInt2, paramInt3 * 13, 0, 13, 12, 0);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    f.a(paramGraphics, e.a(3), paramInt1, paramInt2, 55, 46, 12, 5, 0);
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    f.a(paramGraphics, e.a(3), paramInt1, paramInt2, 61, 39, 6, 7, 0);
  }
  
  public static void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    switch (paramInt3)
    {
    case 6: 
      f.a(paramGraphics, e.a(3), paramInt1, paramInt2, 51, 46, 4, 5, 0);
      return;
    case 3: 
      f.a(paramGraphics, e.a(3), paramInt1, paramInt2, 61, 25, 5, 7, 0);
      return;
    case 4: 
      f.a(paramGraphics, e.a(3), paramInt1, paramInt2, 61, 32, 5, 7, 0);
      return;
    case 2: 
      f.a(paramGraphics, e.a(3), paramInt1, paramInt2, 61, 18, 5, 7, 0);
    }
  }
  
  public static void c(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    f.a(paramGraphics, e.a(0), paramInt1, paramInt2 - 2, 48 + paramInt3 * 7, 12, 7, 8, 0);
  }
  
  public static int a(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    return Math.abs(ao.a.nextInt() % paramInt);
  }
  
  public static int a(int paramInt1, int paramInt2)
  {
    int i = Math.min(paramInt1, paramInt2);
    paramInt1 = Math.max(paramInt1, paramInt2) + 1;
    return i + a(paramInt1 - i);
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    if (paramInt1 < paramInt3) {
      i = paramInt1;
    } else {
      i = paramInt3;
    }
    int j;
    if (paramInt2 < paramInt4) {
      j = paramInt4;
    } else {
      j = paramInt2;
    }
    return j - i <= paramInt2 - paramInt1 + (paramInt4 - paramInt3);
  }
  
  public static boolean a(a parama1, a parama2)
  {
    return a(parama1, parama2, 16, 16, 16, 16);
  }
  
  public static boolean a(a parama1, a parama2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = parama1.b;
    paramInt1 = parama1.b + paramInt1;
    int j = parama2.b;
    int k = parama2.b + paramInt3;
    paramInt3 = parama1.c;
    parama1 = parama1.c + paramInt2;
    paramInt2 = parama2.c;
    parama2 = parama2.c + paramInt4;
    if (!a(i, paramInt1, j, k)) {
      return false;
    }
    return a(paramInt3, parama1, paramInt2, parama2);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
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
  
  public ad(String paramString1, String paramString2)
  {
    this.c = new int[] { 0, 1, 2, 3, 9, 10, 11, 12, 13, 70, 71, 72, 76, 77, 78, 79, 82 };
    this.jdField_a_of_type_JavaLangString = paramString1;
    this.jdField_b_of_type_JavaLangString = paramString2;
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    int[] arrayOfInt1 = paramArrayOfInt;
    Object localObject = this;
    int m;
    if (this.jdField_a_of_type_ArrayOfInt != null) {
      while (localObject.jdField_a_of_type_ArrayOfInt[(localObject.jdField_a_of_type_ArrayOfInt.length - 1)] > 30)
      {
        int i2 = Integer.MAX_VALUE;
        int j = 0;
        m = -1;
        for (;;)
        {
          m++;
          if (m >= ((ad)localObject).jdField_a_of_type_ArrayOfInt.length - 1) {
            break;
          }
          if (localObject.jdField_a_of_type_ArrayOfInt[m] != 0)
          {
            int i1 = 0;
            int n = -1;
            do
            {
              n++;
              if (n >= arrayOfInt1.length) {
                break;
              }
            } while (arrayOfInt1[n] != m);
            ((ad)localObject).jdField_a_of_type_ArrayOfInt[m] = d.c;
            i1 = 1;
            if ((i1 == 0) && (localObject.jdField_a_of_type_ArrayOfInt[m] < i2))
            {
              i2 = localObject.jdField_a_of_type_ArrayOfInt[m];
              j = m;
            }
          }
        }
        ((ad)localObject).jdField_a_of_type_ArrayOfInt[(((ad)localObject).jdField_a_of_type_ArrayOfInt.length - 1)] -= 1;
        ((ad)localObject).jdField_a_of_type_ArrayOfInt[j] = 0;
        ((ad)localObject).jdField_a_of_type_ArrayOfB[j] = null;
        System.gc();
        Thread.yield();
      }
    }
    localObject = paramArrayOfInt;
    if (this.jdField_a_of_type_ArrayOfB != null)
    {
      int[] arrayOfInt2 = new int[30];
      m = 0;
      i = -1;
      for (;;)
      {
        i++;
        if (i >= paramArrayOfInt.length) {
          break;
        }
        if (this.jdField_a_of_type_ArrayOfB[paramArrayOfInt[i]] == null) {
          arrayOfInt2[(m++)] = paramArrayOfInt[i];
        }
      }
      if (m == 0) {
        return;
      }
      localObject = new int[m];
      System.arraycopy(arrayOfInt2, 0, localObject, 0, m);
    }
    for (int i = 0; i < localObject.length - 1; i++) {
      for (int k = 0; k < localObject.length - i - 1; k++) {
        if (localObject[k] > localObject[(k + 1)])
        {
          localObject[k] ^= localObject[(k + 1)];
          localObject[(k + 1)] ^= localObject[k];
          localObject[k] ^= localObject[(k + 1)];
        }
      }
    }
    b((int[])localObject);
  }
  
  public final void b(int[] paramArrayOfInt)
  {
    int i = 0;
    try
    {
      int j = 0;
      InputStream localInputStream;
      int k = ((localInputStream = Ancient.a.getClass().getResourceAsStream(this.jdField_a_of_type_JavaLangString)).read() & 0xFF) << 8 | localInputStream.read() & 0xFF;
      if (this.jdField_a_of_type_ArrayOfB == null)
      {
        this.jdField_a_of_type_ArrayOfB = new b[k + 10];
        this.jdField_a_of_type_ArrayOfInt = new int[k + 10 + 1];
      }
      i = -1;
      for (;;)
      {
        i++;
        if (i >= k) {
          break;
        }
        int m = (localInputStream.read() & 0xFF) << 24 | (localInputStream.read() & 0xFF) << 16 | (localInputStream.read() & 0xFF) << 8 | localInputStream.read() & 0xFF;
        if (i == paramArrayOfInt[j])
        {
          this.jdField_a_of_type_ArrayOfB[i] = new b();
          this.jdField_a_of_type_ArrayOfB[i].a(localInputStream);
          this.jdField_a_of_type_ArrayOfB[i].a(this, i);
          this.jdField_a_of_type_ArrayOfInt[i] = d.c;
          this.jdField_a_of_type_ArrayOfInt[(this.jdField_a_of_type_ArrayOfInt.length - 1)] += 1;
          j++;
          if (j == paramArrayOfInt.length) {
            break;
          }
        }
        else
        {
          localInputStream.skip(m);
        }
      }
      localInputStream.close();
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void c(int[] paramArrayOfInt)
  {
    int[] arrayOfInt1 = new int[30];
    int j = 0;
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= paramArrayOfInt.length) {
        break;
      }
      j = a(this.jdField_a_of_type_ArrayOfB[paramArrayOfInt[m]], arrayOfInt1, j);
    }
    paramArrayOfInt = new int[j];
    System.arraycopy(arrayOfInt1, 0, paramArrayOfInt, 0, j);
    if (this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage != null)
    {
      int[] arrayOfInt2 = paramArrayOfInt;
      ad localad = this;
      if (this.jdField_b_of_type_ArrayOfInt != null) {
        while (localad.jdField_b_of_type_ArrayOfInt[(localad.jdField_b_of_type_ArrayOfInt.length - 1)] > 1024000)
        {
          int i1 = Integer.MAX_VALUE;
          int i2 = 0;
          int i3 = -1;
          for (;;)
          {
            i3++;
            if (i3 >= localad.jdField_b_of_type_ArrayOfInt.length - 1) {
              break;
            }
            int i5 = -1;
            for (;;)
            {
              i5++;
              if (i5 >= localad.c.length) {
                break;
              }
              if ((localad.jdField_b_of_type_ArrayOfInt[i3] != 0) && (i3 != localad.c[i5]))
              {
                int i6 = 0;
                int i4 = -1;
                do
                {
                  i4++;
                  if (i4 >= arrayOfInt2.length) {
                    break;
                  }
                } while (arrayOfInt2[i4] != i3);
                localad.jdField_b_of_type_ArrayOfInt[i3] = d.c;
                i6 = 1;
                if ((i6 == 0) && (localad.jdField_b_of_type_ArrayOfInt[i3] < i1))
                {
                  i1 = localad.jdField_b_of_type_ArrayOfInt[i3];
                  i2 = i3;
                }
              }
            }
          }
          localad.jdField_b_of_type_ArrayOfInt[(localad.jdField_b_of_type_ArrayOfInt.length - 1)] -= (localad.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i2].getWidth() * localad.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i2].getHeight() << 1);
          localad.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i2] = null;
          localad.jdField_b_of_type_ArrayOfInt[i2] = 0;
          System.gc();
          Thread.yield();
        }
      }
      int k = 0;
      n = -1;
      for (;;)
      {
        n++;
        if (n >= paramArrayOfInt.length) {
          break;
        }
        if (this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[paramArrayOfInt[n]] == null) {
          arrayOfInt1[(k++)] = paramArrayOfInt[n];
        }
      }
      if (k == 0) {
        return;
      }
      paramArrayOfInt = new int[k];
      System.arraycopy(arrayOfInt1, 0, paramArrayOfInt, 0, k);
    }
    for (int n = 0; n < paramArrayOfInt.length - 1; n++) {
      for (int i = 0; i < paramArrayOfInt.length - n - 1; i++) {
        if (paramArrayOfInt[i] > paramArrayOfInt[(i + 1)])
        {
          paramArrayOfInt[i] ^= paramArrayOfInt[(i + 1)];
          paramArrayOfInt[(i + 1)] ^= paramArrayOfInt[i];
          paramArrayOfInt[i] ^= paramArrayOfInt[(i + 1)];
        }
      }
    }
    d(paramArrayOfInt);
  }
  
  public static int a(b paramb, int[] paramArrayOfInt, int paramInt)
  {
    if (paramb == null) {
      return 0;
    }
    for (int k = 0; k < paramb.a.length; k += 3)
    {
      int i = paramb.a[k] & 0xFF;
      int j = 0;
      int m = -1;
      do
      {
        m++;
        if (m >= paramInt) {
          break;
        }
      } while (paramArrayOfInt[m] != i);
      j = 1;
      if (j == 0) {
        paramArrayOfInt[(paramInt++)] = i;
      }
    }
    return paramInt;
  }
  
  public final void d(int[] paramArrayOfInt)
  {
    int j = 0;
    try
    {
      DataInputStream localDataInputStream;
      int k = (localDataInputStream = new DataInputStream(Ancient.a.getClass().getResourceAsStream(this.jdField_b_of_type_JavaLangString))).readUnsignedShort();
      if (this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage == null)
      {
        this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage = new Image[k + 15];
        this.jdField_b_of_type_ArrayOfInt = new int[k + 15 + 1];
      }
      for (int i = 0; i < k; i++)
      {
        int m = localDataInputStream.readInt();
        byte[] arrayOfByte;
        if (i == paramArrayOfInt[j])
        {
          if (this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i] == null)
          {
            arrayOfByte = new byte[m];
            localDataInputStream.readFully(arrayOfByte, 0, arrayOfByte.length);
            this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i] = Image.createImage(arrayOfByte, 0, arrayOfByte.length);
            this.jdField_b_of_type_ArrayOfInt[i] = d.c;
            this.jdField_b_of_type_ArrayOfInt[(this.jdField_b_of_type_ArrayOfInt.length - 1)] += (this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i].getWidth() * this.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i].getHeight() << 1);
          }
          else
          {
            localDataInputStream.skipBytes(arrayOfByte);
          }
          j++;
          if (j == paramArrayOfInt.length) {
            break;
          }
        }
        else
        {
          localDataInputStream.skipBytes(arrayOfByte);
        }
      }
      localDataInputStream.close();
      return;
    }
    catch (Exception localException)
    {
      new StringBuffer().append("Cannot read Image ").append(paramArrayOfInt[j]).append(" From i").append(" :").append(localException.getMessage()).toString();
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ad.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */