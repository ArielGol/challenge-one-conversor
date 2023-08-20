
# Challenge ONE | Java | Back End | Conversor de Moneda y Temperatura

Este es el segundo Challenge ONE el cual consiste en un conversor de monedas y temperatura.

## Conversor de Monedas

En el conversor de monedas puedes convertir tu moneda de origen(en mi caso pesos argentinos ARS) a los siguientes tipos:

-Dolares USD

-Euros EUR

-Libras Esterlinas GBP

-Yen Japones JPY

-Won Sur Coreano KRW

Lo mismo a la inversa puedes convertir estas monedas a la moneda de origen.

![pantalla principal de la app](https://github.com/ArielGol/challenge-one-conversor/assets/79612737/855f94fd-f79f-4211-be5e-4aed765a5f45)
![pantalla ingresar cantidad](https://github.com/ArielGol/challenge-one-conversor/assets/79612737/8df0897d-4928-4b0f-af3d-8b9d33702760)
![selecciona tipo de moneda](https://github.com/ArielGol/challenge-one-conversor/assets/79612737/52a158fa-c3c2-4d99-a212-115878f4f52b)
![4](https://github.com/ArielGol/challenge-one-conversor/assets/79612737/1be4d24e-a226-4f33-8366-36011bc60050)

## API Reference
En el conversor de monedas, utilice una API que actualiza los valores de la tasa de cotización de los mismas.

API EXCHANGERATE: https://www.exchangerate-api.com/

#### Obtener tasa de cotización

```http
  v6.exchangerate-api.com/v6/api_key/pair/monedaDestino/monedaOrigen
```

| Parametro | Tipo     | Descripción                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Requiere**. Your API key 
| `monedaOrigen`| `string`|Ejemplo "ARS"|
| `monedaDestino`| `string`|Ejemplo "USD"|

## Conversor de Temperatura

El conversor de temperatura convierte valores de grados Celsius a los siguientes tipos de temperaturas:

-Grados Fahrenheit(°F)

-Grados absolutos Kelvin(K)

-Grados absolutos Rankine(R)

![6](https://github.com/ArielGol/challenge-one-conversor/assets/79612737/58d0357b-3cd7-4d73-8c2b-9ca2ee53e149)
![7](https://github.com/ArielGol/challenge-one-conversor/assets/79612737/125cf075-bdfb-4086-a471-3215d54c4ed2)
![8](https://github.com/ArielGol/challenge-one-conversor/assets/79612737/ecab8ae1-758f-4531-aa2e-3114ecd2a546)
![fahrenheit](https://github.com/ArielGol/challenge-one-conversor/assets/79612737/b537cf53-71e0-4ceb-8a5d-74b47a0e5961)

## Tech Stack

**Client:** JAVA SWING

**Server:** JAVA, JAVA.NET, JAVA.JSON 

