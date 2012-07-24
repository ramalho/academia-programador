# sorteia 6 dezenas para a Sena (1 a 60) */

from random import randrange

NUM_DEZENAS = 6
dezenas = []
for i in range(NUM_DEZENAS):
    repetido = True
    while repetido: 
        sorteio = randrange(1, 61)
        if sorteio not in dezenas:
            repetido = False
    dezenas.append(sorteio)
for n, dezena in enumerate(dezenas, 1):
    print 'dezena',n,':',dezena
