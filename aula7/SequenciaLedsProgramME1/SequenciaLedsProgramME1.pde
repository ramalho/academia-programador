/*
SequenciaLeds
Acender os LEDs do Program-ME em sequencia
*/
 
const int ATRASO = 200;
int led[] = {14, 1, 2, 3, 4, 5, 8, 6, 13};

void setup() {
  // Definimos as portas digitais como portas de saida
  for (int x=0; x<9; x++) {
    pinMode(led[x], OUTPUT);
  }
}

void loop() {
  for (int x=0; x<9; x++) {
    delay(ATRASO);
    digitalWrite(led[x], HIGH);
  }
  for (int x=0; x<9; x++) {
    delay(ATRASO);
    digitalWrite(led[x], LOW);
  }
}
