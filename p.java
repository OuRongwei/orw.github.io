public final class p
{
  final n[] jdField_a_of_type_ArrayOfN;
  final n[] jdField_b_of_type_ArrayOfN;
  final n jdField_a_of_type_N;
  volatile int jdField_a_of_type_Int;
  volatile int jdField_b_of_type_Int;
  volatile int c;
  int d;
  final q jdField_a_of_type_Q;
  
  public p(q paramq)
  {
    this.jdField_a_of_type_Q = paramq;
    this.jdField_a_of_type_ArrayOfN = new n[5];
    this.jdField_b_of_type_ArrayOfN = new n[30];
    paramq = -1;
    for (;;)
    {
      paramq++;
      if (paramq >= this.jdField_a_of_type_ArrayOfN.length) {
        break;
      }
      this.jdField_a_of_type_ArrayOfN[paramq] = new n(256);
    }
    paramq = -1;
    for (;;)
    {
      paramq++;
      if (paramq >= this.jdField_b_of_type_ArrayOfN.length) {
        break;
      }
      this.jdField_b_of_type_ArrayOfN[paramq] = new n(256);
    }
    this.jdField_a_of_type_N = new n(1024);
  }
  
  public final n a(int paramInt)
  {
    int i = this.jdField_b_of_type_Int;
    while ((i + 1) % this.jdField_b_of_type_ArrayOfN.length == this.c) {
      try
      {
        Thread.sleep(10L);
      }
      catch (Exception localException) {}
    }
    if (this.jdField_b_of_type_ArrayOfN[i].a.length < paramInt)
    {
      int j = (i + 1) % this.jdField_b_of_type_ArrayOfN.length;
      int k = this.c;
      while (j != k)
      {
        if (this.jdField_b_of_type_ArrayOfN[j].a.length >= paramInt)
        {
          n localn = this.jdField_b_of_type_ArrayOfN[i];
          this.jdField_b_of_type_ArrayOfN[i] = this.jdField_b_of_type_ArrayOfN[j];
          this.jdField_b_of_type_ArrayOfN[j] = localn;
          break;
        }
        j++;
        if (j == this.jdField_b_of_type_ArrayOfN.length) {
          j = 0;
        }
      }
      if (this.jdField_b_of_type_ArrayOfN[i].a.length < paramInt) {
        this.jdField_b_of_type_ArrayOfN[i].a = new byte[paramInt];
      }
    }
    this.jdField_b_of_type_ArrayOfN[i].a();
    return this.jdField_b_of_type_ArrayOfN[i];
  }
  
  public p() {}
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\p.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */