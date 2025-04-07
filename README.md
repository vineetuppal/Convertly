# 💱 Convertly

> A lightweight Spring Boot application that converts currency values using the FreeCurrencyAPI. 🚀  
> Example: Convert INR to USD in seconds via a simple REST API!

---

## 🌟 Features

- 🔄 Real-time currency conversion using [FreeCurrencyAPI](https://freecurrencyapi.com/)
- ⚡ Built with Spring Boot 3 and RestClient
- 📥 Simple REST API endpoint to convert currency
- 📦 Clean, modular project structure
- 🧪 Easy to test via Postman or your favorite client

---

## 🔧 Tech Stack

- Java 24
- Spring Boot 3
- Spring Web (RestClient)
- Lombok

---

## 📡 API Usage

### ✅ Example Endpoint

-GET http://localhost:8080/convertCurrency?fromCurrency=INR&toCurrency=USD&units=500


### 📥 Query Parameters

| Parameter      | Type   | Description                           |
|----------------|--------|---------------------------------------|
| `fromCurrency` | String | The source currency code (e.g., INR)  |
| `toCurrency`   | String | The target currency code (e.g., USD)  |
| `units`        | Number | Amount to be converted (e.g., 500)    |

### 📤 Sample Response

```json
{
  "fromCurrency": "INR",
  "toCurrency": "USD",
  "units": 500,
  "convertedValue": 6.02
}

