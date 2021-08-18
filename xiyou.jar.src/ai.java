public final class ai
  extends ak
{
  public byte a;
  public ak[] a;
  
  public ai(int[] paramArrayOfInt)
  {
    this.jdField_a_of_type_Byte = 0;
    this.jdField_a_of_type_ArrayOfAk = null;
    this.jdField_a_of_type_Byte = 0;
    int[] arrayOfInt1 = paramArrayOfInt;
    paramArrayOfInt = this;
    this.jdField_a_of_type_Byte = ((byte)arrayOfInt1.length);
    int j = arrayOfInt1[0];
    if (paramArrayOfInt.jdField_a_of_type_Byte > 1)
    {
      int[] arrayOfInt2 = new int[paramArrayOfInt.jdField_a_of_type_Byte - 1];
      System.arraycopy(arrayOfInt1, 1, arrayOfInt2, 0, paramArrayOfInt.jdField_a_of_type_Byte - 1);
      paramArrayOfInt.jdField_a_of_type_ArrayOfAk = ((ak[])new ai[j]);
      for (int i = 0; i < ((ai[])paramArrayOfInt.jdField_a_of_type_ArrayOfAk).length; i++) {
        paramArrayOfInt.jdField_a_of_type_ArrayOfAk[i] = new ai(arrayOfInt2);
      }
      return;
    }
    paramArrayOfInt.jdField_a_of_type_ArrayOfAk = new ak[j];
    for (int k = 0; k < j; k++) {
      paramArrayOfInt.jdField_a_of_type_ArrayOfAk[k] = new al(0);
    }
  }
  
  public final String a()
  {
    if ("Array[" + this.jdField_a_of_type_ArrayOfAk == null) {
      return "";
    }
    return this.jdField_a_of_type_ArrayOfAk.length + "]";
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ai.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */