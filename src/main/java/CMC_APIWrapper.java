public class CMC_APIWrapper {

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

    }

    // returns a list of currencies that stops after a specified amount
    public String getTopCurrencies(int limit) {

    }

    // returns a list of currencies and adds on the 3 extra pieces of info to each about a real world currency
    public String getTopCurrencies(String convert) {

    }

    // returns a list with both a limit (stops after x currencies) and extra info about a real world currency
    public String getTopCurrencies(int limit, String convert) {

    }



    // ----- Specific currency (endpoint: /ticker/{id}/) ----- //
    // returns a String that has info about one currency.
    // Parameters:
        // convert: 3 new pieces of information are added about the cryptocurrency compared to a real world currency [convert]:

    // get info about a currency
    public String getCurrency(String id) {

    }

    // the convert argument adds the 3 extra pieces of information
    public String getCurrency(String id, String convert) {

    }



    // ----- Global data (endpoint: /global/) ----- //
    // returns a String which has general information about the current market
    // Le parameters:
      // convert: adds 24h volume & market cap in another currency

    // get general info about the market
    public String getGlobalData() {

    }

    // adds 24h volume & market cap in [convert] currency
    public String getGlobalData(String convert) {

    }

}
