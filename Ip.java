import java.util.*;
class Ip
{
public static void main(String args[])
{
Scanner t=new Scanner(System.in);
System.out.println("Enter the IP address");
int a=t.nextInt();
int b=t.nextInt();
int c=t.nextInt();
int d=t.nextInt();
System.out.println("Enter the subnets:");
int subn=t.nextInt();
if(subn==1 || subn==2)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:1");
System.out.println("128 host address is added to the every Ip addresses");
}
else if(subn>=3 && subn<=4)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:2");
System.out.println("64 host address is added to the every Ip addresses");
}
else if(subn>=5 && subn<=8)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:3");
System.out.println("32 host address is added to the every Ip addresses");
}
else if(subn>=9 && subn<=16)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:4");
System.out.println("16 host address is added to the every Ip addresses");
int n=15;
n=t.nextInt();
}
else if(subn>=17 && subn<=32)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:5");
System.out.println("8 host address is added to the every Ip addresses");
}
else if(subn>=33 && subn<=64)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:6");
System.out.println("4 host address is added to the every Ip addresses");
}
else if(subn>=65 && subn<=128)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:7");
System.out.println("2 host address is added to the every Ip addresses");
}
else if(subn>=129 && subn<=256)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:8");
System.out.println("1 host address is added to the every Ip addresses");
}
else if(subn>=257 && subn<=512)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:9");
System.out.println("128 host address is added to the every Ip addresses");
}
else if(subn>=513 && subn<=1024)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:10");
System.out.println("64 host address is added to the every Ip addresses");
}
else if(subn>=1025 && subn<=2048)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:11");
System.out.println("32 host address is added to the every Ip addresses");
}
else if(subn>=2049 && subn<=4096)
{
System.out.println("The Host-Id bits needs to be used for subnetting is:12");
System.out.println("16 host address is added to the every Ip addresses");
}
else
{
System.out.println("Invalid Subnet");
}
System.out.println("Enter the host address which is to be added");
int hId=t.nextInt();
if(a>=0&& a<255 && b>=0 && b<255 && c>=0 && c<255 && d>=0 && d<255) 
{
System.out.println("The given IP address is "+a+"."+b+"."+c+"."+d);
if(hId==127 || hId==191 || hId==223 || hId==239 || hId==255 || hId==63 || hId==31 || hId==15 || hId==7 || hId==3 || hId==1)
{
System.out.println("The address range will be");
int i=2;
int z=0;
int j=subn;
int e=d+hId;
while(i<=subn)
{

System.out.println(""+a+"."+b+"."+c+"."+d+ "to" +a+"."+b+"."+c+"."+(d+hId));
 
d=d+1+hId;
i++;


while(j==subn){
z=d+hId;
if(z==256 || z>256)
{
System.out.println(""+a+"."+b+"."+(c+1)+"."+(d+hId-255)+ "to" +a+"."+b+"."+(c+1)+"."+(d+hId-255+e));
}
else if(c==256 || c>256)
{
d=255;
System.out.println(""+a+"."+(b+1)+"."+(c+hId-255)+"."+d+ "to" +a+"."+(b+1)+"."+(c+hId-255+e)+"."+d);

}
else if(b==256 || b>256)
{

c=255;
d=255;
System.out.println(""+(a+1)+"."+(b+hId-255)+"."+c+"."+d+ "to" +a+"."+(b+hId-255+e)+"."+c+"."+d);

}
else
break;
j--;
}
}

if(a<128)
{
System.out.println("The given IP is of Class A");
System.out.println("The NET ID of given IP is "+a+".0.0.0");
System.out.println("The HOST ID of given IP is 0."+b+"."+c+"."+e); 
System.out.println("The default mask of Class A is 255.0.0.0"); 
a=a&255;
b=b&0;
c=c&0;
d=d&0;
System.out.println("The first ip of given ip is "+a+"."+b+"."+c+"."+d);
a=a|0;
b=b|255;
c=c|255;
d=d|255;
System.out.println("The last ip of given ip is "+a+"."+b+"."+c+"."+d);
}
else if(a<192)
{
System.out.println("The given IP is of Class B");
System.out.println("The NET ID of given IP is "+a+"."+b+"."+"0.0");
System.out.println("The HOST ID of given IP is 0.0."+c+"."+e);
System.out.println("The default mask of Class B is 255.255.0.0");
a=a&255;
b=b&255;
c=c&0;
d=d&0;
System.out.println("The first ip of given ip is "+a+"."+b+"."+c+"."+d);
a=a|0;
b=b|0;
c=c|255;
d=d|255;
System.out.println("The last ip of given ip is "+a+"."+b+"."+c+"."+d);

}
else if(a<224)
{
System.out.println("The given IP is of Class C");
System.out.println("The NET ID of given IP is "+a+"."+b+"."+c+".0");
System.out.println("The HOST ID of given IP is 0.0.0."+e);
System.out.println("The default mask of Class C is 255.255.255.0");
a=a&255;
b=b&255;
c=c&255;
d=d&0;
System.out.println("The first of given class is "+a+"."+b+"."+c+"."+d);
a=a|0;
b=b|255;
c=c|255;
d=d|255;
System.out.println("The last ip of given ip is "+a+"."+b+"."+c+"."+d);
}
else if(a<255)
System.out.println("The given IP is of Class reserve");
else
System.out.println("The given IP is of Class reserve");
}
}
else
System.out.println("The IP entered is invalid");
}
}
