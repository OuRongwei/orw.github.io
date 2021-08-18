import javax.microedition.lcdui.Font;

public final class bg
{
  public short a;
  public short b;
  public short c = 0;
  public short d = 0;
  public short e = 0;
  public static Font a;
  public static byte a;
  public static byte b;
  
  public bg()
  {
    this.jdField_a_of_type_Short = 0;
    this.jdField_b_of_type_Short = 0;
    this.jdField_a_of_type_Short = 0;
    this.jdField_b_of_type_Short = 0;
    Font localFont;
    jdField_a_of_type_JavaxMicroeditionLcduiFont = localFont = Font.getFont(0, 0, 8);
    jdField_a_of_type_Byte = (byte)localFont.charWidth('中');
    jdField_b_of_type_Byte = (byte)localFont.getHeight();
  }
  
  public final boolean a()
  {
    return (this.d <= this.jdField_b_of_type_Short + this.c) && (this.jdField_b_of_type_Short < this.d + this.e);
  }
  
  static
  {
    jdField_a_of_type_JavaxMicroeditionLcduiFont = null;
    jdField_a_of_type_Byte = 13;
    jdField_b_of_type_Byte = 15;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bg.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */