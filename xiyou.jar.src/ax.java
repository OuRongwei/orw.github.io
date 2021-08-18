public abstract class ax
  extends ba
{
  public ba[] a;
  public short a;
  public int a;
  
  public ax()
  {
    this.jdField_a_of_type_ArrayOfBa = null;
    this.jdField_a_of_type_Short = 0;
    this.jdField_a_of_type_Int = 0;
    this.jdField_a_of_type_ArrayOfBa = new ba[4];
    this.jdField_a_of_type_Short = 0;
    this.jdField_a_of_type_Int = -1;
  }
  
  public void a(ba paramba)
  {
    if (this.jdField_a_of_type_ArrayOfBa.length <= this.jdField_a_of_type_Short) {
      b();
    }
    this.jdField_a_of_type_ArrayOfBa[this.jdField_a_of_type_Short] = paramba;
    this.jdField_a_of_type_Short = ((short)(this.jdField_a_of_type_Short + 1));
    paramba.a = this;
  }
  
  public final void b(ba paramba)
  {
    int i = 0;
    for (int j = 0; j < this.jdField_a_of_type_Short; j++) {
      if ((this.jdField_a_of_type_ArrayOfBa[j] == paramba) || (i != 0))
      {
        i = 1;
        if (j + 1 < this.jdField_a_of_type_ArrayOfBa.length) {
          this.jdField_a_of_type_ArrayOfBa[j] = this.jdField_a_of_type_ArrayOfBa[(j + 1)];
        }
      }
      else if ((this.jdField_a_of_type_ArrayOfBa[j] instanceof ax))
      {
        ((ax)this.jdField_a_of_type_ArrayOfBa[j]).b(paramba);
      }
    }
    if (i != 0)
    {
      this.jdField_a_of_type_Short = ((short)(this.jdField_a_of_type_Short - 1));
      bb localbb;
      (localbb = paramba.a()).c(null);
      paramba = new au();
      a(localbb, paramba);
      if (paramba.jdField_a_of_type_Int > 0) {
        localbb.c((ba)paramba.a(0));
      }
    }
  }
  
  public final ba a(int paramInt)
  {
    if ((this.jdField_a_of_type_Short > paramInt) && (paramInt >= 0)) {
      return this.jdField_a_of_type_ArrayOfBa[paramInt];
    }
    return null;
  }
  
  public final int a(ba paramba)
  {
    for (int i = 0; i < this.jdField_a_of_type_Short; i++) {
      if (this.jdField_a_of_type_ArrayOfBa[i] == paramba) {
        return i;
      }
    }
    return -1;
  }
  
  public final void b(l paraml)
  {
    String str;
    Object localObject;
    if ((str = paraml.a).equals("br"))
    {
      localObject = new aw(this);
      ba.a(paraml, "br");
      a((ba)localObject);
      return;
    }
    if (str.equals("a"))
    {
      (localObject = new av(this)).a(paraml);
      a((ba)localObject);
      return;
    }
    if (str.equals("i"))
    {
      (localObject = new bd(this)).a(paraml);
      a((ba)localObject);
      return;
    }
    if (str.equals("tb"))
    {
      (localObject = new bi(this)).a(paraml);
      if (d.jdField_a_of_type_Int > 330)
      {
        Object tmp126_125 = localObject;
        tmp126_125.f = ((short)(tmp126_125.f + ((ba)localObject).f * 3 / 10));
        ((ba)localObject).f = (((ba)localObject).f > d.jdField_a_of_type_Int ? (short)d.jdField_a_of_type_Int : ((ba)localObject).f);
        Object tmp170_169 = localObject;
        tmp170_169.jdField_g_of_type_Short = ((short)(tmp170_169.jdField_g_of_type_Short + ((ba)localObject).jdField_g_of_type_Short * 3 / 10));
        ((ba)localObject).jdField_g_of_type_Short = (((ba)localObject).jdField_g_of_type_Short > d.b ? (short)d.b : ((ba)localObject).jdField_g_of_type_Short);
      }
      a((ba)localObject);
      return;
    }
    if (str.equals("tr"))
    {
      (localObject = new bl(this)).a(paraml);
      a((ba)localObject);
      return;
    }
    if (str.equals("td"))
    {
      (localObject = new bk(this)).a(paraml);
      a((ba)localObject);
    }
    if (str.equals("ddl"))
    {
      (localObject = new ay(this)).a(paraml);
      a((ba)localObject);
    }
    if (str.equals("map"))
    {
      localObject = new be(this);
      ba.a(paraml, "map");
      a((ba)localObject);
    }
  }
  
  public final void c(l paraml)
  {
    if (((paraml = paraml.b()) != null) && ((paraml = paraml.replace('\n', ' ').replace('\r', ' ').trim()).length() > 0))
    {
      av localav;
      (localav = new av(this)).h = paraml;
      a(localav);
    }
  }
  
  public final void b()
  {
    ba[] arrayOfba = new ba[this.jdField_a_of_type_ArrayOfBa.length << 1];
    System.arraycopy(this.jdField_a_of_type_ArrayOfBa, 0, arrayOfba, 0, this.jdField_a_of_type_Short);
    this.jdField_a_of_type_ArrayOfBa = arrayOfba;
  }
  
  public final ba a(String paramString)
  {
    if ((this.jdField_g_of_type_JavaLangString != null) && (this.jdField_g_of_type_JavaLangString.equals(paramString))) {
      return this;
    }
    for (int i = 0; i < this.jdField_a_of_type_Short; i++)
    {
      ba localba;
      if ((localba = a(i).a(paramString)) != null) {
        return localba;
      }
    }
    return null;
  }
  
  public static au a(ax paramax, au paramau)
  {
    if (paramau == null) {
      paramau = new au();
    }
    int i = paramax.jdField_a_of_type_Short;
    for (int j = 0; j < i; j++)
    {
      ba localba;
      if (((localba = paramax.a(j)).a()) && (localba.c())) {
        paramau.a(localba);
      } else if (((localba instanceof ax)) && (localba.c())) {
        a((ax)localba, paramau);
      }
    }
    return paramau;
  }
  
  public static au b(ax paramax, au paramau)
  {
    if (paramau == null) {
      paramau = new au();
    }
    int i = paramax.jdField_a_of_type_Short;
    for (int j = 0; j < i; j++)
    {
      ba localba;
      if (((localba = paramax.a(j)).b()) && (localba.c())) {
        paramau.a(localba);
      } else if (((localba instanceof ax)) && (localba.c())) {
        b((ax)localba, paramau);
      }
    }
    return paramau;
  }
  
  public static au c(ax paramax, au paramau)
  {
    if (paramau == null) {
      paramau = new au();
    }
    int i = paramax.jdField_a_of_type_Short;
    for (int j = 0; j < i; j++)
    {
      ba localba;
      if (((localba = paramax.a(j)).b()) && (localba.c())) {
        paramau.a(localba);
      } else if (((localba instanceof ax)) && (localba.c())) {
        c((ax)localba, paramau);
      }
    }
    return paramau;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ax.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */