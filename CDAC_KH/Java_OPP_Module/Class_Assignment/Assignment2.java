import java.util.Scanner;

class AritOps{
    public static void calculate() {
        System.out.println(" ");
        System.out.println("Arithmetic Operations with Command Line Input");
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        //String operator=sc.next();

        double result;

        
         switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
                break;
        }

        
    }
}

class A2Byte {
    public static void displayByte() {
        System.out.println(" ");
        System.out.println("Working with java.lang.Byte");
        

        byte b1=100;
        System.out.println(b1);

        int b2=Byte.BYTES;
        System.out.println("Byte size: "+b2);
        byte bmin=Byte.MIN_VALUE;
        byte bmax=Byte.MAX_VALUE;
        System.out.println("bmin: "+bmin);
        System.out.println("bmax: "+bmax);

        byte number=125;
        String str=Byte.toString(number);
        System.out.println("Byte_to_String:" + str);

        String strNumber="12";
        number= Byte.parseByte(strNumber);
        System.out.println("String_to_byte: "+number);

        strNumber="Ab12Cd3";
        //number=Byte.parseByte(strNumber);
        //System.out.println("Excetion:" + number);

        Byte by1=Byte.valueOf(str);
        Byte by2=Byte.valueOf(number);

        System.out.println("String to ByteObject: "+by1);
        System.out.println("Byte_to_ByteObject: "+by2);

        int n=number;
        float f=number;
        double d=number;

        double d1=100;
        byte num=(byte)d1;
        System.out.println("byte_to: int = "+n+", float = "+f+", double = "+d);
        System.out.println("double to  byte: "+num);

        

    }
    
}

class A2long{
    public static void displayLong(){
        System.out.println(" ");
        System.out.println("Working with java.lang.Long");

        System.out.println("int size: "+Long.BYTES);

        long min_long=Long.MIN_VALUE;
        long max_long=Long.MAX_VALUE;

        System.out.println("MAX_INT: "+max_long+", MIN_INT: "+min_long);

        long number=123;
        String str1=Long.toString(number);
        System.out.println("Long to String: "+str1);

        String strNumber="675";
        long n1=Long.parseLong(strNumber);
        System.out.println("String to Long: "+n1);


        Long n2=Long.valueOf(number);
        Long n3=Long.valueOf(strNumber);
        System.out.println("local int var to wrapper class: "+n2);


        System.out.println("local String var to wrapper class: "+n3);
        long n4=58;
        double d1=n4;

        int l1=(int)n4;

        double d2=34.5;

        long n6=(long)d2;

        System.out.println("double: "+d1+", int: "+l1+", long: "+n6);

        System.out.println("SUM: "+Long.sum(n4, n6)+", MIN: "+Long.min(n4, n6)+", MAX: "+Long.max(n4,n6));

        System.out.println("Binary: "+Long.toBinaryString(n4)+", Octal: "+Long.toOctalString(n4)+" Hexadecimal: "+Long.toHexString(n4));

    }
    
}
class A2Float {
    public static void displayFloat() {
        System.out.println(" ");
        System.out.println("Working with java.lang.Float");

        
        System.out.println("Float size (bytes): " + Float.BYTES);

        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("MIN_FLOAT: " + minFloat + ", MAX_FLOAT: " + maxFloat);

        float number = 123.45f;
        String str = Float.toString(number);
        System.out.println("Float to String: " + str);

        String strNumber = "675.89";
        float f1 = Float.parseFloat(strNumber);
        System.out.println("String to Float: " + f1);

        String invalidStr = "Ab12Cd3";
        try {
            float invalidFloat = Float.parseFloat(invalidStr);
            System.out.println("Invalid String to Float: " + invalidFloat);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Float n2 = Float.valueOf(number);
        System.out.println("Float to Wrapper class: " + n2);

        Float n3 = Float.valueOf(strNumber);
        System.out.println("String to Float Wrapper class: " + n3);

        
        
        System.out.println("Sum of two floats: " + Float.sum(n2, n3));

        
        System.out.println("Minimum: " + Float.min(n2, n3)+", Maximum: " + Float.max(n2, n3));
        System.out.println();

        float negativeValue = -25.0f;
        double sqrt = Math.sqrt(negativeValue);
        System.out.println("Square root of " + negativeValue + ": " + sqrt);

        float zero1 = 0.0f;
        float zero2 = 0.0f;
        float result = zero1 / zero2;
        System.out.println("Result of 0.0f / 0.0f: " + result);

        float f2 = 100.5f;
        int m1 = (int) f2;
        long l1 = (long) f2;
        double d2 =  f2;
        System.out.println("Float to int: " + m1);
        System.out.println("Float to long: " + l1);
        System.out.println("Float to double: " + d2);
    }

    
}

class A2Bool {
    public static void displayBool() {
        System.out.println(" ");
        System.out.println("Working with java.lang.Bool");


        boolean status=true;
        String str=Boolean.toString(status);
        System.out.println("Boolean to String: "+status);

        String strStatus=new String("true");
        Boolean status1= Boolean.parseBoolean(str);
        System.out.println("String to  boolean: "+status1);


        strStatus="1";
        status1=Boolean.parseBoolean(str);
        System.out.println(status1);
        status1=Boolean.valueOf(strStatus);
        System.out.println(status1);


        status=true;
        Boolean wrapStatus=Boolean.valueOf(status);
        System.out.println(wrapStatus);


        strStatus="true";
        wrapStatus=Boolean.valueOf(strStatus);
        System.out.println(status);

        boolean bt=true;
        int n=bt?1:0;
        System.out.println(n);

        int n2=1;
        boolean bt1= (n2!=0);
        System.out.println(bt1);

        double f1=1.0;
        boolean b1=(f1!=0);
        System.out.println(b1);


    }
}
class A2short {
    public static void displayShort() {
        System.out.println(" ");
        System.out.println("Working with java.lang.Short");

        
        int n1=Short.BYTES;
        System.out.println(n1);

        int min_sh=Short.MIN_VALUE;
        int max_sh=Short.MAX_VALUE;

        System.out.println("Max Short value: "+max_sh);
        System.out.println("Min short value: "+min_sh);

        short number=123;
        String sh=Short.toString(number);

        System.out.println("Short->String: "+sh);

        String strNumber="334";
        short nn2=Short.parseShort(strNumber);
        System.out.println("String->Short: "+nn2);

        //strNumber="AB15";
        //nn2=Short.parseShort(strNumber);
        //System.out.println("Number format exception: "nn2);

        Short num=Short.valueOf(number);
        System.out.println("local variable -> wrapper class: "+num);

        Short num1=Short.valueOf(strNumber);
        System.out.println("local variable -> wrapper class: "+num1);

        int m=number;
        double dd=nn2;
        int m2=445;
        short num3=(short)m2;
        System.out.println("int: "+m+", double: "+dd+", short: "+num3);
        

    }
}
class A2Int {

