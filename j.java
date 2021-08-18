import javax.microedition.lcdui.Graphics;

public final class j
{
  private int g;
  public int a;
  public int b;
  public int c;
  public b a;
  public int[] a;
  public int d;
  public byte a;
  public byte b;
  public int e;
  public int f;
  
  public j()
  {
    this.jdField_a_of_type_ArrayOfInt = new int[4];
  }
  
  public final void a()
  {
    this.e = (this.jdField_a_of_type_ArrayOfInt[0] - this.jdField_a_of_type_ArrayOfInt[2]);
    this.f = (this.jdField_a_of_type_ArrayOfInt[1] - this.jdField_a_of_type_ArrayOfInt[3]);
  }
  
  public final void a(int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    if (paramInt1 >= this.jdField_a_of_type_B.a()) {
      paramInt1 = 0;
    }
    this.d &= 0xFF07;
    this.d |= paramInt2;
    this.jdField_b_of_type_Int = paramInt1;
    this.c = this.jdField_a_of_type_B.a(paramInt1, paramArrayOfByte);
    if (this.c == -1)
    {
      this.jdField_a_of_type_Int = -1;
      return;
    }
    if ((this.d & 0x20) == 0) {
      this.jdField_a_of_type_Int = 0;
    } else {
      this.jdField_a_of_type_Int = (this.jdField_a_of_type_B.a(this.c) - 1);
    }
    this.g = 0;
    a(0, this.jdField_a_of_type_ArrayOfInt);
  }
  
  public final void a(int paramInt)
  {
    if (this.g < 0) {
      return;
    }
    if ((paramInt == 0) && (this.g++ <= this.jdField_a_of_type_B.a(this.c, this.jdField_a_of_type_Int))) {
      return;
    }
    paramInt = this.jdField_a_of_type_B.a(this.c);
    if ((this.d & 0x20) == 0)
    {
      this.jdField_a_of_type_Int += 1;
      if ((this.jdField_a_of_type_Int == paramInt - 1) && ((this.d & 0x80) == 0))
      {
        this.d |= 0x8;
        break label263;
      }
      if (this.jdField_a_of_type_Int < paramInt) {
        break label263;
      }
      if ((this.d & 0x10) != 0)
      {
        this.jdField_a_of_type_Int -= 1;
        break label263;
      }
      if ((this.d & 0x40) != 0)
      {
        this.jdField_a_of_type_Int = 0;
        this.jdField_b_of_type_Byte = ((byte)(this.jdField_b_of_type_Byte + 1));
        if (!a()) {
          break label263;
        }
        this.jdField_a_of_type_Int = (paramInt - 1);
        return;
      }
      if ((this.d & 0x80) == 0)
      {
        this.jdField_a_of_type_Int = 0;
        break label263;
      }
    }
    else
    {
      this.jdField_a_of_type_Int -= 1;
      if (this.jdField_a_of_type_Int == 0)
      {
        this.d |= 0x8;
        break label263;
      }
      if (this.jdField_a_of_type_Int >= 0) {
        break label263;
      }
      if ((this.d & 0x10) != 0)
      {
        this.jdField_a_of_type_Int = 0;
        break label263;
      }
    }
    this.jdField_a_of_type_Int = (paramInt - 1);
    label263:
    this.g = 1;
    a(0, this.jdField_a_of_type_ArrayOfInt);
  }
  
  public final void a(int paramInt, int[] paramArrayOfInt)
  {
    if (this.jdField_a_of_type_B != null)
    {
      if (this.g >= 0)
      {
        this.jdField_a_of_type_B.a(paramArrayOfInt, this.c, this.jdField_a_of_type_Int, paramInt, this.d & 0x3);
        return;
      }
      if (this.c >= 0)
      {
        this.jdField_a_of_type_B.a(paramArrayOfInt, this.c, this.jdField_a_of_type_Int);
        return;
      }
      if (this.jdField_a_of_type_Int >= 0) {
        this.jdField_a_of_type_B.a(paramArrayOfInt, this.jdField_a_of_type_Int, paramInt, this.d & 0x3, 0, 0);
      }
    }
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    this.jdField_a_of_type_B.a(paramGraphics, this.c, this.jdField_a_of_type_Int, paramInt1, paramInt2, this.d & 0x3, paramArrayOfByte);
  }
  
  public final boolean a()
  {
    return this.jdField_b_of_type_Byte >= this.jdField_a_of_type_Byte;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\j.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */