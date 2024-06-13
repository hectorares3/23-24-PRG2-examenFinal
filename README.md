# Restaurante

En un restaurante de comida rápida se preparan y sirven hamburguesas. Cada hamburguesa se compone de distintos elementos: diferentes tipos de pan, carnes cocinadas de diversas formas, quesos, salsas y otros ingredientes adicionales.

Cuando el cocinero recibe la orden de preparar una hamburguesa, selecciona los ingredientes adecuados: el pan, el tipo de carne y su cocción y los extras que la acompañarán. El actual cocinero contratado solo sabe preparar hamburguesas con cuatro extras (aunque una hamburguesa puede tener más, dependiendo de la pericia del cocinero).

Una vez preparada, entrega la hamburguesa al camarero, que es el encargado de servirla al cliente. En el proceso de entrega, describe los componentes de la hamburguesa en voz alta para que el cliente sepa exactamente lo que está recibiendo, y luego de esto, muestra la hamburguesa.

<div align=center>

|Ingrediente|||Representación|
|-|-|-|-|
|**Pan**|Brioche||`##############`
||Integral||`\|\|\|\|\|\|\|\|\|\|\|\|\|\|` 
|**Carne**|*Admite cocción*||*Poco hecho, muy hecho, medio hecho*
||Res||`::::::::::::`
||Pollo||`;;;;;;;;;;;;`
|**Extras**|Queso Cheddar||`============`
||Queso Azul||`-.-.-.-.-.-.`
||Huevo||`~-~-(  )~-~-`
||*Admiten cantidad:*||*Mucho, poco*
||Salsa Mayonesa||`~=~~=~~=~~=~`
||Salsa Ketchup||`ooOooOooOooO`

</div>

```

> java Restaurante

Sale una Brioche, Res (poco hecha), Cheddar, poco de Ketchup, mucho de Mayonesa, Huevo frito!!!

##############
 ::::::::::::
 ============
 ooOooOooOooO
 ~=~~=~~=~~=~
 ----(  )----
##############

```

## 2DO

Diseñe y programe un sistema que modele todo este proceso, considerando las responsabilidades del cocinero y del camarero, así como las distintas características, relaciones y comportamientos de los ingredientes involucrados en la preparación de las hamburguesas.

### Legacy

¡No parte de cero! (cosa que puede ser buena, o no...) El dueño del restaurante nos dice que se ha conseguido acceso al siguiente fragmento de código, al cual se agregará el código que presente.

- Clase [Restaurante](/src/Restaurante.java)
- Clase [Empleado](/src/Empleado.java)
- Clase [Cocinero](/src/Cocinero.java)

## Se evaluará

- **Código limpio.**
- **Proceso de creación ***contínuo*** que garantice la trazabilidad.**
- **Implementación clara y legible**
- Diseño.
  - Jerarquía de clases.
  - Reparto adecuado de responsabilidades y atributos.
  - Estructuración que evite al máximo código duplicado.
  - Estructuración que fomente el mínimo tamaño de clases.

> En negrita los puntos [*conditio sine qua non*](https://es.wikipedia.org/wiki/Sine_qua_non) para tener un examen evaluable.
