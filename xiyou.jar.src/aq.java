public final class aq
  extends ak
{
  public byte a;
  private String a;
  
  public aq(String paramString)
  {
    this.jdField_a_of_type_Byte = 0;
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_a_of_type_Byte = 0;
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_a_of_type_JavaLangString = paramString;
    if (paramString.equals("+"))
    {
      this.jdField_a_of_type_Byte = 1;
      return;
    }
    if (paramString.equals("-"))
    {
      this.jdField_a_of_type_Byte = 2;
      return;
    }
    if (paramString.equals("*"))
    {
      this.jdField_a_of_type_Byte = 3;
      return;
    }
    if (paramString.equals("/"))
    {
      this.jdField_a_of_type_Byte = 4;
      return;
    }
    if (paramString.equals(">"))
    {
      this.jdField_a_of_type_Byte = 5;
      return;
    }
    if (paramString.equals("<"))
    {
      this.jdField_a_of_type_Byte = 6;
      return;
    }
    if (paramString.equals("="))
    {
      this.jdField_a_of_type_Byte = 7;
      return;
    }
    if (paramString.equals(">="))
    {
      this.jdField_a_of_type_Byte = 8;
      return;
    }
    if (paramString.equals("<="))
    {
      this.jdField_a_of_type_Byte = 9;
      return;
    }
    if (paramString.equals("<>"))
    {
      this.jdField_a_of_type_Byte = 10;
      return;
    }
    if (paramString.equals("!"))
    {
      this.jdField_a_of_type_Byte = 11;
      return;
    }
    if (paramString.equals("("))
    {
      this.jdField_a_of_type_Byte = 14;
      return;
    }
    if (paramString.equals(")"))
    {
      this.jdField_a_of_type_Byte = 15;
      return;
    }
    if (paramString.equals("&"))
    {
      this.jdField_a_of_type_Byte = 12;
      return;
    }
    if (paramString.equals("|"))
    {
      this.jdField_a_of_type_Byte = 13;
      return;
    }
    this.jdField_a_of_type_Byte = 0;
  }
  
  public final String a()
  {
    return this.jdField_a_of_type_JavaLangString;
  }
  
  public final boolean a()
  {
    int i;
    return ((i = this.jdField_a_of_type_Byte) == 5) || (i == 6) || (i == 7) || (i == 8) || (i == 9) || (i == 10) || (i == 11) || (i == 12) || (i == 13);
  }
  
  public final boolean b()
  {
    int i;
    return ((i = this.jdField_a_of_type_Byte) == 5) || (i == 6) || (i == 7) || (i == 8) || (i == 9) || (i == 10);
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\aq.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */