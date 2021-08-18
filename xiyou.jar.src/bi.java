import javax.microedition.lcdui.Graphics;

public final class bi
  extends ax
{
  public String a;
  private short m = -1;
  private String b = null;
  private short n = -1;
  private String c = null;
  
  public bi(ba paramba)
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
    if (this.a != null)
    {
      if (this.b != null)
      {
        if (this.m == -1)
        {
          if (this.b.indexOf('%') < 0)
          {
            this.h = (this.f = this.m = Short.parseShort(this.b));
            this.d = (this.jdField_b_of_type_Short = (short)(this.a.d + (this.a.h - this.h >> 1)));
          }
          else
          {
            this.h = (this.f = this.m = (short)(this.a.h * Integer.parseInt(this.b.substring(0, this.b.indexOf('%'))) / 100));
            this.d = (this.jdField_b_of_type_Short = (short)(this.a.d + (this.a.h - this.h >> 1)));
          }
        }
        else
        {
          this.h = (this.f = this.m);
          this.d = (this.jdField_b_of_type_Short = (short)(this.a.d + (this.a.h - this.h >> 1)));
        }
      }
      else
      {
        this.h = (this.f = this.a.h);
        this.d = (this.jdField_b_of_type_Short = this.a.d);
      }
      if (this.c != null) {
        if (this.n == -1)
        {
          if (this.c.indexOf('%') >= 0) {
            this.i = (this.g = this.n = (short)(this.a.i * Integer.parseInt(this.c.substring(0, this.c.indexOf('%'))) / 100));
          } else {
            this.i = (this.g = this.n = Short.parseShort(this.c));
          }
        }
        else {
          this.i = (this.g = this.n);
        }
      }
    }
    parambg.jdField_a_of_type_Short = this.a.d;
    bg tmp389_388 = parambg;
    tmp389_388.jdField_b_of_type_Short = ((short)(tmp389_388.jdField_b_of_type_Short + (short)(parambg.c + 1)));
    parambg.c = 0;
    this.e = (this.c = parambg.jdField_b_of_type_Short);
    if ((this.j == Short.MIN_VALUE) && (this.c != Short.MIN_VALUE)) {
      this.j = this.c;
    }
    int i = this.c > bb.c ? this.g : this.g - this.c + bb.c + 6;
    if (this.a.i == this.i) {
      w.a(paramGraphics, this.jdField_b_of_type_Byte, this.jdField_b_of_type_Int, this.jdField_b_of_type_Short, this.j, this.f, i);
    } else {
      w.a(paramGraphics, this.jdField_b_of_type_Byte, this.jdField_b_of_type_Int, this.jdField_b_of_type_Short, this.c, this.f, i);
    }
    bg tmp553_552 = parambg;
    tmp553_552.jdField_b_of_type_Short = ((short)(tmp553_552.jdField_b_of_type_Short + 2));
    for (i = 0; i < this.jdField_a_of_type_Short; i++) {
      parambg = a(i).a(paramGraphics, parambg);
    }
    this.g = (parambg.jdField_b_of_type_Short - this.c + 2 > this.g ? (short)(parambg.jdField_b_of_type_Short - this.c + 2) : this.g);
    if (parambg.jdField_b_of_type_Short - this.c - 2 < this.g) {
      parambg.jdField_b_of_type_Short = ((short)(this.c + this.g - 2));
    }
    d();
    return parambg;
  }
  
  public final ba a(ba paramba, byte paramByte)
  {
    ax localax1;
    paramba = (localax1 = (ax)(paramba = (ax)paramba.a).a).a(paramba);
    int i = a(localax1);
    ax localax2;
    if (paramByte == 0) {
      while (i >= 0) {
        if ((i >= 0) && (this.jdField_a_of_type_Short > 0))
        {
          i--;
          if (((localax2 = (ax)a(i)) != null) && (localax2.a(paramba) != null) && ((localax2 = (ax)localax2.a(paramba)) != null) && (localax2.jdField_a_of_type_Short > 0) && (localax2.a(0).a())) {
            return localax2.a(0);
          }
        }
      }
    }
    while ((paramByte == 1) && (i < this.jdField_a_of_type_Short))
    {
      i++;
      if ((i < this.jdField_a_of_type_Short) && (this.jdField_a_of_type_Short > 0) && ((localax2 = (ax)a(i)) != null) && (localax2.a(paramba) != null) && ((localax2 = (ax)localax2.a(paramba)) != null) && (localax2.jdField_a_of_type_Short > 0) && (localax2.a(0).a())) {
        return localax2.a(0);
      }
    }
    return this.a.a(this, paramByte);
  }
  
  public final void a(l paraml)
  {
    this.jdField_a_of_type_Int = paraml.jdField_a_of_type_Int;
    this.jdField_a_of_type_JavaLangString = paraml.a("ln");
    if (this.jdField_a_of_type_JavaLangString == null) {
      this.jdField_a_of_type_JavaLangString = "l";
    }
    this.b = paraml.a("w");
    this.c = paraml.a("h");
    d(paraml);
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
    } while ((paraml.jdField_b_of_type_Int != 3) || (!paraml.jdField_a_of_type_JavaLangString.equals("tb")) || (this.jdField_a_of_type_Int != paraml.jdField_a_of_type_Int));
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bi.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */