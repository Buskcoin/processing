import roombaide.io.*;
MCP3001 adc;

// see setup.png in the sketch folder for wiring details

void setup() {
  //printArray(SPI.list());
  adc = new MCP3001(SPI.list()[0]);
}

void roboLoop() {
  background(adc.getAnalog() * 255);
}
