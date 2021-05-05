import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date birthOfDate=null;

        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            String dateInString = "31-08-1982 10:20:56";
            birthOfDate = sdf.parse(dateInString);
        }catch (Exception e){
            e.printStackTrace();
        }


        BaseCustomerManager neroCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        neroCustomerManager.save(new Customer(1,"erkam","yildirim",birthOfDate,"23123123123"));




    }
}
