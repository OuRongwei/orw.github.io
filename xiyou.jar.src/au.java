import java.util.NoSuchElementException;

public final class au
{
  private Object[] a;
  public int a;
  private int b;
  
  public au(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      throw new IllegalArgumentException("Illegal Capacity: " + paramInt1);
    }
    this.jdField_a_of_type_ArrayOfJavaLangObject = new Object[paramInt1];
    this.b = paramInt2;
  }
  
  public au(int paramInt)
  {
    this(paramInt, 0);
  }
  
  public au()
  {
    this(10);
  }
  
  public final void a(Object[] paramArrayOfObject)
  {
    int i = this.jdField_a_of_type_Int;
    while (i-- > 0) {
      paramArrayOfObject[i] = this.jdField_a_of_type_ArrayOfJavaLangObject[i];
    }
  }
  
  private void c(int paramInt)
  {
    int i = this.jdField_a_of_type_ArrayOfJavaLangObject.length;
    Object[] arrayOfObject = this.jdField_a_of_type_ArrayOfJavaLangObject;
    if (i += this.b < paramInt) {
      i = paramInt;
    }
    this.jdField_a_of_type_ArrayOfJavaLangObject = new Object[i];
    System.arraycopy(arrayOfObject, 0, this.jdField_a_of_type_ArrayOfJavaLangObject, 0, this.jdField_a_of_type_Int);
  }
  
  public final void a(int paramInt)
  {
    if ((paramInt > this.jdField_a_of_type_Int) && (paramInt > this.jdField_a_of_type_ArrayOfJavaLangObject.length)) {
      c(paramInt);
    } else {
      for (int i = paramInt; i < this.jdField_a_of_type_Int; i++) {
        this.jdField_a_of_type_ArrayOfJavaLangObject[i] = null;
      }
    }
    this.jdField_a_of_type_Int = paramInt;
  }
  
  public final int a()
  {
    return this.jdField_a_of_type_Int;
  }
  
  public final boolean a(Object paramObject)
  {
    return a(paramObject) >= 0;
  }
  
  public final int a(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      for (i = 0; i < this.jdField_a_of_type_Int; i++) {
        if (this.jdField_a_of_type_ArrayOfJavaLangObject[i] == null) {
          return i;
        }
      }
    } else {
      for (i = 0; i < this.jdField_a_of_type_Int; i++) {
        if (paramObject.equals(this.jdField_a_of_type_ArrayOfJavaLangObject[i])) {
          return i;
        }
      }
    }
    return -1;
  }
  
  public final Object a(int paramInt)
  {
    if (paramInt >= this.jdField_a_of_type_Int) {
      throw new ArrayIndexOutOfBoundsException(paramInt + " >= " + this.jdField_a_of_type_Int);
    }
    try
    {
      return this.jdField_a_of_type_ArrayOfJavaLangObject[paramInt];
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new ArrayIndexOutOfBoundsException(paramInt + " < 0");
    }
  }
  
  public final Object a()
  {
    if (this.jdField_a_of_type_Int == 0) {
      throw new NoSuchElementException();
    }
    return this.jdField_a_of_type_ArrayOfJavaLangObject[0];
  }
  
  public final Object b()
  {
    if (this.jdField_a_of_type_Int == 0) {
      throw new NoSuchElementException();
    }
    return this.jdField_a_of_type_ArrayOfJavaLangObject[(this.jdField_a_of_type_Int - 1)];
  }
  
  public final void a(Object paramObject, int paramInt)
  {
    if (paramInt >= this.jdField_a_of_type_Int) {
      throw new ArrayIndexOutOfBoundsException(paramInt + " >= " + this.jdField_a_of_type_Int);
    }
    this.jdField_a_of_type_ArrayOfJavaLangObject[paramInt] = paramObject;
  }
  
  public final void b(int paramInt)
  {
    if (paramInt >= this.jdField_a_of_type_Int) {
      throw new ArrayIndexOutOfBoundsException(paramInt + " >= " + this.jdField_a_of_type_Int);
    }
    if (paramInt < 0) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    int i;
    if ((i = this.jdField_a_of_type_Int - paramInt - 1) > 0) {
      System.arraycopy(this.jdField_a_of_type_ArrayOfJavaLangObject, paramInt + 1, this.jdField_a_of_type_ArrayOfJavaLangObject, paramInt, i);
    }
    this.jdField_a_of_type_Int -= 1;
    this.jdField_a_of_type_ArrayOfJavaLangObject[this.jdField_a_of_type_Int] = null;
  }
  
  public final void b(Object paramObject, int paramInt)
  {
    int i = this.jdField_a_of_type_Int + 1;
    if (paramInt >= i) {
      throw new ArrayIndexOutOfBoundsException(paramInt + " > " + this.jdField_a_of_type_Int);
    }
    if (i > this.jdField_a_of_type_ArrayOfJavaLangObject.length) {
      c(i);
    }
    System.arraycopy(this.jdField_a_of_type_ArrayOfJavaLangObject, paramInt, this.jdField_a_of_type_ArrayOfJavaLangObject, paramInt + 1, this.jdField_a_of_type_Int - paramInt);
    this.jdField_a_of_type_ArrayOfJavaLangObject[paramInt] = paramObject;
    this.jdField_a_of_type_Int += 1;
  }
  
  public final void a(Object paramObject)
  {
    int i;
    if ((i = this.jdField_a_of_type_Int + 1) > this.jdField_a_of_type_ArrayOfJavaLangObject.length) {
      c(i);
    }
    this.jdField_a_of_type_ArrayOfJavaLangObject[(this.jdField_a_of_type_Int++)] = paramObject;
  }
  
  public final void a()
  {
    for (int i = this.jdField_a_of_type_Int - 1; i >= 0; i--) {
      this.jdField_a_of_type_ArrayOfJavaLangObject[i] = null;
    }
    this.jdField_a_of_type_Int = 0;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\au.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */