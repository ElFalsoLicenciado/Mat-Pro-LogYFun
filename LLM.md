Los Modelos de Lenguaje se basan en el principio de llenar el espacio vació.

> Cada palabra es un token, el modelo no adivina letras, sino números.

Para que un modelo pueda ser entrenado debe tener
- **Corpus**: La información/contexto.

**RAC**: Permite aumentar la información con `.txt`, `.pdf`, etc.
	**DG AnythingLLM**: Herramienta para brindar contexto.

Digamos tenemos: `Hola mundo`. Se puede dividir en 2 tokens normalmente.
Pero también podríamos subdividir en 2 tokens más.

1. **Base de datos vectorial**: Operaciones con vectores y multidimensionalidad.
2. **Embedder**: Palabras convertidas en números.