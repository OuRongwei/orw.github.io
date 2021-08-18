import javax.microedition.lcdui.Graphics;

public final class bh
  extends bb
{
  public bg b = null;
  public int d = 0;
  
  public bh()
  {
    this.g = 0;
  }
  
  public bh(String paramString)
  {
    this.g = 0;
    try
    {
      a(bc.a(paramString), "show");
      return;
    }
    catch (Exception localException) {}
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    int i = paramGraphics.getClipX();
    int j = paramGraphics.getClipY();
    int k = paramGraphics.getClipWidth();
    int m = paramGraphics.getClipHeight();
    paramGraphics.setClip(Math.max(i, this.jdField_b_of_type_Short), Math.max(j, this.c), Math.min(k, this.f), Math.min(m, this.g));
    w.a(paramGraphics, this.jdField_b_of_type_Byte, this.jdField_b_of_type_Int, this.jdField_b_of_type_Short, this.c, this.f, this.g);
    parambg.c = 0;
    for (int n = 0; n < this.jdField_a_of_type_Short; n++) {
      parambg = a(n).a(paramGraphics, parambg);
    }
    paramGraphics.setClip(i, j, k, m);
    if (this.g == 0)
    {
      this.g = ((short)(parambg.jdField_b_of_type_Short + parambg.c - this.d + 2));
      this.i = this.g;
    }
    return parambg;
  }
  
  public final void a(l paraml)
  {
    this.jdField_a_of_type_Int = paraml.jdField_a_of_type_Int;
    int i = 0;
    int j = 0;
    int k = paraml.c;
    String str1;
    for (int m = 0; m < k; m++)
    {
      str1 = paraml.a(m);
      String str2 = paraml.b(m);
      if (str1.equals("w")) {
        if (str2.indexOf('%') >= 0)
        {
          str2 = str2.trim();
          this.f = ((short)(Short.parseShort(str2.substring(0, str2.length() - 1)) * bc.d / 100));
        }
        else
        {
          this.f = Short.parseShort(str2);
        }
      }
      if (str1.equals("h")) {
        if (str2.indexOf('%') >= 0)
        {
          str2 = str2.trim();
          this.g = ((short)(Short.parseShort(str2.substring(0, str2.length() - 1)) * bc.d / 100));
        }
        else
        {
          this.g = Short.parseShort(str2);
        }
      }
      if (str1.equals("x")) {
        i = Short.parseShort(str2);
      }
      if (str1.equals("y")) {
        j = Short.parseShort(str2);
      }
      if (str1.equals("c")) {
        this.jdField_b_of_type_Int = Integer.parseInt(str2, 16);
      }
      if (str1.equals("bt")) {
        this.jdField_b_of_type_Byte = Byte.parseByte(str2);
      }
    }
    do
    {
      paraml.a();
      str1 = paraml.jdField_a_of_type_JavaLangString;
      c(paraml);
      if (paraml.jdField_b_of_type_Int == 2)
      {
        b(paraml);
        paraml.a(3, str1);
      }
    } while ((paraml.jdField_b_of_type_Int != 3) || (!paraml.jdField_a_of_type_JavaLangString.equals("show")) || (this.jdField_a_of_type_Int != paraml.jdField_a_of_type_Int));
    b(i, j);
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.jdField_b_of_type_Short = ((short)paramInt1);
    this.c = ((short)paramInt2);
    this.d = this.jdField_b_of_type_Short;
    this.h = this.f;
    this.e = this.c;
    this.i = this.g;
    this.d = ((short)(this.d + 3));
    this.h = ((short)(this.h - 2));
    this.d = this.e;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bh.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */