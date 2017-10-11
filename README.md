# CoinMarketCap Java API Wrapper 
A simple Java library that allows you to access the CoinMarketCap API for checking cryptocurrency information. Useful for Java developers looking to develop a cryptocurrency monitoring application!

# Installation
There are three ways to download this library. You can automatically download it through maven (easiest), download the jar, or install it yourself.

For maven, add this dependency to your pom.xml file:

```xml
<dependency>
    <groupId>com.github.Draylar</groupId>
    <artifactId>CMC_APIWrapper</artifactId>
    <version>2.0.0</version>
    <classifier>jar-with-dependencies</classifier>
</dependency>
```

To install it as a jar file, check out the jar release page here. Jars are released more than the maven dependencies and may include bug fixes/new features faster, but also require you to add it to your project yourself. 

# Basic Usage

To use the API wrapper, first import the library after you have downloaded it like so:

```java
import com.github.Draylar.CMC_APIWrapper;
```

Now you'll need to create a CMC_APIWrapper object. For an example:

```java
CMC_APIWrapper api = new CMC_APIWrapper();
```

This object will handle all of your requests. 

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


