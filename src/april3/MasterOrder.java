package april3;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder
{
    private List<CookieOrder> orders;

    public MasterOrder(List<CookieOrder> orders)
    {
        this.orders = orders;
    }

    public MasterOrder()
    {
        orders = new ArrayList<>();
    }


    public int getTotalBoxes()
    {
        int total = 0;
        for(CookieOrder o : orders)
        {
            total += o.getNumBoxes();
        }

        return total;
    }
    public int removeVariety(String cookieVar)
    {
        int count = 0;
        int pos = 0;
        while(pos < orders.size())
        {
            if(orders.get(pos).getVariety().equals(cookieVar))
            {
                count +=orders.get(pos).getNumBoxes();
                orders.remove(pos);
            }
            else pos++;
        }

        return count;
    }
}
