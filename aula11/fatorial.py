# coding: utf-8

def fatorial(n):
	if n < 0:
		raise ValueError("Não existe fatorial de n<0")
	elif n <= 1:
		return 1
	else:
		return n * fatorial(n-1)

numero = input("Digite um número inteiro positivo:")
print str(numero)+"! = ", fatorial(numero)
