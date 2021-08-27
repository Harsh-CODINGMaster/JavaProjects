let scores = {
  X: 10,
  O: -10,
  tie: 0
};

function bestMove() {

  // AI to make its turn
  let bestScore = -Infinity;
  let move;
  for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {

      //Finding an empty spot Is the spot available?
      if (board[i][j] == '') {

        // marking for now
        board[i][j] = ai;
        let score = minimax(board, 0, false);

        // remove it
        board[i][j] = '';
        if (score > bestScore) {
          bestScore = score;
          move = { i, j };
        }
      }
    }
  }

  // now finally mark it 
  board[move.i][move.j] = ai;

  // now human will play
  currentPlayer = human;
}

function minimax(board, depth, isMaximizing) {

  let result = checkWinner();

  // if a winner is there or a tie return score
  if (result !== null) {
    return scores[result];
  }

  if (isMaximizing) {
    let bestScore = -Infinity;
    for (let i = 0; i < 3; i++) {
      for (let j = 0; j < 3; j++) {
        // Is the spot available?
        if (board[i][j] == '') {
          board[i][j] = ai;
          let score = minimax(board, depth + 1, false);
          board[i][j] = '';
          bestScore = max(score, bestScore);
        }
      }
    }
    return bestScore;

  } else {

    let bestScore = Infinity;
    for (let i = 0; i < 3; i++) {
      for (let j = 0; j < 3; j++) {
        // Is the spot available?
        if (board[i][j] == '') {
          board[i][j] = human;
          let score = minimax(board, depth + 1, true);
          board[i][j] = '';
          bestScore = min(score, bestScore);
        }
      }
    }
    return bestScore;
  }
}
