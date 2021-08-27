let board = [
  ['', '', ''],
  ['', '', ''],
  ['', '', '']
];

let w; // = width / 3;
let h; // = height / 3;

let ai = 'X';
let human = 'O';
let currentPlayer = human;

// The setup() function is called once when the program starts. 
function setup() {
  
  // creates canvas of 400 * 400
  createCanvas(400, 400);
  // width and height variable are set by create canvas method
  w = width / 3;
  h = height / 3;

  frameRate(2);
}

function equals3(a, b, c) {
  return a == b && b == c && a != '';
}

function checkWinner() {
  let winner = null;

  // horizontal winner check
  for (let i = 0; i < 3; i++) {
    if (equals3(board[i][0], board[i][1], board[i][2])) {
      winner = board[i][0];
    }
  }

  // Vertical winner check
  for (let i = 0; i < 3; i++) {
    if (equals3(board[0][i], board[1][i], board[2][i])) {
      winner = board[0][i];
    }
  }

  // Diagonal
  if (equals3(board[0][0], board[1][1], board[2][2])) {
    winner = board[0][0];
  }
  if (equals3(board[2][0], board[1][1], board[0][2])) {
    winner = board[2][0];
  }

  let openSpots = 0;
  for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
      if (board[i][j] == '') {
        openSpots++;
      }
    }
  }

  if (winner == null && openSpots == 0) {
    return 'tie';
  } else {
    return winner;
  }
}

function mousePressed() {
  if (currentPlayer == human) {
    // Human make turn

    let i = floor(mouseX / w);

    let j = floor(mouseY / h);

    // If valid turn
    if (board[i][j] == '') {
      board[i][j] = human;
      currentPlayer = ai;
      // now ai's turn
      bestMove();
    }
  }
}

function draw() {
  // painter function

  // bg color of board
  // background(255);
   background("#ffffff00");

  // controls width of lines
  strokeWeight(6);

  // creating basic frame of tic tac toe
  // vertical lines
  line(w, 0, w, height);
  line(w * 2, 0, w * 2, height);
  // horizontal lines
  line(0, h, width, h);
  line(0, h * 2, width, h * 2);

  for (let j = 0; j < 3; j++) {
    for (let i = 0; i < 3; i++) {

      let x = w * i + w / 2;
      let y = h * j + h / 2;

      let spot = board[i][j];
      
      textSize(32);
      let r = w / 4;

      if (spot == human) {
        noFill();
        ellipse(x, y, r * 2);

      } else if (spot == ai) {

        line(x - r, y - r, x + r, y + r);
        line(x - r, y + r, x + r, y - r);
      }
    }
  }

  let result = checkWinner();

  if (result != null) {
    // player or ai won or it's a draw

    // stops drawing
    noLoop();

    if (result == 'tie') {
      document.querySelector("h1").innerHTML = "Tie!";
    } else {
      document.querySelector("h1").innerHTML = result + " wins" ;
    }

  }
}
