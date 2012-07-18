# coding: utf-8

p1 = input('Informe a nota da prova P1: ')
p2 = input('Informe a nota da prova P2: ')
media = float(p1+p2) / 2
print 'Media:', media
if media >= 5:
	print 'Aprovado!'
else:
	print 'Reprovado!'
