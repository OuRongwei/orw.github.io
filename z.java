import javax.microedition.lcdui.Image;

public final class z
{
  private byte jdField_c_of_type_Byte;
  public byte a;
  private short jdField_c_of_type_Short = -1;
  public short a;
  public int a;
  public int b;
  public boolean a;
  private boolean jdField_b_of_type_Boolean;
  private int jdField_c_of_type_Int;
  short jdField_b_of_type_Short;
  byte jdField_b_of_type_Byte;
  
  public z(int paramInt1, int paramInt2)
  {
    this.jdField_a_of_type_Byte = -1;
    this.jdField_c_of_type_Byte = ((byte)(paramInt1 + 1));
    if (paramInt2 == 0)
    {
      paramInt1 = (d.jdField_a_of_type_Int - 175 >> 1) - (d.jdField_a_of_type_Int == 240 ? 10 : 0);
      paramInt2 = 25;
      i = 27;
    }
    else
    {
      if (d.jdField_a_of_type_Int > 330)
      {
        paramInt1 = d.jdField_a_of_type_Int - 120 - e.a(12).getWidth() >> 1;
        paramInt2 = 36;
      }
      else
      {
        paramInt1 = d.jdField_a_of_type_Int - 24 - e.a(12).getWidth() >> 1;
        paramInt2 = 20;
      }
      i = e.a(12).getHeight() + 1;
    }
    int i = d.jdField_b_of_type_Int - i;
    paramInt2 = paramInt1 + paramInt2 * (this.jdField_c_of_type_Byte - 1);
    paramInt1 = this;
    this.jdField_a_of_type_Int = paramInt2;
    paramInt1.jdField_b_of_type_Int = i;
  }
  
  public final void a()
  {
    if (this.jdField_b_of_type_Short > 0) {
      this.jdField_b_of_type_Short = ((short)(this.jdField_b_of_type_Short - 1));
    }
  }
  
  public final boolean a()
  {
    return this.jdField_b_of_type_Short > 0;
  }
  
  public final void b()
  {
    this.jdField_a_of_type_Short = -1;
    this.jdField_c_of_type_Short = -1;
    this.jdField_a_of_type_Byte = -1;
    this.jdField_c_of_type_Int = 0;
    this.jdField_a_of_type_Boolean = false;
  }
  
  private void d()
  {
    if (!this.jdField_a_of_type_Boolean) {
      return;
    }
    if (((c()) || (b())) && (!d.a((byte)13)))
    {
      this.jdField_b_of_type_Boolean = true;
    }
    else if (((c()) || (b())) && (d.a((byte)13)))
    {
      this.jdField_b_of_type_Boolean = (!a());
      if (!this.jdField_b_of_type_Boolean) {
        t.a("CD未冷却");
      }
    }
    if (this.jdField_b_of_type_Boolean)
    {
      switch (this.jdField_a_of_type_Byte)
      {
      case 0: 
        t.a(this.jdField_c_of_type_Int);
        break;
      case 1: 
        t.b(this.jdField_c_of_type_Int);
        break;
      case 2: 
        if (((ag.a()) && (this.jdField_c_of_type_Short != 4) && (this.jdField_c_of_type_Short != 1)) || ((e.a.jdField_b_of_type_Boolean) && (this.jdField_c_of_type_Short != 7)))
        {
          this.jdField_b_of_type_Boolean = false;
          d.b();
          d.f();
          return;
        }
        switch (this.jdField_c_of_type_Short)
        {
        case 2: 
          h.b("vm:taskList");
          break;
        case 5: 
          h.b("vm:allAroundPlayer");
          break;
        case 6: 
          y.a();
          break;
        case 3: 
          h.b("vm:bags");
          break;
        case 1: 
          h.b("QuickItem");
          break;
        case 4: 
          h.b("setFollow");
          break;
        case 7: 
          if (ag.a())
          {
            d.b();
          }
          else
          {
            e.a.jdField_b_of_type_Boolean = (!e.a.jdField_b_of_type_Boolean);
            if (!e.a.jdField_b_of_type_Boolean) {
              e.a.A = 0;
            }
          }
          break;
        }
        break;
      }
      this.jdField_b_of_type_Boolean = false;
      d.b();
      d.f();
    }
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    return (paramInt1 >= paramInt3) && (paramInt1 <= paramInt3 + paramInt5) && (paramInt2 >= paramInt4) && (paramInt2 <= paramInt4 + paramInt6);
  }
  
