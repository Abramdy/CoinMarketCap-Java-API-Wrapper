import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class CMC_APIWrapper {

    String currentResponse;

    // constructor
    public CMC_APIWrapper() {

    }



    // ----- Top currencies (endpoint: /ticker/) ----- //
    // returns a String that contains a list of currencies ordered by rank
    // Optional parameters:
        // limit: the list will stop after a specified amount of currencies.
        // convert: 3 new pieces of information are added about the cryptocurrency compared to a real world currency [convert]
    // All lists go from high to low.

    // returns a full list of all currencies
    public String getTopCurrencies() {
        try {
            HttpResponse<String> response = Unirest.get("https://api.coinmarketcap.com/v1/ticker/")
                    .header("market", "BTC-LTC")
                    .header("cache-control", "no-cache")
                    .asString();
            currentResponse = response.getBody();
        } catch (Exception e) {
            System.out.println("An error occurred while sending your request: ");
            e.printStackTrace();
        }
        return currentResponse;
    }

    // returns a list of currencies that stops after a specified amount
    public String getTopCurrencies(int limit) {
        try {
            HttpResponse<String> response = Unirest.get("https://api.coinmarketcap.com/v1/ticker/?limit=" + limit)
                    .header("market", "BTC-LTC")
                    .header("cache-control", "no-cache")
                    .asString();
            currentResponse = response.getBody();
        } catch (Exception e) {
            System.out.println("An error occurred while sending your request: ");
            e.printStackTrace();
        }
        return currentResponse;
    }

    // returns a list of currencies and adds on the 3 extra pieces of info to each about a real world currency
    public String getTopCurrencies(String convert) {
        try {
            HttpResponse<String> response = Unirest.get("https://api.coinmarketcap.com/v1/ticker/?convert=" + convert)
                    .header("market", "BTC-LTC")
                    .header("cache-control", "no-cache")
                    .asString();
            currentResponse = response.getBody();
        } catch (Exception e) {
            System.out.println("An error occurred while sending your request: ");
            e.printStackTrace();
        }
        return currentResponse;
    }

    // returns a list with both a limit (stops after x currencies) and extra info about a real world currency
    public String getTopCurrencies(int limit, String convert) {
        try {
            HttpResponse<String> response = Unirest.get("https://api.coinmarketcap.com/v1/ticker/?convert=" + convert +
                    "&limit=" + limit)
                    .header("market", "BTC-LTC")
                    .header("cache-control", "no-cache")
                    .asString();
            currentResponse = response.getBody();
        } catch (Exception e) {
            System.out.println("An error occurred while sending your request: ");
            e.printStackTrace();
        }
        return currentResponse;
    }



    // ----- Specific currency (endpoint: /ticker/{id}/) ----- //
    // returns a String that has info about one currency.
    // Parameters:
        // convert: 3 new pieces of information are added about the cryptocurrency compared to a real world currency [convert]:

    // get info about a currency
    public String getCurrency(String id) {
        try {
            HttpResponse<String> response = Unirest.get("https://api.coinmarketcap.com/v1/ticker/" + id.toLowerCase() + "/")
                    .header("market", "BTC-LTC")
                    .header("cache-control", "no-cache")
                    .asString();
            currentResponse = response.getBody();
        } catch (Exception e) {
            System.out.println("An error occurred while sending your request: ");
            e.printStackTrace();
        }
        return currentResponse;
    }

    // the convert argument adds the 3 extra pieces of information
    public String getCurrency(String id, String convert) {
        try {
            HttpResponse<String> response = Unirest.get("https://api.coinmarketcap.com/v1/ticker/" + id.toLowerCase() +
                    "/?convert=" + convert)
                    .header("market", "BTC-LTC")
                    .header("cache-control", "no-cache")
                    .asString();
            currentResponse = response.getBody();
        } catch (Exception e) {
            System.out.println("An error occurred while sending your request: ");
            e.printStackTrace();
        }
        return currentResponse;
    }



    // ----- Global data (endpoint: /global/) ----- //
    // returns a String which has general information about the current market
    // Le parameters:
      // convert: adds 24h volume & market cap in another currency

    // get general info about the market
    public String getGlobalData() {
        try {
            HttpResponse<String> response = Unirest.get("https://api.coinmarketcap.com/v1/global/")
                    .header("market", "BTC-LTC")
                    .header("cache-control", "no-cache")
                    .asString();
            currentResponse = response.getBody();
        } catch (Exception e) {
            System.out.println("An error occurred while sending your request: ");
            e.printStackTrace();
        }
        return currentResponse;
    }

    // adds 24h volume & market cap in [convert] currency
    public String getGlobalData(String convert) {
        try {
            HttpResponse<String> response = Unirest.get("https://api.coinmarketcap.com/v1/global/?convert=" + convert)
                    .header("market", "BTC-LTC")
                    .header("cache-control", "no-cache")
                    .asString();
            currentResponse = response.getBody();
        } catch (Exception e) {
            System.out.println("An error occurred while sending your request: ");
            e.printStackTrace();
        }
        return currentResponse;
    }

    //  ------------- EXTRAS  ------------- //

    /* I have added a text parser for your convenience. Normally the String you get is (formatted like this):
    [
      {
        "id": "bitcoin",
        "name": "Bitcoin",
        "symbol": "BTC",
      }
    ]

    This is all contained in one String object, so you have to parse it yourself and maybe put it into an array.
    This function does it for you and turns something like that example into something like this:

    array[0] ---> "id": "bitcoin"
    array[1] ---> "name": "Bitcoin"
    array[2] ---> "symbol": "BTC"

    Of course, I don't actually add 'array[x]' into your string, that's just showing you that each line is
    split into the array. Take note that the comma at the end is also removed.

    To use this, first store a request as a string and then send it into the parser.
    To newer programmers who don't know, you could also do it all on one line with:
       String[] x = parseInformation(myAPIObject.getCurrency("bitcoin"));
    */

    // parses a response string. returns an array without the extra characters
    public String[] parseInformation(String unparsedResponse) {
        String[] returnArray;

        // replace unneeded characters
        unparsedResponse = unparsedResponse.replace("[", ""); // replace [
        unparsedResponse = unparsedResponse.replace("]", ""); // replace ]
        unparsedResponse = unparsedResponse.replace("{", ""); // replace {
        unparsedResponse = unparsedResponse.replace("}", ""); // replace }

        returnArray = unparsedResponse.split(",");

        return returnArray;
    }
}
