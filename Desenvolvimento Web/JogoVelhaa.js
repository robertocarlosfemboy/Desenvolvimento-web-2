var X = "X";
var O = "O";
matriz = [
    ["","",""],
    ["","",""],
    ["","",""]
]

if (matriz[0][0] != "" == matriz[0][1] != "" == matriz[0][2]){ // linha 1
    alert("Fim de jogo. Temos um vencedor!");}
else if (matriz[1][0] != "" == matriz[1][1] != "" == matriz[1][2]){ // linha 2
    alert("Fim de jogo. Temos um vencedor!");}
else if (matriz[2][0] != "" == matriz[2][1] != "" == matriz[2][2]){ // linha 3
    alert("Fim de jogo. Temos um vencedor!");}
else if (matriz[0][0] != "" == matriz[1][0] != "" == matriz[2][0]){ // coluna 1
    alert("Fim de jogo. Temos um vencedor!");}
else if (matriz[0][1] != "" == matriz[1][1] != "" == matriz[2][1]){ // coluna 2
    alert("Fim de jogo. Temos um vencedor!");}
else if (matriz[0][2] != "" == matriz[1][2] != "" == matriz[2][2]){ // coluna 3
    alert("Fim de jogo. Temos um vencedor!");}
else if (matriz[0][0] != "" == matriz[1][1] != "" == matriz[2][2]){ // diagonal principal
    alert("Fim de jogo. Temos um vencedor!");}
else if (matriz[2][0] != "" == matriz[1][1] != "" == matriz[0][2]){ // diagonal secundária
    alert("Fim de jogo. Temos um vencedor!");}
else{     
    alert("Se lascaram. Deu velha!");}

function validar(){}
    if ()

function vez(){
    alert
}

