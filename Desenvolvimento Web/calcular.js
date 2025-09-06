var X1 = 1;
var Y1 = 6;
var X2 = 6;
var Y2 = 1;
var altura = Y1 - X1;
var base = X2 - Y2;
var hipotenusa = "";

function contaHipotenusa(){
    hipotenusa = Math.sqrt((base * base) + (altura * altura)); 
    alert(hipotenusa);
}

function area(){
    alert("A área é: " + (altura * base)/2);
}

function perimetro(){
    alert("O perímetro é: " + (base + altura + hipotenusa));     
}

contaHipotenusa();
area();
perimetro();