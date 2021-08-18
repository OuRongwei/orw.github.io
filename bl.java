import javax.microedition.lcdui.Graphics;

public final class bl
  extends ax
{
  private String jdField_a_of_type_JavaLangString = null;
  private static boolean jdField_a_of_type_Boolean = true;
  
  public bl(ba paramba)
  {
    this.a = paramba;
    this.g = 0;
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    if (!this.jdField_b_of_type_Boolean) {
      return parambg;
    }
    c();
    this.f = this.a.h;
    this.h = ((short)(this.f - 2));
    this.d = ((short)(this.a.d + 1));
    this.jdField_b_of_type_Short = this.a.d;
    int k = parambg.jdField_b_of_type_Short;
    int m = 0;
    int n;
    if ((n = this.jdField_a_of_type_Short) > 0)
    {
      int[] arrayOfInt = new int[n];
      int i = 0;
      int i1 = 0;
      for (int i2 = 0; i2 < n; i2++)
      {
        bk localbk2;
        if ((localbk2 = (bk)a(i2)).c == 1)
        {
          arrayOfInt[i2] = (this.h * localbk2.m / 100);
          i += arrayOfInt[i2];
          i1++;
          localbk2.f = ((short)arrayOfInt[i2]);
        }
        else if (localbk2.c == 2)
        {
          arrayOfInt[i2] = localbk2.m;
          i += arrayOfInt[i2];
          localbk2.f = ((short)arrayOfInt[i2]);
          i1++;
        }
      }
      if (n - i1 > 0)
      {
        i4 = (this.h - i) / (n - i1);
        for (i = 0; i < n; i++)
        {
          bk localbk1 = (bk)a(i);
          if (arrayOfInt[i] == 0)
          {
            arrayOfInt[i] = i4;
            localbk1.f = ((short)arrayOfInt[i]);
          }
        }
      }
      int i3 = 0;
      if (this.jdField_a_of_type_JavaLangString != null) {
        try
        {
          i3 = Integer.parseInt(this.jdField_a_of_type_JavaLangString);
        }
        catch (NumberFormatException localNumberFormatException) {}
      }
      int i4 = this.jdField_b_of_type_Short;
      w.a(paramGraphics, this.jdField_b_of_type_Byte, this.jdField_b_of_type_Int, this.jdField_b_of_type_Short, parambg.jdField_b_of_type_Short, this.f, this.g);
      Object localObject2;
      int i5;
      if (((bi)this.a).jdField_a_of_type_JavaLangString.startsWith("l"))
      {
        Object localObject1 = this;
        localObject2 = new au();
        localObject2 = ax.c((ax)localObject1, (au)localObject2);
        i5 = -1;
        do
        {
          i5++;
        } while (((ba)localObject1).a().b != ((au)localObject2).a(i5));
        if ((i5 < ((au)localObject2).jdField_a_of_type_Int ? 1 : 0) != 0)
        {
          if (((localObject1 = bc.a(((bi)this.a).jdField_a_of_type_JavaLangString, 1)) != null) && (((String)localObject1).length() > 0)) {
            j = Byte.parseByte((String)localObject1);
          } else {
            j = 6;
          }
          bc.a(((bi)this.a).jdField_a_of_type_JavaLangString, 2);
          w.a(paramGraphics, j, 6650752, this.jdField_b_of_type_Short + 3, parambg.jdField_b_of_type_Short + 2, this.f - 6, this.g - 2);
        }
      }
      for (int j = 0; j < n; j++)
      {
        (localObject2 = a(j)).jdField_b_of_type_Short = ((short)i4);
        ((ba)localObject2).c = k;
        ((ba)localObject2).d = ((ba)localObject2).jdField_b_of_type_Short;
        ((ba)localObject2).e = ((ba)localObject2).c;
        if (jdField_a_of_type_Boolean)
        {
          Object tmp554_552 = localObject2;
          tmp554_552.d = ((short)(tmp554_552.d + 1));
          Object tmp566_564 = localObject2;
          tmp566_564.e = ((short)(tmp566_564.e + 1));
        }
        ((ba)localObject2).f = ((short)arrayOfInt[j]);
        ((ba)localObject2).h = ((short)(((ba)localObject2).f - 2));
        i4 += ((ba)localObject2).f;
        parambg.jdField_a_of_type_Short = ((ba)localObject2).d;
        parambg.jdField_b_of_type_Short = ((ba)localObject2).e;
        parambg.c = 0;
        if ((i5 = (parambg = ((ba)localObject2).a(paramGraphics, parambg)).jdField_b_of_type_Short + parambg.c - k) <= 0) {
          i5 = 1;
        }
        if (m < i5) {
          m = i5;
        }
        if (m < i3) {
          m = i3;
        }
        ((ba)localObject2).i = ((short)m);
      }
      this.g = (m > this.g ? (short)m : this.g);
      parambg.jdField_b_of_type_Short = k;
      parambg.c = ((short)m);
      i4 = this.jdField_b_of_type_Short;
      if (parambg.a())
      {
        paramGraphics.setColor(28, 57, 37);
        for (j = 0; j < n; j++)
        {
          ((bk)a(j)).i = ((short)m);
          if (((bi)this.a).jdField_a_of_type_JavaLangString.equals(""))
          {
            paramGraphics.drawRect(i4, k, arrayOfInt[j], m);
            i4 += arrayOfInt[j];
          }
        }
      }
    }
    parambg.jdField_a_of_type_Short = this.a.d;
    parambg.jdField_b_of_type_Short = ((short)(k + m));
    parambg.c = 0;
    d();
    return parambg;
  }
  
  public final void a(l paraml)
  {
    this.jdField_a_of_type_Int = paraml.jdField_a_of_type_Int;
    d(paraml);
    this.jdField_a_of_type_JavaLangString = paraml.a("h");
    String str;
    if ((str = paraml.a("c")) != null) {
      this.jdField_b_of_type_Int = Integer.parseInt(str, 16);
    }
    if ((str = paraml.a("bt")) != null) {
      this.jdField_b_of_type_Byte = Byte.parseByte(str);
    }
    do
    {
      paraml.a();
      str = paraml.jdField_a_of_type_JavaLangString;
      if (paraml.jdField_b_of_type_Int == 2)
      {
        b(paraml);
        paraml.a(3, str);
      }
    } while ((paraml.jdField_b_of_type_Int != 3) || (!paraml.jdField_a_of_type_JavaLangString.equals("tr")) || (this.jdField_a_of_type_Int != paraml.jdField_a_of_type_Int));
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bl.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */