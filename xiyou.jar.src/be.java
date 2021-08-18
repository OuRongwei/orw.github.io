import javax.microedition.lcdui.Graphics;

public final class be
  extends ba
{
  public be(ba paramba)
  {
    this.a = paramba;
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    this.h = (this.f = this.a.h);
    this.i = (this.g = this.a.i);
    this.b = (this.d = this.a.d);
    this.c = (this.e = this.a.e);
    if (e.jdField_a_of_type_Ah != null)
    {
      Graphics localGraphics = paramGraphics;
      if ((paramGraphics = e.jdField_a_of_type_Ah).jdField_a_of_type_JavaxMicroeditionLcduiImage != null)
      {
        if (paramGraphics.b < 0) {
          paramGraphics.b = 0;
        }
        if (paramGraphics.c < 0) {
          paramGraphics.c = 0;
        }
        int i = paramGraphics.c / paramGraphics.e;
        int j = paramGraphics.b / paramGraphics.d;
        int k = d.b / paramGraphics.e + 1;
        int m = (d.jdField_a_of_type_Int > paramGraphics.d * paramGraphics.f ? paramGraphics.d * paramGraphics.f : d.jdField_a_of_type_Int) / paramGraphics.d + 1;
        if (i + k >= paramGraphics.g) {
          k = paramGraphics.g - 1 - i;
        }
        if (j + m >= paramGraphics.f) {
          m = paramGraphics.f - 1 - j;
        }
        for (int n = i; n <= i + k; n++) {
          for (int i1 = j; i1 <= j + m; i1++)
          {
            if (paramGraphics.jdField_a_of_type_Array2dOfShort[n][i1] != -1) {
              f.a(localGraphics, paramGraphics.jdField_a_of_type_JavaxMicroeditionLcduiImage, i1 * paramGraphics.d - paramGraphics.b + paramGraphics.jdField_a_of_type_Short, n * paramGraphics.e - paramGraphics.c, paramGraphics.jdField_a_of_type_Array2dOfShort[n][i1] % 7 * paramGraphics.d, paramGraphics.jdField_a_of_type_Array2dOfShort[n][i1] / 7 * paramGraphics.e, paramGraphics.d, paramGraphics.e, 0);
            }
            if (paramGraphics.jdField_a_of_type_Array2dOfShort[(n + paramGraphics.g)][(i1 + paramGraphics.f)] != -1) {
              f.a(localGraphics, paramGraphics.jdField_a_of_type_JavaxMicroeditionLcduiImage, i1 * paramGraphics.d - paramGraphics.b + paramGraphics.jdField_a_of_type_Short, n * paramGraphics.e - paramGraphics.c, paramGraphics.jdField_a_of_type_Array2dOfShort[(n + paramGraphics.g)][(i1 + paramGraphics.f)] % 7 * paramGraphics.d, paramGraphics.jdField_a_of_type_Array2dOfShort[(n + paramGraphics.g)][(i1 + paramGraphics.f)] / 7 * paramGraphics.e, paramGraphics.d, paramGraphics.e, 0);
            }
          }
        }
        if (paramGraphics.jdField_a_of_type_A != null)
        {
          paramGraphics.jdField_a_of_type_A.a.a(0);
          paramGraphics.jdField_a_of_type_A.a.a(localGraphics, paramGraphics.jdField_a_of_type_At.jdField_a_of_type_Int - paramGraphics.b, paramGraphics.jdField_a_of_type_At.b - paramGraphics.c - 18, null);
        }
        localGraphics.setColor(0);
        localGraphics.drawString(paramGraphics.jdField_a_of_type_At.jdField_a_of_type_JavaLangString, paramGraphics.jdField_a_of_type_At.jdField_a_of_type_Int - paramGraphics.b + 1, paramGraphics.jdField_a_of_type_At.b - paramGraphics.c, 17);
        localGraphics.drawString(paramGraphics.jdField_a_of_type_At.jdField_a_of_type_JavaLangString, paramGraphics.jdField_a_of_type_At.jdField_a_of_type_Int - paramGraphics.b - 1, paramGraphics.jdField_a_of_type_At.b - paramGraphics.c + 1, 17);
        localGraphics.drawString(paramGraphics.jdField_a_of_type_At.jdField_a_of_type_JavaLangString, paramGraphics.jdField_a_of_type_At.jdField_a_of_type_Int - paramGraphics.b, paramGraphics.jdField_a_of_type_At.b - paramGraphics.c + 1, 17);
        localGraphics.drawString(paramGraphics.jdField_a_of_type_At.jdField_a_of_type_JavaLangString, paramGraphics.jdField_a_of_type_At.jdField_a_of_type_Int - paramGraphics.b, paramGraphics.jdField_a_of_type_At.b - paramGraphics.c - 1, 17);
        localGraphics.setColor(-1);
        n = -1;
        for (;;)
        {
          n++;
          if (n >= paramGraphics.jdField_a_of_type_Au.jdField_a_of_type_Int) {
            break;
          }
          at localat;
          if (ad.a((localat = (at)paramGraphics.jdField_a_of_type_Au.a(n)).jdField_a_of_type_Int, localat.b, paramGraphics.b, paramGraphics.c, d.jdField_a_of_type_Int, d.b)) {
            localGraphics.drawString(localat.jdField_a_of_type_JavaLangString, localat.jdField_a_of_type_Int - paramGraphics.b, localat.b - paramGraphics.c, 17);
          }
        }
      }
    }
    return parambg;
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final void b(int paramInt)
  {
    if ((paramInt = e.jdField_a_of_type_Ah).jdField_a_of_type_At != null)
    {
      Object localObject;
      if ((d.a(4) == 1) || (d.a(9) == 1))
      {
        if (!ag.a())
        {
          if ((localObject = e.jdField_a_of_type_Bc.a("worldmap")) != null)
          {
            bb localbb = ((bb)localObject).a("trans2Op");
            ((bb)localObject).c(localbb);
            localbb.c = true;
            bb.g();
          }
        }
        else {
          e.a("系统", "跟随状态，不可传送！");
        }
      }
      else if ((d.a(0) == 1) || (d.a(6) == 1))
      {
        (localObject = paramInt).jdField_a_of_type_Int -= 1;
        if (((ah)localObject).jdField_a_of_type_Int < 0) {
          ((ah)localObject).jdField_a_of_type_Int = 0;
        }
        ((ah)localObject).jdField_a_of_type_At = ((at)((ah)localObject).jdField_a_of_type_Au.a(((ah)localObject).jdField_a_of_type_Int));
      }
      else if ((d.a(1) == 1) || (d.a(12) == 1))
      {
        (localObject = paramInt).jdField_a_of_type_Int += 1;
        if (((ah)localObject).jdField_a_of_type_Int >= ((ah)localObject).jdField_a_of_type_ArrayOfByte.length) {
          ((ah)localObject).jdField_a_of_type_Int = (((ah)localObject).jdField_a_of_type_ArrayOfByte.length - 1);
        }
        ((ah)localObject).jdField_a_of_type_At = ((at)((ah)localObject).jdField_a_of_type_Au.a(((ah)localObject).jdField_a_of_type_Int));
      }
      else if ((d.a(2) == 1) || (d.a(8) == 1))
      {
        (localObject = paramInt).jdField_a_of_type_Int -= 1;
        if (((ah)localObject).jdField_a_of_type_Int < 0) {
          ((ah)localObject).jdField_a_of_type_Int = 0;
        }
        ((ah)localObject).jdField_a_of_type_At = ((at)((ah)localObject).jdField_a_of_type_Au.a(((ah)localObject).jdField_a_of_type_Int));
      }
      else if ((d.a(3) == 1) || (d.a(10) == 1))
      {
        (localObject = paramInt).jdField_a_of_type_Int += 1;
        if (((ah)localObject).jdField_a_of_type_Int >= ((ah)localObject).jdField_a_of_type_ArrayOfByte.length) {
          ((ah)localObject).jdField_a_of_type_Int = (((ah)localObject).jdField_a_of_type_ArrayOfByte.length - 1);
        }
        ((ah)localObject).jdField_a_of_type_At = ((at)((ah)localObject).jdField_a_of_type_Au.a(((ah)localObject).jdField_a_of_type_Int));
      }
      paramInt.a(paramInt.jdField_a_of_type_At, false);
    }
  }
  
  public final void a(int paramInt1, int paramInt2) {}
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    return true;
  }
  
  public final void a(l paraml)
  {
    ba.a(paraml, "map");
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\be.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */