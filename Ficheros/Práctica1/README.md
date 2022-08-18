Realizar un programa que realice un encriptador/desencriptador de ficheros.
    Deberá aparecer un menú con las siguientes opciones:
        1.- Encriptar un fichero.
        2.- Desencriptar un fichero.
        3.- Salir.
    Si teclea un 1 se deberán realizar las siguientes acciones:
    - Pedir un nombre de fichero. Si no existe mensaje de error.
    - Si existe se pedirá por pantalla una contraseña y se creara un fichero
      que contenga lo siguiente:
	.- Primera línea: “Contraseña:valor”. Valor el pedido por pantalla.
	.- A continuación se ecribirá todo el fichero encriptado con los
           caracteres según la siguiente correspondencia:
                origen=“abcdefghijkl……….xyz”
                encrip=“ghtsdfqdwh…………….caq” .
            El resto de caracteres se escribirán igual.
    Si se teclea un 2 se realizarán las siguientes acciones:
    .- Pedir un nombre de fichero. Si no existe mensaje de error.
    .- Si existe se pedirá por pantalla una contraseña si la contraseña
    coincide con la del fichero, se visualizará por pantalla el contenido 
    desencriptado del fichero, sino coincide el mensaje de contraseña no valida.