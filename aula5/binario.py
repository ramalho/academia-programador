q = 17
print "decimal:", q
binario = ""
while q >= 2:
	resto = q % 2
	q = q / 2
	binario = str(resto) + binario
binario = str(q) + binario
print "binario:", binario
