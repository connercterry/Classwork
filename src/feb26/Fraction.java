package feb26;

public class Fraction implements Comparable<Fraction>
{
    private int num;
    private int denom;

    private Fraction(int num, int denom)
    {
        this.num=num;
        this.denom=denom;
        simplify();
    }


    @Override
    public int compareTo(Fraction o)
    {
       int difference = this.num*o.denom - o.num*this.denom;
       if(difference>0)return 1;
       else if(difference<0)return -1;
       return 0;
    }



    private void simplify()
    {

    }
}