    public static void displayInt() {
        System.out.println(" ");
        System.out.println("Working with java.lang.Integer");

        
        System.out.println("int size: "+Integer.BYTES);

        int min_int=Integer.MIN_VALUE;
        int max_int=Integer.MAX_VALUE;

        System.out.println("MAX_INT: "+max_int+", MIN_INT: "+min_int);

        int number=123;
        String str1=Integer.toString(number);
        System.out.println("Integer to String: "+str1);

        String strNumber="675";
        int n1=Integer.parseInt(strNumber);
        System.out.println("String to Integer: "+n1);


        Integer n2=Integer.valueOf(number);
        Integer n3=Integer.valueOf(strNumber);
        System.out.println("local int var to wrapper class: "+n2);


        System.out.println("local String var to wrapper class: "+n3);
        int n4=58;
        double d1=n4;

        long l1=n4;

        double d2=34.5;

        int n6=(int)d2;

        System.out.println("double: "+d1+", long: "+l1+", int: "+n6);

        System.out.println("SUM: "+Integer.sum(n4, n6)+", MIN: "+Integer.min(n4, n6)+", MAX: "+Integer.max(n4,n6));

        System.out.println("Binary: "+Integer.toBinaryString(n4)+", Octal: "+Integer.toOctalString(n4)+" Hexadecimal: "+Integer.toHexString(n4));

    }
    
}

class A2Double{
    public static void displayDouble(){
        System.out.println(" ");
        System.out.println("Working with java.lang.double");


        System.out.println("int size: "+Double.BYTES);

        double min_db=Double.MIN_VALUE;
        double max_db=Double.MAX_VALUE;

        System.out.println("MAX_Double: "+max_db+", MIN_Double: "+min_db);

        double number=123;
        String str1=Double.toString(number);
        System.out.println("Long to String: "+str1);

        String strNumber="675";
        Double n1=Double.parseDouble(strNumber);
        System.out.println("String to Long: "+n1);


        Double n2=Double.valueOf(number);
        Double n3=Double.valueOf(strNumber);
        System.out.println("local int var to wrapper class: "+n2);


        System.out.println("local String var to wrapper class: "+n3);
        double n4=58.5;
        long l1=(long)n4;

        int m1=(int)n4;

        float f2=34.5f;

        double n6=f2;

        System.out.println("long: "+l1+", int: "+m1+", double: "+n6);

        System.out.println("SUM: "+Double.sum(n4, n6)+", MIN: "+Double.min(n4, n6)+", MAX: "+Double.max(n4,n6));

       

    }
    
}
class defalutPrimitive{
    boolean bo;
     byte bt;
     short st;
     int n;
     long l;
     float f;
     double d;
     char ch;

    void defValues(){
     
     System.out.println("boolean: "+ bo);
     System.out.println("byte: "+bt);
     System.out.println("short: "+st);
     System.out.println("int: "+n);
     System.out.println("long: "+l);
     System.out.println("float: "+f);
     System.out.println("double: "+d);
     System.out.println("char: "+ch);
    }
    
}
public class Assignment2 {
    public static void main(String[] args) {
        A2Byte.displayByte();
        A2Bool.displayBool();
        A2short.displayShort();
        A2Int.displayInt();
        A2long.displayLong();
        A2Float.displayFloat();
        A2Double.displayDouble();
        AritOps.calculate();
        defalutPrimitive df=new defalutPrimitive();
        df.defValues();
    }
}
