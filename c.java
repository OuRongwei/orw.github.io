public final class c
{
  a a;
  
  public final a a(long paramLong)
  {
    a locala;
    if ((locala = this.jdField_a_of_type_A) != null) {
      while (locala != null)
      {
        if (locala.jdField_a_of_type_Long == paramLong) {
          return locala;
        }
        if (paramLong > locala.jdField_a_of_type_Long) {
          locala = locala.b;
        } else {
          locala = locala.jdField_a_of_type_A;
        }
      }
    }
    return null;
  }
  
  public final void a()
  {
    b(this.jdField_a_of_type_A);
  }
  
  private final void b(a parama)
  {
    if (parama == null) {
      return;
    }
    b(parama.jdField_a_of_type_A);
    b(parama.b);
    a.a(parama);
  }
  
  public final void a(a parama)
  {
    if (parama == null) {
      return;
    }
    a(parama.jdField_a_of_type_A);
    a(parama.b);
    parama.c();
    if (((parama.j & 0x3) == 2) && (e.a(f.a, f.b, parama)))
    {
      if ((parama != e.a) && ((n.a(parama.jdField_a_of_type_ArrayOfByte, 20) & 0x10) == 0)) {}
      f.b(parama, ((parama.j & 0x298) != 0 ? 1 : 0) != 0);
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\c.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */