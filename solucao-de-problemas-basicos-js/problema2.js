let casoDeTeste = parseInt(gets());

function calcularDias(qtdComida) {
  if (qtdComida <= 1.0) {
    return 0;
  }
  const comeComida = qtdComida / 2.0;
  
  return 1 + calcularDias(comeComida);
}

while (casoDeTeste-- > 0) {
  const qtdComida = parseFloat(gets());
  const diasFinais = calcularDias(qtdComida);
  
  console.log(diasFinais, 'dias');
}