'use strict';

function dfs() {
  alert('Depth-first search not implemented yet');
}

function bfs() {
  const start = world.board.getCell(world.config.start.row, world.config.start.col);
  
  const cellsQueue = [start];
  
  traverse(cellsQueue);
}
