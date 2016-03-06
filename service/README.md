

Como tarea de este tema tendréis que entregar una implementación del servicio cuyos requisitos se os plantean a continuación.

    Esta tarea plantea algunos problemas que no se han visto en Beeter.

Se desea implementar un servicio denominado Group Talk en el que los usuarios pueden ingresar en unos determinados grupos de interés y crear temas en ese grupo a modo de foro. El servicio lo administra un tipo particular de usuario administrador con ciertos privilegios sobre el resto de usuarios.

    Se debe permitir el registro de usuarios. Cualquier usuario no registrado lo único que podrá ver son los grupos que hay en el sistema.
    Los usuarios registrados pueden hacer login en la aplicación recibiendo un token de acceso que utilizarán para pedir la autorización para que se procesen sus peticiones. También podrán hacer logout que eliminará el token de acceso concedido en el login.
    Los grupos sólo los puede crear el usuario administrador.
    Los usuarios registrados pueden ingresar en cualquier grupo. También pueden abandonar el grupo aunque sus mensajes no serán borrados.
    Los usuarios registrados pueden consultar cualquier tema de cualquier grupo a los que estén suscritos.
    Los usuarios registrados pueden escribir un tema en cualquiera de los grupos en los que hayan ingresado.
    Cada tema tiene un título y un contenido que desarrolla el tema. Cualquier usuario registrado puede participar en el tema mediante respuestas al tema inicial. Una respuesta sólo tiene contenido.
    El contenido de un tema o una respuesta puede ser editado por el usuario que lo creó. El título no se puede editar.
    El usuario que creó un tema puede eliminarlo por completo y también cualquier respuesta asociada al tema. El administrador puede eliminar cualquier tema y cualquier respuesta.

A partir de estos requisitos tenéis que diseñar e implementar un servicio web RESTful. Os recomendamos que empecéis por el diseño y lo presentéis al profesor antes de empezar a implementarlo.

Ánimo.