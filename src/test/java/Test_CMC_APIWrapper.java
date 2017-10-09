public class Test_CMC_APIWrapper {



    public static void main(String[] args) {
        CMC_APIWrapper api = new CMC_APIWrapper();
        String list = api.getCurrency("ethereum", "EUR");
        System.out.println(list);
    }




}
