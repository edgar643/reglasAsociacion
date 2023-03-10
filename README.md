# reglasAsociacion
Reglas de asociacion para realizar mineria de datos para obtener patrones

Reglas de asociación

El proceso de minería de datos trata de descubrir patrones o relaciones en un conjunto de datos dado. Una de las posibles técnicas de datamining son las reglas de asociación. Una regla de asociación es una implicación entre condiciones sobre atributos del estilo

	SI (practica_esport = falso) Y (fruita_en_dieta <10%) Y (colesterol_en_sang> 3g / L) ENTONCES malaltia_cardiaca = cierto

Aquí, "practica_esport" y "malaltia_cardiaca" son atributos booleanos mientras que "fruita_en_dieta" y "colesterol_en_sang" son atributos numéricos.

Se trata de hacer una herramienta que encuentre las reglas de asociación que en los datos superan ciertos umbrales de apoyo (% de registros donde el antecedente y el consecuente de la regla son ciertos) y de confianza (% de registros donde, siendo antecedente cierto, además el consecuente es cierto).

Los datos vendrán en ficheros de texto. Cada línea del archivo se llamará registro, y contendrá los valores de varios atributos. Como mínimo deben poder haber atributos numéricos, booleanos o categóricos (ej: azul, verde, rojo).

El programa debe ofrecer un entorno tan cómodo como sea posible para el necesario preproceso de los datos. Obligatoriamente, el programa debe:

•	Permitir la definición de atributos
•	Incluir la discretización o binarización de atributos numéricos.
•	Dar la opción de que el usuario pueda guardar estos datos preprocessades para no tener que repetir el preproceso en trabajar de nuevo con el mismo juego de datos.

Y opcionalmente:

•	Es podría incluir la inspección visual de los datos, eliminación de registros escogidos (p.ej., outliers o redundantes), eliminación de atributos (que podrían ser, por ejemplo, poco relevantes), añadir nuevos atributos (p.ej., calculados o derivados de los otros), etc.
•	Es podría tratar el caso de los missing values (rellenar valores de atributos que puedan faltar).

El entorno deberá permitir las siguientes funcionalidades:

1.	Introducción de reglas de asociación a partir de un conjunto de datos.
2.	Validació de un conjunto de reglas obtenidas en un conjunto de datos diferente (es decir, calcular la relevancia y fiabilidad de las reglas en el nuevo conjunto.
3.	Preprocéso de los datos de un conjunto.
4.	Guardar y recuperar el resultado del algoritmo principal (reglas de asociación encuentros)

Sería bueno que el usuario pudiera elegir entre varios niveles de interactividad: desde el caso de que el programa lo hace casi todo automáticamente hasta aquel en que el usuario puede establecer manualmente todos los parámetros del algoritmo, seguir el proceso paso a paso, modificar el resultado final, etc.

Funcionalidades principales a entregar a la primera entrega:

1.	Introducción de reglas de asociación usando el algoritmo Apriori
2.	Funcionalidades automáticas definidas por el preproceso de los datos (aquellas en las que no interviene interactivamente el usuario)
3.	Validación de un conjunto de reglas

