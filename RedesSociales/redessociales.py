#UNAM FES ARAGON
#EDUARDO SALAZAR AGUILAR 319030693
#1310
#TAREA REDES SOCIALES

#Se importa la biblioteca pandas para manejo de datos
import pandas as pd

#La variable Datos guarda los datos del archivo csv, se leen de manera local
#con la funcion read_csv
datos = pd.read_csv('presenciaredes.csv')
#Se muestran todos los datos
#print(datos)

#Se imprimen solo los datos donde la columna "RED SOCIAL" es 'TWITTER'
filt_1 = datos[datos["RED SOCIAL"] == 'TWITTER']

#Aquellos datos que ya se filtraron solo se toman los de la columna de seguidores para conocer la diferencia
filt_1 = filt_1[filt_1["CONCEPTO"] == 'SEGUIDORES (FOLLOWERS)']

#Usamos 'iloc' para tomar un solo registro de cada columna y eliminamos las comas para convertir los 'strings' a 'integer'
#para luego restarlos y conocer la diferencia de seguidores entre ENERO Y JUNIO
diff = int((filt_1.iloc[0]['JUNIO']).replace(',', ''))-int((filt_1.iloc[0]['ENERO']).replace(',', ''))
print("La diferencia de seguidores es de: ",diff)

###################################################################################################
filt_2 = datos[datos["RED SOCIAL"] == 'YOUTUBE']

filt_2 = filt_2[filt_2["CONCEPTO"] == 'VISUALIZACIONES']

print("SELECCIONE 2 MESES (ENERO A JUNIO) PARA CONOCER LA DIFERENCIA DE VISUALIZACIONES")
var_1 = input()
var_2 = input()
a = int((filt_2.iloc[0][var_1]).replace(',', ''))
b = int((filt_2.iloc[0][var_2]).replace(',', ''))
diff_2 = a - b
if diff_2 < 0:
	diff_2 = b - a
print("La diferencia de visualizaciones entra ambos meses es de: " , diff_2)

###################################################################################################
filt_3 = datos[datos["RED SOCIAL"] == 'TWITTER']

filt_3 = filt_3[filt_3["CONCEPTO"] == 'CRECIMIENTO DE FOLLOWERS']

promedio = int((filt_3.iloc[0]['ENERO']).replace(',', '')) + int((filt_3.iloc[0]['FEBRERO']).replace(',', ''))
promedio = promedio + int((filt_3.iloc[0]['MARZO']).replace(',', '')) + int((filt_3.iloc[0]['ABRIL']).replace(',', ''))
promedio = promedio + int((filt_3.iloc[0]['MAYO']).replace(',', '')) + int((filt_3.iloc[0]['JUNIO']).replace(',', ''))
print("El promedio de crecimiento de seguidores en Twitter es: " , promedio / 6)


filt_4 = datos[datos["RED SOCIAL"] == 'FACEBOOK']

filt_4 = filt_4[filt_4["CONCEPTO"] == 'CRECIMIENTO (seguidores)']

promedio_2 = int((filt_4.iloc[0]['ENERO']).replace(',', '')) + int((filt_4.iloc[0]['FEBRERO']).replace(',', ''))
promedio_2 = promedio_2 + int((filt_4.iloc[0]['MARZO']).replace(',', '')) + int((filt_4.iloc[0]['ABRIL']).replace(',', ''))
promedio_2 = promedio_2 + int((filt_4.iloc[0]['MAYO']).replace(',', '')) + int((filt_4.iloc[0]['JUNIO']).replace(',', ''))
print("El promedio de crecimiento de seguidores en Facebook es: " ,promedio_2 / 6)