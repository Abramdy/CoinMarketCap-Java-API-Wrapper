public class Test_CMC_APIWrapper {



    public static void main(String[] args) {
        CMC_APIWrapper api = new CMC_APIWrapper();
        String list = api.getTopCurrencies(5,"EUR");
        System.out.println(list);
    }




}
