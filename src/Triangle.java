public class Triangle {

    public static Tri checkTriangle(int s1,int s2,int s3)
    {
        if(s1+s2<=s3 || s1+s3<=s2 || s2+s3<=s1)
            return Tri.INVALID;
        if(s1==s3 || s1==s2 || s2==s3)
            return Tri.MOTESAVI;
        if(s1>s3)
            return Tri.MOTEVAZi;
        return Tri.GHEYREIN;
		return Tri;
    }
}
enum Tri
{
    INVALID,MOTEVAZi,MOTESAVI,GHEYREIN
}
