/*
  LuminosidadeVariavel
  
  Exemplo 3.5.3.3 do Modulo 1 da Academia do Programador
 */
 
#define LDR 5
int led[] = {14, 1, 2, 3, 4, 5, 8, 6, 13};
int luminosidade;

void setup() {                
  // Definimos as portas digitais como portas de saida
  for (int x=0; x<9; x++) {
    pinMode(led[x], OUTPUT);     
  }
  Serial.begin(9600);
}

void loop() {
  luminosidade = analogRead(LDR);
  int ledsParaLigar = map(luminosidade, 450, 1000, 0, 8);
  Serial.print(luminosidade, DEC);
  Serial.print("->");
  Serial.println(ledsParaLigar, DEC);
  for (int x=0; x<=ledsParaLigar; x++) {
    digitalWrite(led[x], HIGH);
  }
  delay(100);
  for (int x=0; x<=ledsParaLigar; x++) {
    digitalWrite(led[x], LOW);
    //delay(100);
  }
}
