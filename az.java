import javax.microedition.lcdui.Graphics;

public final class az
  extends ax
{
  private String a;
  public boolean a;
  private byte c = 7;
  
  public az(ba paramba)
  {
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_a_of_type_Boolean = false;
    this.a = paramba;
  }
  
  public final bg a(Graphics paramGraphics, bg parambg)
  {
    if (!this.jdField_b_of_type_Boolean) {
      return parambg;
    }
    c();
    if (this.a != null) {
      if (this.jdField_a_of_type_JavaLangString != null)
      {
        if (this.jdField_a_of_type_JavaLangString.indexOf('%') < 0)
        {
          this.jdField_h_of_type_Short = (this.f = Short.parseShort(this.jdField_a_of_type_JavaLangString));
          this.d = (this.jdField_b_of_type_Short = (short)(this.a.d + (this.a.jdField_h_of_type_Short - this.jdField_h_of_type_Short >> 1)));
        }
        else
        {
          this.jdField_h_of_type_Short = (this.f = (short)(this.a.jdField_h_of_type_Short * Integer.parseInt(this.jdField_a_of_type_JavaLangString.substring(0, this.jdField_a_of_type_JavaLangString.indexOf('%'))) / 100));
          this.d = (this.jdField_b_of_type_Short = (short)(this.a.d + (this.a.jdField_h_of_type_Short - this.jdField_h_of_type_Short >> 1)));
        }
      }
      else
      {
        this.jdField_h_of_type_Short = (this.f = this.a.jdField_h_of_type_Short);
        this.d = (this.jdField_b_of_type_Short = this.a.d);
      }
    }
    parambg.jdField_a_of_type_Short = this.a.d;
    bg tmp210_209 = parambg;
    tmp210_209.jdField_b_of_type_Short = ((short)(tmp210_209.jdField_b_of_type_Short + (short)(parambg.c + 3)));
    parambg.c = 0;
    for (int i = 0; i < this.jdField_a_of_type_Short; i++) {
      parambg = a(i).a(paramGraphics, parambg);
    }
    d();
    return parambg;
  }
  
  public final void a(l paraml)
  {
    this.jdField_a_of_type_Int = paraml.jdField_a_of_type_Int;
    this.jdField_a_of_type_JavaLangString = paraml.a("w");
    d(paraml);
    this.jdField_h_of_type_JavaLangString = paraml.a("tl");
    Object localObject;
    if ((localObject = paraml.a("ew")) != null) {
      this.c = Byte.parseByte((String)localObject);
    }
    (localObject = new av(this)).jdField_h_of_type_JavaLangString = this.jdField_h_of_type_JavaLangString;
    ((ba)localObject).jdField_b_of_type_Int = 12564849;
    ((av)localObject).b = "exp:";
    ((av)localObject).c(1);
    a((ba)localObject);
    a(new aw(this));
    do
    {
      paraml.a();
      localObject = paraml.jdField_a_of_type_JavaLangString;
      c(paraml);
      if (paraml.jdField_b_of_type_Int == 2)
      {
        b(paraml);
        paraml.a(3, (String)localObject);
      }
    } while ((paraml.jdField_b_of_type_Int != 3) || (!paraml.jdField_a_of_type_JavaLangString.equals("exp")) || (this.jdField_a_of_type_Int != paraml.jdField_a_of_type_Int));
    a(false);
  }
  
  public final void a(boolean paramBoolean)
  {
    this.jdField_a_of_type_Boolean = paramBoolean;
    Object localObject1 = new au();
    Object localObject2 = localObject1;
    localObject1 = this;
    int j = this.jdField_a_of_type_Short;
    for (int k = 0; k < j; k++)
    {
      ba localba = ((ax)localObject1).a(k);
      ((au)localObject2).a(localba);
    }
    ((ba)(localObject1 = localObject2).a(0)).c(this.jdField_a_of_type_Boolean ? 2 : 1);
    int i = 0;
    for (;;)
    {
      i++;
      if (i >= ((au)localObject1).jdField_a_of_type_Int) {
        break;
      }
      ((ba)((au)localObject1).a(i)).b(paramBoolean);
      ((ba)((au)localObject1).a(i)).k = ((short)this.c);
      ((ba)((au)localObject1).a(i)).l = ((short)-this.c);
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\az.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */