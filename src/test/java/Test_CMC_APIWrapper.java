public class Test_CMC_APIWrapper {



    public static void main(String[] args) {
        CMC_APIWrapper api = new CMC_APIWrapper();

        String[] list = api.parseInformation(api.getCurrency("bitcoin"));

        for(int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }




}
