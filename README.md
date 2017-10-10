# CoinMarketCap Java API Wrapper 
A simple Java library that allows you to access the CoinMarketCap API for checking cryptocurrency information. Useful for Java developers looking to develop a cryptocurrency monitoring application!

# Installation
maven coming soon

# Basic Usage

To use the API wrapper, first you'll need to create a CMC_APIWrapper object like so:

```java
CMC_APIWrapper api = new CMC_APIWrapper();
```

This will handle all of your requests. 

Let's try to get some information about Bitcoin:

```java
api.getCurrency("bitcoin");
```

The response:

```
[
    {
        "id": "bitcoin", 
        "name": "Bitcoin", 
        "symbol": "BTC", 
        "rank": "1", 
        "price_usd": "4567.7", 
        "price_btc": "1.0", 
        "24h_volume_usd": "1449190000.0", 
        "market_cap_usd": "75881085255.0", 
        "available_supply": "16612537.0", 
        "total_supply": "16612537.0", 
        "percent_change_1h": "-0.61", 
        "percent_change_24h": "2.78", 
        "percent_change_7d": "3.06", 
        "last_updated": "1507532654"
    }
]
```

For a full tutorial on what you can do with this library, visit the wiki. 