  public final boolean b()
  {
    int i = d.f();
    int j = d.h();
    if ((d.e() >= -1) && (d.g() == d.d) && (d.i() == d.e) && (d.i() > d.jdField_b_of_type_Int - 40)) {
      if (d.jdField_a_of_type_Int > 330)
      {
        if (a(i, j, this.jdField_a_of_type_Int, this.jdField_b_of_type_Int, 36, 36)) {
          return true;
        }
      }
      else if (a(i, j, this.jdField_a_of_type_Int, this.jdField_b_of_type_Int, 20, 20)) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean c()
  {
    z localz = this;
    if (this.jdField_a_of_type_Byte != 2) {
      switch (localz.jdField_c_of_type_Byte)
      {
      case 1: 
        tmpTernaryOp = 5;
        break;
      case 2: 
        tmpTernaryOp = 6;
        break;
      case 3: 
        tmpTernaryOp = 7;
        break;
      case 4: 
        tmpTernaryOp = 8;
        break;
      case 5: 
        tmpTernaryOp = 9;
        break;
      case 6: 
        tmpTernaryOp = 10;
        break;
      case 7: 
        tmpTernaryOp = 11;
        break;
      }
    } else {
      switch (localz.jdField_c_of_type_Byte)
      {
      case 1: 
        tmpTernaryOp = 14;
        break;
      case 2: 
        tmpTernaryOp = 5;
        break;
      case 3: 
        tmpTernaryOp = 7;
        break;
      case 4: 
        tmpTernaryOp = 11;
        break;
      case 5: 
        tmpTernaryOp = 13;
        break;
      case 6: 
        tmpTernaryOp = 16;
        break;
      case 7: 
        tmpTernaryOp = 15;
        break;
      }
    }
    return d.a(-1) > 0;
  }
  
  public final void a(int paramInt1, short paramShort, int paramInt2, int paramInt3)
  {
    this.jdField_a_of_type_Short = ((short)paramInt1);
    this.jdField_c_of_type_Short = paramShort;
    this.jdField_a_of_type_Byte = ((byte)paramInt2);
    this.jdField_c_of_type_Int = paramInt3;
    this.jdField_a_of_type_Boolean = true;
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 != 2)
    {
      paramInt1 -= 5;
      g.a[paramInt1].a(paramInt4, (short)0, paramInt2, paramInt3);
      return;
    }
    switch (paramInt1)
    {
    case 14: 
      tmpTernaryOp = 1;
      break;
    case 5: 
      tmpTernaryOp = 2;
      break;
    case 7: 
      tmpTernaryOp = 3;
      break;
    case 11: 
      tmpTernaryOp = 4;
      break;
    case 13: 
      tmpTernaryOp = 5;
      break;
    case 16: 
      tmpTernaryOp = 6;
      break;
    case 15: 
      tmpTernaryOp = 7;
      break;
    }
    paramInt1 = 8;
    g.jdField_b_of_type_ArrayOfZ[(paramInt1 - 1)].a(paramInt4, (short)paramInt3, paramInt2, 0);
  }
  
  public static void c()
  {
    int i = -1;
    for (;;)
    {
      i++;
      if (i >= g.c.length) {
        break;
      }
      g.c[i].b();
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if ((this.jdField_c_of_type_Int == paramInt1) && (this.jdField_a_of_type_Byte == 0))
    {
      this.jdField_b_of_type_Short = ((short)paramInt2);
      paramInt1 = this;
      switch (this.jdField_b_of_type_Short)
      {
      case 2: 
        paramInt1.jdField_b_of_type_Byte = 8;
        return;
      case 3: 
        paramInt1.jdField_b_of_type_Byte = 5;
        return;
      case 4: 
        paramInt1.jdField_b_of_type_Byte = 4;
        return;
      case 5: 
        paramInt1.jdField_b_of_type_Byte = 3;
        return;
      }
      paramInt1.jdField_b_of_type_Byte = 2;
    }
  }
  
  public static void a(int paramInt)
  {
    if (paramInt == 0)
    {
      paramInt = -1;
      for (;;)
      {
        paramInt++;
        if (paramInt >= 7) {
          break;
        }
        z localz;
        if (((localz = t.jdField_a_of_type_Byte == 0 ? g.a[paramInt] : g.c[paramInt]).jdField_c_of_type_Byte > 0) && (localz.jdField_c_of_type_Byte <= 7)) {
          localz.d();
        }
      }
      return;
    }
    if (paramInt == 1)
    {
      paramInt = -1;
      for (;;)
      {
        paramInt++;
        if (paramInt >= 7) {
          break;
        }
        g.jdField_b_of_type_ArrayOfZ[paramInt].d();
      }
    }
  }
  
  public static void a(n paramn)
  {
    paramn.a();
    int i = paramn.a();
    int j = -1;
    for (;;)
    {
      j++;
      if (j >= i) {
        break;
      }
      int k = paramn.a();
      int m = paramn.a();
      int n = paramn.d();
      int i1 = paramn.c();
      a(m, k, i1, n);
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\z.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */