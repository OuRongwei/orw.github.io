import javax.microedition.lcdui.Image;

public final class ah
{
  public int a;
  public int b;
  public int c;
  public at a;
  public int d = 16;
  public int e = 16;
  public int f;
  public int g;
  public Image a;
  public short[][] a;
  public final byte[] a;
  public au a;
  public a a;
  private short[] a;
  private short b;
  public short a;
  
  public ah()
  {
    this.jdField_a_of_type_Int = 0;
    { { 0 }, { 1 }, { 2 }, { 3, 4, 5 }, { 6, 70, 7 }, { 8 }, { 9 }, { 10, 11 }, { 12 }, { 13 }, { 14, 15, 16 }, { 17, 18 }, { 19, 20 }, { 21 }, { 22, 23, 24, 25 }, { 26 } }[16] = { 27 };
    this.jdField_a_of_type_ArrayOfByte = new byte[] { 0, 1, 2, 3, 4, 5, 70, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27 };
    new byte[] { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0 }[16] = 1;
    if (d.jdField_b_of_type_Int < 240)
    {
      this.jdField_a_of_type_Short = 0;
      return;
    }
    this.jdField_a_of_type_Short = ((short)(d.jdField_a_of_type_Int - 240 >> 1));
  }
  
  public final void a(n paramn)
  {
    this.f = paramn.a();
    this.g = paramn.a();
    this.g += 2;
    this.jdField_a_of_type_Array2dOfShort = new short[this.g << 1][this.f << 1];
    for (int i = 2; i < this.g; i++) {
      for (int k = 0; k < this.f; k++)
      {
        this.jdField_a_of_type_Array2dOfShort[i][k] = ((short)paramn.a());
        this.jdField_a_of_type_Array2dOfShort[(i + this.g)][(k + this.f)] = ((short)paramn.a());
      }
    }
    this.jdField_a_of_type_A = new a();
    this.jdField_a_of_type_A.a(4);
    this.jdField_a_of_type_A.a(8, 1, 0);
    n localn = paramn;
    ah localah = this;
    this.jdField_b_of_type_Short = ((short)localn.a());
    if (localah.jdField_a_of_type_Au == null) {
      localah.jdField_a_of_type_Au = new au();
    } else {
      localah.jdField_a_of_type_Au.a();
    }
    localah.jdField_a_of_type_Au.a(localah.jdField_b_of_type_Short - 1);
    int n = -1;
    for (;;)
    {
      n++;
      if (n >= localah.jdField_b_of_type_Short - 1) {
        break;
      }
      at localat2;
      (localat2 = new at()).a(localn, localah.jdField_a_of_type_Short);
      localah.jdField_a_of_type_Au.a(localat2, n);
    }
    at localat1;
    (localat1 = new at()).a(localn, localah.jdField_a_of_type_Short);
    localah.jdField_a_of_type_Au.b(localat1, 6);
    localah.jdField_a_of_type_At = ((at)localah.jdField_a_of_type_Au.a(0));
    int j = paramn.a();
    this.jdField_a_of_type_ArrayOfShort = new short[j];
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= this.jdField_a_of_type_ArrayOfShort.length) {
        break;
      }
      this.jdField_a_of_type_ArrayOfShort[m] = ((short)paramn.a());
    }
    this.jdField_a_of_type_JavaxMicroeditionLcduiImage = e.a(31);
    a();
  }
  
  /* Error */
  public final void a()
  {
    // Byte code:
    //   0: getstatic 50	e:jdField_a_of_type_Bc	Lbc;
    //   3: ldc 9
    //   5: invokestatic 65	bc:a	(Ljava/lang/String;)Ljava/lang/String;
    //   8: ldc 1
    //   10: aload_0
    //   11: aload_0
    //   12: getfield 32	ah:jdField_a_of_type_ArrayOfShort	[S
    //   15: astore_2
    //   16: astore_1
    //   17: ldc 7
    //   19: astore_3
    //   20: ldc 6
    //   22: astore 4
    //   24: ldc 2
    //   26: astore 5
    //   28: ldc 8
    //   30: astore 6
    //   32: ldc 3
    //   34: astore 7
    //   36: ldc 4
    //   38: astore 8
    //   40: ldc 5
    //   42: astore 9
    //   44: getstatic 51	e:jdField_a_of_type_JavaLangStringBuffer	Ljava/lang/StringBuffer;
    //   47: dup
    //   48: astore 10
    //   50: iconst_0
    //   51: invokevirtual 74	java/lang/StringBuffer:setLength	(I)V
    //   54: iconst_m1
    //   55: istore 11
    //   57: iinc 11 1
    //   60: iload 11
    //   62: aload_2
    //   63: arraylength
    //   64: if_icmpge +143 -> 207
    //   67: iconst_m1
    //   68: istore 12
    //   70: iinc 12 1
    //   73: iload 12
    //   75: aload_1
    //   76: getfield 28	ah:jdField_a_of_type_Au	Lau;
    //   79: getfield 45	au:jdField_a_of_type_Int	I
    //   82: if_icmpge +122 -> 204
    //   85: aload_1
    //   86: getfield 28	ah:jdField_a_of_type_Au	Lau;
    //   89: iload 12
    //   91: invokevirtual 61	au:a	(I)Ljava/lang/Object;
    //   94: checkcast 15	at
    //   97: astore 13
    //   99: aload_2
    //   100: iload 11
    //   102: saload
    //   103: aload 13
    //   105: getfield 43	at:jdField_a_of_type_Short	S
    //   108: if_icmpne +93 -> 201
    //   111: iload 11
    //   113: iconst_2
    //   114: irem
    //   115: ifne +10 -> 125
    //   118: aload 10
    //   120: aload_3
    //   121: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   124: pop
    //   125: aload 10
    //   127: aload 4
    //   129: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   132: aload_2
    //   133: iload 11
    //   135: saload
    //   136: invokevirtual 72	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   139: aload 5
    //   141: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   144: aload 6
    //   146: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   149: bipush 34
    //   151: invokevirtual 71	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   154: aload_2
    //   155: iload 11
    //   157: saload
    //   158: invokevirtual 72	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
    //   161: bipush 34
    //   163: invokevirtual 71	java/lang/StringBuffer:append	(C)Ljava/lang/StringBuffer;
    //   166: aload 7
    //   168: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   171: aload 13
    //   173: getfield 42	at:jdField_a_of_type_JavaLangString	Ljava/lang/String;
    //   176: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   179: aload 8
    //   181: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   184: pop
    //   185: iload 11
    //   187: iconst_2
    //   188: irem
    //   189: iconst_1
    //   190: if_icmpne +11 -> 201
    //   193: aload 10
    //   195: aload 9
    //   197: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   200: pop
    //   201: goto -131 -> 70
    //   204: goto -147 -> 57
    //   207: aload_2
    //   208: arraylength
    //   209: iconst_2
    //   210: irem
    //   211: iconst_1
    //   212: if_icmpne +11 -> 223
    //   215: aload 10
    //   217: aload 9
    //   219: invokevirtual 73	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   222: pop
    //   223: aload 10
    //   225: invokevirtual 75	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   228: invokestatic 67	bc:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   231: invokevirtual 66	bc:a	(Ljava/lang/String;)V
    //   234: aload_0
    //   235: getstatic 49	e:jdField_a_of_type_Int	I
    //   238: istore_2
    //   239: astore_1
    //   240: iload_2
    //   241: iflt +131 -> 372
    //   244: iconst_m1
    //   245: istore 4
    //   247: iinc 4 1
    //   250: iload 4
    //   252: aload_1
    //   253: getfield 28	ah:jdField_a_of_type_Au	Lau;
    //   256: getfield 45	au:jdField_a_of_type_Int	I
    //   259: if_icmpge +113 -> 372
    //   262: aload_1
    //   263: getfield 28	ah:jdField_a_of_type_Au	Lau;
    //   266: iload 4
    //   268: invokevirtual 61	au:a	(I)Ljava/lang/Object;
    //   271: checkcast 15	at
    //   274: dup
    //   275: astore 5
    //   277: getfield 43	at:jdField_a_of_type_Short	S
    //   280: iload_2
    //   281: if_icmpne +88 -> 369
    //   284: aload_1
    //   285: aload 5
    //   287: astore 7
    //   289: dup
    //   290: astore 6
    //   292: getfield 27	ah:jdField_a_of_type_At	Lat;
    //   295: aload 7
    //   297: if_acmpeq +10 -> 307
    //   300: aload 6
    //   302: aload 7
    //   304: putfield 27	ah:jdField_a_of_type_At	Lat;
    //   307: aload_1
    //   308: aload 5
    //   310: getfield 43	at:jdField_a_of_type_Short	S
    //   313: istore 7
    //   315: astore 6
    //   317: iconst_m1
    //   318: istore 8
    //   320: iinc 8 1
    //   323: iload 8
    //   325: aload 6
    //   327: getfield 31	ah:jdField_a_of_type_ArrayOfByte	[B
    //   330: arraylength
    //   331: if_icmpge +26 -> 357
    //   334: aload 6
    //   336: getfield 31	ah:jdField_a_of_type_ArrayOfByte	[B
    //   339: iload 8
    //   341: baload
    //   342: iload 7
    //   344: if_icmpne -24 -> 320
    //   347: aload 6
    //   349: iload 8
    //   351: putfield 25	ah:jdField_a_of_type_Int	I
    //   354: goto -34 -> 320
    //   357: aload_1
    //   358: aload_1
    //   359: getfield 27	ah:jdField_a_of_type_At	Lat;
    //   362: iconst_1
    //   363: invokevirtual 56	ah:a	(Lat;Z)V
    //   366: goto +6 -> 372
    //   369: goto -122 -> 247
    //   372: iconst_2
    //   373: putstatic 48	e:jdField_a_of_type_Byte	B
    //   376: return
  }
  
  public final void a(at paramat, boolean paramBoolean)
  {
    if (paramat == null) {
      return;
    }
    int i = paramat.jdField_a_of_type_Int - (d.jdField_a_of_type_Int >> 1) - this.jdField_b_of_type_Int;
    paramat = paramat.jdField_b_of_type_Int - (d.jdField_b_of_type_Int >> 1) - this.c;
    if (paramBoolean)
    {
      this.jdField_b_of_type_Int += i;
      this.c += paramat;
    }
    else
    {
      this.jdField_b_of_type_Int += f.a(i, i < 0 ? -48 : 48);
      this.c += f.a(paramat, paramat < 0 ? -112 : 112);
    }
    paramat = this;
    if (this.jdField_b_of_type_Int < 0) {
      paramat.jdField_b_of_type_Int = 0;
    } else if (paramat.jdField_b_of_type_Int > paramat.f * paramat.d - d.jdField_a_of_type_Int) {
      paramat.jdField_b_of_type_Int = (paramat.f * paramat.d - d.jdField_a_of_type_Int);
    }
    if (paramat.c < 0)
    {
      paramat.c = 0;
      return;
    }
    if (paramat.c > paramat.g * paramat.e - d.jdField_b_of_type_Int) {
      paramat.c = (paramat.g * paramat.e - d.jdField_b_of_type_Int);
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ah.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */