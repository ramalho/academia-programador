# coding: utf-8
import sys

try:
	q = long(sys.argv[1]);
except (IndexError, ValueError):
	print 'Digite um número na linha de comando'
	sys.exit(-1)
 
print "decimal:", q
binario = ""
while q >= 2:
	resto = q % 2
	q = q / 2
	binario = str(resto) + binario
binario = str(q) + binario
print "binario:", binario
