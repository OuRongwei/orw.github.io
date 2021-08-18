import java.io.InputStream;
import java.io.OutputStream;

public final class n
{
  public byte[] a;
  private int jdField_a_of_type_Int;
  private int b;
  private static final StringBuffer jdField_a_of_type_JavaLangStringBuffer = new StringBuffer();
  
  public n(int paramInt)
  {
    this.jdField_a_of_type_ArrayOfByte = new byte[paramInt];
    this.jdField_a_of_type_Int = 0;
    this.b = this.jdField_a_of_type_ArrayOfByte.length;
  }
  
  public final n a(int paramInt)
  {
    if (this.jdField_a_of_type_Int >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)paramInt);
    return this;
  }
  
  public final n b(int paramInt)
  {
    if (this.jdField_a_of_type_Int + 1 >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(paramInt >>> 8));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)paramInt);
    return this;
  }
  
  public final n c(int paramInt)
  {
    if (this.jdField_a_of_type_Int + 3 >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = (paramInt >> 24);
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(paramInt >>> 16));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(paramInt >>> 8));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)paramInt);
    return this;
  }
  
  public final n a(long paramLong)
  {
    if (this.jdField_a_of_type_Int + 7 >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(int)(paramLong >>> 56));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(int)(paramLong >>> 48));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(int)(paramLong >>> 40));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(int)(paramLong >>> 32));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(int)(paramLong >>> 24));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(int)(paramLong >>> 16));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(int)(paramLong >>> 8));
    this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] = ((byte)(int)paramLong);
    return this;
  }
  
  public final n a(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }
    int i = paramString.length();
    b(i);
    int k = -1;
    for (;;)
    {
      k++;
      if (k >= i) {
        break;
      }
      int j = (short)paramString.charAt(k);
      b(j);
    }
    return this;
  }
  
  public final void a(n paramn)
  {
    if (paramn.e() > e()) {
      throw new ArrayIndexOutOfBoundsException();
    }
    System.arraycopy(paramn.jdField_a_of_type_ArrayOfByte, paramn.jdField_a_of_type_Int, this.jdField_a_of_type_ArrayOfByte, this.jdField_a_of_type_Int, paramn.e());
    this.jdField_a_of_type_Int += paramn.e();
    paramn.jdField_a_of_type_Int = paramn.b;
  }
  
  public final int a()
  {
    return this.jdField_a_of_type_Int;
  }
  
  public final n d(int paramInt)
  {
    this.jdField_a_of_type_Int = paramInt;
    return this;
  }
  
  public final int b()
  {
    return this.b;
  }
  
  public final n e(int paramInt)
  {
    this.b = paramInt;
    return this;
  }
  
  public final long a()
  {
    if (this.jdField_a_of_type_Int + 7 >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    int i = this.jdField_a_of_type_Int;
    byte[] arrayOfByte;
    long l = ((arrayOfByte = this.jdField_a_of_type_ArrayOfByte)[(i++)] & 0xFF) << 56 | (arrayOfByte[(i++)] & 0xFF) << 48 | (arrayOfByte[(i++)] & 0xFF) << 40 | (arrayOfByte[(i++)] & 0xFF) << 32 | (arrayOfByte[(i++)] & 0xFF) << 24 | (arrayOfByte[(i++)] & 0xFF) << 16 | (arrayOfByte[(i++)] & 0xFF) << 8 | arrayOfByte[i] & 0xFF;
    this.jdField_a_of_type_Int += 8;
    return l;
  }
  
  public final int c()
  {
    if (this.jdField_a_of_type_Int + 3 >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return (this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] & 0xFF) << 24 | (this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] & 0xFF) << 16 | (this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] & 0xFF) << 8 | this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] & 0xFF;
  }
  
  public final short a()
  {
    if (this.jdField_a_of_type_Int + 1 >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return (short)((this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] & 0xFF) << 8 | this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] & 0xFF);
  }
  
  public final short a(int paramInt)
  {
    if (paramInt + 1 >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return (short)((this.jdField_a_of_type_ArrayOfByte[(paramInt++)] & 0xFF) << 8 | this.jdField_a_of_type_ArrayOfByte[paramInt] & 0xFF);
  }
  
  public final int d()
  {
    if (this.jdField_a_of_type_Int >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)] & 0xFF;
  }
  
  public final byte a()
  {
    if (this.jdField_a_of_type_Int >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return this.jdField_a_of_type_ArrayOfByte[(this.jdField_a_of_type_Int++)];
  }
  
  public final byte[] a(int paramInt)
  {
    if (this.jdField_a_of_type_Int + (paramInt - 1) >= this.b) {
      throw new ArrayIndexOutOfBoundsException();
    }
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(this.jdField_a_of_type_ArrayOfByte, this.jdField_a_of_type_Int, arrayOfByte, 0, paramInt);
    this.jdField_a_of_type_Int += paramInt;
    return arrayOfByte;
  }
  
  public final byte b()
  {
    if (this.b <= 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return this.jdField_a_of_type_ArrayOfByte[0];
  }
  
  public final String a()
  {
    int i = a();
    StringBuffer localStringBuffer;
    (localStringBuffer = jdField_a_of_type_JavaLangStringBuffer).setLength(0);
    int j = -1;
    for (;;)
    {
      j++;
      if (j >= i) {
        break;
      }
      char c = (char)a();
      localStringBuffer.append(c);
    }
    return localStringBuffer.toString();
  }
  
  public final n a()
  {
    this.jdField_a_of_type_Int = 0;
    this.b = this.jdField_a_of_type_ArrayOfByte.length;
    return this;
  }
  
  public final int e()
  {
    return this.b - this.jdField_a_of_type_Int;
  }
  
  public final void a(int paramInt)
  {
    this.jdField_a_of_type_Int += paramInt;
  }
  
  public final n b()
  {
    this.b = this.jdField_a_of_type_Int;
    n localn = this;
    this.jdField_a_of_type_Int = 0;
    return localn;
  }
  
  public static final byte a(byte[] paramArrayOfByte, int paramInt)
  {
    return paramArrayOfByte[paramInt];
  }
  
  public static final short a(byte[] paramArrayOfByte)
  {
    return (short)((paramArrayOfByte[7] & 0xFF) << 8 | paramArrayOfByte[8] & 0xFF);
  }
  
  public static final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[paramInt1] = ((byte)paramInt2);
  }
  
  public final int a(InputStream paramInputStream, int paramInt)
  {
    paramInt = paramInputStream.read(this.jdField_a_of_type_ArrayOfByte, this.jdField_a_of_type_Int, paramInt - this.jdField_a_of_type_Int);
    this.jdField_a_of_type_Int += paramInt;
    return paramInt;
  }
  
  public final void a(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.jdField_a_of_type_ArrayOfByte, this.jdField_a_of_type_Int, e());
    this.jdField_a_of_type_Int = this.b;
  }
  
  public final byte[] a()
  {
    return this.jdField_a_of_type_ArrayOfByte;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\n.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */