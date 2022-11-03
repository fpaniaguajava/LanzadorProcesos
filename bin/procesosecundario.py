import sys
#Estamos haciendo cosas en Python

with open ("./salida.txt","w") as fichero:
    fichero.write("Esto lo ha escrito un programa Python ejecutado desde Java")
    sys.exit(0)
    