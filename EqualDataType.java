package ractice;

public class EqualDataType <T>{
public static void main(String[] args) {
	
	EqualDataType<Object> eDT = new EqualDataType<Object>();
//	int a=10;
//	String b="10";
//	double a=10.4;
//	String b="10.4";
//	float a=45.40909f;
//	String b="45.40909";
//	long a=10234234234l;
//	String b="10234234234";
	boolean a=true;
	String b="true";
	
	boolean s=eDT.comparesAnyData(a, b);
	System.out.println(s);
	
}

public boolean comparesAnyData(T a,T b){
	String s1="";
	String s2="";
	if(a instanceof Integer) {
		s1=Integer.toString((int)a);
	}
	if(a instanceof Double) {
		s1=Double.toString((Double)a);
	}
	if(a instanceof Long) {
		s1=Long.toString((Long)a);
	}
	if(a instanceof String) {
		s1=(String)a;
	}
	if(a instanceof Character) {
		s1=""+(char)a;
	}
	if(a instanceof Boolean) {
		s1=Boolean.toString((boolean)a);
	}
	
	
	
	if(b instanceof Integer) {
		s2=Integer.toString((int)b);
	}
	if(b instanceof Double) {
		s2=Double.toString((Double)b);
	}
	if(b instanceof Long) {
		s2=Long.toString((Long)b);
	}
	if(b instanceof String) {
		s2=(String)b;
	}
	if(b instanceof Character) {
		s2=""+(char)b;
	}
	if(b instanceof Boolean) {
		s2=""+(char)b;
	}
	
	
	
return s1.equals(s2);

	
}

}


