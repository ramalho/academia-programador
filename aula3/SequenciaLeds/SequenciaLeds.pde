/*
  SequenciaLeds
  
  Acender os LEDs do Program-ME em sequencia
 */
 
int led[] = {14, 1, 2, 3, 4, 5, 8, 6, 13};

void setup() {                
  // Definimos as portas digitais como portas de saida
  for (int x=0; x<9; x++) {
    pinMode(led[x], OUTPUT);     
  }
}

void loop() {
  for (int x=0; x<9; x++) {
    delay(20);    
    digitalWrite(led[x], HIGH);
  }
  for (int x=0; x<9; x++) {
    delay(20);    
    digitalWrite(led[x], LOW);
  }
}
