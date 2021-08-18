public final class v
{
  public int a;
  public int b;
  public v a;
  public w[] a;
  
  public final int a()
  {
    switch (this.jdField_a_of_type_Int)
    {
    case 0: 
      break;
    case 1: 
      if (this.b == 0)
      {
        if (this.jdField_a_of_type_ArrayOfW[this.b].a() == 3) {
          a(2);
        }
      }
      else if (this.jdField_a_of_type_ArrayOfW[this.b].a() == 3)
      {
        this.b += 1;
        if (this.b >= this.jdField_a_of_type_ArrayOfW.length) {
          this.b = 0;
        } else {
          this.jdField_a_of_type_ArrayOfW[this.b].a(1);
        }
      }
      break;
    }
    int i = this.jdField_a_of_type_Int;
    if (this.jdField_a_of_type_V != null) {
      i &= this.jdField_a_of_type_V.a();
    }
    return i;
  }
  
  public final void a(int paramInt)
  {
    for (;;)
    {
      this.jdField_a_of_type_Int = paramInt;
      switch (paramInt)
      {
      case 1: 
        this.jdField_a_of_type_ArrayOfW[this.b].a(1);
        if (this.jdField_a_of_type_V == null) {
          return;
        }
        paramInt = 1;
        this = this.jdField_a_of_type_V;
      }
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\v.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */