import java.io.InputStream;
import java.io.PrintStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class b
{
  private static byte[][] jdField_a_of_type_Array2dOfByte = { { 0, 1, 2, 3, 4, 5, 6, 7 }, { 1, 0, 3, 2, 5, 4, 7, 6 }, { 2, 3, 0, 1, 6, 7, 4, 5 }, { 3, 2, 1, 0, 7, 6, 5, 4 }, { 4, 6, 5, 7, 0, 2, 1, 3 }, { 5, 7, 4, 6, 1, 3, 0, 2 }, { 6, 4, 7, 5, 2, 0, 3, 1 }, { 7, 5, 6, 4, 3, 1, 2, 0 } };
  private int jdField_a_of_type_Int;
  private byte[] jdField_c_of_type_ArrayOfByte;
  public byte[] a;
  private short[] jdField_a_of_type_ArrayOfShort;
  private byte[] jdField_d_of_type_ArrayOfByte;
  private short[] jdField_b_of_type_ArrayOfShort;
  private byte[] jdField_e_of_type_ArrayOfByte;
  private short[] jdField_c_of_type_ArrayOfShort;
  private byte[] jdField_f_of_type_ArrayOfByte;
  private byte[] g;
  private short[] jdField_d_of_type_ArrayOfShort;
  private byte[] h;
  public byte[] b;
  private short[] jdField_e_of_type_ArrayOfShort;
  private byte[] i;
  private short[] jdField_f_of_type_ArrayOfShort;
  private byte[] j;
  private byte[] k;
  private byte[][] jdField_b_of_type_Array2dOfByte;
  private int jdField_b_of_type_Int;
  private ad jdField_a_of_type_Ad;
  
  public final void a(ad paramad, int paramInt)
  {
    this.jdField_a_of_type_Ad = paramad;
    this.jdField_b_of_type_Int = paramInt;
  }
  
  public final void a(InputStream paramInputStream)
  {
    int m = 0;
    if ((short)((paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF) != 2) {
      System.out.println("ERROR: Invalid XEditor version !");
    }
    this.jdField_a_of_type_Int = ((paramInputStream.read() & 0xFF) << 24 | (paramInputStream.read() & 0xFF) << 16 | (paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF);
    if ((this.jdField_a_of_type_Int & 0x1) != 0)
    {
      if ((this.jdField_a_of_type_Int & 0x200) != 0) {
        m = (paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF;
      } else {
        m = paramInputStream.read() & 0xFF;
      }
      if ((this.jdField_a_of_type_Int & 0x2) != 0)
      {
        this.jdField_a_of_type_ArrayOfByte = new byte[m * 3];
        paramInputStream.read(this.jdField_a_of_type_ArrayOfByte, 0, this.jdField_a_of_type_ArrayOfByte.length);
      }
      this.jdField_c_of_type_ArrayOfByte = new byte[m << 1];
      paramInputStream.read(this.jdField_c_of_type_ArrayOfByte, 0, this.jdField_c_of_type_ArrayOfByte.length);
    }
    int n;
    if ((this.jdField_a_of_type_Int & 0x100) != 0)
    {
      if ((this.jdField_a_of_type_Int & 0x20000) != 0) {
        m = (paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF;
      } else {
        m = paramInputStream.read() & 0xFF;
      }
      if (m > 0)
      {
        this.jdField_a_of_type_ArrayOfShort = new short[m + 1];
        n = -1;
        for (;;)
        {
          n++;
          if (n >= m + 1) {
            break;
          }
          this.jdField_a_of_type_ArrayOfShort[n] = ((short)((paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF));
        }
        this.jdField_d_of_type_ArrayOfByte = new byte[this.jdField_a_of_type_ArrayOfShort[(this.jdField_a_of_type_ArrayOfShort.length - 1)] << 2];
        paramInputStream.read(this.jdField_d_of_type_ArrayOfByte, 0, this.jdField_d_of_type_ArrayOfByte.length);
        if ((this.jdField_a_of_type_Int & 0x400) != 0)
        {
          this.jdField_b_of_type_ArrayOfShort = new short[m + 1];
          n = -1;
          for (;;)
          {
            n++;
            if (n >= m + 1) {
              break;
            }
            this.jdField_b_of_type_ArrayOfShort[n] = ((short)((paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF));
          }
          this.jdField_e_of_type_ArrayOfByte = new byte[this.jdField_b_of_type_ArrayOfShort[(this.jdField_b_of_type_ArrayOfShort.length - 1)] << 2];
          paramInputStream.read(this.jdField_e_of_type_ArrayOfByte, 0, this.jdField_e_of_type_ArrayOfByte.length);
        }
        if (((this.jdField_a_of_type_Int & 0x800) != 0) && ((m = paramInputStream.read() & 0xFF) > 0))
        {
          this.jdField_c_of_type_ArrayOfShort = new short[m + 1];
          n = -1;
          for (;;)
          {
            n++;
            if (n >= m + 1) {
              break;
            }
            this.jdField_c_of_type_ArrayOfShort[n] = ((short)((paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF));
          }
          this.jdField_f_of_type_ArrayOfByte = new byte[this.jdField_c_of_type_ArrayOfShort[(this.jdField_c_of_type_ArrayOfShort.length - 1)] << 2];
          paramInputStream.read(this.jdField_f_of_type_ArrayOfByte, 0, this.jdField_f_of_type_ArrayOfByte.length);
          if ((this.jdField_a_of_type_Int & 0x1000) != 0)
          {
            this.g = new byte[m];
            paramInputStream.read(this.g, 0, this.g.length);
          }
        }
      }
    }
    if ((this.jdField_a_of_type_Int & 0x10000) != 0)
    {
      if ((this.jdField_a_of_type_Int & 0x2000000) != 0) {
        m = (paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF;
      } else {
        m = paramInputStream.read() & 0xFF;
      }
      if (m > 0)
      {
        this.jdField_d_of_type_ArrayOfShort = new short[m + 1];
        n = -1;
        for (;;)
        {
          n++;
          if (n >= m + 1) {
            break;
          }
          this.jdField_d_of_type_ArrayOfShort[n] = ((short)((paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF));
        }
        this.h = new byte[this.jdField_d_of_type_ArrayOfShort[(this.jdField_d_of_type_ArrayOfShort.length - 1)] * 5];
        paramInputStream.read(this.h, 0, this.h.length);
        if ((this.jdField_a_of_type_Int & 0x40000) != 0)
        {
          this.jdField_b_of_type_ArrayOfByte = new byte[m * 5];
          paramInputStream.read(this.jdField_b_of_type_ArrayOfByte, 0, this.jdField_b_of_type_ArrayOfByte.length);
        }
      }
    }
    if ((this.jdField_a_of_type_Int & 0x1000000) != 0)
    {
      if ((m = (paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF) > 0)
      {
        this.jdField_e_of_type_ArrayOfShort = new short[m + 1];
        n = -1;
        for (;;)
        {
          n++;
          if (n >= m + 1) {
            break;
          }
          this.jdField_e_of_type_ArrayOfShort[n] = ((short)((paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF));
        }
        this.i = new byte[this.jdField_e_of_type_ArrayOfShort[(this.jdField_e_of_type_ArrayOfShort.length - 1)] << 1];
        paramInputStream.read(this.i, 0, this.i.length);
      }
      if (((this.jdField_a_of_type_Int & 0x4000000) != 0) && ((m = paramInputStream.read() & 0xFF) > 0))
      {
        this.jdField_f_of_type_ArrayOfShort = new short[m + 1];
        n = -1;
        for (;;)
        {
          n++;
          if (n >= m + 1) {
            break;
          }
          this.jdField_f_of_type_ArrayOfShort[n] = ((short)((paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF));
        }
        this.j = new byte[this.jdField_f_of_type_ArrayOfShort[(this.jdField_f_of_type_ArrayOfShort.length - 1)] << 1];
        paramInputStream.read(this.j, 0, this.j.length);
        if ((this.jdField_a_of_type_Int & 0x8000000) != 0)
        {
          this.k = new byte[m];
          paramInputStream.read(this.k, 0, this.k.length);
        }
      }
    }
    if (((this.jdField_a_of_type_Int & 0x4) != 0) && ((m = paramInputStream.read() & 0xFF) > 0))
    {
      this.jdField_b_of_type_Array2dOfByte = new byte[m][];
      n = -1;
      for (;;)
      {
        n++;
        if (n >= m) {
          break;
        }
        int i1 = (paramInputStream.read() & 0xFF) << 8 | paramInputStream.read() & 0xFF;
        this.jdField_b_of_type_Array2dOfByte[n] = new byte[i1];
        paramInputStream.read(this.jdField_b_of_type_Array2dOfByte[n], 0, this.jdField_b_of_type_Array2dOfByte[n].length);
      }
    }
  }
  
  public final int a()
  {
    if ((this.jdField_a_of_type_Int & 0x1000000) != 0) {
      return this.jdField_e_of_type_ArrayOfShort[1] - this.jdField_e_of_type_ArrayOfShort[0];
    }
    return this.jdField_d_of_type_ArrayOfShort.length - 1;
  }
  
  public final int a(int paramInt)
  {
    return this.jdField_d_of_type_ArrayOfShort[(paramInt + 1)] - this.jdField_d_of_type_ArrayOfShort[paramInt];
  }
  
  private int b(int paramInt)
  {
    return this.jdField_a_of_type_ArrayOfShort[(paramInt + 1)] - this.jdField_a_of_type_ArrayOfShort[paramInt];
  }
  
  public final int a(int paramInt1, int paramInt2)
  {
    paramInt2 = (paramInt1 = this.jdField_d_of_type_ArrayOfShort[paramInt1] + paramInt2) << 2;
    paramInt1 += paramInt2;
    return this.h[(paramInt1 + 1)] & 0xFF;
  }
  
  public final int a(int paramInt, byte[] paramArrayOfByte)
  {
    int m = this.jdField_e_of_type_ArrayOfShort[0] + paramInt << 1;
    paramInt = this.i[m] & 0xFF;
    if (((m = this.i[(m + 1)]) & 0x1) != 0)
    {
      int n = 0;
      if (paramArrayOfByte != null) {
        n = paramArrayOfByte[this.k[paramInt]];
      }
      n = this.jdField_f_of_type_ArrayOfShort[paramInt] + n << 1;
      m = this.j[(n + 1)];
      paramInt = this.j[n] & 0xFF;
      if ((m & 0x1) != 0) {
        return -1;
      }
    }
    if ((this.jdField_a_of_type_Int & 0x2000000) != 0) {
      paramInt |= (m & 0xE0) << 3;
    }
    return paramInt;
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte[] paramArrayOfByte)
  {
    this.jdField_a_of_type_Ad.jdField_a_of_type_ArrayOfInt[this.jdField_b_of_type_Int] = d.c;
    paramInt2 = ((paramInt1 = this.jdField_d_of_type_ArrayOfShort[paramInt1] + paramInt2) << 2) + paramInt1;
    paramInt1 = this.h[paramInt2] & 0xFF;
    if ((this.jdField_a_of_type_Int & 0x20000) != 0) {
      paramInt1 |= (this.h[(paramInt2 + 4)] & 0xE0) << 3;
    }
    int m;
    if ((paramInt5 & 0x2) != 0) {
      m = 0 + this.h[(paramInt2 + 2)];
    } else {
      m = 0 - this.h[(paramInt2 + 2)];
    }
    int n;
    if ((paramInt5 & 0x1) != 0) {
      n = 0 + this.h[(paramInt2 + 3)];
    } else {
      n = 0 - this.h[(paramInt2 + 3)];
    }
    b(paramGraphics, paramInt1, paramInt3 - m, paramInt4 - n, jdField_a_of_type_Array2dOfByte[(this.h[(paramInt2 + 4)] & 0xF)][paramInt5], 0, paramArrayOfByte);
  }
  
  private void b(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, byte[] paramArrayOfByte)
  {
    int m = b(paramInt1);
    int n = -1;
    label941:
    for (;;)
    {
      n++;
      if (n >= m) {
        break;
      }
      byte[] arrayOfByte = paramArrayOfByte;
      int i5 = 0;
      int i4 = paramInt3;
      int i3 = paramInt2;
      int i2 = n;
      Graphics localGraphics = paramGraphics;
      b localb = this;
      int i1 = this.jdField_a_of_type_ArrayOfShort[paramInt1] + i2 << 2;
      i2 = localb.jdField_d_of_type_ArrayOfByte[i1] & 0xFF;
      int i7 = localb.jdField_d_of_type_ArrayOfByte[(i1 + 3)];
      if ((localb.jdField_a_of_type_Int & 0x200) != 0) {
        i2 |= (i7 & 0xE0) << 3;
      }
      int i8 = localb.jdField_d_of_type_ArrayOfByte[(i1 + 1)] << paramInt5;
      i1 = localb.jdField_d_of_type_ArrayOfByte[(i1 + 2)] << paramInt5;
      int i9;
      if ((i7 & 0x10) != 0)
      {
        i9 = 0;
        if (arrayOfByte != null) {
          i9 = arrayOfByte[localb.g[i2]];
        }
        i9 = localb.jdField_c_of_type_ArrayOfShort[i2] + i9 << 2;
        if ((localb.jdField_f_of_type_ArrayOfByte[(i9 + 3)] & 0x1) != 0) {
          break label941;
        }
        i8 += (localb.jdField_f_of_type_ArrayOfByte[(i9 + 1)] << paramInt5);
        i1 += (localb.jdField_f_of_type_ArrayOfByte[(i9 + 2)] << paramInt5);
        i2 = localb.jdField_f_of_type_ArrayOfByte[i9] & 0xFF;
        if ((localb.jdField_a_of_type_Int & 0x20200) != 0) {
          i2 |= (localb.jdField_f_of_type_ArrayOfByte[(i9 + 3)] & 0xE0) << 3;
        }
      }
      switch (paramInt4)
      {
      case 0: 
        i3 = paramInt2 + i8;
        i4 = paramInt3 + i1;
        break;
      case 1: 
        i3 = paramInt2 + i8;
        i4 = paramInt3 - i1;
        break;
      case 2: 
        i3 = paramInt2 - i8;
        i4 = paramInt3 + i1;
        break;
      case 3: 
        i3 = paramInt2 - i8;
        i4 = paramInt3 - i1;
        break;
      case 4: 
        i3 = paramInt2 + i1;
        i4 = paramInt3 + i8;
        break;
      case 5: 
        i3 = paramInt2 - i1;
        i4 = paramInt3 + i8;
        break;
      case 6: 
        i3 = paramInt2 + i1;
        i4 = paramInt3 - i8;
        break;
      case 7: 
        i3 = paramInt2 - i1;
        i4 = paramInt3 - i8;
      }
      if ((i7 & 0x8) != 0)
      {
        localb.b(localGraphics, i2, i3, i4, jdField_a_of_type_Array2dOfByte[(i7 & 0x7)][paramInt4], paramInt5, arrayOfByte);
      }
      else
      {
        i7 &= 0x7;
        i8 = (localb.jdField_c_of_type_ArrayOfByte[(i2 << 1)] & 0xFF) << paramInt5;
        i1 = (localb.jdField_c_of_type_ArrayOfByte[((i2 << 1) + 1)] & 0xFF) << paramInt5;
        if (i7 > 3)
        {
          i8 ^= i1;
          i1 ^= i8;
          i8 ^= i1;
        }
        switch (paramInt4)
        {
        case 1: 
          i4 -= i1;
          break;
        case 2: 
          i3 -= i8;
          break;
        case 3: 
          i3 -= i8;
          i4 -= i1;
          break;
        case 5: 
          i3 -= i1;
          break;
        case 6: 
          i4 -= i8;
          break;
        case 7: 
          i3 -= i1;
          i4 -= i8;
        }
        i4 = jdField_a_of_type_Array2dOfByte[i7][paramInt4];
        i3 = i4;
        i2 = i3;
        i1 = i2;
        localGraphics = localGraphics;
        localb = localb;
        i5 = 0;
        int i6 = 0;
        Image localImage = null;
        if (paramInt5 <= 0)
        {
          i6 = i1 << 1;
          i5 = i1 + i6;
          i5 = localb.jdField_a_of_type_ArrayOfByte[i5] & 0xFF;
          if (localb.jdField_a_of_type_Ad.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i5] == null) {
            localb.jdField_a_of_type_Ad.d(new int[] { i5 });
          }
          localImage = localb.jdField_a_of_type_Ad.jdField_a_of_type_ArrayOfJavaxMicroeditionLcduiImage[i5];
          localb.jdField_a_of_type_Ad.b[i5] = d.c;
        }
        i8 = 0;
        i9 = 0;
        int i10 = 0;
        if (localImage != null)
        {
          i10 = i1;
          i1 = i6;
          i5 = (localb.jdField_c_of_type_ArrayOfByte[i1] & 0xFF) << paramInt5;
          i6 = (localb.jdField_c_of_type_ArrayOfByte[(i1 + 1)] & 0xFF) << paramInt5;
          i1 += i10;
          i8 = (localb.jdField_a_of_type_ArrayOfByte[(i1 + 1)] & 0xFF) << paramInt5;
          i9 = (localb.jdField_a_of_type_ArrayOfByte[(i1 + 2)] & 0xFF) << paramInt5;
        }
        if (localImage != null) {
          f.a(localGraphics, localImage, i2, i3, i8, i9, i5, i6, i4);
        }
      }
    }
  }
  
  public final void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = ((paramInt1 = this.jdField_d_of_type_ArrayOfShort[paramInt1] + paramInt2) << 2) + paramInt1;
    paramInt1 = this.h[paramInt2] & 0xFF;
    if ((this.jdField_a_of_type_Int & 0x20000) != 0) {
      paramInt1 |= (this.h[(paramInt2 + 4)] & 0xE0) << 3;
    }
    int m;
    if ((paramInt4 & 0x2) != 0) {
      m = 0 + this.h[(paramInt2 + 2)];
    } else {
      m = 0 - this.h[(paramInt2 + 2)];
    }
    int n;
    if ((paramInt4 & 0x1) != 0) {
      n = 0 + this.h[(paramInt2 + 3)];
    } else {
      n = 0 - this.h[(paramInt2 + 3)];
    }
    a(paramArrayOfInt, paramInt1, paramInt3, jdField_a_of_type_Array2dOfByte[(this.h[(paramInt2 + 4)] & 0xF)][paramInt4], m, n);
  }
  
  public final void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt2 != -1)
    {
      paramInt2 += this.jdField_b_of_type_ArrayOfShort[paramInt1];
      if (this.jdField_b_of_type_ArrayOfShort[(paramInt1 + 1)] <= paramInt2)
      {
        paramArrayOfInt[0] = (paramArrayOfInt[1] = paramArrayOfInt[2] = paramArrayOfInt[3] = 0);
        return;
      }
      paramInt2 <<= 2;
      m = this.jdField_e_of_type_ArrayOfByte[(paramInt2++)];
      n = this.jdField_e_of_type_ArrayOfByte[(paramInt2++)];
      i1 = this.jdField_e_of_type_ArrayOfByte[(paramInt2++)] & 0xFF;
      i2 = this.jdField_e_of_type_ArrayOfByte[paramInt2] & 0xFF;
      if ((paramInt3 & 0x2) != 0) {
        paramInt4 += m + i1;
      } else {
        paramInt4 -= m;
      }
      if ((paramInt3 & 0x1) != 0) {
        paramInt5 += n + i2;
      } else {
        paramInt5 -= n;
      }
      paramArrayOfInt[0] = (-paramInt4);
      paramArrayOfInt[1] = (-paramInt5);
      paramArrayOfInt[2] = (paramArrayOfInt[0] + i1);
      paramArrayOfInt[3] = (paramArrayOfInt[1] + i2);
      return;
    }
    paramInt2 = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = b(paramInt1);
    int i3 = -1;
    for (;;)
    {
      i3++;
      if (i3 >= i2) {
        break;
      }
      a(paramArrayOfInt, paramInt1, i3);
      if (paramArrayOfInt[0] < paramInt2)
      {
        n = paramInt2 + n - paramArrayOfInt[0];
        paramInt2 = paramArrayOfInt[0];
      }
      if (paramArrayOfInt[1] < m)
      {
        i1 = m + i1 - paramArrayOfInt[1];
        m = paramArrayOfInt[1];
      }
      if (paramArrayOfInt[2] > paramInt2 + n) {
        n = paramArrayOfInt[2] - paramInt2;
      }
      if (paramArrayOfInt[3] > m + i1) {
        i1 = paramArrayOfInt[3] - m;
      }
    }
    if ((paramInt3 & 0x2) != 0) {
      paramInt4 += paramInt2 + n;
    } else {
      paramInt4 -= paramInt2;
    }
    if ((paramInt3 & 0x1) != 0) {
      paramInt5 += m + i1;
    } else {
      paramInt5 -= m;
    }
    paramArrayOfInt[0] = (-paramInt4);
    paramArrayOfInt[1] = (-paramInt5);
    paramArrayOfInt[2] = (paramArrayOfInt[0] + n);
    paramArrayOfInt[3] = (paramArrayOfInt[1] + i1);
  }
  
  public final void a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int m = this.jdField_a_of_type_ArrayOfShort[paramInt1] + paramInt2 << 2;
    int n = this.jdField_d_of_type_ArrayOfByte[m] & 0xFF;
    m = this.jdField_d_of_type_ArrayOfByte[(m + 3)] & 0xFF;
    if ((this.jdField_a_of_type_Int & 0x200) != 0) {
      n |= (m & 0xE0) << 3;
    }
    if ((m & 0x8) != 0)
    {
      a(paramArrayOfInt, n, -1, 0, 0, 0);
      return;
    }
    b localb = this;
    n = this.jdField_a_of_type_ArrayOfShort[paramInt1] + paramInt2 << 2;
    paramArrayOfInt[0] = localb.jdField_d_of_type_ArrayOfByte[(n + 1)];
    localb = this;
    n = this.jdField_a_of_type_ArrayOfShort[paramInt1] + paramInt2 << 2;
    paramArrayOfInt[1] = localb.jdField_d_of_type_ArrayOfByte[(n + 2)];
    localb = this;
    n = this.jdField_a_of_type_ArrayOfShort[paramInt1] + paramInt2 << 2;
    int i1 = localb.jdField_d_of_type_ArrayOfByte[n] & 0xFF;
    if ((localb.jdField_a_of_type_Int & 0x200) != 0) {
      i1 |= (localb.jdField_d_of_type_ArrayOfByte[(n + 3)] & 0xE0) << 3;
    }
    paramArrayOfInt[2] = (paramArrayOfInt[0] + (localb.jdField_c_of_type_ArrayOfByte[(i1 << 1)] & 0xFF));
    localb = this;
    n = this.jdField_a_of_type_ArrayOfShort[paramInt1] + paramInt2 << 2;
    i1 = localb.jdField_d_of_type_ArrayOfByte[n] & 0xFF;
    if ((localb.jdField_a_of_type_Int & 0x200) != 0) {
      i1 |= (localb.jdField_d_of_type_ArrayOfByte[(n + 3)] & 0xE0) << 3;
    }
    paramArrayOfInt[3] = (paramArrayOfInt[1] + (localb.jdField_c_of_type_ArrayOfByte[((i1 << 1) + 1)] & 0xFF));
  }
  
  public final void a()
  {
    this.jdField_c_of_type_ArrayOfByte = null;
    this.jdField_a_of_type_ArrayOfByte = null;
    this.jdField_a_of_type_ArrayOfShort = null;
    this.jdField_d_of_type_ArrayOfByte = null;
    this.jdField_b_of_type_ArrayOfShort = null;
    this.jdField_e_of_type_ArrayOfByte = null;
    this.jdField_c_of_type_ArrayOfShort = null;
    this.jdField_f_of_type_ArrayOfByte = null;
    this.g = null;
    this.jdField_d_of_type_ArrayOfShort = null;
    this.h = null;
    this.jdField_b_of_type_ArrayOfByte = null;
    this.jdField_e_of_type_ArrayOfShort = null;
    this.i = null;
    this.jdField_f_of_type_ArrayOfShort = null;
    this.j = null;
    this.k = null;
    this.jdField_b_of_type_Array2dOfByte = null;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\b.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */