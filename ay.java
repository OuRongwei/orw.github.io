import javax.microedition.lcdui.Graphics;

public final class ay
  extends ba
{
  private String jdField_a_of_type_JavaLangString = null;
  private int jdField_a_of_type_Int;
  
  public ay(ba paramba)
  {
    this.a = paramba;
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    if (!this.jdField_b_of_type_Boolean) {
      return parambg;
    }
    if (this.f == Short.MIN_VALUE) {
      this.f = 80;
    }
    if (this.f > this.a.jdField_h_of_type_Short) {
      this.f = this.a.jdField_h_of_type_Short;
    }
    this.jdField_b_of_type_Short = parambg.a;
    this.jdField_c_of_type_Short = parambg.jdField_b_of_type_Short;
    if (parambg.a + this.f >= this.a.d + this.a.jdField_h_of_type_Short)
    {
      bg tmp94_93 = parambg;
      tmp94_93.jdField_b_of_type_Short = ((short)(tmp94_93.jdField_b_of_type_Short + parambg.jdField_c_of_type_Short));
      parambg.a = this.a.d;
    }
    if (parambg.a())
    {
      if (a().b == this) {
        paramGraphics.setColor(255, 255, 255);
      } else {
        paramGraphics.setColor(67, 94, 83);
      }
      paramGraphics.fillRect(parambg.a, parambg.jdField_b_of_type_Short, this.f, bg.jdField_b_of_type_Byte + 1);
      int i = paramGraphics.getClipX();
      int j = paramGraphics.getClipY();
      int k = paramGraphics.getClipWidth();
      int m = paramGraphics.getClipHeight();
      paramGraphics.clipRect(parambg.a, parambg.jdField_b_of_type_Short >= a().e ? parambg.jdField_b_of_type_Short : a().e, this.f, parambg.jdField_b_of_type_Short + bg.jdField_b_of_type_Byte + 1 <= a().e + a().i ? bg.jdField_b_of_type_Byte + 1 : a().e + a().i - parambg.jdField_b_of_type_Short);
      paramGraphics.setColor(0);
      paramGraphics.drawString(this.jdField_h_of_type_JavaLangString, parambg.a + 3, parambg.jdField_b_of_type_Short + 1, 20);
      paramGraphics.setColor(0);
      paramGraphics.drawRect(parambg.a, parambg.jdField_b_of_type_Short, this.f - 1, bg.jdField_b_of_type_Byte);
      paramGraphics.drawRect(parambg.a - 1, parambg.jdField_b_of_type_Short - 1, this.f + 1, bg.jdField_b_of_type_Byte + 2);
      f.a(paramGraphics, e.a(9), this.f + parambg.a - 16, parambg.jdField_b_of_type_Short + 3, 0, 0, 11, 11, 0);
      if (parambg.jdField_c_of_type_Short < bg.jdField_b_of_type_Byte + 1) {
        parambg.jdField_c_of_type_Short = ((short)(bg.jdField_b_of_type_Byte + 1));
      }
      paramGraphics.setClip(i, j, k, m);
    }
    this.jdField_g_of_type_Short = parambg.jdField_c_of_type_Short;
    bg tmp458_457 = parambg;
    tmp458_457.a = ((short)(tmp458_457.a + (short)(this.f + 3)));
    return parambg;
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final void b(int paramInt)
  {
    bb localbb = null;
    if ((a().jdField_a_of_type_Bc != null) && (paramInt == 4))
    {
      (localbb = b().b(this.jdField_g_of_type_JavaLangString + "_ddl")).jdField_g_of_type_Short = ((short)((bg.jdField_b_of_type_Byte + 2) * (this.jdField_a_of_type_Int < 6 ? this.jdField_a_of_type_Int : 6) + 8));
      if ((paramInt = d.jdField_b_of_type_Int - this.jdField_g_of_type_Short - this.jdField_c_of_type_Short) < bg.jdField_b_of_type_Byte + 2 + 8)
      {
        if (localbb.jdField_g_of_type_Short > this.jdField_c_of_type_Short) {
          localbb.jdField_g_of_type_Short = this.jdField_c_of_type_Short;
        }
        b().c(localbb);
        localbb.b(this.jdField_b_of_type_Short, this.jdField_c_of_type_Short - localbb.jdField_g_of_type_Short);
        return;
      }
      if (paramInt < localbb.jdField_g_of_type_Short) {
        localbb.jdField_g_of_type_Short = ((short)paramInt);
      }
      b().c(localbb);
    }
  }
  
  public final void a(l paraml)
  {
    if ((str = paraml.a("w")) != null) {
      this.f = Short.parseShort(str);
    }
    d(paraml);
    if ((str = paraml.a("num")) != null) {
      this.jdField_c_of_type_Int = Integer.parseInt(str);
    }
    String str = paraml.a("list");
    a(str);
    this.jdField_a_of_type_JavaLangString = paraml.a("ocg");
    ba.a(paraml, "ddl");
  }
  
  public final void a(String paramString)
  {
    paramString = new StringBuffer(paramString);
    au localau = new au();
    String str = null;
    while (((str = av.a(paramString)) != null) && (str.length() > 0)) {
      localau.a(str);
    }
    if ((paramString = localau.jdField_a_of_type_Int) == 0) {
      return;
    }
    this.jdField_a_of_type_Int = paramString;
    if (paramString > 6) {
      paramString = 6;
    }
    bb localbb;
    if ((localbb = b().a(this.jdField_g_of_type_JavaLangString + "_ddl")) == null)
    {
      localbb = new bb(b().jdField_a_of_type_Bc);
    }
    else
    {
      localbb.a = 0;
      this.jdField_c_of_type_Int = -1;
    }
    localbb.jdField_a_of_type_Bb.b = null;
    localbb.jdField_g_of_type_Short = ((short)(paramString * (bg.jdField_b_of_type_Byte + 2) + 8));
    paramString = new bi(localbb);
    this.jdField_g_of_type_JavaLangString += "_ddl";
    localbb.jdField_a_of_type_JavaLangString = "ddl";
    localbb.jdField_b_of_type_Byte = 4;
    localbb.jdField_b_of_type_Int = 0;
    int j = -1;
    int i;
    for (;;)
    {
      j++;
      if (j >= localau.jdField_a_of_type_Int) {
        break;
      }
      bl localbl = new bl(paramString);
      bk localbk = new bk(localbl);
      av localav = new av(localbk);
      if ((i = (str = (String)localau.a(j)).indexOf("|")) >= 0)
      {
        localav.jdField_h_of_type_JavaLangString = str.substring(0, i);
        localav.jdField_c_of_type_Int = Integer.parseInt(str.substring(i + 1));
      }
      else
      {
        localav.jdField_h_of_type_JavaLangString = str;
      }
      str = str.replace('|', ':');
      localav.b = ("g:ddl:" + b().jdField_g_of_type_JavaLangString + ":" + this.jdField_g_of_type_JavaLangString + ":" + str);
      localav.c = "back()";
      localbk.a(localav);
      localbl.a(localbk);
      paramString.a(localbl);
    }
    paramString.jdField_a_of_type_JavaLangString = "l";
    localbb.a(paramString);
    if (b().a(this.jdField_g_of_type_JavaLangString + "_ddl") == null) {
      b().b(localbb);
    }
    if (this.jdField_c_of_type_Int == -1)
    {
      if ((i = (str = (String)localau.a(0)).indexOf("|")) >= 0)
      {
        this.jdField_h_of_type_JavaLangString = str.substring(0, i);
        this.jdField_c_of_type_Int = Integer.parseInt(str.substring(i + 1));
        return;
      }
      this.jdField_h_of_type_JavaLangString = str;
      this.jdField_c_of_type_Int = 0;
      return;
    }
    a(this.jdField_c_of_type_Int);
  }
  
  public final void a(int paramInt)
  {
    Object localObject;
    if ((localObject = b().a(this.jdField_g_of_type_JavaLangString + "_ddl")) != null)
    {
      localObject = ax.a((ax)localObject, null);
      int i = -1;
      do
      {
        i++;
        if (i >= ((au)localObject).jdField_a_of_type_Int) {
          break;
        }
      } while (((av)((au)localObject).a(i)).jdField_c_of_type_Int != paramInt);
      this.jdField_h_of_type_JavaLangString = ((av)((au)localObject).a(i)).jdField_h_of_type_JavaLangString;
      this.jdField_c_of_type_Int = paramInt;
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    b().c(b().b(this.jdField_g_of_type_JavaLangString + "_ddl"));
  }
  
  public final boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 > this.jdField_b_of_type_Short) && (paramInt2 > this.jdField_c_of_type_Short) && (paramInt1 < this.jdField_b_of_type_Short + this.f) && (paramInt2 < this.jdField_c_of_type_Short + this.jdField_g_of_type_Short);
  }
  
  private bb b()
  {
    for (Object localObject = this; !(localObject instanceof bb); localObject = ((ba)localObject).a) {}
    return (bb)localObject;
  }
  
  public final void d(int paramInt)
  {
    this.jdField_c_of_type_Int = paramInt;
    if (this.jdField_a_of_type_JavaLangString != null) {
      b().a().a(this.jdField_a_of_type_JavaLangString);
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ay.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */