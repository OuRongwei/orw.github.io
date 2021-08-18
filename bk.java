import javax.microedition.lcdui.Graphics;

public final class bk
  extends ax
{
  public short m = 0;
  public byte c = 0;
  private String a;
  
  public bk(ba paramba)
  {
    this.g = 0;
    this.jdField_a_of_type_Ba = paramba;
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    if (!this.jdField_b_of_type_Boolean) {
      return parambg;
    }
    w.a(paramGraphics, this.jdField_b_of_type_Byte, this.jdField_b_of_type_Int, parambg.jdField_a_of_type_Short, parambg.b, this.f, this.g);
    if (((bi)this.jdField_a_of_type_Ba.jdField_a_of_type_Ba).jdField_a_of_type_JavaLangString.startsWith("g"))
    {
      bk localbk = this;
      Object localObject = new au();
      localObject = ax.a(localbk, (au)localObject);
      int k = -1;
      do
      {
        k++;
      } while (localbk.a().b != ((au)localObject).a(k));
      if ((k < ((au)localObject).jdField_a_of_type_Int ? 1 : 0) != 0)
      {
        if (((localObject = bc.a(((bi)this.jdField_a_of_type_Ba.jdField_a_of_type_Ba).jdField_a_of_type_JavaLangString, 1)) != null) && (((String)localObject).length() > 0)) {
          i = Byte.parseByte((String)localObject);
        } else {
          i = 6;
        }
        int j;
        if (((localObject = bc.a(((bi)this.jdField_a_of_type_Ba.jdField_a_of_type_Ba).jdField_a_of_type_JavaLangString, 2)) != null) && (((String)localObject).length() > 0)) {
          j = Integer.parseInt((String)localObject, 16);
        } else {
          j = 3099199;
        }
        w.a(paramGraphics, i, j, parambg.jdField_a_of_type_Short, parambg.b, this.f, this.g);
      }
    }
    if (this.jdField_a_of_type_JavaLangString != null) {
      if (this.jdField_a_of_type_Byte == 1) {
        ae.a(paramGraphics, parambg.jdField_a_of_type_Short + 20 + this.f >> 1, parambg.b + 1, this.jdField_a_of_type_JavaLangString, -1, 20);
      } else {
        ae.a(paramGraphics, parambg.jdField_a_of_type_Short + 10, parambg.b + 1, this.jdField_a_of_type_JavaLangString, -1, 17);
      }
    }
    this.e = parambg.b;
    for (int i = 0; i < this.jdField_a_of_type_Short; i++) {
      parambg = a(i).a(paramGraphics, parambg);
    }
    this.g = (parambg.b + parambg.c + 2 - this.e > this.g ? (short)(parambg.b + parambg.c + 1 - this.e) : this.g);
    bg tmp391_390 = parambg;
    tmp391_390.c = ((short)(tmp391_390.c + 1));
    return parambg;
  }
  
  public final void a(l paraml)
  {
    this.jdField_a_of_type_Int = paraml.jdField_a_of_type_Int;
    d(paraml);
    String str1;
    if (((str1 = paraml.a("w")) != null) && ((str1 = str1.trim()).length() != 0)) {
      try
      {
        if (str1.indexOf('%') >= 0)
        {
          str1 = str1.substring(0, str1.length() - 1);
          this.c = 1;
        }
        else
        {
          this.c = 2;
        }
        int i;
        if ((i = Integer.parseInt(str1)) < 100) {
          this.m = ((short)i);
        }
      }
      catch (Exception localException)
      {
        this.c = 0;
      }
    }
    String str2;
    if ((str2 = paraml.a("c")) != null) {
      this.jdField_b_of_type_Int = Integer.parseInt(str2, 16);
    }
    if ((str2 = paraml.a("bt")) != null) {
      this.jdField_b_of_type_Byte = Byte.parseByte(str2);
    }
    if ((this.jdField_a_of_type_JavaLangString = paraml.a("pl")) != null) {
      if (this.jdField_a_of_type_JavaLangString.equals("min")) {
        this.jdField_a_of_type_Byte = 1;
      } else if (this.jdField_a_of_type_JavaLangString.equals("s")) {
        this.jdField_a_of_type_Byte = 2;
      } else if (this.jdField_a_of_type_JavaLangString.equals("r")) {
        this.jdField_a_of_type_Byte = 3;
      }
    }
    this.jdField_a_of_type_JavaLangString = paraml.a("txt");
    do
    {
      paraml.a();
      str2 = paraml.jdField_a_of_type_JavaLangString;
      c(paraml);
      if (paraml.jdField_b_of_type_Int == 2)
      {
        b(paraml);
        paraml.a(3, str2);
      }
    } while ((paraml.jdField_b_of_type_Int != 3) || (!paraml.jdField_a_of_type_JavaLangString.equals("td")) || (this.jdField_a_of_type_Int != paraml.jdField_a_of_type_Int));
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bk.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */